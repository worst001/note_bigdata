package com.atuigu.doris.flink;

import org.apache.doris.flink.cfg.DorisExecutionOptions;
import org.apache.doris.flink.cfg.DorisOptions;
import org.apache.doris.flink.cfg.DorisReadOptions;
import org.apache.doris.flink.cfg.DorisSink;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.data.GenericRowData;
import org.apache.flink.table.data.RowData;
import org.apache.flink.table.data.StringData;
import org.apache.flink.table.types.logical.*;

/**
 * TODO
 *
 * @author cjp
 * @version 1.0
 */
public class DataStreamRowDataSinkDemo {
    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);


        DataStream<RowData> source = env.fromElements("")
                .map(new MapFunction<String, RowData>() {
                    @Override
                    public RowData map(String value) throws Exception {
                        GenericRowData genericRowData = new GenericRowData(4);
                        genericRowData.setField(0, 88);
                        genericRowData.setField(1, new Short("8"));
                        genericRowData.setField(2, StringData.fromString("flink-stream"));
                        genericRowData.setField(3, 8L);
                        return genericRowData;
                    }
                });

        LogicalType[] types = {new IntType(), new SmallIntType(), new VarCharType(32), new BigIntType()};
        String[] fields = {"siteid", "citycode", "username", "pv"};


        source.addSink(
                DorisSink.sink(
                        fields,
                        types,
                        DorisReadOptions.builder().build(),
                        DorisExecutionOptions.builder()
                                .setBatchSize(3)
                                .setBatchIntervalMs(0L)
                                .setMaxRetries(3)
                                .build(),
                        DorisOptions.builder()
                                .setFenodes("hadoop1:8030")
                                .setTableIdentifier("test_db.table1")
                                .setUsername("test")
                                .setPassword("test").build()
                ));



        env.execute();

    }
}

package com.atuigu.doris.flink;

import org.apache.doris.flink.cfg.*;
import org.apache.doris.flink.datastream.DorisSourceFunction;
import org.apache.doris.flink.deserialization.SimpleListDeserializationSchema;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.util.Properties;

/**
 * TODO
 *
 * @author cjp
 * @version 1.0
 */
public class DataStreamJsonSinkDemo {
    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        Properties pro = new Properties();
        pro.setProperty("format", "json");
        pro.setProperty("strip_outer_array", "true");

        env
                .fromElements(
                        "{\"siteid\": \"66\", \"citycode\": \"6\", \"username\": \"pengyuyan\",\"pv\": \"6\"}"
                )
                .addSink(
                        DorisSink.sink(
                                DorisReadOptions.builder().build(),
                                DorisExecutionOptions.builder()
                                        .setBatchSize(3)
                                        .setBatchIntervalMs(0L)
                                        .setMaxRetries(3)
                                        .setStreamLoadProp(pro).build(),
                                DorisOptions.builder()
                                        .setFenodes("hadoop1:8030")
                                        .setTableIdentifier("test_db.table1")
                                        .setUsername("test")
                                        .setPassword("test").build()
                        ));
//            .addSink(
//                DorisSink.sink(
//                        DorisOptions.builder()
//                                .setFenodes("hadoop1:8030")
//                                .setTableIdentifier("test_db.table1")
//                                .setUsername("test")
//                                .setPassword("test").build()
//                ));

        env.execute();

    }
}

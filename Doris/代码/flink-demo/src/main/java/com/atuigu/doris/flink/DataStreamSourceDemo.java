package com.atuigu.doris.flink;

import org.apache.doris.flink.cfg.DorisStreamOptions;
import org.apache.doris.flink.datastream.DorisSourceFunction;
import org.apache.doris.flink.deserialization.SimpleListDeserializationSchema;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

import java.util.Properties;

/**
 * TODO
 *
 * @author cjp
 * @version 1.0
 */
public class DataStreamSourceDemo {
    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        Properties properties = new Properties();
        properties.put("fenodes","hadoop1:8030");
        properties.put("username","test");
        properties.put("password","test");
        properties.put("table.identifier","test_db.table1");

        env.addSource(new DorisSourceFunction(
                        new DorisStreamOptions(properties),
                        new SimpleListDeserializationSchema()
                )
        ).print();

        env.execute();

    }
}

package com.atuigu.doris.spark

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

/**
  * TODO
  *
  * @version 1.0
  * @author cjp
  */
object SQLDemo {
  def main( args: Array[String] ): Unit = {
    val sparkConf = new SparkConf().setAppName("SQLDemo")
      .setMaster("local[*]") //TODO 要打包提交集群执行，注释掉
    val sparkSession = SparkSession.builder().config(sparkConf).getOrCreate()

    sparkSession.sql(
      """
        |CREATE TEMPORARY VIEW spark_doris
        |USING doris
        |OPTIONS(
        |  "table.identifier"="test_db.table1",
        |  "fenodes"="hadoop1:8030",
        |  "user"="test",
        |  "password"="test"
        |);
      """.stripMargin)

    //读取数据
//        sparkSession.sql("select * from spark_doris").show()

    //写入数据
    sparkSession.sql("insert into spark_doris values(99,99,'spark-sql',5)")
  }

}

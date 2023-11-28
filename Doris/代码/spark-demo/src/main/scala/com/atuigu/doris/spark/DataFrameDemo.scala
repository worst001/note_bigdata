package com.atuigu.doris.spark

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession


/**
  * TODO
  *
  * @version 1.0
  * @author cjp
  */
object DataFrameDemo {
  def main( args: Array[String] ): Unit = {
    val sparkConf = new SparkConf().setAppName("DataFrameDemo")
      .setMaster("local[*]") //TODO 要打包提交集群执行，注释掉
    val sparkSession = SparkSession.builder().config(sparkConf).getOrCreate()


    // 读取数据
        val dorisSparkDF = sparkSession.read.format("doris")
          .option("doris.table.identifier", "test_db.table1")
          .option("doris.fenodes", "hadoop1:8030")
          .option("user", "test")
          .option("password", "test")
          .load()
        dorisSparkDF.show()


    // 写入数据
/*    import sparkSession.implicits._
    val mockDataDF = List(
      (11,23, "haha", 8),
      (11, 3, "hehe", 9),
      (11, 3, "heihei", 10)
    ).toDF("siteid", "citycode", "username","pv")
    mockDataDF.show(5)

    mockDataDF.write.format("doris")
      .option("doris.table.identifier", "test_db.table1")
      .option("doris.fenodes", "hadoop1:8030")
      .option("user", "test")
      .option("password", "test")
      //指定你要写入的字段
//      .option("doris.write.fields", "user")
      .save()*/

  }

}

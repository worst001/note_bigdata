package com.atuigu.doris.spark

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SparkSession


/**
  * TODO
  *
  * @version 1.0
  * @author cjp
  */
object RDDDemo {
  def main( args: Array[String] ): Unit = {
    val sparkConf = new SparkConf().setAppName("RDDDemo")
      .setMaster("local[*]") //TODO 要打包提交集群执行，注释掉
    val sc = new SparkContext(sparkConf)


    import org.apache.doris.spark._
    val dorisSparkRDD = sc.dorisRDD(
      tableIdentifier = Some("test_db.table1"),
      cfg = Some(Map(
        "doris.fenodes" -> "hadoop1:8030",
        "doris.request.auth.user" -> "test",
        "doris.request.auth.password" -> "test"
      ))
    )

    dorisSparkRDD.collect().foreach(println)


  }

}

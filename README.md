# 大数据

收录了大数据相关各类资料、笔记、手册

公网资料、笔记地址请访问这里 


<!-- PROJECT SHIELDS -->

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
<!-- [![LinkedIn][linkedin-shield]][linkedin-url] -->

<!-- PROJECT LOGO -->

--------------------

# 大数据

## 基本概念

大数据（Big Data）指的是传统数据处理应用软件难以有效处理的大规模、高增长率和多样的信息资产。这些种类繁多的数据集通常从不同的来源收集而来，例如社交媒体、交易记录、移动应用、传感器设备和各种形式的数字化记录等。大数据的核心价值在于能从这些庞大的、复杂的数据集中提取出有用的信息，并用于决策支持、产品开发、市场分析和其他众多领域。

### 大数据通常按照4V模型来描述，这包括

#### Volume（数据量）
大数据涉及的数据量极为庞大，可以是TB（太字节）、PB（拍字节）、EB（艾字节）的数量级。

#### Velocity（数据流转速度）
数据的生成速度非常快，需要实时或近实时的处理能力。比如社交媒体的动态更新、股票交易等。

#### Variety（数据种类）
大数据来源多样，包括结构化数据（如数据库中的交易记录）、半结构化数据（如XML文件）和非结构化数据（如视频、图片和文本）。

#### Veracity（数据的准确性或质量）
由于数据来源众多，数据的质量和准确性可能参差不齐，大数据技术需要能够处理和分析这些数据，确保产生的洞察是可靠的。

### 为了有效处理大数据，开发了一系列新的技术和架构，例如：

#### 分布式存储和计算框架
如Hadoop和Apache Spark，它们能够在成百上千的服务器上存储和处理大量数据。

#### 数据库技术
包括NoSQL数据库（如MongoDB、Cassandra和Couchbase）以及NewSQL数据库，它们能够更高效地处理大量、多样和快速变化的数据集。

#### 数据挖掘和分析工具
它们包括复杂的算法和机器学习技术，用于从数据中提取模式、趋势和洞察。

#### 可视化工具
它们帮助用户以图形方式理解数据模式和趋势。

### 大数据的应用领域非常广泛，包括但不限于
+ 商业智能和市场分析
+ 健康医疗信息系统
+ 智慧城市和物联网
+ 个性化推荐系统（如电子商务和流媒体服务）
+ 风险管理和欺诈检测
+ 科学研究和气候变化分析


--------------------

## 目录

[目录](index.md)

## Hadoop

+ [Hadoop_随堂笔记](Hadoop/Hadoop 随堂笔记.md)
+ [分布式文件存储系统 —— HDFS](BigData-Notes/notes/Hadoop-HDFS.md)
+ [分布式计算框架 —— MapReduce](BigData-Notes/notes/Hadoop-MapReduce.md)
+ [集群资源管理器 —— YARN](BigData-Notes/notes/Hadoop-YARN.md)
+ [Hadoop 单机伪集群环境搭建](BigData-Notes/notes/installation/Hadoop单机环境搭建.md)
+ [Hadoop 集群环境搭建](BigData-Notes/notes/installation/Hadoop集群环境搭建.md)
+ [HDFS 常用 Shell 命令](BigData-Notes/notes/HDFS常用Shell命令.md)
+ [HDFS Java API 的使用](BigData-Notes/notes/HDFS-Java-API.md)
+ [基于 Zookeeper 搭建 Hadoop 高可用集群](BigData-Notes/notes/installation/基于Zookeeper搭建Hadoop高可用集群.md)
+ [Hadoop 课件资料](Hadoop/Direction.md)


## 数仓建设

+ [大数据与数仓随堂笔记](数仓建设/大数据与数仓.md)
+ [数仓建设课件资料](数仓建设/Direction.md)

## Hive

+ [Hive_学习笔记](Hive/Hive_学习笔记.md)
+ [Hive 简介及核心概念](BigData-Notes/notes/Hive简介及核心概念.md)
+ [Linux 环境下 Hive 的安装部署](BigData-Notes/notes/installation/Linux环境下Hive的安装部署.md)
+ [Hive CLI 和 Beeline 命令行的基本使用](BigData-Notes/notes/HiveCLI和Beeline命令行的基本使用.md)
+ [Hive 常用 DDL 操作](BigData-Notes/notes/Hive常用DDL操作.md)
+ [Hive 分区表和分桶表](BigData-Notes/notes/Hive分区表和分桶表.md)
+ [Hive 视图和索引](BigData-Notes/notes/Hive视图和索引.md)
+ [Hive 常用 DML 操作](BigData-Notes/notes/Hive常用DML操作.md)
+ [Hive 数据查询详解](BigData-Notes/notes/Hive数据查询详解.md)
+ [Hive 课件资料](Hive/Direction.md)


## HBase

+ [Hbase 简介](BigData-Notes/notes/Hbase简介.md)
+ [HBase 系统架构及数据结构](BigData-Notes/notes/Hbase系统架构及数据结构.md)
+ [HBase 基本环境搭建](BigData-Notes/notes/installation/HBase单机环境搭建.md)
+ [HBase 集群环境搭建](BigData-Notes/notes/installation/HBase集群环境搭建.md)
+ [HBase 常用 Shell 命令](BigData-Notes/notes/Hbase_Shell.md)
+ [HBase Java API](BigData-Notes/notes/Hbase_Java_API.md)
+ [HBase 过滤器详解](BigData-Notes/notes/Hbase过滤器详解.md)
+ [HBase 协处理器详解](BigData-Notes/notes/Hbase协处理器详解.md)
+ [HBase 容灾与备份](BigData-Notes/notes/Hbase容灾与备份.md)
+ [HBase的 SQL 中间层 —— Phoenix](BigData-Notes/notes/Hbase的SQL中间层_Phoenix.md)
+ [Spring/Spring Boot 整合 Mybatis + Phoenix](BigData-Notes/notes/Spring+Mybtais+Phoenix整合.md)
+ [尚硅谷课件资料](HBase/Direction.md)


## Flume

+ [Flume 简介及基本使用](BigData-Notes/notes/Flume简介及基本使用.md)
+ [Linux 环境下 Flume 的安装部署](BigData-Notes/notes/installation/Linux下Flume的安装.md)
+ [Flume 整合 Kafka](BigData-Notes/notes/Flume整合Kafka.md)
+ [尚硅谷课件资料](Flume/Direction.md)

## Kerbros

+ [Kerbros](https://app.yinxiang.com/fx/9a5651d6-50d4-4ae1-8b74-376d04157d28)


## Spark

+ [Spark 学习笔记](Spark/Spark学习笔记.md)
+ [Spark 课件资料](Spark/Direction.md)

#### Spark Core

+ [Spark 简介](BigData-Notes/notes/Spark简介.md)
+ [Spark 开发环境搭建](BigData-Notes/notes/installation/Spark开发环境搭建.md)
+ [弹性式数据集 RDD](BigData-Notes/notes/Spark_RDD.md)
+ [RDD 常用算子详解](BigData-Notes/notes/Spark_Transformation和Action算子.md)
+ [Spark 运行模式与作业提交](BigData-Notes/notes/Spark部署模式与作业提交.md)
+ [Spark 累加器与广播变量](BigData-Notes/notes/Spark累加器与广播变量.md)
+ [基于 Zookeeper 搭建 Spark 高可用集群](BigData-Notes/notes/installation/Spark集群环境搭建.md)

#### Spark SQL

+ [DateFrame 和 DataSet](BigData-Notes/notes/SparkSQL_Dataset和DataFrame简介.md)
+ [Structured API 的基本使用](BigData-Notes/notes/Spark_Structured_API的基本使用.md)
+ [Spark SQL 外部数据源](BigData-Notes/notes/SparkSQL外部数据源.md)
+ [Spark SQL 常用聚合函数](BigData-Notes/notes/SparkSQL常用聚合函数.md)
+ [Spark SQL JOIN 操作](BigData-Notes/notes/SparkSQL联结操作.md)

#### Spark Streaming

+ [Spark Streaming 简介](BigData-Notes/notes/Spark_Streaming与流处理.md)
+ [Spark Streaming 基本操作](BigData-Notes/notes/Spark_Streaming基本操作.md)
+ [Spark Streaming 整合 Flume](BigData-Notes/notes/Spark_Streaming整合Flume.md)
+ [Spark Streaming 整合 Kafka](BigData-Notes/notes/Spark_Streaming整合Kafka.md)


## Flink

+ [Flink 随堂摘要](Flink/Flink随堂笔记.md)
+ [Flink 核心概念综述](BigData-Notes/notes/Flink核心概念综述.md)
+ [Flink 开发环境搭建](BigData-Notes/notes/Flink开发环境搭建.md)
+ [Flink Data Source](BigData-Notes/notes/Flink_Data_Source.md)
+ [Flink Data Transformation](BigData-Notes/notes/Flink_Data_Transformation.md)
+ [Flink Data Sink](BigData-Notes/notes/Flink_Data_Sink.md)
+ [Flink 窗口模型](BigData-Notes/notes/Flink_Windows.md)
+ [Flink 状态管理与检查点机制](BigData-Notes/notes/Flink状态管理与检查点机制.md)
+ [Flink Standalone 集群部署](BigData-Notes/notes/installation/Flink_Standalone_Cluster.md)
+ [超详细笔记](Flink/Direction.md)


## Doris

+ [官方文档](https://doris.apache.org/zh-CN/docs/dev/get-starting/what-is-apache-doris/)
+ [Doris 课件资料](Doris/Direction.md)


## CDH

+ [CDH官方文档](https://docs.cloudera.com/documentation/enterprise/latest/topics/introduction.html)
+ [CDH 课件资料](CDH/Direction.md)


-------------------

## 贡献者

请阅读**CONTRIBUTING.md** 查阅为该项目做出贡献的开发者。

#### 如何参与开源项目

贡献使开源社区成为一个学习、激励和创造的绝佳场所。你所作的任何贡献都是**非常感谢**的。


1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request


## 版本控制

该项目使用Git进行版本管理。您可以在repository参看当前可用版本。

<!-- ## 作者 -->
<!--  -->
<!-- [小昊子](https://github.com/worst001) -->
<!--  -->
<!-- 制做不易，如果有帮到你就请作者喝杯咖啡吧! -->
<!--  -->
<!-- ![支付宝加微信](https://xiyou-oss.oss-cn-shanghai.aliyuncs.com/%E5%85%AC%E4%BC%97%E5%8F%B7%E4%B8%8E%E6%94%AF%E4%BB%98/%E6%94%AF%E4%BB%98%E5%AE%9D%E5%8A%A0%E5%BE%AE%E4%BF%A1.jpg) -->
<!--  -->
<!-- 作者无聊时做的测试游戏，完全免费哦！ -->
<!--  -->
<!-- ![公众号](https://xiyou-oss.oss-cn-shanghai.aliyuncs.com/%E5%85%AC%E4%BC%97%E5%8F%B7%E4%B8%8E%E6%94%AF%E4%BB%98/%E5%85%AC%E4%BC%97%E5%8F%B7%E5%B0%8F.jpg) -->

## 参考资料

[尚硅谷系列教程资料](http://www.atguigu.com/opensource.shtml)

[https://docs.cloudera.com/documentation](https://docs.cloudera.com/documentation)

[https://github.com/bjmashibing/Flink-Study](https://github.com/bjmashibing/Flink-Study)

[https://github.com/heibaiying/BigData-Notes](https://github.com/heibaiying/BigData-Notes)

<!-- links -->
[your-project-path]:shaojintian/Best_README_template
[contributors-shield]: https://img.shields.io/github/contributors/worst001/mkdocs_bigdata.svg?style=flat-square
[contributors-url]: https://github.com/worst001/mkdocs_bigdata/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/worst001/mkdocs_bigdata.svg?style=flat-square
[forks-url]: https://github.com/worst001/mkdocs_bigdata/network/members
[stars-shield]: https://img.shields.io/github/stars/worst001/mkdocs_bigdata.svg?style=flat-square
[stars-url]: https://github.com/worst001/mkdocs_bigdata/stargazers
[issues-shield]: https://img.shields.io/github/issues/worst001/mkdocs_bigdata.svg?style=flat-square
[issues-url]: https://img.shields.io/github/issues/worst001/mkdocs_bigdata.svg
[license-shield]: https://img.shields.io/github/license/worst001/mkdocs_bigdata.svg?style=flat-square
[license-url]: https://github.com/worst001/mkdocs_bigdata/blob/main/LICENSE.txt
<!-- [linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=flat-square&logo=linkedin&colorB=555 -->
<!-- [linkedin-url]: https://linkedin.com/in/shaojintian -->

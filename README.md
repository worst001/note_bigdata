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

### 参考文档

[Hadoop 随堂笔记](Hadoop/Hadoop 随堂笔记.md)

[大数据概论](Hadoop/笔记/01_尚硅谷大数据技术之大数据概论.pdf)

[Hadoop_入门](Hadoop/笔记/02_尚硅谷大数据技术之Hadoop（入门）V3.3.pdf)

[Hadoop_HDFS](Hadoop/笔记/03_尚硅谷大数据技术之Hadoop（HDFS）V3.3.pdf)

[Hadoop_MapReduce](Hadoop/笔记/04_尚硅谷大数据技术之Hadoop（MapReduce）V3.3.pdf)

[Hadoop_Yarn](Hadoop/笔记/05_尚硅谷大数据技术之Hadoop（Yarn）V3.3.pdf)

[Hadoop_生产调优手册](Hadoop/笔记/06_尚硅谷大数据技术之Hadoop（生产调优手册）V3.3.pdf)

[Hadoop_源码解析](Hadoop/笔记/07_尚硅谷大数据技术之Hadoop（源码解析）V3.3.pdf)


## 数仓建设

### 参考文档

[大数据与数仓随堂笔记](数仓建设/大数据与数仓.md)

[用户行为采集平台](数仓建设/笔记/尚硅谷大数据项目之尚品汇（1用户行为采集平台）V4.1.0.pdf)

[业务数据采集平台](数仓建设/笔记/尚硅谷大数据项目之尚品汇（2业务数据采集平台）V4.1.0.pdf)

[数据仓库系统](数仓建设/笔记/尚硅谷大数据项目之尚品汇（3数据仓库系统）V4.2.0.pdf)

[可视化报表Superset](数仓建设/笔记/尚硅谷大数据项目之尚品汇（4可视化报表Superset）V4.0.pdf)

[即席查询Presto&Kylin](数仓建设/笔记/尚硅谷大数据项目之尚品汇（5即席查询Presto&Kylin）V4.0.pdf)

[集群监控Zabbix](数仓建设/笔记/尚硅谷大数据项目之尚品汇（6集群监控Zabbix）V4.1.pdf)

[用户认证Kerberos](数仓建设/笔记/尚硅谷大数据项目之尚品汇（7用户认证Kerberos）V4.1.pdf)

[安全环境实战](数仓建设/笔记/尚硅谷大数据项目之尚品汇（8安全环境实战）V4.0.pdf)

[权限管理Ranger](数仓建设/笔记/尚硅谷大数据项目之尚品汇（9权限管理Ranger）V4.0.pdf)

[元数据管理Atlas](数仓建设/笔记/尚硅谷大数据项目之尚品汇（10元数据管理Atlas）V4.0.pdf)

[数据质量管理](数仓建设/笔记/尚硅谷大数据项目之尚品汇（11数据质量管理）V4.0.pdf)


## Hive

### 参考文档

[Hive 学习笔记](Hive/Hive 学习笔记.md)

[尚硅谷_Hive_技术](Hive/尚硅谷大数据技术之Hive（V4.8.0）.pdf)


## HBase

### 参考文档
[尚硅谷_HBase_pdf](HBase/笔记/尚硅谷大数据技术之HBase.pdf)


## Flume

### 参考文档
[尚硅谷_Flume_pdf](Flume/笔记/尚硅谷大数据技术之Flume.pdf)


## Spark

### 参考文档

[Spark 学习笔记](Spark/Spark学习笔记.md)

[SparkCore](Spark/笔记/01_尚硅谷大数据技术之SparkCore.pdf)

[SparkSql](Spark/笔记/02_尚硅谷大数据技术之SparkSql.pdf)

[SparkStreaming](Spark/笔记/03_尚硅谷大数据技术之SparkStreaming.pdf)

[Spark内核](Spark/笔记/04_尚硅谷大数据技术之Spark内核.pdf)

[Spark优化](Spark/笔记/05_尚硅谷大数据技术之Spark优化.pdf)

[Spark源码](Spark/笔记/07-尚硅谷大数据技术之Spark源码.pdf)


## Flink

### 参考文档

[Flink 随堂笔记](Flink/Flink随堂笔记.md)

[超详细笔记](Flink/笔记/Flink超神文档.pdf)

[Flink_Java_pdf](Flink/笔记/尚硅谷大数据技术之Flink1.13（Java）.pdf)

[Flink_Scala_pdf](Flink/笔记/尚硅谷大数据之Flink（Scala版）.pdf)


## Doris

### 参考文档
[尚硅谷_Doris](Doris/笔记/尚硅谷大数据技术之Apache Doris.pdf)


## CDH

### 参考文档

[CDH 中文手册](CDH/Cloudera-Manager(中文手册).pdf)

[尚硅谷_用户行为采集平台](CDH/笔记/尚硅谷大数据项目之CDH电商数仓（1用户行为采集平台）V5.0.pdf)

[尚硅谷_业务数据采集平台](CDH/笔记/尚硅谷大数据项目之CDH电商数仓（2业务数据采集平台）V5.0.pdf)

[尚硅谷_电商数据仓库系统](CDH/笔记/尚硅谷大数据项目之CDH电商数仓（3电商数据仓库系统）V5.0.pdf)

[尚硅谷_可视化报表](CDH/笔记/尚硅谷大数据项目之CDH电商数仓（4可视化报表）.pdf)


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
[https://github.com/Tinywan/lua-nginx-redis](https://github.com/Tinywan/lua-nginx-redis)

[https://www.kuangstudy.com/bbs/1354069127022583809](https://www.kuangstudy.com/bbs/1354069127022583809)

[尚硅谷系列教程资料](http://www.atguigu.com/opensource.shtml)

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

<!-- PROJECT SHIELDS -->

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![Stargazers][stars-shield]][stars-url]
<!-- [![LinkedIn][linkedin-shield]][linkedin-url] -->

<!-- PROJECT LOGO -->

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

## Hadoop

### 参考文档

[Hadoop_随堂笔记](Hadoop/Hadoop_随堂笔记.md)

[分布式文件存储系统 —— HDFS](BigData-Notes/notes/Hadoop-HDFS.md)

[分布式计算框架 —— MapReduce](BigData-Notes/notes/Hadoop-MapReduce.md)

[集群资源管理器 —— YARN](BigData-Notes/notes/Hadoop-YARN.md)

[Hadoop 单机伪集群环境搭建](BigData-Notes/notes/installation/Hadoop单机环境搭建.md)

[Hadoop 集群环境搭建](BigData-Notes/notes/installation/Hadoop集群环境搭建.md)

[HDFS 常用 Shell 命令](BigData-Notes/notes/HDFS常用Shell命令.md)

[HDFS Java API 的使用](BigData-Notes/notes/HDFS-Java-API.md)

[基于 Zookeeper 搭建 Hadoop 高可用集群](BigData-Notes/notes/installation/基于Zookeeper搭建Hadoop高可用集群.md)

[Hadoop 课件资料](Hadoop/Direction.md)


### 基本介绍

#### Hadoop是一个开源的分布式计算框架
Hadoop是一个开源的分布式计算框架，旨在处理大规模数据集的存储和处理问题。它提供了一种可靠、可扩展和高效的方式来处理和分析大数据。

#### Hadoop的核心组件包括
+ Hadoop分布式文件系统（HDFS）：
    + HDFS是一个分布式文件系统，用于存储大规模数据集。它将数据分布在集群中的多台计算机上，提供高容错性和可靠性。
+ MapReduce编程模型：
    + MapReduce是一种用于并行计算的编程模型，它允许在分布式环境中处理大规模数据集。MapReduce将数据分为多个小块，并通过Map和Reduce两个阶段进行处理和聚合。
+ YARN资源管理器：
    + YARN（Yet Another Resource Negotiator）是Hadoop的资源管理器，负责集群资源的分配和任务的调度。它允许多种应用程序共享和管理集群资源。

除了这些核心组件，Hadoop生态系统还包括许多其他工具和组件，如Hive（用于数据仓库和查询）、Pig（用于数据分析和转换）、Spark（用于高速数据处理和机器学习）等。
Hadoop的优势在于它的可扩展性、容错性和成本效益。通过将大规模数据集分布在多台计算机上进行处理，Hadoop能够有效地处理海量数据，并提供高度可靠的数据存储和处理解决方案。
然而，使用Hadoop进行数据处理和分析需要一定的技术和基础知识。在实际应用中，通常需要配置和管理Hadoop集群，并编写适合MapReduce编程模型的任务。因此，对于初学者来说，可能需要一定的学习和实践才能充分发挥Hadoop的潜力。


## 数仓建设

### 参考文档

[大数据与数仓随堂笔记](数仓建设/大数据与数仓.md)

[数仓建设课件资料](数仓建设/Direction.md)

### 基本介绍

#### 构建和管理企业或组织的数据仓库

数仓建设（Data Warehouse Construction）是指构建和管理企业或组织的数据仓库（Data Warehouse）的过程。数据仓库是一个集成的、面向主题的、时间一致的、非易失性的数据集合，用于支持企业的决策制定和业务分析。

#### 数仓建设通常包括以下关键步骤

+ 需求分析：
    + 与业务部门和利益相关者合作，了解业务需求和数据分析目标，明确需要构建的数据仓库的范围和功能。
+ 数据采集与清洗：
    + 收集来自不同数据源的数据，并进行清洗、转换和集成，以确保数据的一致性和可用性。这可能涉及数据抽取、转换和加载（ETL）过程。
+ 数据建模：
    + 设计和构建数据仓库的逻辑模型和物理模型。常见的数据模型包括维度模型（如星型模型、雪花模型）和规范化模型（如第三范式）。
+ 数据存储与管理：
    + 选择适当的技术和工具来存储和管理数据仓库。常见的选择包括关系型数据库（如Oracle、MySQL）、列式数据库（如Vertica、Redshift）和大数据技术（如Hadoop、Spark）。
+ 数据质量与治理：
    + 确保数据的质量和准确性，包括数据验证、清理、去重和监控。同时，建立数据治理策略和流程，确保数据的安全性和合规性。
+ 报表与分析：
    + 为用户提供易于使用和理解的报表和分析工具，以便进行数据查询、可视化和业务分析。常见的工具包括商业智能（BI）工具、数据可视化工具和自助查询工具。
+ 持续优化与演进：
    + 数据仓库是一个持续演进的过程，需要根据业务需求和数据变化进行调整和优化。这包括性能优化、数据增量更新、新数据源集成等。

通过数仓建设，企业可以将分散的、杂乱的数据整合起来，提供一致、准确的数据，为决策和业务分析提供支持。数仓建设可以提高数据的可靠性和可用性，帮助企业更好地理解业务情况，做出基于数据的决策，并发现潜在的商业机会。


## Hive

### 参考文档

[Hive_学习笔记](Hive/Hive_学习笔记.md)

[Hive 简介及核心概念](BigData-Notes/notes/Hive简介及核心概念.md)

[Linux 环境下 Hive 的安装部署](BigData-Notes/notes/installation/Linux环境下Hive的安装部署.md)

[Hive CLI 和 Beeline 命令行的基本使用](BigData-Notes/notes/HiveCLI和Beeline命令行的基本使用.md)

[Hive 常用 DDL 操作](BigData-Notes/notes/Hive常用DDL操作.md)

[Hive 分区表和分桶表](BigData-Notes/notes/Hive分区表和分桶表.md)

[Hive 视图和索引](BigData-Notes/notes/Hive视图和索引.md)

[Hive 常用 DML 操作](BigData-Notes/notes/Hive常用DML操作.md)

[Hive 数据查询详解](BigData-Notes/notes/Hive数据查询详解.md)

[Hive 课件资料](Hive/Direction.md)

### 基本介绍

#### Hive 是一个基于 Hadoop 的数据仓库工具
Hive 是一个基于 Hadoop 的数据仓库工具，它提供了类似于 SQL 的查询语言和分析能力，使用户能够方便地处理大规模的结构化和半结构化数据。

#### 以下是 Hive 的一些重要特点和功能
+ SQL-Like 查询语言：
    + Hive 支持类似于 SQL 的查询语言，称为 HiveQL。这使得熟悉 SQL 的开发人员可以轻松地使用 Hive 进行数据查询、过滤和聚合等操作。
+ 面向列存储：
    + Hive 使用面向列存储的方式来存储数据，这有助于提高查询性能和压缩数据大小。它将数据按列存储在 Hadoop 分布式文件系统（HDFS）中，只检索所需的列，减少了 I/O 开销。
+ 扩展性和容错性：
    + Hive 是建立在 Hadoop 生态系统之上的，利用了 Hadoop 的分布式计算和存储能力。它能够处理大规模数据集，并提供高度可扩展性和容错性。
+ 数据转换与集成：
    + Hive 提供了强大的数据转换和集成功能，可以将不同格式的数据进行转换和加载。它支持各种数据源，如文本文件、CSV、JSON 等，并提供了丰富的内置函数和表达式来处理数据。
+ 可编程性和扩展性：
    + Hive 具有良好的可编程性，用户可以使用自定义函数（UDF）和自定义聚合函数（UDAF）来扩展 Hive 的功能。此外，Hive 还支持用户定义的 MapReduce 任务和脚本任务。
+ 集成查询工具和可视化平台：
    + Hive 可以与各种商业智能（BI）工具和数据可视化平台集成，例如 Tableau、Power BI 等。这样，用户可以使用他们熟悉的工具来查询和分析 Hive 中的数据。

Hive 主要用于大规模数据的分析、报表生成和数据探索等场景。它为那些熟悉 SQL 查询的用户提供了一种方便而灵活的方式来处理和分析 Hadoop 生态系统中的数据。


## HBase

### 参考文档

[Hbase 简介](BigData-Notes/notes/Hbase简介.md)

[HBase 系统架构及数据结构](BigData-Notes/notes/Hbase系统架构及数据结构.md)

[HBase 基本环境搭建](BigData-Notes/notes/installation/HBase单机环境搭建.md)

[HBase 集群环境搭建](BigData-Notes/notes/installation/HBase集群环境搭建.md)

[HBase 常用 Shell 命令](BigData-Notes/notes/Hbase_Shell.md)

[HBase Java API](BigData-Notes/notes/Hbase_Java_API.md)

[HBase 过滤器详解](BigData-Notes/notes/Hbase过滤器详解.md)

[HBase 协处理器详解](BigData-Notes/notes/Hbase协处理器详解.md)

[HBase 容灾与备份](BigData-Notes/notes/Hbase容灾与备份.md)

[HBase的 SQL 中间层 —— Phoenix](BigData-Notes/notes/Hbase的SQL中间层_Phoenix.md)

[Spring/Spring Boot 整合 Mybatis + Phoenix](BigData-Notes/notes/Spring+Mybtais+Phoenix整合.md)

[HBase 课件资料](HBase/Direction.md)

### 基本介绍

#### HBase 是一个分布式、面向列的 NoSQL 数据库

HBase 是一个分布式、面向列的 NoSQL 数据库，构建在 Hadoop 生态系统之上。它提供了高可靠性、高性能和可扩展性的数据存储解决方案，适用于需要快速读写大规模数据的场景。

#### 以下是 HBase 的一些关键特点和功能

+ 分布式架构：
    + HBase 基于 Hadoop 分布式文件系统（HDFS）构建，使用分布式存储和计算的方式来处理海量数据。数据被分区并分布在多个节点上，实现数据的高可靠性和容错性。
+ 面向列存储：
    + HBase 是面向列的数据库，将数据按列族进行组织和存储。这种存储方式使得读取特定列的数据非常高效，并且可以灵活地添加或删除列。
+ 强一致性：
    + HBase 提供强一致性的读写操作，确保数据的原子性和一致性。它支持原子写入和读取操作，并提供乐观并发控制机制，以处理并发访问的情况。
+ 水平扩展性：
    + HBase 具有良好的可扩展性，可以通过增加更多的节点来扩展存储容量和吞吐量。它自动负载均衡数据，并允许水平分片数据以实现更好的性能和可用性。
+ 快速读写：
    + HBase 提供了快速的读写操作，适合于需要低延迟的应用场景。它支持随机读写，可以根据行键（Row Key）进行高效的数据访问。
+ 支持多种数据模型：
    + 除了键值存储，HBase 还支持多维映射、列限定符索引和复杂的数据结构（如列表、集合和映射）。这使得 HBase 可以存储和查询更复杂的数据类型。

HBase 主要用于需要快速读写和海量数据存储的场景，例如实时分析、日志处理、在线交易等。它在互联网、电子商务、社交媒体等领域得到广泛应用，为这些领域提供了强大的数据存储和访问能力。


## Flume

### 参考文档

[Flume 简介及基本使用](BigData-Notes/notes/Flume简介及基本使用.md)

[Linux 环境下 Flume 的安装部署](BigData-Notes/notes/installation/Linux下Flume的安装.md)

[Flume 整合 Kafka](BigData-Notes/notes/Flume整合Kafka.md)

[Flume 课件资料](Flume/Direction.md)

### 基本介绍

#### Flume 是一个开源的分布式日志收集工具
Flume 是一个开源的分布式日志收集工具，用于可靠、高效地收集、聚合和传输大量的日志数据。它是为了解决大规模数据流式传输和处理的需求而设计的。

#### 以下是 Flume 的一些关键特点和功能
+ 可靠性：
    + Flume 提供了可靠的数据传输机制，确保数据的可靠性和完整性。它支持故障恢复和失败重试，能够处理网络中断、节点故障等异常情况。
+ 可扩展性：
    + Flume 具有良好的可扩展性，可以通过添加新的代理节点来扩展处理能力。它采用分布式架构，支持水平扩展和负载均衡。
+ 多种数据源和目的地：
    + Flume 支持多种数据源和目的地的集成，如日志文件、网络流、消息队列等。它提供了丰富的插件和适配器，方便与不同的数据系统进行集成。
+ 灵活的数据传输：
    + Flume 提供了多种传输方式，包括内存通道、文件通道和JDBC通道等。可以根据具体需求选择合适的通道和数据传输机制。
+ 数据过滤和转换：
    + Flume 允许对数据进行过滤、转换和格式化，以满足特定的数据处理需求。它支持使用拦截器（interceptors）进行数据预处理和操作。
+ 可视化监控和管理：
    + Flume 提供了可视化的监控和管理界面，用于实时监控数据流、查看传输状态和性能指标，并进行配置和管理。

Flume 主要用于大规模日志数据的采集和传输场景，例如应用日志收集、系统监控、事件处理等。它可以与其他数据处理工具和平台（如Hadoop、Kafka、Spark等）结合使用，构建完整的数据流处理和分析解决方案。


## Kerbros

### 参考文档

[Kerbros](https://app.yinxiang.com/fx/9a5651d6-50d4-4ae1-8b74-376d04157d28)

### 基本介绍

Kerberos是一个网络身份验证协议，用于在计算机网络中实现安全的身份验证。它提供了一种强大的机制，以确保用户和服务之间的身份验证和通信的安全性。

#### Kerberos的一些要点
+ 安全认证
    + Kerberos通过使用加密技术，确保用户在网络上进行安全认证。它基于对称密钥加密和票据系统来验证用户的身份，并生成临时凭证（票据）供用户在网络上进行访问。
+ 三个主要角色
    + Kerberos涉及三个主要角色：客户端、认证服务器（AS）和票据授权服务器（TGS）。客户端向AS请求访问权限并获取票据，然后使用该票据向TGS请求特定服务的票据，最后使用该票据向目标服务进行身份验证和通信。
+ 单点登录
    + Kerberos实现了单点登录（Single Sign-On，SSO）功能，使用户可以在网络环境中使用一组凭证登录多个服务，而不需要为每个服务单独输入凭证。一旦用户通过Kerberos获得了初始票据，他们可以在整个会话中使用该票据来访问多个受保护的服务。
+ 安全性：
    + Kerberos通过使用加密技术和令牌传递来确保通信的安全性。它使用共享密钥加密算法，确保票据的机密性，并在网络上传输使用票据进行安全通信。
+ 跨平台支持：
    + Kerberos是一种跨平台的身份验证协议，可以在各种操作系统和应用程序中实现。它被广泛应用于企业环境中，以提供网络身份验证和访问控制。


## Spark

### 参考文档

[Spark 学习笔记](Spark/Spark学习笔记.md)

[Spark 课件资料](Spark/Direction.md)

#### Spark Core

[Spark 简介](BigData-Notes/notes/Spark简介.md)

[Spark 开发环境搭建](BigData-Notes/notes/installation/Spark开发环境搭建.md)

[弹性式数据集 RDD](BigData-Notes/notes/Spark_RDD.md)

[RDD 常用算子详解](BigData-Notes/notes/Spark_Transformation和Action算子.md)

[Spark 运行模式与作业提交](BigData-Notes/notes/Spark部署模式与作业提交.md)

[Spark 累加器与广播变量](BigData-Notes/notes/Spark累加器与广播变量.md)

[基于 Zookeeper 搭建 Spark 高可用集群](BigData-Notes/notes/installation/Spark集群环境搭建.md)

#### Spark SQL

[DateFrame 和 DataSet](BigData-Notes/notes/SparkSQL_Dataset和DataFrame简介.md)

[Structured API 的基本使用](BigData-Notes/notes/Spark_Structured_API的基本使用.md)

[Spark SQL 外部数据源](BigData-Notes/notes/SparkSQL外部数据源.md)

[Spark SQL 常用聚合函数](BigData-Notes/notes/SparkSQL常用聚合函数.md)

[Spark SQL JOIN 操作](BigData-Notes/notes/SparkSQL联结操作.md)

#### Spark Streaming

[Spark Streaming 简介](BigData-Notes/notes/Spark_Streaming与流处理.md)

[Spark Streaming 基本操作](BigData-Notes/notes/Spark_Streaming基本操作.md)

[Spark Streaming 整合 Flume](BigData-Notes/notes/Spark_Streaming整合Flume.md)

[Spark Streaming 整合 Kafka](BigData-Notes/notes/Spark_Streaming整合Kafka.md)

### 基本介绍

#### Spark 是一个开源的大数据处理框架
Spark 是一个开源的大数据处理框架，旨在提供高速、通用和易于使用的数据分析和计算能力。它支持分布式数据处理，并提供了丰富的库和工具，用于处理大规模数据集、实时流数据和机器学习等任务。

#### 以下是 Spark 的一些关键特点和功能

+ 快速性能：
    + Spark 通过内存计算和基于 DAG（有向无环图）的执行引擎，实现了比传统 MapReduce 更快的数据处理能力。它将数据加载到内存中进行计算，减少了磁盘 I/O 开销。
+ 通用性：
    + Spark 提供了统一的编程模型，支持多种编程语言（如 Scala、Java、Python 和 R），并提供了丰富的 API 和库，适用于批处理、交互式查询、流处理和机器学习等各种场景。
+ 弹性分布式数据集（RDD）：
    + Spark 基于 RDD 进行数据处理，它是一个可分区、可容错、可并行操作的不可变数据集合。RDD 可以在内存中缓存数据，并支持多次计算重用。
+ 流数据处理：
    + Spark Streaming 模块允许对实时数据流进行处理和分析。它提供了类似于批处理的 API 接口，能够以微批次方式实时处理数据。
+ 机器学习和图计算：
    + Spark 提供了 MLlib 和 GraphX 库，用于机器学习和图计算。MLlib 包含了常见的机器学习算法和工具，GraphX 则提供了图计算的能力。
+ 集成生态系统：
    + Spark 可以与许多其他大数据工具和平台进行集成，如 Hadoop、Hive、HBase、Kafka 等。这使得用户可以利用现有的数据存储和处理基础设施，并扩展 Spark 的功能。

Spark 主要应用于大规模数据处理和分析场景，例如数据清洗、特征提取、数据挖掘、实时数据分析等。它在快速性能、通用性和易用性方面具有优势，并且拥有活跃的社区和广泛的应用案例。


## Flink

### 参考文档

[Flink 随堂摘要](Flink/Flink随堂笔记.md)

[Flink 核心概念综述](BigData-Notes/notes/Flink核心概念综述.md)

[Flink 开发环境搭建](BigData-Notes/notes/Flink开发环境搭建.md)

[Flink Data Source](BigData-Notes/notes/Flink_Data_Source.md)

[Flink Data Transformation](BigData-Notes/notes/Flink_Data_Transformation.md)

[Flink Data Sink](BigData-Notes/notes/Flink_Data_Sink.md)

[Flink 窗口模型](BigData-Notes/notes/Flink_Windows.md)

[Flink 状态管理与检查点机制](BigData-Notes/notes/Flink状态管理与检查点机制.md)

[Flink Standalone 集群部署](BigData-Notes/notes/installation/Flink_Standalone_Cluster.md)

[Flink 课件资料](Flink/Direction.md)


### 基本介绍

#### Flink（Apache Flink）是一个开源的流处理和批处理框架

Flink（Apache Flink）是一个开源的流处理和批处理框架，它提供了高性能、可靠性和可伸缩性的数据处理能力。Flink 在大规模数据处理和实时数据流场景下表现出色，并支持事件时间处理、状态管理和容错恢复等功能。

#### 以下是 Flink 的一些关键特点和功能

+ 流处理和批处理：
    + Flink 同时支持流处理和批处理，可以处理无界的实时数据流以及有界的批量数据。这使得 Flink 能够在不同场景下灵活地进行数据处理和分析。
+ 事件驱动和准确性：
    + Flink 是基于事件驱动的流处理框架，支持事件时间处理和水印机制，确保数据的准确性和正确性。它能够处理乱序数据和延迟数据，并提供窗口操作和事件时间窗口的支持。
+ 低延迟和高吞吐量：
    + Flink 基于流式计算模型，采用了内存计算和基于任务图的执行引擎，具备低延迟和高吞吐量的处理能力。它将计算结果保存在内存中，减少了磁盘 I/O 开销。
+ 状态管理和容错恢复：
    + Flink 提供了一致性的分布式状态管理，以保持数据处理的一致性和可靠性。它支持检查点机制，能够实现故障恢复和容错性。
+ 灵活的事件驱动编程模型：
    + Flink 提供了基于流和转换操作的丰富 API 和编程模型，如 DataStream API 和 DataSet API，使开发人员可以方便地编写复杂的数据处理逻辑。
+ 集成生态系统：
    + Flink 可以与其他大数据工具和平台集成，如 Hadoop、Kafka、Hive、Elasticsearch 等。这使得用户可以利用现有的数据存储和消息队列，以及扩展 Flink 的功能。

Flink 主要应用于实时数据分析、事件驱动应用、实时报表生成、机器学习等场景。它在事件时间处理、状态管理和容错恢复等方面具有优势，并且具备高性能和可伸缩性的特点。Flink 社区活跃，持续推出新的功能和改进，受到越来越多的关注和应用。


## Doris

### 参考文档

[官方文档](https://doris.apache.org/zh-CN/docs/dev/get-starting/what-is-apache-doris/)

[Doris 课件资料](Doris/Direction.md)

### 基本介绍

#### 是一个开源的分布式实时数据仓库

Doris（原名 Apache Doris，现更名为 Pegasus）是一个开源的分布式实时数据仓库，旨在提供高性能、低延迟的数据分析和查询能力。它最初由百度公司开发，并于2018年贡献给 Apache 基金会，成为 Apache 孵化器项目。

#### 以下是 Doris 的一些关键特点和功能

+ 分布式架构：
    + Doris 使用分布式架构来存储和处理大规模数据集。它将数据分片存储在多个节点上，以实现数据的水平扩展和并行处理。
+ 实时数据分析：
    + Doris 提供了实时数据分析和查询能力，支持秒级查询响应和实时数据更新。它通过使用类似于 Google Dremel 的技术来实现快速的交互式查询。
+ 高可靠性和容错性：
    + Doris 具备高可靠性和容错性，支持数据冗余和故障恢复机制。它通过数据复制和副本机制来保证数据的可靠性和一致性。
+ 列式存储和压缩：
    + Doris 使用列式存储和压缩算法来优化数据的存储和查询效率。它可以按需读取特定列，减少不必要的 I/O 操作，并提供多种压缩算法来减小数据存储空间。
+ 高性能的并行计算：
    + Doris 使用分布式查询引擎进行并行计算，以提供高性能的数据分析和查询。它支持并行扫描、过滤、聚合和排序等操作，以快速处理大规模数据。
+ 多维分析和 OLAP 支持：
    + Doris 提供了多维分析和 OLAP（联机分析处理）的支持，包括针对大规模数据集的复杂查询和聚合操作。它支持多级数据分层和预计算，以提高查询效率。

Doris 主要应用于需要实时数据分析和查询的场景，如在线报表生成、业务分析、监控和指标分析等。它具备高性能、低延迟和可扩展性的特点，适用于大规模数据集的存储和处理。

## CDH

### 参考文档


[CDH官方文档](https://docs.cloudera.com/documentation/enterprise/latest/topics/introduction.html)

[CDH 课件资料](CDH/Direction.md)

### 基本介绍

#### 是由Cloudera提供的一个集成的大数据平台

CDH（Cloudera Distribution for Hadoop）是由Cloudera提供的一个集成的大数据平台，它基于Apache Hadoop生态系统构建而成。CDH旨在简化大数据的部署、管理和操作，并提供了一套全面的工具和组件来处理和分析大规模的数据。

#### CDH包含了以下主要组件和工具

+ Apache Hadoop：
    + CDH使用Apache Hadoop作为其核心组件，包括Hadoop分布式文件系统（HDFS）用于存储大数据，以及Hadoop YARN用于资源管理和作业调度。
+ Apache Spark：
    + CDH集成了Apache Spark，这是一个快速、通用的大数据处理框架，支持批处理、流处理和机器学习等多种数据处理任务。
+ Apache Hive：
    + CDH中的Apache Hive提供了类似于SQL的查询语言，使用户可以通过HiveQL编写查询来分析存储在Hadoop上的数据。
+ Apache Impala：
    + Impala是CDH中的交互式SQL查询引擎，它能够实时查询存储在Hadoop上的数据，提供更快的查询响应时间。
+ Apache HBase：
    + CDH还包含了Apache HBase，这是一个分布式的、可扩展的NoSQL数据库，适用于高吞吐量的随机读写操作。
+ Apache Kafka：
    + CDH中也集成了Apache Kafka，用于高性能的实时数据流处理和消息传递。

除了上述核心组件外，CDH还包含其他许多工具和组件，如Cloudera Manager用于集群管理和监控、Apache Flume用于可靠地收集、聚合和移动大量日志数据、Apache Sqoop用于在Hadoop和关系型数据库之间进行数据传输等。

总的来说，CDH提供了一个完整且易于使用的大数据平台，使用户能够轻松地部署、管理和分析大规模的数据。它的灵活性和丰富的生态系统使得CDH成为企业级大数据处理的理想选择。


<!-- links -->
[your-project-path]:shaojintian/Best_README_template
[contributors-shield]: https://img.shields.io/github/contributors/worst001/note_bigdata.svg?style=flat-square
[contributors-url]: https://github.com/worst001/note_bigdata/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/worst001/note_bigdata.svg?style=flat-square
[forks-url]: https://github.com/worst001/note_bigdata/network/members
[stars-shield]: https://img.shields.io/github/stars/worst001/note_bigdata.svg?style=social
[stars-url]: https://github.com/worst001/note_bigdata/stargazers
[issues-shield]: https://img.shields.io/github/issues/worst001/note_bigdata.svg?style=flat-square
[issues-url]: https://img.shields.io/github/issues/worst001/note_bigdata.svg
[license-shield]: https://img.shields.io/github/license/worst001/note_bigdata.svg?style=flat-square
[license-url]: https://github.com/worst001/note_bigdata/blob/main/LICENSE.txt

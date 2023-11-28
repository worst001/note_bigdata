-- User-Defined Table-Generating Functions

-- 使用Hive，首先需要将JSON数据存入Hive中：

CREATE TABLE jsondata (
  json_data STRING
);

LOAD DATA LOCAL INPATH 'jsondata.json' OVERWRITE INTO TABLE jsondata;

-- 然后可以使用Hive提供的get_json_object函数，从JSON字符串中提取出键值对：

SELECT
  get_json_object(json_data, '$.name') AS name,
  get_json_object(json_data, '$.price') AS price,
  get_json_object(json_data, '$.size') AS size
FROM jsondata;

-- 最后，可以使用Hive提供的STORE命令，将查询结果保存为关系表格：

STORE SELECT
  get_json_object(json_data, '$.name') AS name,
  get_json_object(json_data, '$.price') AS price,
  get_json_object(json_data, '$.size') AS size
FROM jsondata
INTO 'table.csv'
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
OVERWRITE;

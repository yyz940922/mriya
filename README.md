# mriya (运输机)

#### 介绍
使用Flink开发的实时ETL，数据从MySQL到Greenplum。使用canal解析MySQL的binlog，投放进kafka，使用Flink消费kafka并把数据组装进Greenplum，后续将会添加更多的数据源和目标源。


>> MySql ---> PostGreSql/Greenplum:

1. 支持近实时级别的数据增删改

2. 支持自动创建表

```
CREATE TABLE [IF NOT EXISTS] tbl_name create_definition: {...}
```

3. 支持MySql表结构的变更

```
ALTER TABLE tbl_name

  | ADD [COLUMN] col_name column_definition （支持）
  
  | ADD [COLUMN] (col_name column_definition,...)（支持）
  
  | DROP [COLUMN] col_name（支持）
  
  | MODIFY [COLUMN] col_name column_definition（支持）
  
```

#### 软件架构
软件架构说明


#### 安装教程

1.  xxxx
2.  xxxx
3.  xxxx

#### 使用说明

1.  xxxx
2.  xxxx
3.  xxxx

#### 快速体验
1. docker

#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request

#### 同步速度

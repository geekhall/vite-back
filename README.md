# Vite-Demo的后端项目

Vite-Demo的后端项目，采用SpringBoot开发

## 环境搭建


### 数据库

```sql

-- 创建数据库
create database db_yeb default charset=utf8;

-- 创建用户并授权;
use mysql;
CREATE USER 'yeb'@'%' IDENTIFIED BY '123456';

-- 为用户添加权限
GRANT ALL ON db_yeb.* TO 'yeb'@'%';
```

### 工程说明

* gh_generator： 使用`mybatis-plus-generator`从DB反向生成代码

这里需要注意的是使用了3.5.1版本的`mybatis-plus-generator` ，3.5.1版本的代码生成方式与之前版本是不同的。

* gh_server： 后端工程




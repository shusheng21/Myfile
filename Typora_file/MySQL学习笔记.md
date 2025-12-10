# MySQL安装和启动

以管理员身份运行命令提示符后

启动

```
net start mysql80
```

停止

```
net stop mysql80
```

登录mysql

```sql
mysql -h 主机名 -u 用户名 -p

登录本机的 MySQL 数据库，只需要输入以下命令即可：
mysql -u root -p

```



## 创建用户

```mysql
create user ‘username’ @ 'host' identified by 'password';
```

![image-20250725145323777](D:\APP_data\Typora文档\assets\image-20250725145323777.png)

## DDL

DDL-数据表操作

```SQL
一、查询
查询所有数据库
SHOW DATABASES;

查询当前数据库
SELECT DATABASE();

二、创建
CREATE DATABASE [IF NOT EXISTS] 数据库名 [DEFAULT CHARSET 字符集] [COLLATE 排序规则];

三、删除
DROP DATABASE [IF EXISTS] 数据库名;

四、使用
USE 数据库名;

```

表操作-查询

```sql
一、查询当前数据库所有表
SHOW TABLES;

二、查询表结构
DESC 表名；

三、查询表的建表语句
SHOW CREATE TABLE 表名；
```

表操作-创建

```sql
CREATE TABLE 表名(
    字段1  字段类型[COMMENT 字段1注释]，
    字段2  字段类型[COMMENT 字段2注释]，
    .....
    字段3  字段类型[COMMENT 字段3注释]
)[COMMENT 表注释];

注意：[...]为可选内容，最后一个字段后没有逗号
```

![image-20250725163820083](D:\APP_data\Typora文档\assets\image-20250725163820083.png)

数据类型

分为三类：数值类型、字符串类型、日期时间类型。

![image-20250725164209775](D:\APP_data\Typora文档\assets\image-20250725164209775.png)

![image-20250725165215837](D:\APP_data\Typora文档\assets\image-20250725165215837.png)

![image-20250725165227411](D:\APP_data\Typora文档\assets\image-20250725165227411.png)

![image-20250725165336823](D:\APP_data\Typora文档\assets\image-20250725165336823-1753433618313-1.png)

![image-20250725165645817](D:\APP_data\Typora文档\assets\image-20250725165645817.png)

```sql
create table emp(
	id int comment '编号',
    emp_id varchar(10) comment'员工工号'， 
	name varchar(10) comment'员工姓名'，
    agent char(1) comment'性别'，
    age tinyint unsigned comment'年龄'
    
)
```









```sql
CREATE DATABASE student;
CREATE DATABASE `database`;  //使用反引号（esc下面的）来区分关键字和名称，创建名为database的表；
SHOW DATABASE;    //显示数据库
DROP DATABASE `database`;  //删除数据表database;

  
```

创建表格和删除表格

![image-20250728101645659](D:\APP_data\Typora文档\assets\image-20250728101645659.png)

```sql
创建上述表格，id为主键
CREATE DATABASE student;
USE student;
CREATE TABLE `student`(
	`student_id` INT PRIMARY KEY,
    `name` VARCHAR(20),
    `major` VARCHAR(20)
);

主键的写法2：
CREATE TABLE `student`(
	`student_id` INT ,
    `name` VARCHAR(20),
    `major` VARCHAR(20)，
    PRIMARY KEY(`student_id`)    
);

DESCRIBE `student`;    //显示表格信息
DROP TABLE `student`;  //删除表格

ALTER TABLE `student` ADD gpa DECIMAL(3.2);  //添加一个列属性
ALTER TABLE	`student` DROP COLUMN gpa;   //删除gpa这个列属性；

补充：
DECIMAL(3,2);表示一个有三位数字，其中小数点后有2位的小数，eg 3.56
```

存入资料

```sql
CREATE TABLE `student`(
	`student_id` INT ,
    `name` VARCHAR(20),
    `major` VARCHAR(20)，
    PRIMARY KEY(`student_id`)    
);

INSERT INTO `student` VALUES(1,'小白'，"历史");  //varchar类型需要使用单引号或双引号。建议用单引号。  按着属性的顺序存 

SELECT * FROM `student`; //显示该表的所有信息；

INSERT INTO `student` VALUES(2,'小黑'，'生物'); 
INSERT INTO `student` VALUES(3,'小绿'，NULL);   //使用NULL表示空白

填入数据的另一种写法，自行决定写入的顺序
INSERT INTO `student`(`name`,`major`,`student_id`) VALUES('小蓝','英语',4);
空白值写法1：

```

限制和约束

```sql
DROP TABLE `student`;
CREATE TABLE `student`(
    student_id INT UNIQUE,
    name VARCHAR(20) NOT NULL,
    major VARCHAR(20) DEFAULT '数学'
);
//student_id 值不可以重复；name 不可以为空；default表如果新增行没有设置major时就默认为“历史”。

DROP TABLE `student`;
CREATE TABLE `student`(
    student_id INT AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    major VARCHAR(20) DEFAULT '数学'
);
//STUDENT_IDz自动递增1，新增资料时就不需要写id了
```

修改、删除数据

```sql
MySql Workbench预设的更新模式会让很多练习没法做，需先关闭
SET SQL_SAFE_UPDATES = 0;

CREATE TABLE `student`(
	`student_id` INT PRIMARY KEY,
    `name` VARCHAR(20),
    `major` VARCHAR(20),
    `score` INT
);
INSERT INTO `student`('小白','英语',50);
INSERT INTO `student`('小黄','生物',90);
INSERT INTO `student`('小绿','历史',70);
INSERT INTO `student`('小兰','英语',80);
INSERT INTO `student`('小黑','化学',20);

//将英语全部改成英语文学
UPDATE `student`
SET `major` = '英语文学'
WHERE `major` = '英语';

//把生物和化学改成生化系
UPDATE `student`
SET `major` = '生化系'
WHERE `major` = '生物' OR `major` = '化学';

//修改iD为1的信息
UPDATE `student`
SET `name` = '小胡', `major` = '人工智能'
WHERE `student_id` = 1;

//把资料里所有的major都改成‘物理’
UPDATE `student`
SET `major` = '物理';

//删除数据
//删除id=4的资料
DELETE FROM `student`
WHERE `student_id` = 4;

//删除分数小于60的数据
DELETE FROM `student`
WHERE `score` < 60;
//大于等于：  >=
//小于等于：  <=
// 不等于：   <>

//删除学生表中的所有数据
DELETE FROM `student`;
```

获取资料

```sql
//显示该表的所有信息；
SELECT * FROM `student`; 
//获取单个属性信息：
SELECT `name` FROM `student`;
//获取多个属性信息：
SELECT `name`, `major` FROM `student`;

//ORDER BY 排序   默认是升序，DESC降序。
//按照成绩升序排列
SELECT *
FROM `student`
ORDER BY `score`;  //相当于ORDER BY `score` ASC;

//按照成绩降序排列
SELECT *
FROM `student`
ORDER BY `score` DESC;

ORDER BY `score` ,`student_id`;  //先根据分数排序，再根据id排序;

LIMIT 3;//  只显示前面三行

WHERE `major` IN('历史', '英语', '生物');
相当于下列语句：
WHERE `major` = '历史' OR `major` = '英语' OR `major` = '生物';

```

创建一个简单的公司资料库

![image-20250729093556906](D:\APP_data\Typora文档\assets\image-20250729093556906.png)

​	创建员工表格

![image-20250729094524073](D:\APP_data\Typora文档\assets\image-20250729094524073.png)

​	创建部门表格

![image-20250729094438611](D:\APP_data\Typora文档\assets\image-20250729094438611.png)

```sql
使用 ON DELECT SET NULL 的作用是

当员工表中的某个人被删除后，该员工对应到branch表中的外键就变为NULL 
如下图
```

![image-20250730104849940](D:\APP_data\Typora文档\assets\image-20250730104849940.png)

员工表和部门表都创建好了，现在设置员工表的两个外键

![image-20250729094846513](D:\APP_data\Typora文档\assets\image-20250729094846513.png)

创建客户表

![image-20250729094945159](D:\APP_data\Typora文档\assets\image-20250729094945159.png)

创建客户员工表works_with,emp_id和client_id 即是主键也是外键

![image-20250729095101173](D:\APP_data\Typora文档\assets\image-20250729095101173.png)

```sql
使用 ON DELETE CASCADE  
作用是当这个外键关联着的表中数据被删除后，works_with表中对应外键的这行数据页相应删除。

注意这里不能使用 ON DELETE SET NULL  , 因为这两个外键都是作为主键，主键不能为NULL
```

先新增部门的资料，同时manager_id属于外键，还没有和他对应的，先设置为NULL,后续再添加

![image-20250729101343264](D:\APP_data\Typora文档\assets\image-20250729101343264.png)

新增员工的资料

![image-20250729101420596](D:\APP_data\Typora文档\assets\image-20250729101420596.png)

依此修改Branch表中的manager_id

![image-20250729101544295](D:\APP_data\Typora文档\assets\image-20250729101544295.png)

新增客户的资料

![image-20250729101627193](D:\APP_data\Typora文档\assets\image-20250729101627193.png)

新增销售数据

![image-20250729101716247](D:\APP_data\Typora文档\assets\image-20250729101716247.png)

这样就创建好了一个公司表，完成以下练习

![image-20250729101850249](D:\APP_data\Typora文档\assets\image-20250729101850249.png)

```sql
//取出所有员工的部门ID
select branch_id from employee;  
//取出所有员工的部门ID，且不重复出现
select distinct branch_id from employee;
```



通配符  %代表多个字  _代表一个字

union 

join 把两个表格连接在一起

   Python 连接数据库

pip install mysql-connector-python

![image-20250730111659659](D:\APP_data\Typora文档\assets\image-20250730111659659.png)

```python
import mysql.connector

connection = mysql.connector.connect(host='localhost',
                                     port='3306',
                                     user='root',
                                     password='password'
)

connection = mysql.connector.connect(host='localhost',
                                     port='3306',
                                     user='root',
                                     password='password'
                                     database='user'
)


cursor = connection.cursor()

# 创建数据库
cursor.execute("CREATE DATABASE qq;")

# 取得所有数据库
cursor.execute("SHOW DATABASES;")
records = cursor.fetchall()
for r in records:
    print(r)
    
 # 选择资料库
cursor.execute("USE emp;")

# 创建表格
cursor.execute("CREATE TABLE qq2(qq2 INT);")

cursor.close()
connection.close()


如果是要对数据表格进行增删改等工作，思路是一样的
cursor.execute("对应的增删改语句")
最后需要新增一个commit()
cursor.close()
cuesor.commit() //使得指令生效
connection.close()


```


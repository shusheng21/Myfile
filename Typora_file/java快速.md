# Java快速

## 一、maven项目

### Maven引入

Maven是使用Java语言编写的基于项目对象模型（POM）**项目管理工具软件**。开发者可以通过一小段描述信息来管理项目构建、报告和文档。使用Maven可以更好的帮助我们完成项目的管理。

一句话总结：使用Maven可以更好的管理项目依赖库Lib(.jar文件)

![image-20251215102710139](assets/java快速/image-20251215102710139.png)

### Maven基础配置

1. [maven仓库搜索需要的jar]([Maven Repository: mysql](https://mvnrepository.com/search?q=mysql))

![image-20251210095540329](assets/java快速/image-20251210095540329.png)

2. 选一个用的多的版本

![image-20251210095657894](assets/java快速/image-20251210095657894-1765331819891-1.png)

3. 往下滑就可以看到Maven 的坐标

![image-20251210095752975](assets/java快速/image-20251210095752975.png)

5. [下载Maven]([Download Apache Maven – Maven](https://maven.apache.org/download.cgi))

![image-20251210095957852](assets/java快速/image-20251210095957852.png)

6. 解压下载好的Maven,打开settings.xml配置本地仓库

![image-20251210100134929](assets/java快速/image-20251210100134929.png)

7. 随便选择一个目录作为本地仓库，可以使用我提供的本地仓库
8. 在 settings.xml 配置文件中指定本地仓库位置

```
<localRepository>D:/repository</localRepository>
```

![image-20251210144753772](assets/java快速/image-20251210144753772.png)

9. 配置镜像仓库

![image-20251210145011657](assets/java快速/image-20251210145011657.png)

10. 配置JDK(注意jdk版本) 此处用JDK17

![image-20251210145322537](assets/java快速/image-20251210145322537-1765349604221-3.png)

![image-20251210145747328](assets/java快速/image-20251210145747328.png)

注意：高版本如果不匹配，则降低版本

![image-20251210145641918](assets/java快速/image-20251210145641918.png)

### 创建Maven项目

1. IDEA新建一个空项目，在空项目再创建模块TestMaven
2. 进行配置

![image-20251210150915240](assets/java快速/image-20251210150915240.png)

3. 新建一个模块，选择Maven,填写项目的坐标

   ![image-20251210151502741](assets/java快速/image-20251210151502741.png)

4. 此时可以看到Libraries中只有jdk1.8一个文件。回想之前连接数据库需要先建一个Lib文件夹，再把jdbc jar包导入Lib包。现在使用Maven项目只需要直接在pom.xml中指定jar的左边即可
5. [找到mysql的jar包坐标]([Maven Repository: mysql » mysql-connector-java » 8.0.28](https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.28))

![image-20251210152449460](assets/java快速/image-20251210152449460.png)

6. 放到pom.xml中，发现报错，需在外面添加<dependencies>标签  

![image-20251210152549632](assets/java快速/image-20251210152549632.png)

![image-20251210152706156](assets/java快速/image-20251210152706156.png)

7. ==需要什么jar包就去Maven仓库中找到坐标，放到POM.xml的<dependencies>标签下就可以==
8. 此时配置好后，发现Libraries路劲下除了jdk1.8,还多了其他文件

![image-20251210153054413](assets/java快速/image-20251210153054413.png)

9. 项目结构发生变化

1. main下的java--------放项目源码文件
2. main下的resource------放配置文件如.xml;.project
3. test下的java ------项目做测试的代码文件；该路径下也可以创建resource放测试所需配置文件

![image-20251210153502379](assets/java快速/image-20251210153502379.png)

10. 在test中编写文件，操作数据库，测试后可以正常使用。

## 二、MyBatis框架

### 框架的引入

- 框架出现的意义

  - 重复/基础代码封装，同时添加额外功能。
  - 释放程序员写代码精力，更关注业务层面。
  - 框架是半成品。

- 框架优缺点

  - 优点

    - ##### 更好用

    - ##### 更强大

    - ##### 开发周期更短

  - 缺点

    - ##### 更多的学习成本

    - ##### 初学者更容易出错

    - ##### 对于初学者，出了错误更难解决

- **常见Java框架分类：**

  - 1）持久层框架（连数据库）。**MyBatis**、Hibernate、Spring Data、iBatis。

    （2）MVC框架。**Spring MVC**、Struts1、Struts2。

    （3）项目管理框架。**Spring Framework、Spring Boot**。

    （4）微服务框架。Spring Cloud。

    （5）权限管理框架。Spring Security、Shiro。

### MyBatis框架

#### MyBatis是持久层框架

**持久层**是分层开发中专门负责访问数据源的一层，Java项目中每一层都有自己的作用，持久层的作用就是访问数据源，把访问数据源的代码和业务逻辑代码分离开，有利于后期维护和团队分工开发。同时也增加了数据访问代码的复用性。

#### MyBatis是ORM框架

**ORM**(Object/Relation Mapping)，中文名称：对象/关系 映射。是一种解决数据库发展和面向对象编程语言发展不匹配问题而出现的技术。

![image-20251215103917988](assets/java快速/image-20251215103917988.png)



#### 搭建第一个MyBatis框架

1. 创建数据库表
2. 创建Maven项目
3. 添加依赖
4. 创建MyBatis全局配置文件（mybaits中文网址：https://mybatis.org/mybatis-3/zh/getting-started.html）
5. 创建实体类
6. 创建映射文件，在核心配置文件中进行扫描
7. 编写测试类，启动项目



1. 创建数据库表
2. 创建Maven项目

![image-20251215104548814](assets/java快速/image-20251215104548814.png)

3. 添加依赖

- 需要导入两个依赖 ，一个MyBatis依赖，一个JDBC
  - [找到mysql的jar包坐标]([Maven Repository: mysql » mysql-connector-java » 8.0.28](https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.28))和[MyBatis坐标]([Maven Repository: org.mybatis » mybatis » 3.5.16](https://mvnrepository.com/artifact/org.mybatis/mybatis/3.5.16)),然后放到pom.xml中

4. 创建MyBatis全局配置文件（mybaits中文网址：[MyBatis 3 | 入门 – mybatis](https://mybatis.org/mybatis-3/zh_CN/getting-started.html)）

   - 添加配置文件，在src/main/resources下添加mybatis.xml

     - ```xml
       <?xml version="1.0" encoding="UTF-8" ?>   <!--文档头-->
       <!--添加约束，标签按照约束来写(configuration作为根标签)，首次添加报错需要alt + enter 进行一个下载-->
       <!DOCTYPE configuration
               PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
               "https://mybatis.org/dtd/mybatis-3-config.dtd">
       <configuration>
           <environments default="mysql">
               <environment id="mysql">
                   <transactionManager type="JDBC"></transactionManager>
                   <dataSource type="POOLED">
       <!--                前面的name需要按照规定好的来写，将value替换为自己需要的就可以-->
                       <property name="driver" value="com.mysql.cj.jdbc.Driver"/>
       <!--                注意：下面的 & 需要替换为 &amp; -->
                       <property name="url" value="jdbc:mysql://127.0.0.1:3306/msb?useSSL=false&amp;useUnicode=true&amp;characterEncoding=UTF-8&amp;serverTimezone=Asia/Shanghai&amp;allowPublicKeyRetrieval=true"/>
                       <property name="username" value="root"/>
                       <property name="password" value="root"/>
                   </dataSource>
               </environment>
       
       <!--        可以配置多个数据库，需要使用哪个数据库就在“<environments default="mysql">”中指定-->
       <!--        <environment id="oracle">-->
       <!--            <transactionManager type=""></transactionManager>-->
       <!--            <dataSource type=""></dataSource>-->
       <!--        </environment>-->
       
           </environments>
           <mappers>
               <mapper resource="org/mybatis/example/BlogMapper.xml"/>
           </mappers>
       </configuration>
       ```

       ![image-20251216102750349](assets/java快速/image-20251216102750349.png)

5. 创建实体类

在java下创建pakege:com.rao.pojo  在该路径下创建实体类Book

![image-20251216102812375](assets/java快速/image-20251216102812375.png)

6. 创建映射文件（对数据库操作的SQL信息），在核心配置文件mybatis.xml中进行扫描 

- 映射文件一般放在单独目录下，在resources下新建文件夹mapper，新建BookMapper.xml文件

- 对照下图写xml

- ![image-20251216103928724](assets/java快速/image-20251216103928724.png)

- ```xml
  <?xml version="1.0" encoding="UTF-8" ?>
  <!DOCTYPE mapper
          PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
          "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
  <mapper namespace="a.b">  <!--此处的命名空间可随意写 -->
  <!--    id相当于查询的方法名 public List selectAllBooks(参数){方法体} -->
  <!--    resultType相当于返回类型，放回的是Book的集合(list)，
  但只需要写集合中的内容是什么.即：Book,需要指定路径，即com.rao.pojo.Book-->
      <select id="selectAllBooks" resultType="com.rao.pojo.Book">
          select * from t_book
      </select>
  </mapper>
  ```

- 在核心配置文件mybatis.xml中进行扫描 
  - ![image-20251216141602068](assets/java快速/image-20251216141602068.png)

7. 编写测试类，启动项目

```java
package com.rao.test;

public class Test {
    public static void main(String[] args) throws IOException {
        //指定核心配置文件的路径
//        String resource = "org/mybatis/example/mybatis-config.xml";
        String resource = "mybatis.xml";
        //获取加载配置文件的输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //加载配置文件，创建工厂类
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //通过工厂类获取一个会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行查询
        List list = sqlSession.selectList("a.b.selectAllBooks");
        //遍历
        for (int i = 0; i < list.size(); i++) {
            Book b = (Book)list.get(i);
            System.out.println(b.getBookname() + "---" + b.getAuthor());
        }
        sqlSession.close();
    }
}

```


























































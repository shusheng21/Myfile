package com.rao.test;

import com.rao.mapper.BookMapper;
import com.rao.pojo.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test_cangshu {
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
        //使用了动态代理，BookMapper mapper（接口类型） = BookMapper的实现类
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

//        多个纯参数
//        Book book = mapper.selectBookByAuthorandName("史记","无名");

//      一个参数且参数为对象
//        Book b = new Book();
//        b.setName("史记");
//        b.setAuthor("无名");
//        Book book = mapper.selectBookByAuthorandName2(b);

//        一个参数且参数为对象
//        Book b2 = new Book();
//        b2.setAuthor("无名");
//        Book book = mapper.selectBookByAuthorandName3("史记",b2);
//
//        System.out.println(book.getName());

//        插入书籍
//        Book b3 = new Book(5, "红楼梦", "曹雪芹", 150.3);
//        int n = mapper.insertBook(b3);
//        if(n>0){
//            System.out.println("插入数据成功！n = " + n);
//        }

//        删除红高粱这本书
//        int n = mapper.deleteBookByName("红高粱");
//        if(n>0){
//            System.out.println("删除数据成功！n = " + n);
//        }

        //       更新ID= 5 这本书 价格为 9.9
        int n = mapper.updateBook(5);
        if(n>0){
            System.out.println("更新数据成功！n = " + n);
        }

        //提交事物
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
    }
}

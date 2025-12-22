package com.rao;

import com.rao.pojo.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        // Spring通过加载配置文件，创建Spring容器。
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从容器中取出叫做p的bean
//        Book  book = (Book)ac.getBean("b");//这种方式需要强转
        Book  book = (Book)ac.getBean("b2");//这种方式需要强转
        System.out.println(book.getId() + "----" + book.getName());
    }
}

package com.rao;

import com.rao.pojo.Book;
import com.rao.pojo.Girl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test02 {
    public static void main(String[] args) {
        // Spring通过加载配置文件，创建Spring容器。
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从容器中取出叫做p的bean
        Girl g1 = (Girl)ac.getBean("girl");
        System.out.println(g1.getName() + g1.getAge() + " 男友：" + g1.getBoyfriend().getName() + g1.getBoyfriend().getAge());
    }
}

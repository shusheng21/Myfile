package com.rao;

import com.rao.pojo.Girl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test03_zhujie {
    public static void main(String[] args) {
        // Spring通过加载配置文件，创建Spring容器。
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_zhujie.xml");
        // 从容器中取出叫做p的bean
        Girl g1 = (Girl)ac.getBean("girl");//使用注解生成的对象实例名字默认就是类名首字母变小写
        System.out.println(g1.getName() + g1.getAge() + " 男友：" + g1.getBoyfriend().getName() + g1.getBoyfriend().getAge());

    }
}

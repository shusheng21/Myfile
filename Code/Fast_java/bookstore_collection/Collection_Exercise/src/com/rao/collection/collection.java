package com.rao.collection;

import java.util.ArrayList;

public class collection {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        System.out.println(list);

        //增
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("eee");
        list.add("fff");
        list.add("999");
        System.out.println(list);
        //删
        list.remove("bbb");
        System.out.println(list);

        //修改
        list.set(0,"888");
        System.out.println(list);

        //查看
        Object o = list.get(1);
        System.out.println(o);

        System.out.println(list);

        System.out.println(list.size());
        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }


}

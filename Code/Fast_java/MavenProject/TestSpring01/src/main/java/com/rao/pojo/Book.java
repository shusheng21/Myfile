package com.rao.pojo;

public class Book {
    private int id;
    private String name;

    public Book() {
        System.out.println("Book的无参构造器");
    }

//    public Book(int id, String name) {
//        this.id = id;
//        this.name = name;
//        System.out.println("Book的有参构造器");
//    }

    public Book(int id2, String name2) {
        this.id = id2;
        this.name = name2;
        System.out.println("Book的有参构造器");
    }


    public int getId() {
        return id;
    }

    public void setId1(int id) {
        this.id = id;
        System.out.println("setID()...");
    }


    public String getName() {
        return name;
    }

    public void setName1(String name) {
        this.name = name;
        System.out.println("setName()...");
    }

}

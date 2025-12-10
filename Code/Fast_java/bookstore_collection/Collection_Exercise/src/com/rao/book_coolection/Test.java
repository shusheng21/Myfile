package com.rao.book_coolection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("=========老马书城=========");
            System.out.println("------1、显示书籍--------");
            System.out.println("------2、添加书籍--------");
            System.out.println("------3、删除书籍--------");
            System.out.println("------4、退出系统--------");

            System.out.println("请选择功能1-4");
            int Gno = sc.nextInt();

            if(Gno == 1){
                System.out.println("---显示书籍-----");
                for (int i = 0; i < list.size(); i++) {
                    Book b = (Book)list.get(i);
                    System.out.println(b.getbName() + "---" + b.getbAuthor() + "---" + b.getPrice());
                }
            }

            if(Gno == 2){
                System.out.println("---添加书籍---");
                System.out.println("请输入书名：");
                String bName = sc.next();
                System.out.println("请输入作者：");
                String bAuthor = sc.next();
                System.out.println("请输入价格：");
                double bPrice = sc.nextDouble();
                Book book = new Book(bName, bAuthor, bPrice);
                list.add(book);
            }
            if(Gno == 3){
                System.out.println("---删除书籍---");
                System.out.println("请输入要删除的书籍名称");
                String bName = sc.next();
                for (int i = 0; i < list.size(); i++) {
                    Book bb = (Book)list.get(i);
                    if(bb.getbName().equals(bName)){
                        list.remove(bb);
                        System.out.println("删除成功了");
                        break;
                    }
                }

            }
            if(Gno == 4){
                break;
            }

        }

    }
}

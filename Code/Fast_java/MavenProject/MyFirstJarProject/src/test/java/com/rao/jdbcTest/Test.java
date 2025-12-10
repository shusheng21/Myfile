package com.rao.jdbcTest;

import java.sql.*;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/msb?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement sta = conn.createStatement();
        //插入数据
//        int i = sta.executeUpdate("insert into t_book (id,bookname,author,price) values (4,'红高粱','莫言',49)");
//        if (i > 0) {
//            System.out.println("插入成功！");
//        } else {
//            System.out.println("插入失败！");
//        }

        //查询数据
        ResultSet resultSet = sta.executeQuery("select * from t_book");
        if (resultSet != null) {
            while(resultSet.next()){
                System.out.println(resultSet.getInt("id") + "---" + resultSet.getString("bookname"));
            }

        } else {
            System.out.println("没有数据！");
        }

        sta.close();
        conn.close();
    }
}

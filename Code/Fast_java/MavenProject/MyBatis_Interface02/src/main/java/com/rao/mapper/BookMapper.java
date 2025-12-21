package com.rao.mapper;

import com.rao.pojo.Book;

import java.util.List;

public interface BookMapper {
    List MySelectAllBooks();
    Book selectBookByAuthorandName(String name,String suthor); //多个纯参数（没有对象）
    Book selectBookByAuthorandName2(Book book); //一个参数且参数为对象
    Book selectBookByAuthorandName3(String name,Book book);  //多个参数且参数有对象
    int insertBook(Book book);//添加书籍操作，返回值为int类型，代表影响的条数
    int deleteBookByName(String name);//通过书名删除书籍
    int updateBook(int id);//通过ID来查找对应书籍并更新书籍
}

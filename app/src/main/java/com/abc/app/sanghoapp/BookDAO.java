package com.abc.app.sanghoapp;

import java.util.List;

/**
 * Created by hb2002 on 2016-08-03.
 */
public class BookDAO {

    private static BookDAO instance = new BookDAO();

    static BookDAO getInstance() {
        return instance;
    }
    private BookDAO() {
    }

    public int regist(BookCityBean bean) {
        int result = 0;
        String sql = "insert into book_member(seq2,address,check_in,check_out,explain,"
                + "review,price,option2,local2,facilities,"
                + "policy,house_type,language,photo,room,"
                + "toilet,bed,count,id) "
                + "values(seq2.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        return result;
    }
    public int book(BookBean bBean) {
        int result = 0;
        String sql = "insert into book(ADDRESS, CHECK_IN, CHECK_OUT, COUNT, ID) values(?,?,?,?,?)";

        return result;
    }


    public int cancel(BookBean bBean) {
        String sql = "delete from book where id=?";
        int result = 0;

        return result;
    }

    public List<?> list(String id) {
        String sql = "select * from book_member where id = ?";

        return null;
    }


}

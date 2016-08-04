package com.abc.app.sanghoapp;

import android.content.Context;

import java.util.List;

/**
 * Created by hb2002 on 2016-08-03.
 */
public class BookServiceImpl implements BookService{
    BookDAO dao;
    BookCityBean bcSession;
    BookBean bBean = new BookBean();

    public BookServiceImpl(Context context) {
        dao = new BookDAO(context);
    }

    public BookCityBean getbcSession() {
        return bcSession;
    }


    public void book(BookBean bBean) {
        dao.book(bBean);
    }

    public void cancel(BookBean bBean) {
        dao.cancel(bBean);
    }

    @Override
    public void regist(BookCityBean bean) {

    }

    @Override
    public void wishlist(BookCityBean bean) {
        // TODO Auto-generated method stub

    }
    @Override
    public void wishlistDel(BookCityBean bean) {
        // TODO Auto-generated method stub

    }
    @Override
    public BookCityBean search(BookCityBean bean) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public List<?> list(String id) {
        return null;
    }
}

package com.abc.app.sanghoapp;

import java.util.List;

/**
 * Created by hb2002 on 2016-08-03.
 */
public interface BookService {
    public void book(BookBean bean);
    public void cancel (BookBean bean);
    public void regist (BookCityBean bean);
    public void wishlist (BookCityBean bean);
    public void wishlistDel (BookCityBean bean);
    public BookCityBean search(BookCityBean bean);
    public List<?> list(String id);
}

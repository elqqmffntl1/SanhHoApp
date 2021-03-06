package com.abc.app.sanghoapp;

/**
 * Created by hb2002 on 2016-08-04.
 */
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hb2003 on 2016-08-03.
 */
public interface CityService {

    public void regist(CityBean mBean);
    public CityBean findByAddr(String id);
    public boolean login(CityBean mBean);
    public void logOut(CityBean mBean);
    public CityBean getSession();
    public int count();
    public ArrayList<CityBean> list();
    public List<CityBean> findBy(String word);

}
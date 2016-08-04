package com.abc.app.sanghoapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class BookingListActivity extends Activity {
    ListView lv_bookinglist;
    BookService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_list);
    }


}

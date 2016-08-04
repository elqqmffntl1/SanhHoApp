package com.abc.app.sanghoapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BookingActivity extends Activity implements View.OnClickListener{
    TextView et_check_in,et_check_out,et_count,et_address;
    Button bt_booking,bt_reset;
    BookService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        service = new BookServiceImpl(this.getApplicationContext());
        et_check_in = (TextView) findViewById(R.id.et_check_in);
        et_check_out = (TextView) findViewById(R.id.et_check_out);
        et_address = (TextView) findViewById(R.id.et_address);
        bt_booking = (Button) findViewById(R.id.bt_booking);
        bt_reset = (Button) findViewById(R.id.bt_reset);
        bt_booking.setOnClickListener(this);
        bt_reset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_booking:
                BookCityBean bean = new BookCityBean();
                bean.setCheckIn(et_check_in.getText().toString());
                bean.setCheckOut(et_check_out.getText().toString());
                bean.setAddress(et_address.getText().toString());
                bean.setCount(Integer.parseInt(et_count.getText().toString()));
                service.regist(bean);
                startActivity(new Intent(this,BookingActivity.class));
                break;
            case R.id.bt_reset:
                startActivity(new Intent(this,HomeActivity.class));
                break;
        }
    }
}

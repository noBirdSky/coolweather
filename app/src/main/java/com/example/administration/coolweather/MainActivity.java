package com.example.administration.coolweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administration.coolweather.db.City;
import com.example.administration.coolweather.db.Province;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        /**
         * 江苏省
         *         Province province = new Province();
         province.setProvinceCode(16);
         province.setProvinceName("江苏");
         province.save();
         */



        /**
         * 苏州市
         * City city  = new City();
         city.setCityCode(116);
         city.setCityName("苏州");
         city.setProvinceId(16);
         */




    }
}

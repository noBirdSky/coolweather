package com.example.administration.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/8/31.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId ;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String name){
        cityName = name;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int code){
        cityCode = code;
    }
    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }
    public int getProvinceId(){
        return provinceId;
    }
}

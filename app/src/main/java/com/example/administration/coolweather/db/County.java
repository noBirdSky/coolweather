package com.example.administration.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/8/31.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getcountyName(){
        return countyName;
    }
    public void setcountyName(String name){
        countyName = name;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId){
       this.weatherId = weatherId;
    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }
    public int getCityId(){
        return cityId;
    }
}

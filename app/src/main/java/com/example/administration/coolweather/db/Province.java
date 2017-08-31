package com.example.administration.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/8/31.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId(){
        return id;
    }

    public void setId(int Id){
        this.id = id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String name) {
        provinceName = name;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int code){
        provinceCode = code;
    }
}

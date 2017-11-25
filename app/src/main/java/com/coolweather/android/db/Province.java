package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by shizhengui on 2017/11/7.
 */

public class Province extends DataSupport {

    private int id;
    private String provinceName;
    private int provinceId;

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceId() {
        return provinceId;
    }
}

package com.teddy.jfinal.interfaces;

import com.jfinal.plugin.activerecord.Model;
import com.teddy.jfinal.tools.CustomTool;

import java.util.List;

/**
 * Created by teddy on 2015/7/28.
 */
public abstract class DBModel<M extends DBModel> extends Model<M> {
    private static final long serialVersionUID = -101956006715745792L;

    @SuppressWarnings("unchecked")
    public M enhancer() {
        return CustomTool.auto((M) this);
    }

    @SuppressWarnings("unchecked")
    public M custom() {
        return CustomTool.custom((M) this);
    }

    @SuppressWarnings("unchecked")
    public M transaction() {
        return CustomTool.transaction((M) this);
    }

    public List<M> findAll() {
        StringBuilder sb = new StringBuilder();
        String tableName = this.getClass().getAnnotation(com.teddy.jfinal.annotation.Model.class).value();
        sb.append("select ").append(tableName).append(".* from " + tableName);
        return find(sb.toString());
    }

    public boolean getToBoolean(String attr) {
        return Boolean.valueOf(getStr(attr));
    }

    public Integer getToInteger(String attr) {
        return Integer.valueOf(getStr(attr));
    }


    public Long getToLong(String attr) {
        return Long.valueOf(getStr(attr));
    }

    public Double getToDouble(String attr) {
        return Double.valueOf(getStr(attr));
    }

    public Float getToFloat(String attr) {
        return Float.valueOf(getStr(attr));
    }
}

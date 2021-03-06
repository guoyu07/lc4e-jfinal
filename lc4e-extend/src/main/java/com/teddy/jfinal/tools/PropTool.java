package com.teddy.jfinal.tools;

import com.jfinal.kit.Prop;
import com.teddy.jfinal.common.Dict;

import java.lang.reflect.Field;
import java.util.*;


public class PropTool {


    private Map<String, Object> paramMap = new HashMap<>();

    private Properties properties;

    public PropTool() {
    }

    public PropTool(Properties properties) {
        this.properties = properties;
        start();
    }



    public Object getObject(String key) {
        return paramMap.get(key);
    }


    public String getValue(String key) {
        return paramMap.containsKey(key) ? (String) paramMap.get(key) : null;
    }

    public String getValue(String key, String defaultValue) {
        return paramMap.containsKey(key) ? (String) paramMap.get(key) : defaultValue;
    }


    public Integer getInt(String key) {
        String value = getValue(key);
        return value == null ? (Integer) null : Integer.valueOf(value);
    }

    public Integer getInt(String key, Integer defaultValue) {
        String value = getValue(key);
        return value == null ? defaultValue : Integer.valueOf(value);
    }


    public Long getLong(String key) {
        String value = getValue(key);
        return value == null ? (Long) null : Long.valueOf(value);
    }

    public Long getLong(String key, Long defaultValue) {
        String value = getValue(key);
        return value == null ? defaultValue : Long.valueOf(value);
    }

    public Boolean getBool(String key) {
        String value = getValue(key);
        return value == null ? (Boolean) null : Boolean.valueOf(value);
    }

    public Boolean getBool(String key, Boolean defaultValue) {
        String value = getValue(key);
        return value == null ? defaultValue : Boolean.valueOf(value);
    }

    public boolean start() {

        Field[] fields = Dict.class.getDeclaredFields();

        for (Field field : fields) {
            try {
                paramMap.put(field.getName(), properties.getProperty(field.get(null).toString()));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        String scan_package = getValue(Dict.SCAN_PACKAGE);
        if (null != scan_package && !scan_package.isEmpty()) {
            List<String> list = new ArrayList<>();
            String[] pkgs = scan_package.split(";");
            for (String pkg : pkgs) {
                list.add(pkg.trim());
            }
            paramMap.put(Dict.SCAN_PACKAGE, list);
        } else {
            paramMap.put(Dict.SCAN_PACKAGE, new ArrayList<String>());
        }

        String scan_jar = getValue(Dict.SCAN_JAR);
        if (null != scan_jar && !scan_jar.isEmpty()) {
            List<String> list = new ArrayList<>();
            String[] jars = scan_jar.split(",");
            for (String jar : jars) {
                list.add(jar.trim());
            }
            paramMap.put(Dict.SCAN_JAR, list);
        } else {
            paramMap.put(Dict.SCAN_JAR, new ArrayList<String>());
        }

        return true;
    }

    public boolean stop() {
        paramMap.clear();
        return true;
    }

}

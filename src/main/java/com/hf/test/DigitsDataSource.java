package com.hf.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 数据
 */
public class DigitsDataSource {

    public static DigitsDataSource digitsDataSource = null;

    //数据存入Map集合中
    private static Map<String,Object> dataSource = new HashMap<String, Object>();

    public DigitsDataSource(){
        this.init();
    }

    /**
     * 初始化Map集合中的数据
     */
    public void init(){
        dataSource.put("0", Arrays.asList(""));
        dataSource.put("1",Arrays.asList(""));
        dataSource.put("2",Arrays.asList("A","B","C"));
        dataSource.put("3",Arrays.asList("D","E","F"));
        dataSource.put("4",Arrays.asList("G","H","I"));
        dataSource.put("5",Arrays.asList("J","K","L"));
        dataSource.put("6",Arrays.asList("M","N","O"));
        dataSource.put("7",Arrays.asList("P","Q","R","S"));
        dataSource.put("8",Arrays.asList("T","U","V"));
        dataSource.put("9",Arrays.asList("W","X","Y","Z"));
    }

    /**
     * 单例模式：获取引用对象
     * @return
     */
    public static DigitsDataSource getInstance(){
        //判空
        if(digitsDataSource == null){
            digitsDataSource = new DigitsDataSource();
        }
        return digitsDataSource;
    }


    public Map<String, Object> getDataSource() {
        return dataSource;
    }


}

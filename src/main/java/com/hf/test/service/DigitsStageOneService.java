package com.hf.test.service;

import com.hf.test.entity.DigitsDataSource;

import java.util.ArrayList;
import java.util.List;

/**
 * 业务处理
 */
public class DigitsStageOneService {

    private DigitsDataSource digitsDataSource;

    protected final List<String> result = new ArrayList<String>();

    /**
     * 构造函数
     */
    public DigitsStageOneService(){
        digitsDataSource = DigitsDataSource.getInstance();
    }

    public void digitsToLetters(int... num){
        //输入的内容
        StringBuilder inputStr=new StringBuilder("Input:arr[] ={");
        //创建一个List集合获取数字对应的总英文
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length; i++){
            if (num[i] > 9) {
                System.out.println("Your Input is out of valid range,we only accept 0 to 9 as parameters");
                return;
            }
            inputStr.append(num[i]);
            if(i < num.length - 1){
                inputStr.append(",");
            }
            //根据arrStr[i]取出对应的字母集合
            sb.append(num[i]);
        }
        combine("",sb.toString());
        inputStr.append("}");
        //打印输入内容
        System.out.println(inputStr.toString());
        //输出内容
        StringBuilder outStr = new StringBuilder("Output: ");
        //使用递归实现排列组合，得到输出内容
        for (String s : result){
            outStr.append(s + " ");
        }
        //打印输出内容
        System.out.println(outStr.toString());
    }

    public void clear() {
        result.clear();
    }

    private String getString(String s) {
        String re = (String)digitsDataSource.getDataSource().get(s);
        return re;
    }

    protected void combine(String s, String nums) {
        if (nums.length() == 0) {
            result.add(s);
        } else {
            String num = nums.substring(0, 1);
            String ls = getString(num);
            for (int i = 0; i < ls.length(); i++) {
                String l = getString(num).substring(i, i + 1);
                combine(s + l, nums.substring(1));
            }
        }
    }

}

package com.hf.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 业务处理
 */
public class DigitsService {

    private DigitsDataSource digitsDataSource;

    /**
     * 构造函数
     */
    public DigitsService(){
        digitsDataSource = new DigitsDataSource();
        digitsDataSource = DigitsDataSource.getInstance();
    }

    /**
     *
     * @param numStr
     */
    public void digitsToLetters(String numStr){
        //输入的内容
        StringBuilder inputStr=new StringBuilder("Input:arr[] ={");
        //将输入的数字进行拆分成数组
        String[] arrStr=numStr.split("");
        //创建一个List集合获取数字对应的总英文
        List<List<String>> dataList = new ArrayList<List<String>>();
        for (int i = 0; i < arrStr.length; i++){
            inputStr.append(arrStr[i]);
            if(i < arrStr.length - 1){
                inputStr.append(",");
            }
            //根据arrStr[i]取出对应的字母集合
            List<String> lettersList = (List<String>)digitsDataSource.getDataSource().get(arrStr[i]);
            if(lettersList != null && lettersList.size() > 0){
                dataList.add(lettersList);
            }
        }
        inputStr.append("}");
        //打印输入内容
        System.out.println(inputStr.toString());
        //输出内容
        StringBuilder outStr = new StringBuilder("Output: ");
        //使用递归实现排列组合，得到输出内容
        List<String> strings = CombinUtils.combin(dataList);
        for (int i = 0; i < strings.size(); i++){
            outStr.append(strings.get(i) + " ");
        }
        //打印输出内容
        System.out.println(outStr.toString());
    }

}

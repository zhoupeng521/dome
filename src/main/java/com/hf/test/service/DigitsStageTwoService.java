package com.hf.test.service;

public class DigitsStageTwoService extends DigitsStageOneService{

    @Override
    public void digitsToLetters(int... num) {
        //输入的内容
        StringBuilder inputStr=new StringBuilder("Input:arr[] ={");
        //创建一个List集合获取数字对应的总英文
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length; i++){
            if (num[i] > 99) {
                System.out.println("Your Input is out of valid range,we only accept 0 to 99 as parameters");
                return;
            }
            inputStr.append(num[i]);
            if(i < num.length - 1){
                inputStr.append(",");
            }
            //根据arrStr[i]取出对应的字母集合
            char[] tmp = Integer.toString(num[i]).toCharArray();
            for (char c:tmp){
                if (c=='1' || c == '0') continue;
                sb.append(c);
            }
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
}

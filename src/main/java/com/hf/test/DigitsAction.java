package com.hf.test;


public class DigitsAction {

    /**
     * 返回结果
     */
    public void getResult(String numStr) {
        if(!numStr.matches("[0-9]{1,2}")){
            System.out.println("输入不合法，只能输入0-99的数字，请重新输入");
        }else{
            DigitsService digitsService = new DigitsService();
            digitsService.digitsToLetters(numStr);
        }
    }

}

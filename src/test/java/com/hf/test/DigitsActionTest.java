package com.hf.test;

import org.junit.Before;
import org.junit.Test;


public class DigitsActionTest {

    private DigitsAction digitsAction;

    @Before
    public void setUp() {
        digitsAction = new DigitsAction();
    }

    @Test
    public void getResult() {
        //传入不合法的参数
        digitsAction.getResult("109");
        //输入正常值
        digitsAction.getResult("23");
        //输入11
        digitsAction.getResult("11");
        //输入12
        digitsAction.getResult("12");
        //输入2
        digitsAction.getResult("2");
        //输入1
        digitsAction.getResult("1");

    }
}

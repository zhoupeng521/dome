package com.hf.test.service;


import org.junit.Before;
import org.junit.Test;


public class DigitsStageOneServiceTest {

    private DigitsStageOneService digitsStageOneService;

    @Before
    public void setUp() {
        digitsStageOneService = new DigitsStageOneService();
    }

    @Test
    public void getResult() {

        int[] num = {2};
        digitsStageOneService.digitsToLetters(num);
        digitsStageOneService.clear();

        int[] num1 = {2,4};
        digitsStageOneService.digitsToLetters(num1);
        digitsStageOneService.clear();

        int[] num2 = {3,5};
        digitsStageOneService.digitsToLetters(num2);
        digitsStageOneService.clear();

        int[] num3 = {9,7,6};
        digitsStageOneService.digitsToLetters(num3);
        digitsStageOneService.clear();

        int[] num4 = {9,110};
        digitsStageOneService.digitsToLetters(num4);
        digitsStageOneService.clear();

        int[] num5 = {0};
        digitsStageOneService.digitsToLetters(num5);
        digitsStageOneService.clear();

        int[] num6 = {0,1};
        digitsStageOneService.digitsToLetters(num6);
        digitsStageOneService.clear();

        int[] num7 = {1,4};
        digitsStageOneService.digitsToLetters(num7);
        digitsStageOneService.clear();

        int[] num8 = {1,100};
        digitsStageOneService.digitsToLetters(num8);
        digitsStageOneService.clear();

    }
}

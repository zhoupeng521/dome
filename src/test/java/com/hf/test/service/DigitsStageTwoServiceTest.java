package com.hf.test.service;

import org.junit.Before;
import org.junit.Test;


public class DigitsStageTwoServiceTest {

    private DigitsStageTwoService digitsStageTwoService;

    @Before
    public void setUp() {
        digitsStageTwoService = new DigitsStageTwoService();
    }

    @Test
    public void digitsToLetters() {

        int[] num = {99};
        digitsStageTwoService.digitsToLetters(num);
        digitsStageTwoService.clear();

        int[] num1 = {54};
        digitsStageTwoService.digitsToLetters(num1);
        digitsStageTwoService.clear();

        int[] num2 = {100};
        digitsStageTwoService.digitsToLetters(num2);
        digitsStageTwoService.clear();

        int[] num3 = {6,99};
        digitsStageTwoService.digitsToLetters(num3);
        digitsStageTwoService.clear();

        int[] num4 = {4,8,6};
        digitsStageTwoService.digitsToLetters(num4);
        digitsStageTwoService.clear();

        int[] num5 = {5};
        digitsStageTwoService.digitsToLetters(num5);
        digitsStageTwoService.clear();

        int[] num51 = {2,5};
        digitsStageTwoService.digitsToLetters(num51);
        digitsStageTwoService.clear();

        int[] num6 = {0};
        digitsStageTwoService.digitsToLetters(num6);
        digitsStageTwoService.clear();

        int[] num7 = {0,1,101};
        digitsStageTwoService.digitsToLetters(num7);
        digitsStageTwoService.clear();

        int[] num8 = {100};
        digitsStageTwoService.digitsToLetters(num8);
        digitsStageTwoService.clear();

        int[] num9 = {0,99};
        digitsStageTwoService.digitsToLetters(num9);
        digitsStageTwoService.clear();

        int[] num10 = {0, 6, 99};
        digitsStageTwoService.digitsToLetters(num10);
        digitsStageTwoService.clear();

        int[] num11 = {0, 11};
        digitsStageTwoService.digitsToLetters(num11);
        digitsStageTwoService.clear();

        int[] num12 = {0, 0};
        digitsStageTwoService.digitsToLetters(num12);
        digitsStageTwoService.clear();

    }
}

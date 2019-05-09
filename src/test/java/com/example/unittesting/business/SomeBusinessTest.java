package com.example.unittesting.business;

import org.junit.Assert;
import org.junit.Test;

public class SomeBusinessTest {

    @Test
    public void calculateSum_basic() {
        SomeBusiness business =  new SomeBusiness();
        int result = business.calculateSum(new int[]{1, 2, 3});
        int expectedResult = 6;

        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void calculateSum_empty() {
        SomeBusiness business =  new SomeBusiness();
        int result = business.calculateSum(new int[]{});
        int expectedResult = 0;

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void calculateSum_one_value() {
        SomeBusiness business =  new SomeBusiness();
        int result = business.calculateSum(new int[]{5});
        int expectedResult = 5;

        Assert.assertEquals(expectedResult, result);
    }
}

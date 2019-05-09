package com.example.unittesting.business;

import com.example.unittesting.data.SomeDataServiceImp;
import org.junit.Assert;
import org.junit.Test;



public class SomeBusinessStubTest {

    @Test
    public void calculateSumUsingDataService_basic_basic() {
        SomeBusiness business =  new SomeBusiness();
        business.setSomeDataService(new SomeDataServiceImp());
        int result = business.calculateSumUsingDataService();
        int expectedResult = 6;

        Assert.assertEquals(expectedResult, result);
    }

}

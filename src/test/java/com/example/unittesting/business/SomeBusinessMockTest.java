package com.example.unittesting.business;

import com.example.unittesting.data.SomeDataService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest {

    @InjectMocks
    SomeBusiness business;

    @Mock
    SomeDataService dataService;

    @Test
    public void calculateSumUsingDataService_basic_basic() {
        when(dataService.retrieveAllData()).thenReturn(new int[] {1,2,3});

        int result = business.calculateSumUsingDataService();
        int expectedResult = 6;

        Assert.assertEquals(expectedResult, result);
    }

}

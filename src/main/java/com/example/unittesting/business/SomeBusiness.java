package com.example.unittesting.business;

import com.example.unittesting.data.SomeDataService;

public class SomeBusiness {

    private SomeDataService someDataService;

    public int calculateSum(int[] data) {
        int sum = 0;
        for(int value: data) {
            sum += value;
        }

        return sum;
    }

    public int calculateSumUsingDataService() {
        int sum = 0;
        int[] data = someDataService.retrieveAllData();
        for(int value: data) {
            sum += value;
        }

        return sum;
    }

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }
}

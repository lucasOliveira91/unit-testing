package com.example.unittesting.business;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListMockTest {
    List mock =  mock(List.class);

    @Test
    public void size_basic() {
        when(mock.size()).thenReturn(5);
        Assert.assertEquals(5, mock.size());
    }

    @Test
    public void returnDifferentValues() {
        when(mock.size()).thenReturn(5).thenReturn(10);
        Assert.assertEquals(5, mock.size());
        Assert.assertEquals(10, mock.size());
    }


    @Test
    public void returnWithParameters() {
      when(mock.get(0)).thenReturn("teste");
      Assert.assertEquals(mock.get(0), "teste");
    }
}

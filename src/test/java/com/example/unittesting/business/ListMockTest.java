package com.example.unittesting.business;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class ListMockTest {
    List<String > mock =  mock(List.class);

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

    @Test
    public void returnWithGenericParametes() {
      when(mock.get(anyInt())).thenReturn("teste");
      Assert.assertEquals(mock.get(0), "teste");
    }

    @Test
    public void verificationBasics() {
        String value = mock.get(0);

        verify(mock).get(0);
        verify(mock, times(1)).get(0);

    }

    @Test
    public void spying() {
        ArrayList arrayList =  spy(ArrayList.class);
        arrayList.add("teste");
        System.out.println(arrayList.size());

    }
}

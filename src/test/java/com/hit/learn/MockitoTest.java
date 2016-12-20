package com.hit.learn;

import com.hit.learn.effectivejava.item8.reflexivity.A;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

/**
 * Created by Acceml on 2016/12/20.
 */
public class MockitoTest {
    @Mock
    private MockElementA mockElementA;
    @Mock
    private MockElementB mockElementB;

    @Before
    public void initTest() {
        //Important! This needs to be somewhere in the base class or a test runner.
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void tutorialMockito() {
        //mock creation
        List mockedList = mock(List.class);

        //using mock object
        mockedList.add("one");
        mockedList.clear();

        //verification
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

    @Test
    public void testStubbing() {
        //You can mock concrete classes, not just interfaces
        LinkedList mockedList = mock(LinkedList.class);

        //stubbing
        when(mockedList.get(0)).thenReturn("first");
        when(mockedList.get(1)).thenThrow(new RuntimeException());

        //following prints "first"
        System.out.println(mockedList.get(0));

        //following throws runtime exception
        //System.out.println(mockedList.get(1));

        //following prints "null" because get(999) was not stubbed
        System.out.println(mockedList.get(999));

        //Although it is possible to verify a stubbed invocation, usually it's just redundant
        //If your code cares what get(0) returns, then something else breaks (often even before verify() gets executed).
        //If your code doesn't care what get(0) returns, then it should not be stubbed. Not convinced? See here.
        verify(mockedList).get(0);
    }

    @Test
    public void testArgumentMatcher() {
        LinkedList mockedList = mock(LinkedList.class);
        when(mockedList.get(anyInt())).thenReturn("element");
        Assert.assertEquals("element", mockedList.get(999));
        verify(mockedList).get(anyInt());
    }

    @Test
    public void testSpy() {
        List list = new LinkedList();
        List spy = spy(list);
        when(spy.size()).thenReturn(100);
        spy.add("one");
        spy.add("two");
        Assert.assertEquals(100, spy.size());
        verify(spy).add("one");
        verify(spy).add("two");
        Assert.assertEquals("one", spy.get(0));
        Assert.assertEquals("two", spy.get(1));
        when(spy.get(0)).thenReturn("foo");
        System.out.println(spy.get(0));
        doReturn("foo").when(spy).get(0);
    }
}
package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackServiceTest {

    CashBackService service = new CashBackService();

@Test
 public void shouldReturnDifferenceBetweenTheValues() {
        int actual = service.remain(800);
        int expected = 200;
        assertEquals(actual, expected);
    }
@Test
public void shouldReturnZeroIfAmountIsEqualTo1000() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
@Test
public void shouldReturnDifferenceIfAmountIsMoreThan1000() {
        int actual = service.remain(1100);
        int expected = 900;
        assertEquals(actual, expected);
    }
}
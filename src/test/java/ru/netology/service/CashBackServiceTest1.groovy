package ru.netology.service

import org.junit.Test
import static org.junit.Assert.*

CashBackService service = new CashBackService()

@Test
void shouldReturnDifferenceBetweenTheValues() {
    int expected = 200
    int actual = service.remain(800)
    assertEquals(expected, actual)
}

@Test
void shouldReturnZeroIfAmountIsEqualTo1000() {
    int expected = 0
    int actual = service.remain(1000)
    assertEquals(expected, actual)
}

@Test
void shouldReturnDifferenceIfAmountIsMoreThan1000() {
    int expected = 900
    int actual = service.remain(1100)
    assertEquals(expected, actual)
}

package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateRemainAmount2000() {
        int actual = service.remain(2000);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainAmountLess1000() {
        int actual = service.remain(777);
        int expected = 223;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateRemainAmountMore1000() {
        int actual = service.remain(1890);
        int expected = 110;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainAmount0() {
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }
}
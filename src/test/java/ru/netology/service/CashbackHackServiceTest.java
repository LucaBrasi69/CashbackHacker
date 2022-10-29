package ru.netology.service;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateRemainAmount1000() {
        int actual = service.remain(1000);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainAmountLess1000() {
        int actual = service.remain(800);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainAmountMore1000() {
        int actual = service.remain(1550);
        int expected = 450;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainAmount1() {
        int actual = service.remain(1);
        int expected = 999;

        assertEquals(actual, expected);
    }

}
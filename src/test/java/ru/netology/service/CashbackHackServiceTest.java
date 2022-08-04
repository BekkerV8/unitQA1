package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void ShouldCashback() {
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldCashbackZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1_000;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldCashback1000() {
        int amount = 1_000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldCashback10() {
        int amount = 990;
        int actual = service.remain(amount);
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldMinusCashback() {
        int amount = -1;
        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);
    }

}


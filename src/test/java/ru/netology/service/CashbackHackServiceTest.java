package ru.netology.service;

import static org.junit.Assert.*;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void ShouldCashback() {
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void ShouldCashbackZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1_000;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void ShouldCashback1000() {
        int amount = 1_000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void ShouldCashback10() {
        int amount = 990;
        int actual = service.remain(amount);
        int expected = 10;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void ShouldMinusCashback() {
        int amount = -1;
        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void  JunitShouldCashback() {
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void  JunitShouldCashbackZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1_000;

        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void  JunitShouldCashback1000() {
        int amount = 1_000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void  JunitShouldCashback10() {
        int amount = 990;
        int actual = service.remain(amount);
        int expected = 10;

        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void  JunitShouldMinusCashback() {
        int amount = -1;
        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);
    }

}


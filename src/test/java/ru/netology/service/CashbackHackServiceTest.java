package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void calculateRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void RemainWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void RemainWithoutCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void RemainWithoutActions() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }
}
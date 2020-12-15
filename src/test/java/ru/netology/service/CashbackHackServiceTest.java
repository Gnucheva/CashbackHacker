package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateIfAmountCorrect() {
        int amount = 450;
        int actual = service.remain(amount);
        int expected = 550;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfAmountZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfAmountOver1000() {
        int amount = 1005;

        int actual = service.remain(amount);
        int expected = 995;

        assertEquals(actual, expected);
    }

}

package ru.netology.QA38.unit;

import org.junit.Test;
import static org.junit.Assert.*;


public class CashbackHackServiceTest {

    @Test
    public void shouldRemainToCashbackIfPrise800() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 800;

        int actual = cashbackHackService.remain(amount);
        int expected = 200;
        assertEquals(expected, actual);
    }

    @Test
   public void shouldRemainToCashbackIfPrise999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;

        int actual = cashbackHackService.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
   public void shouldRemainToCashbackIfPrise1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
   public void shouldRemainToCashbackIfPrise1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Scanner;

class NextDayCalculatorTest {

    @Test
    void testCalculateNextDay1() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2/1/2018";
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String result = nextDayCalculator.calculateNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testCalculateNextDay2() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1/2/2018";
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String result = nextDayCalculator.calculateNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testCalculateNextDay3() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1/5/2018";
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String result = nextDayCalculator.calculateNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testCalculateNextDay4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1/3/2018";
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String result = nextDayCalculator.calculateNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testCalculateNextDay5() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1/3/2020";
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String result = nextDayCalculator.calculateNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testCalculateNextDay6() {
        int day = 28;
        int month = 2;
        int year = 2020;
        String expected = "29/2/2020";
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String result = nextDayCalculator.calculateNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testCalculateNextDay7() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1/1/2019";
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String result = nextDayCalculator.calculateNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testCalculateNextDay8() {
        int day = 31;
        int month = 13;
        int year = 2018;
        try {
            NextDayCalculator nextDayCalculator = new NextDayCalculator();
            String result = nextDayCalculator.calculateNextDay(day, month, year);
            assertFalse(true);
        } catch (Exception exception) {
            assertTrue(true);
        }
    }
    @Test
    void testCalculateNextDay9() {
        int day = 0;
        int month = 0;
        int year = 2018;
        try {
            NextDayCalculator nextDayCalculator = new NextDayCalculator();
            String result = nextDayCalculator.calculateNextDay(day, month, year);
            assertFalse(true);
        } catch (Exception exception) {
            assertTrue(true);
        }
    }
}
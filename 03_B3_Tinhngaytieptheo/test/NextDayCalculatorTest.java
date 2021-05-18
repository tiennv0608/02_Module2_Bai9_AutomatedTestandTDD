import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Scanner;

class NextDayCalculatorTest {

    @Test
    void calculateNextDay() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2/1/2018";

        String result = NextDayCalculator.calculateNextDay(day,month,year);
        assertEquals(expected, result);
    }

    @Test
    void calculateNextDayLastMonthHas31Days() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1/2/2018";

        String result = NextDayCalculator.calculateNextDay(day,month,year);
        assertEquals(expected, result);
    }
    @Test
    void calculateNextDayLastMonthHas30Days() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1/5/2018";

        String result = NextDayCalculator.calculateNextDay(day,month,year);
        assertEquals(expected, result);
    }
    @Test
    void calculateNextDayLastFebruary() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1/3/2018";

        String result = NextDayCalculator.calculateNextDay(day,month,year);
        assertEquals(expected, result);
    }
    @Test
    void calculateNextDayLastFebruaryInLeapYear() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1/3/2020";

        String result = NextDayCalculator.calculateNextDay(day,month,year);
        assertEquals(expected, result);
    }
    @Test
    void calculateNextDayFebruaryInLeapYear() {
        int day = 28;
        int month = 2;
        int year = 2020;
        String expected = "29/2/2020";

        String result = NextDayCalculator.calculateNextDay(day,month,year);
        assertEquals(expected, result);
    }
    @Test
    void calculateNextDayLastYear() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1/1/2019";

        String result = NextDayCalculator.calculateNextDay(day,month,year);
        assertEquals(expected, result);
    }
}
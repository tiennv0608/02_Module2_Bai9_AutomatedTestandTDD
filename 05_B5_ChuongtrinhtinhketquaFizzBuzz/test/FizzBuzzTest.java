import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void testFizz1() {
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void testFizz2() {
        int number = 6;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        Assertions.assertEquals(expected,result);
    }
    @Test
    void testBuzz1() {
        int number = 5;
        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzz(number);
        Assertions.assertEquals(expected,result);
    }
    @Test
    void testBuzz2() {
        int number = 10;
        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzz(number);
        Assertions.assertEquals(expected,result);
    }
    @Test
    void testFizzBuzz1() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzBuzz(number);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz2() {
        int number = 30;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzBuzz(number);
        Assertions.assertEquals(expected, result);
    }
    @Test
    void testFizz3() {
        int number = 23;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        Assertions.assertEquals(expected, result);
    }
    @Test
    void testBuzz3() {
        int number = 52;
        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzz(number);
        Assertions.assertEquals(expected, result);
    }
    @Test
    void testFizzBuzzWrong1() {
        int number = 26;
        String expected = "hai sau";

        String result = FizzBuzz.fizzBuzz(number);
        Assertions.assertEquals(expected, result);
    }
    @Test
    void testFizzBuzzWrong2() {
        int number = 14;
        String expected = "muoi bon";

        String result = FizzBuzz.fizzBuzz(number);
        Assertions.assertEquals(expected, result);
    }
    @Test
    void testFizzBuzzWrong3() {
        int number = 1;
        String expected = "mot";

        String result = FizzBuzz.fizzBuzz(number);
        Assertions.assertEquals(expected, result);
    }
    @Test
    void testFizzBuzzWrong4() {
        int number = 100;
        String expected = "Khong choi voi so lon hon hoac bang 100";

        String result = FizzBuzz.fizzBuzz(number);
        Assertions.assertEquals(expected, result);
    }
}
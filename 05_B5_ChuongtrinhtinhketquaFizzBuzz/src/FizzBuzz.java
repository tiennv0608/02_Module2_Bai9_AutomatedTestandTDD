public class FizzBuzz {
    public static String fizzBuzz(int number) {
        String result = "";
        if (number > 99 || number < 0) {
            result = "Khong choi voi so lon hon hoac bang 100";
        } else {
            boolean isFizz = number % 3 == 0;
            boolean isBuzz = number % 5 == 0;
            String str = Integer.toString(number);

            if (isFizz && isBuzz) {
                result = "FizzBuzz";
            } else if (isFizz) {
                result = "Fizz";
            } else if (isBuzz) {
                result = "Buzz";
            } else {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '3') {
                        result = "Fizz";
                        break;
                    } else if (str.charAt(i) == '5') {
                        result = "Buzz";
                        break;
                    } else {
                        switch (str.charAt(i)) {
                            case '1':
                                if (str.length() == 1) {
                                    result += "mot ";
                                } else {
                                    result += "muoi ";
                                }
                                break;
                            case '2':
                                result += "hai ";
                                break;
                            case '4':
                                result += "bon ";
                                break;
                            case '6':
                                result += "sau ";
                                break;
                            case '7':
                                result += "bay ";
                                break;
                            case '8':
                                result += "tam ";
                                break;
                            case '9':
                                result += "chin ";
                                break;
                        }
                    }
                }
            }
        }
        result = result.trim();
        return result;
    }
}

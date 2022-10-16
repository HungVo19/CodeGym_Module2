public class FizzBuzzTranslate {
    public static String numberToString(int number) {
        if (number >= 0) {
            if (number % 3 == 0 && number % 5 == 0) {
                return "FizzBuzz";
            } else if (number % 3 == 0) {
                return "Fizz";
            } else if (number % 5 == 0) {
                return "Buzz";
            }
        }
        return "Please enter a positive number";
    }
}

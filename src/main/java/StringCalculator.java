public class StringCalculator {
    public static int add(final String numbers) {

        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (Integer.parseInt(number.trim()) < 0) {
                throw new IllegalArgumentException("Negatives not allowed."); // Handle exception if n is negative
            }
            if (!number.trim().isEmpty()) {
                returnValue += Integer.parseInt(number.trim());
            }
        }
        return returnValue;
    }
}
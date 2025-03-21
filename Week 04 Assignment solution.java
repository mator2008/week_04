public class Main {

    public static void main(String[] args) {
        // 1. Create an array of int called ages.
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        // 1.a. Subtract the first element from the last element programmatically.
        int difference = ages[ages.length - 1] - ages[0];
        System.out.println("Difference in ages array (last - first): " + difference);

        // 1.b. Create a new array of int called ages2 with 9 elements.
        // (Here we create an array with 9 elements. You can change the values as needed.)
        int[] ages2 = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        // 1.b.ii. Repeat the subtraction for ages2.
        int difference2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println("Difference in ages2 array (last - first): " + difference2);

        // 1.b.iii. This demonstrates that using dynamic indices works for arrays of any length.
        // (By using ages2[ages2.length - 1] and ages2[0] we do not rely on hard-coded indices.)

        // 1.c. Calculate the average age in the ages array.
        int sumAges = 0;
        for (int age : ages) {
            sumAges += age;
        }
        double averageAge = (double) sumAges / ages.length;
        System.out.println("Average age in ages array: " + averageAge);

        // 2. Create an array of String called names.
        String[] names = {"Samuel", "Tommy", "Tim", "Sally", "Buck", "Bobby"};

        // 2.a. Calculate the average number of letters per name.
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double averageLetters = (double) totalLetters / names.length;
        System.out.println("Average number of letters per name: " + averageLetters);

        // 2.b. Concatenate all the names together separated by spaces.
        StringBuilder concatenatedNames = new StringBuilder();
        for (String name : names) {
            concatenatedNames.append(name).append(" ");
        }
        // Remove the trailing space before printing.
        System.out.println("Concatenated names: " + concatenatedNames.toString().trim());

        // 3. How do you access the last element of any array?
        // Answer: array[array.length - 1]
        System.out.println("Last element of ages array: " + ages[ages.length - 1]);

        // 4. How do you access the first element of any array?
        // Answer: array[0]
        System.out.println("First element of ages array: " + ages[0]);

        // 5. Create a new array of int called nameLengths.
        // Fill it with the lengths of each name from the names array.
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // 6. Sum all the elements in the nameLengths array.
        int sumNameLengths = 0;
        for (int len : nameLengths) {
            sumNameLengths += len;
        }
        System.out.println("Sum of all elements in nameLengths: " + sumNameLengths);

        // 7. Call method to concatenate a word to itself n times.
        String repeatedWord = repeatWord("Hello", 3);
        System.out.println("Repeated word: " + repeatedWord);

        // 8. Call method to get a full name.
        String fullName = getFullName("Alan", "Smith");
        System.out.println("Full name: " + fullName);

        // 9. Call method that checks if the sum of an int array is greater than 100.
        int[] sampleNumbers = {10, 20, 30, 40, 5}; // Sum is 105 which is > 100.
        System.out.println("Is sum > 100? " + isSumGreaterThan100(sampleNumbers));

        // 10. Call method to calculate the average of an array of doubles.
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5};
        System.out.println("Average of doubleArray: " + calculateAverage(doubleArray));

        // 11. Call method that compares the averages of two arrays of doubles.
        double[] firstArray = {2.0, 4.0, 6.0};
        double[] secondArray = {1.0, 2.0, 3.0};
        System.out.println("Is average of firstArray greater than secondArray? " +
                isFirstAverageGreater(firstArray, secondArray));

        // 12. Call willBuyDrink method.
        boolean willBuy = willBuyDrink(true, 11.00);
        System.out.println("Will buy drink? " + willBuy);

        // 13. Call a custom method.
        // Custom method: findMax finds the maximum value in an integer array.
        // This is useful for determining the largest number in a set.
        int[] sampleArray = {5, 3, 9, 1, 4};
        int maxValue = findMax(sampleArray);
        System.out.println("Maximum value in sampleArray: " + maxValue);
    }

    /**
     * 7. Returns the given word concatenated to itself n times.
     * For example, repeatWord("Hello", 3) returns "HelloHelloHello".
     */
    public static String repeatWord(String word, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        return result.toString();
    }

    /**
     * 8. Returns the full name by combining firstName and lastName with a space.
     */
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    /**
     * 9. Returns true if the sum of all the integers in the array is greater than 100.
     */
    public static boolean isSumGreaterThan100(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum > 100;
    }

    /**
     * 10. Returns the average of all the elements in an array of doubles.
     */
    public static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    /**
     * 11. Returns true if the average of the elements in the first array is greater than
     * the average of the elements in the second array.
     */
    public static boolean isFirstAverageGreater(double[] array1, double[] array2) {
        return calculateAverage(array1) > calculateAverage(array2);
    }

    /**
     * 12. Returns true if it is hot outside and money in pocket is greater than 10.50.
     */
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }

    /**
     * 13. Custom method: Finds and returns the maximum value in an integer array.
     * This method is useful for determining the largest number in a collection.
     */
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

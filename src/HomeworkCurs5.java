public class HomeworkCurs5 {
    public static void main(String[] args) {
        int[] numbers = {4, 52, 4, 3, 67, 43};
        System.out.println(countOddNumbers(numbers));
        String[] numbersBiggerThan = getNumbersBiggerThan(numbers, 5);
        for (String number : numbersBiggerThan) {
            System.out.println(Integer.parseInt(number));
        }
    }

    public static int countOddNumbers(int[] input) {
        int count = 0;
        for (int number : input) {
            if (number % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static String[] getNumbersBiggerThan(int[] numbers, int target) {
        StringBuilder result = new StringBuilder();
        for (int number : numbers) {
            if (number > target) {
                result.append(number).append(" ");
            }
        }
        return result.toString().split(" ");
    }
}
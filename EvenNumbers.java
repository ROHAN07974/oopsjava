import java.util.Arrays;

public class EvenNumbers {
    static int[] getEvenNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                     .filter(n -> n % 2 == 0)
                     .toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(getEvenNumbers(numbers)));
    }
}
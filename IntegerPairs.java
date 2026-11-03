import java.util.Arrays;

public class IntegerPairs {
    static Integer[][] groupIntoPairs(int[] numbers) {
        Integer[][] pairs = new Integer[(numbers.length + 1) / 2][2];

        for (int i = 0; i < numbers.length; i++) {
            int pairIndex = i / 2;
            int positionInPair = i % 2;
            pairs[pairIndex][positionInPair] = numbers[i];
        }

        return pairs;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Integer[][] pairs = groupIntoPairs(numbers);

        for (Integer[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
    }
}

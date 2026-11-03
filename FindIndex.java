public class FindIndex {
    static int findIndex(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        int target = 30;

        int index = findIndex(numbers, target);
        if (index == -1) {
            System.out.println(target + " was not found.");
        } else {
            System.out.println(target + " is at index " + index + ".");
        }
    }
}

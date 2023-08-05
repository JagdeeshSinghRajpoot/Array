public class Reverse_an_Array {
    public static void reverseArray(int numbers[]) {
        int start = 0, last = numbers.length - 1;
        while (start < last) {
            int tamp = numbers[last];
            numbers[last] = numbers[start];
            numbers[start] = tamp;

            start++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 8, 10, 12, 14, 16 };
        reverseArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

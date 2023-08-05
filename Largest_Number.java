import java.util.*;

public class Largest_Number {
    public static int largestNumber(int numbers[]) {
        int Largest = Integer.MIN_VALUE; // - infinity
        for (int i = 0; i < numbers.length; i++) {
            if (Largest < numbers[i]) {
                Largest = numbers[i];
            }

        }
        return Largest;
    }

    public static int smallest(int numbers[]) {
        int Smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (Smallest > numbers[i]) {
                Smallest = numbers[i];
            }
        }
        return Smallest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 3, 5, 3, 8 };
        System.out.println(largestNumber(numbers));
        System.out.println(smallest(numbers));
    }

}

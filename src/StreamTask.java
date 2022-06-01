import java.util.Arrays;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        return Arrays.stream(numbers)
            .filter(a -> a % 2 == 0)
            .reduce(0, (a, b) -> a + b * b);
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        return Arrays.stream(numbers)
            .filter(a -> Math.abs(a) % 2 == 1)
            .sorted()
            .toArray();
    }
}

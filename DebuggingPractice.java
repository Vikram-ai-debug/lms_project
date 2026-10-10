
public class DebuggingPractice {

    public static int findMax(int[] numbers) {
    int maxValue = numbers[0]; // start from the first number, not 0
    for (int n : numbers) {
        if (n > maxValue) {
            maxValue = n;
        }
    }
    return maxValue;
}


    public static void main(String[] args) {
        int[] numbers = {-8, -3, -12, -5};

        System.out.println("Maximum: " + findMax(numbers));
    }
}

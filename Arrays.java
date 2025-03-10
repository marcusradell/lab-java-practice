public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(java.util.Arrays.toString(numbers));

        for(var number: numbers) {
            System.out.println("number = " + number);
        }

        java.util.Arrays.fill(numbers, 99);

        System.out.println(java.util.Arrays.toString(numbers));


    }
}

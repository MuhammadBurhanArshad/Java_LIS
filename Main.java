public class Main{
    public static void main(String[] args) {
        int[] numbers = {10, 9, 2, 5, 3, 7, 101, 18};

        LIS lis = new LIS();

        int foundLIS = lis.findLIS(numbers);

        System.out.println(foundLIS);
    }
}
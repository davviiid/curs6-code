package ro.fasttrackit.curs6;

public class FindIntegersSum {
    public static void main(String [] args) {
        int [] numbers  = new int[] {-1, 3, 5, 8, 10, -12, 9};
        System.out.println(findSum(numbers));
    }

    private static int findSum(int[] numbers){
        int sum = 0;
        for(int number : numbers){
            sum = sum + number;
        }
        return sum;
    }
}

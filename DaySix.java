public class DaySix{
    public static void main(String[] args){
        // Sum of N natural numbers
        int n = sumOfNNaturalNumbers(30);
        System.out.println(n);

    }

    public static int sumOfNNaturalNumbers(int n){
        if(n == 1){
            return n;
        }
        return n + sumOfNNaturalNumbers(n-1);
    }
}
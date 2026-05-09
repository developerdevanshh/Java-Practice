public class DayFive{
    public static void main(String[] args){
        int[] arr = {20,2,55,55,656,51};
        System.out.println(sumOfArray(arr));
        System.out.println(sum(2,3,4, 0));
        System.out.println(upperFun(" asdfa dev  sfaf         "));
        System.out.println(sum(3.3,432.3, 2.2,2.20));

    }   
    
    public static int sumOfArray(int[] arr){
        int res = 0;
        // for(int i=0;i< arr.length;i++){
        //     res = res + arr[i];
        // }
        for(int i : arr){
            res += i;
        }
        return res;
    }

    private static String upperFun(String str){
        return str.toUpperCase().trim();
    }

    private static int sum(int a, int b){
        return a + b;
    }

    private static int sum(int a, int b,int c){ // Overloading Methods
        return a + b + c;
    }
    
    // private static float sum(float a, float b,float c,float d){ // Overloading Methods
    //     return a + b + c + d;
    // }

    private static double sum(double a, double b, double c, double d){ // Overloading Methods
        return a + b + c + d;
    }
    // Signature == Name + parameters types

}
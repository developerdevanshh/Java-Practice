public class Hello {
    public static void main(String[] args){ 
        // byte b = 127; // byte can hold values from -128 to 127  
        // int a = 555; // int can hold values from -2,147,483,648 to 2,147,483,647
        // byte k = (byte)a;

        float f = 5.65f; // The 'f' suffix indicates that this is a float literal. By default, decimal numbers are treated as double in Java, so we need to specify that this is a float.
        int t = (int)f; // converting the float to an int will truncate the decimal part, resulting in 5    
        System.out.println(f);
        System.out.println(t);

    }
}

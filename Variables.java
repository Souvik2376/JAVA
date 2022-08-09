public class Variables {
    /*
    Type of the variable    size     primitive/ reference               value
    --------------------    ----     --------------------               -----
    *boolean                 1 bit      primitive                     true or false

    byte                    1 byte     ,,                            -128 to 127
    short                   2 bytes    ,,                            -32,768 to 32,768
    *int                     4 bytes    ,,                            -2 bilion to 2 billoin
    *long                    8 bytes    ,,                            -9 quintrillion to 9 quintrillion
    
    *float                   4 bytes    ,,                            fractional number upto 5-6 digits after decimal 
    *double                  8 bytes    ,,                            fractional number upto 15 digits after decimal  

    *char                    2 byte     ,,                            letters , characters , ASCI value 
    *string                  varies     reference                     any string 
     */
    public static void main(String[] args ){
        int a;// variable declaration
        a= 2022;// variable initialization
        int b = 2023;// declare and initialize at the same line
        System.out.println("The year is "+a);
        System.out.println("Next year is :"+b);

        int c= 12345;// Nothig just initialize
        long x=1234567891234567908L;//using long data type the number should be followed by L
        System.out.println(c);
        System.out.println(x);

        float y= 1.12345f;//using float we have to follow the number with f 
        double z= 1.23456789123456; // no fllowing needed
        System.out.println(y);
        System.out.println(z);

        boolean m=true; //boolean oly can store 2 values like truend flase it dont need any single and double cout just declareit like normal 
        boolean n=false;
        System.out.println("JAVA is object orianed programming ? Ans :-"+m);
        System.out.println("JAVA is nots good as python :( ? Ans :-"+n);

        char o='A';// character should be in single quote '' 
        System.out.println(o);

        String q="Anya likes peanuts";// to declare a string we have to make the first letter of the string is capital and declare it double quote""
        System.out.println(q);
    }
}

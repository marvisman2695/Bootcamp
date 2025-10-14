public class DemoPrimitives{
public static void main(String[] args) {


// Raw Type

//We have 8 primitive (byte, short, int, long, float, double,char,Boolean)

        byte b1 = 3;
        byte b2 = 127; //max value of byte
        byte b3 =-128; // min value of byte

        //byte b4 = -129;
        //byte b4 = 128;


        short s1 = 32767; // max
        short s2 = -32768; // min
        // short s3 = 32768
        // short s4 = 32769;

        //!!By Default, we use int for 99% scenario.
        int i1 = 2147483647; // max
        int i2 = -2147483648; //min

        // 2^63 -1 (max)
        // -2^63 (min)
        long l1 = 10;
        long l2 = -21;


        //! Decimal
        // double, float

        //10.123456789-> double value
        // double > float (precision)
        double d1 = 10.123456789;


        // ! java(Assign double value to float variable -> error)
        //float f1 = 10.123456789f;

        //10.123456789f-> float value
        float f1 = 10.123456789f;
        double d2 = 10.123456789f;

        double d10 = 10.3;
        //error, not because og the actual value but the type
        //float f10 = d10; // risk ->error (Step1: risky)



        //!Char (single character, including space ' ')
        //"a" is a char value
        // assign char value into char variable
        //single quote '' for char value
        char c1 = 'a';
        String s10 = "a ";

        char gender = 'F';
        char grade = 'A';

        // For primitives comparison, ==, >=, <=,!=, >, <
        //'!=' NOT EQUAL TO
    

        //boolean
        int age = 19;

        // age >= 18 -> event
        boolean isAdult = age >= 18;

        boolean b10 = false;



}
    
}

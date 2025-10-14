public class DemoInt{
    public static void main(String[] args) {
        // You can drop comments/notes by double slash
        // ! Variable and Data Type
        int x = 3;
        // ! int x (declaration)
        // x is a avariavle name
        // ! = 3 (assignment, assgin value 3 to variable x)

        System.out.println(x); //3

int y=10;
System.out.println(y);


//delaration
int a;
int k;

//Assigment
a = 100;
k = 20;

int total = x + y;
System.out.println(total);

int baseSalary = 20000;
int bonus = 5000;
int totalSalary = baseSalary + bonus;
System.out.println(totalSalary);

//discount * (multiply)
int price = 150;
//Naming convension (camel case)
//double finalPrice = price;

double discountRate = 0.8;

//!! Math Operation: 
//1.int + int -> int
//2. int + double -> double
//3. double + int ->double
//4. double + double -> double
// ie. 1.0+4 = 5.0
// 1+4 ->5

//int*double ->double
//! We cannot assign double value int an int variable
//
double finalPrice = price * discountRate;

System.out.println(finalPrice);

int englishScore = 82;
int mathScore = 91;
int historyScore = 83;

//+ - * /
//()

//!(int + int + int) / int -> int
//double averageScore =(englishScore + mathScore + historyScore) /3;
double averageScore =(englishScore + mathScore + historyScore) /3.0;
System.out.println(averageScore);

int appleCount = 9;
double applePrice = 5.5;
int orangeCount = 4;
double orangePrice= 6.5;

double discount = 0.95;

double appleTotalprice = applePrice * appleCount;
System.out.println(appleTotalprice);

// ! String has + operation
String firstName = "Jennie";
String lastName = "wong";
String fullName = firstName + " " + lastName;
System.out.println(fullName);

// short cut; sysout

String emptyString = "";
System.out.println(emptyString);

//!String has no -, *,/ operations

//!For + operation in String , it becomes String no matter what they are.

//String Value + double value -> String Value
//Assign String value into String varialbeS
String s3 = "Sally" + 0.3;
System.out.println(s3);  // sally0.3
String s4 = "Leo" +102;
System.out.println(s4); // Leo102

// double result = "Vincent" + 8.4 // error

//! Methods (Functions)
// 1. length
String teacher = "Steven";
System.out.println(teacher.length()); // 6


// 2. isEmpty
System.out.println(teacher.isEmpty()); // false
System.out.println(emptyString.isEmpty()); // true

//3. equals
String s6="abc";
String s7="abc";
System.out.println(s6.equals(s7)); // true
String s8 = "abcd";
System.out.println(s8.equals(s7)); // false


//4. charAt
// ! Index begins at 0
System.out.println(s8.charAt(0)); //a
System.out.println(s8.charAt(1)); //b
System.out.println(s8.charAt(2)); //c
System.out.println(s8.charAt(3)); //d
//system.out.prinln(s8.charAt(4)); // error
//system.out.ptinln(s8.charAt(-1)); // error

}
}
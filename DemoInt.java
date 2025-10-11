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
finalPrice = price;

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

}
}
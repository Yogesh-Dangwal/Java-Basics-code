       //Different  types of print function
// public class JavaBasics {
//
//     public static void main(String[] args) {
//         System.out.print("Hello ");
//         System.out.print("Yash");
//         System.out.println("Hello");
//         System.out.println("Yash");
//         System.out.print("Hello\nYash");
//     }
// }



       //Pattern
// public class JavaBasics {

//     public static void main(String[] args) {
//         System.out.println("* * * *");
//         System.out.println("* * *");
//         System.out.println("* *");
//         System.out.print("*");
//     }
// }



           //Primitive data types
// public class JavaBasics {

//     public static void main(String[] args) {
//         int a = 2147483647;
//         int b = 5;
//         System.out.println(a);
//         System.out.println(b);
//         String name = "Yash";
//         System.out.println(name);
//         a=100;
//         System.out.println(a);
//         byte c = 127;
//         System.out.println(c);
//         char ch = 'a';
//         System.out.println(ch);
//         boolean var = false;
//         System.out.println(var);
//         float d = 1;
//         System.out.println(d);
//         double e = 1.14;
//         System.out.println(e);
//         long f = 999999999;
//         System.out.println(f);
//         short g = 32767;
//         System.out.println(g);
//     }
// }



           //Sum of two given no.
/*public class JavaBasics {

   public static void main(String[] args) {
       int a = 10;
       int b = 25;
       int sum = a+b;
       // int a,b,sum;
       // a=10;
       // b=25;
       // sum=a+b;
       System.out.println(sum);
   }
}*/



           //Input in java
// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // String a = sc.next(); //Yash
//         // String a = sc.nextLine(); //Yash Rajput
//         // int a = sc.nextInt();
//         // System.out.println(a);
//         // float b = sc.nextFloat();
//         // System.out.println(b);
//         // boolean c = sc.nextBoolean();
//         // System.out.println(c);
//         // short d = sc.nextShort();
//         // System.out.println(d);
//         long e = sc.nextLong();
//         System.out.println(e);
//     }
// }



           //Sum of two no.(Take input from user)
// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // int a = sc.nextInt();
//         // int b = sc.nextInt();
//         // int sum = a+b;
//         // System.out.println(sum);
//         float a = sc.nextFloat();
//         float b = sc.nextFloat();
//         Float sum = a+b;
//         System.out.println(sum);
//     }
// }



           //Product of two no.(Take input from user)
// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a,b,product;
//         a = sc.nextInt();
//         b = sc.nextInt();
//         product = a * b;
//         System.out.println("Product of two number is : "+ product);
//     }
// }



           //Find area of cicle
// import java.util.*;
// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float r,a;
//         r = sc.nextFloat();
//         a=3.14f*r*r;
//         // float r,pi,a;
//         // r = sc.nextFloat();
//         // pi=3.14f;
//         // a = pi*r*r;
//         System.out.println("Area of circle is : "+a);
//         sc.close();
//     }
// }



           //Type conversion in java/Widening/Implicit
// public class JavaBasics {

//     public static void main(String[] args) {
//         int a = 20;
//         long b = a; //Destination Type > Source Type
//         char c = 'a';
//         int d = c;
//         System.out.println(b);
//         System.out.println(d);
//     }
// }



           //Type casting in java/Narrowing/Explicit
// import java.util.*;
// public class JavaBasics {
//     public static void main(String[] args) {
//         // float a = 20.2569f;
//         // int b = (int) a;
//         // System.out.println(b);
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your marks : ");
//         float m = sc.nextFloat();
//         int b = (int) m;
//         System.out.println(b);
//         sc.close();
//     }
// }



           //Type promotion in java
// public class JavaBasics {

//     public static void main(String[] args) {
//         char a = 'a';
//         char b = 'b';
//         char c = 'c';
//         System.out.println(a+b+c);
//         char d = 'a';
//         byte e = 40;
//         short f = 500;
//         System.out.println(d+e+f);
//     }
// }//Char,Byte and Short data type promoted to Integer data type.

// public class JavaBasics {
//     public static void main(String[] args) {
//         float a = 50.25f;
//         int b = 20;
//         byte c = 12;
//         System.out.println(a+b+c);
//         int d = 100;
//         long e = 500;
//         float f = 10.25f;
//         System.out.println(d+e+f);
//     }
// }//Expressions will convert to the biggest data type in it.




           //Type of operators in java
       //Arithmetic operators
// public class JavaBasics {

//     public static void main(String[] args) {
//         int A = 10;
//         int B = 3;
//         System.out.println("Addition : "+(A+B));
//         System.out.println("Subtraction : "+(A-B));
//         System.out.println("Multiplication : "+(A*B));
//         System.out.println("Division : "+(A/B));
//         System.out.println("Remainder : "+(A%B));
//     }
// }//Binary operators

// public class JavaBasics {

//     public static void main(String[] args) {
//         int a = 10;
//         int b = ++a;
//         System.out.println(a);
//         System.out.println("Pre Increment :"+b);

//         int c = 10;
//         int d = c++;
//         System.out.println(c);
//         System.out.println("Post Increment :"+d);

//         int e = 10;
//         int f = --e;
//         System.out.println(e);
//         System.out.println("Pre Decrement :"+f);

//         int g = 10;
//         int h = g--;
//         System.out.println(g);
//         System.out.println("Post Decrement :"+h);
//     }
// }//Unary operators


       //Relational operators
// public class JavaBasics {

//         public static void main(String[] args) {
//                 int A = 10;
//                 int B = 10;
//                 int C = 15;
//                 System.out.println(A==B);
//                 System.out.println(A==C);

//                 System.out.println(A!=B);
//                 System.out.println(A!=C);

//                 System.out.println(A>B);
//                 System.out.println(C>B);

//                 System.out.println(C<B);
//                 System.out.println(A<C);

//                 System.out.println(A>=B);
//                 System.out.println(A>=C);

//                 System.out.println(A<=B);
//                 System.out.println(C<=A);
//         }
// }


       //Logical operators
// public class JavaBasics {

//         public static void main(String[] args) {
//                 System.out.println((3>2)&&(4>3));
//                 System.out.println((4>3)&&(3>4));
//         }
// }//Logical AND

// public class JavaBasics {

//         public static void main(String[] args) {
//                 System.out.println((3>2)||(4>3));
//                 System.out.println((4>4)||(8>9));
//         }
// }//Logical OR

// public class JavaBasics {

//         public static void main(String[] args) {
//                 System.out.println(!(3>4));
//                 System.out.println(!(4>3));
//         }
// }//Logical NOT


       //Assignment operators
// public class JavaBasics {

//         public static void main(String[] args) {
//                 int A = 10;
//                 A += 5;
//                 System.out.println(A);
//                 // int A = 10;
//                 // System.out.println(A-=5);
//                 // int A = 10;
//                 // System.out.println(A*=2);
//                 // int A = 10;
//                 // System.out.println(A/=2);
//                 // int A = 10;
//                 // System.out.println(A%=2);
//         }
// }



           //Conditional statement
       //if/else statement
// import java.util.*;
// public class JavaBasics {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter your age : ");
//                 int age = sc.nextInt();
//                 if(age >= 18){
//                         System.out.println("As you are an adult you can vote and drive");
//                 }
//                 if(age > 13 && age < 18){
//                         System.out.println("You're not an adult! but you are teenager!");
//                 }
//                 else{
//                         System.out.println("You're not an adult!!");
//                 }
//         }
// }

// import java.util.*;
// public class JavaBasics {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter Two number: ");
//                 int a = sc.nextInt();
//                 int b = sc.nextInt();
//                 if(a>b){
//                         System.out.println("1st number is greater than 2nd number");
//                 }else{
//                         System.out.println("2nd number is greater than 1st number");
//                 }
//         }
// }//Largest of 2 numbers

// import java.util.*;
// public class JavaBasics {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 int input = sc.nextInt();
//                 if(input%2==0){
//                         System.out.println("Number is even");
//                 }else{
//                         System.out.println("Number is odd");
//                 }
//         }
// }Check whether the number is even or odd


       //else if example
// import java.util.*;
// public class JavaBasics {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter your age : ");
//                 int age = sc.nextInt();
//                 if(age >= 18){
//                         System.out.println("As you are an adult you can vote and drive");
//                 }
//                 else if(age > 13 && age < 18){
//                         System.out.println("You're not an adult! but you are teenager!");
//                 }
//                 else{
//                         System.out.println("You're not an adult!!");
//                 }
//         }
// }

// import java.util.*;
// public class JavaBasics {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter Two number: ");
//                 int a = sc.nextInt();
//                 int b = sc.nextInt();
//                 if(a>b){
//                         System.out.println("1st number is greater than 2nd number");
//                 }
//                 else if(a==b){
//                         System.out.println("Both numbers are equal");
//                 }
//                 else{
//                         System.out.println("2nd number is greater than 1st number");
//                 }
//         }
// }//Largest of 2 numbers (else if)

// import java.util.*;
// public class JavaBasics {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter your income: ");
//                 int a = sc.nextInt();
//                 int tax;
//                 if(a<300000){
//                         tax=0;
//                 }
//                 else if(a>=300000 && a<=700000){
//                         tax=(int) (a*0.05);
//                 }
//                 else if(a>700000 && a<=1000000){
//                         tax=(int) (a*0.10);
//                 }
//                 else if(a>1000000 && a<=1200000){
//                         tax=(int) (a*0.15);
//                 }
//                 else if(a>1200000 && a<=1500000){
//                         tax=(int) (a*0.20);
//                 }
//                 else{
//                         tax=(int) (a*0.30);
//                 }
//                 System.out.println("Your tax is: "+tax);
//                 sc.close();
//         }
// }//income tax calculator

// import java.util.*;
// public class JavaBasics {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter any 3 numbers :");
//                 int A,B,C;
//                 A = sc.nextInt();
//                 B = sc.nextInt();
//                 C = sc.nextInt();
//                 if(A>B && A>C){
//                         System.out.println("First number is lagest number");
//                 }else if(B>C){
//                         System.out.println("Second number is lagest number");
//                 }else if(C>B){
//                         System.out.println("Third number is lagest number");
//                 }else{
//                         System.out.println("All numbers are equal");
//                 }
//         }
// }//Largest of 3 numbers


       //3rd type of arithmetic operator- Ternary operator{Alternate method of if/else}
// import java.util.*;
// public class JavaBasics {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter your Age :");
//                 int a = sc.nextInt();
//                 String s = a>=18? "You can vote":"You can't vote";
//                 System.out.println(s);
//         }
//}

// import java.util.*;
// public class JavaBasics {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter your marks : ");
//                 int m = sc.nextInt();
//                 String a = m>=33? "PASS":"FAIL";
//                 System.out.println(a );
//         }
// }


       //Switch
// import java.util.*;
// public class JavaBasics {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Choice 1: Samosa\nChoice 2: Momos\nChoice 3: Cold drink\nEnter your choice :");
//                 int c = sc.nextInt();
//                 switch (c){
//                     case 1:
//                     System.out.println("Ok sir! wait your samosa is coming");
//                     break;

//                     case 2:
//                     System.out.println("Ok sir! wait your momos is coming");
//                     break;

//                     case 3:
//                     System.out.println("Ok sir! wait your cold drink is coming");
//                     break;

//                     default:System.out.println("Invalid choice");
//                 }
//         }
// }

// import java.util.*;
// public class JavaBasics {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter two numbers :");
//                 int a = sc.nextInt();
//                 int b = sc.nextInt();
//                 System.out.println("Enter your operator you want to perform");
//                 char c = sc.next().charAt(0);
//                 switch (c) {
//                         case '+':
//                         System.out.println(a+b);
//                         break;

//                         case '-':
//                         System.out.println(a-b);
//                         break;

//                         case '*':
//                         System.out.println(a*b);
//                         break;

//                         case '/':
//                         System.out.println(a/b);
//                         break;

//                         case '%':
//                         System.out.println(a%b);
//                         break;

//                         default:
//                         System.out.println("Invalid choice!!");
//                         break;
//                 }

//         }
// }//Calculator

// import java.util.*;
// public class JavaBasics {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter year :");
//                 int y = sc.nextInt();
//                 boolean a = y%4==0;
//                 boolean b = y%100!=0;
//                 boolean c = y%100==0 && y%400==0;
//                 if(a && (b || c)){
//                         System.out.println("Year is leap year");
//                 }else{
//                         System.out.println("Year is not leap year");
//                 }
//         }
// }//Leap year



           //Loops
       //while loop
// public class JavaBasics {

//         public static void main(String[] args) {
//                 int counter = 1;
//                 while(counter<101){
//                         System.out.println(counter+" "+"Hello world");
//                         counter++;
//                 }
//         }
// }//100 times Hello world

// public class JavaBasics {

//         public static void main(String[] args) {
//                 int counter = 1;
//                 while(counter<=100){
//                         System.out.print(counter+" ");
//                         counter++;
//                 }
//         }
// }//print numbers 1 to 100

// import java.util.*;
// public class JavaBasics {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 int n = sc.nextInt();
//                 int counter = 1;
//                 while(counter<=n){
//                         System.out.print(counter+" ");
//                         counter++;
//                 }
//         }
// }//print numbers 1 to n

// import java.util.*;
// public class JavaBasics {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 int n = sc.nextInt();
//                 int Sum=0;
//                 int i=1;
//                 while(i<=n){
//                         Sum+=i;
//                         i++;
//                 }
//                 System.out.println("Sum is :"+" "+Sum);
//         }
// }Sum of n natural numbers


       //for loop
// public class JavaBasics {

//         public static void main(String[] args) {
//                 for(int i=1 ;i<=100;i++){
//                         System.out.println(i+" Hello world");
//                 }
//         }
// }100 times Hello world

// public class JavaBasics {

//         public static void main(String[] args) {
//                 for(int i=0;i<4;i++){
//                         System.out.println("* * * *");
//                 }//for loop

//                 // int i=0;
//                 // while(i<4){
//                 //         System.out.println("* * * *");
//                 //         i++;
//                 // }//while loop
//         }
// }

// import java.util.*;
// public class JavaBasics {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter number :");
//                 int n = sc.nextInt();
//                 // while(n>0){
//                 //         int l = n % 10;
//                 //         System.out.print(l);
//                 //         n = n / 10;
//                 // }

//                 for(int l=0;n>0;){
//                         l = n % 10;
//                         System.out.print(l);
//                         n = n / 10;
//                 }
//         }
// }//Reverse of a number


       //do while loop
// public class JavaBasics {

//         public static void main(String[] args) {
//                 int i = 1;
//                 do{
//                         System.out.println(i+" Hello world");
//                         i++;
//                 } while(i<=10);
//         }
// }


       //break keyword
// public class JavaBasics {
//         public static void main(String[] args) {
//                 int i = 1;
//                 do{
//                         if(i==5){
//                                 break;
//                         }
//                         System.out.println(i+" Hello world");
//                         i++;
//                 } while(i<=10);
//                 System.out.println("Out of loop");
//         }
// }

// import java.util.*;
// public class JavaBasics {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 do{
//                         System.out.print("Enter your number : ");
//                         int n = sc.nextInt();
//                         if(n%10==0){
//                                 System.out.println(n+" is the multiple of 10");
//                                 break;
//                         }
//                         System.out.println(n+" is not the multiple of 10");
//                 } while(true);
//         }
// }


       //continue keyword
// public class JavaBasics {

//         public static void main(String[] args) {
//                 for(int i=0;i<=10;i++){
//                         if(i==5){
//                                 continue;
//                         }
//                         System.out.println(i+" Hello world");
//                 }
//         }
// }

// public class JavaBasics {
//         public static void main(String[] args) {
//                 int i = 1;
//                 do{
//                         if(i==5){
//                                 i++;
//                                 continue;
//                         }
//                         System.out.println(i+" Hello world");
//                         i++;
//                 } while(i<=10);
//                 System.out.println("out of loop");
//         }
// }

// import java.util.*;
// public class JavaBasics {

//         public static void main(String[] args) {
//                 do{
//                         Scanner sc = new Scanner(System.in);
//                         System.out.print("Enter your number : ");
//                         int n = sc.nextInt();
//                         if(n%10==0){
//                                 System.out.println(n+" is the multiple of 10");
//                                 continue;
//                         }
//                         System.out.println(n+" is not the multiple of 10");
//                         sc.close();
//                 } while(true);
//         }
// }

// import java.util.*;
// public class JavaBasics {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 int i=1;
//                 System.out.print("Enter your number : ");
//                 int n = sc.nextInt();
//                 do{
//                         if(i%10==0){
//                                 i++;
//                                 continue;
//                         }
//                         System.out.print(i+" ");
//                         i++;
//                 } while(i<=n);
//         }
// }


 //Number is prime or composite
// import java.util.*;
// public class JavaBasics {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter number : ");
//                 int n = sc.nextInt();
//                 int i = 2;
//                 boolean Isp=true;
//                 if(n==2){
//                         System.out.println("Number is prime number");
//                 }else{
//                         while(i<=n-1){
//                                 if(n%i==0){
//                                         Isp = false;
//                                         break;
//                                 }i++;
//                         }
//                         if(Isp==true){
//                                 System.out.println("Number is prime number");
//                         }else{
//                                 System.out.println("Number is composite number");
//                         }
//                 }
//         }
// }

 //Sum of even and odd numbers
// import java.util.Scanner;
// public class JavaBasics {
//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 int number;
//                 int choice;
//                 int evenSum = 0;
//                 int oddSum = 0;
//                 do {
//                         System.out.print("Enter the number ");
//                         number = sc.nextInt();
//                         if( number % 2 == 0) {
//                                 evenSum += number;
//                         } else {
//                                 oddSum += number;
//                         }
//                         System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
//                         choice = sc.nextInt();
//                 } while(choice==1);
//                 System.out.println("Sum of even numbers: " + evenSum);
//                 System.out.println("Sum of odd numbers: " + oddSum);
//         }
// }



           //Nested Loop/Statement
// public class JavaBasics {

//         public static void main(String[] args) {
//                 int n=7;
//                 for(int i=1;i<=n;i++){
//                         for(int j=1;j<=i;j++){
//                                 System.out.print("* ");
//                         }System.out.println();
//                 }
//         }
// }//Half pyramid

// public class JavaBasics {

//         public static void main(String[] args) {
//                 int n=7;
//                 for(int i=1;i<=n;i++){
//                         for(int j=1;j<=n-i+1;j++){
//                                 System.out.print("* ");
//                         }System.out.println();
//                 }
//         }
// }//Inverted half pyramid

// public class JavaBasics {

//         public static void main(String[] args) {
//                 int n = 4;
//                 for(int i=1;i<=n;i++){
//                         for(int j=1;j<=i;j++){
//                                 System.out.print(j);
//                         }System.out.println();
//                 }
//         }
// }//Numbers Half pyramid

// public class JavaBasics {

//         public static void main(String[] args) {
//                 int n = 7;
//                 char ch='A';
//                 for(int i=1;i<=n;i++){
//                         for(int j=1;j<=i;j++){
//                                 System.out.print(ch+" ");
//                                 ch++;
//                         }
//                         System.out.println();
//                 }
//         }
// }//Alphabets half pyramid



           //Functions/Methods
// public class JavaBasics {

//         public static void printHelloWorld(){
//                 System.out.println("Hello World");
//                 System.out.println("Hello World");
//                 System.out.println("Hello World");
//                 System.out.println("Hello World");
//                 System.out.println("Hello World");
//         }
//         public static void main(String[] args) {
//                 printHelloWorld(); //function call
//         }
// }//print Hello World

// import java.util.*;
// public class JavaBasics {
//         public static int CalculateSum(int num1, int num2){ //Parameters or formal parameters
//                 int sum = num1+num2;
//                 return sum;
//         }

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter two numbers : ");
//                 int a = sc.nextInt();
//                 int b = sc.nextInt();
//                 int sum = CalculateSum(a,b); //Arguements or actual parameters
//                 System.out.println("Sum is : "+sum);
//         }
// }//Sum of two numbers

// public class JavaBasics {

//         public static int Multiply(int a, int b){
//                 int product = a*b;
//                 return product;
//         }
//         public static void main(String[] args) {
//                 int a = 10;
//                 int b = 4;
//                 int product = Multiply(a,b);
//                 System.out.println("Product is : "+product);
//                 product=Multiply(10,5);
//                 System.out.println("Product is : "+product);
//         }
// }//product of two numbers

// import java.util.*;
// public class JavaBasics {

//         public static int Factorial(int n){
//                 int fact = 1;
//                 for(int i=1;i<=n;i++){
//                         fact *= i;
//                 }
//                 return fact;
//         }
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter number : ");
//                 int n = sc.nextInt();
//                 System.out.println("Factorial is : "+Factorial(n));
//         }
// }//Factorial Ex-1

// public class JavaBasics {
//         public static void main(String[] args) {
//                 System.out.print("Factorial is : "+Factorial(4));
//         }

//         public static int Factorial(int n) {
//                 int f = 1;
//                 for(int i=1;i<=n;i++){
//                         f*=i;
//                 }return f;
//         }
// }//Factorial Ex-2

// import java.util.*;
// public class JavaBasics {
//         public static int Factorial(int n){
//                 int f = 1;
//                 for(int i=1;i<=n;i++){
//                         f*=i;
//                 }return f;
//         }

//         public static int BinomialCoefficient(int n, int r){
//                 int a = Factorial(n);
//                 int b = Factorial(r);
//                 int c = Factorial(n-r);
//                 int BC = a/(b*c);
//                 return BC;
//         }

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter n : ");
//                 int n = sc.nextInt();
//                 System.out.print("Enter r : ");
//                 int r = sc.nextInt();
//                 System.out.println("Binomial Coefficient is : "+BinomialCoefficient(n, r));
//                 sc.close();
//         }
// }//Binomial coefficient [n!/(r!*(n-r)!)]

// public class JavaBasics {

//         public static int Sum(int a, int b){
//                 return a+b;
//         }
//         public static int Sum(int a, int b, int c){
//                 return a+b+c;
//         }
//         public static void main(String[] args) {
//                 System.out.println(Sum(5,2));
//                 System.out.println(Sum(10,5,8));
//         }
// }//Function overloading - Multiple functions with same name but different no. of parameters

// public class JavaBasics {

//         public static int Sum(int a, int b){
//                 return a+b;
//         }
//         public static float Sum(float a, float b){
//                 return a+b;
//         }
//         public static void main(String[] args) {
//                 System.out.println(Sum(5,2));
//                 System.out.println(Sum(10.10f,5.25f));
//         }
// }//Function overloading - Multiple functions with same name but different type of parameters

// import java.util.*;
// public class JavaBasics {

//         public static boolean IsPrime(int n){
//                 boolean IsPrime = true;
//                 if(n==2){
//                         return IsPrime;
//                 }
//                 for(int i=2;i<=n-1;i++){
//                         if(n % i == 0){
//                                 IsPrime = false;
//                                 return IsPrime; //break keyword can also use here
//                         }
//                 }return IsPrime;
//         }
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter number : ");
//                 int n = sc.nextInt();
//                 if(IsPrime(n)==true){
//                         System.out.println("Number is prime");
//                 }
//                 else{
//                         System.out.println("Number is composite");
//                 }
//                 sc.close();
//         }
// }//Prime number or not Ex-1

// import java.util.*;
// public class JavaBasics {

//         public static boolean IsPrime(int n){
//                 if(n==2){
//                         return true;
//                 }
//                 for(int i=2;i<=n-1;i++){
//                         if(n % i == 0){
//                                 return false;
//                         }
//                 }return true;
//         }
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter number : ");
//                 int n = sc.nextInt();
//                 System.out.println(IsPrime(n));
//                 sc.close();
//                 // if(IsPrime(n)){
//                 //         System.out.println("Number is prime");
//                 // }else{
//                 //         System.out.println("Numer is composite");
//                 // }
//         }
// }//Prime number or not Ex-2

// import java.util.*;
// public class JavaBasics {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter number : ");
//                 int n = sc.nextInt();
//                 PrimeInRange(n);
//                 sc.close();
//         }

//         public static void PrimeInRange(int n){
//                 for(int i=2;i<=n;i++){
//                         if(IsPrime(i)){
//                                 System.out.print(i+" ");
//                         }
//                 }
//         }

//         public static boolean IsPrime(int n){
//                 if(n==2){
//                         return true;
//                 }
//                 for(int i=2;i<=Math.sqrt(n);i++){
//                         if(n % i == 0){
//                                 return false;
//                         }
//                 }return true;
//         }
// }//All prime number in a range


       //Binary to Decimal conversion
// import java.util.*;
// public class JavaBasics {

//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter Binary number : ");
//                 int BinNum = sc.nextInt();
//                 BinToDec(BinNum);
//         }

//         public static void BinToDec(int BinNum){
//                 int MyNum = BinNum;
//                 int pow = 0;
//                 int DecNum = 0;

//                 while(BinNum>0){
//                         int ld = BinNum % 10;
//                         DecNum += ld * (int)Math.pow(2, pow);
//                         BinNum /= 10;
//                         pow++;
//                 }
//                 System.out.println("Decimal number of "+MyNum+" = "+DecNum);
//         }
// }


       //Decimal to Binary conversion
// import java.util.*;
// public class JavaBasics {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter Decimal number : ");
//                 int DecNum = sc.nextInt();
//                 DecToBin(DecNum);
//         }

//         public static void DecToBin(int DecNum){
//                 int MyNum = DecNum;
//                 int pow = 0;
//                 int BinNum = 0;

//                 while(DecNum > 0){
//                         int Rem = DecNum % 2;
//                         BinNum += Rem * (int)Math.pow(10, pow);
//                         DecNum /= 2;
//                         pow++;
//                 }
//                 System.out.println("Binary Number of "+MyNum+" = "+BinNum);
//         }
// }


 // Hollow rectangle pattern
// import java.util.*;
// public class JavaBasics {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter number of rows : ");
//                 int r = sc.nextInt();
//                 System.out.print("Enter number of columns : ");
//                 int c = sc.nextInt();
//                 HollowRectanglePattern(r, c);
//         }

//         public static void HollowRectanglePattern(int TotRow, int TotCol){
//                 for(int i=1;i<=TotRow;i++){
//                         for(int j=1;j<=TotCol;j++){
//                                 if(i == 1 || i == TotRow || j == 1 || j == TotCol){
//                                         System.out.print("* ");
//                                 }else{
//                                         System.out.print("  ");
//                                 }
//                         }
//                         System.out.println();
//                 }
//         }
// }

 // Inverted & Rotated half pyramid
// import java.util.*;
// public class JavaBasics {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter number of rows : ");
//                 int r = sc.nextInt();
//                 IRHalfPyramid(r);
//         }

//         public static void IRHalfPyramid(int TotRow){
//                 for(int i=1;i<=TotRow;i++){
//                         for(int j=1;j<=TotRow-i;j++){
//                                 System.out.print(" ");
//                         }
//                         for(int j=1;j<=i;j++){
//                                 System.out.print("*");
//                         }
//                         System.out.println();
//                 }
//         }
// }

 // Inverted numbers half pyramid
// import java.util.*;
// public class JavaBasics {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter number of rows : ");
//                 int r = sc.nextInt();
//                 InvertedHalfPyramid(r);
//         }

//         public static void InvertedHalfPyramid(int TotRow){
//                 for(int i=1;i<=TotRow;i++){
//                         for(int j=1;j<=TotRow-i+1;j++){
//                                 System.out.print(j);
//                         }
//                         System.out.println();
//                 }
//         }
// }

 // Floyd's triangle
// import java.util.*;
// public class JavaBasics {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter number of rows : ");
//                 int r = sc.nextInt();
//                 FloydTriangle(r);
//         }

//         public static void FloydTriangle(int TotRow){
//                 int n = 1;
//                 for(int i=1;i<=TotRow;i++){
//                         for(int j=1;j<=i;j++){
//                                 System.out.print(n+" ");
//                                 n++;
//                         }
//                         System.out.println();
//                 }
//         }
// }

 // Zero-One Half pyramid
// import java.util.*;
// public class JavaBasics {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter number of rows : ");
//                 int r = sc.nextInt();
//                 ZOHalfPyramid(r);
//         }

//         public static void ZOHalfPyramid(int r){
//                 for(int i=1;i<=r;i++){
//                         for(int j=1;j<=i;j++){
//                                 if((i+j) % 2 == 0){
//                                         System.out.print(1);
//                                 }else{
//                                         System.out.print(0);
//                                 }
//                         }
//                         System.out.println();
//                 }
//         }
// }

  // Butterfly pattern
// import java.util.*;
// public class JavaBasics {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter number of rows : ");
//                 int r = sc.nextInt();
//                 Butterfly(r);
//         }

//         public static void Butterfly(int r){
//                 //!st half
//                 for(int i=1;i<=r;i++){
//                         //Stars = i
//                         for(int j=1;j<=i;j++){
//                                 System.out.print("*");
//                         }
//                         //Spaces = 2(n-1)
//                         for(int j=1;j<=2*(r-i);j++){
//                                 System.out.print(" ");
//                         }
//                         //Stars = i
//                         for(int j=1;j<=i;j++){
//                                 System.out.print("*");
//                         }
//                         System.out.println();
//                 }

//                 //2nd half
//                 for(int i=r;i>=1;i--){
//                         //Stars = i
//                         for(int j=1;j<=i;j++){
//                                 System.out.print("*");
//                         }
//                         //Spaces = 2(n-1)
//                         for(int j=1;j<=2*(r-i);j++){
//                                 System.out.print(" ");
//                         }
//                         //Stars = i
//                         for(int j=1;j<=i;j++){
//                                 System.out.print("*");
//                         }
//                         System.out.println();
//                 }
//         }
// }

 // Solid rhombus pattern
// import java.util.*;
// public class JavaBasics {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter number of rows : ");
//                 int n = sc.nextInt();
//                 SolidRhombus(n);
//         }

//         public static void SolidRhombus(int n){
//                 for(int i=1;i<=n;i++){
//                         for(int j=1;j<=(n-i);j++){
//                                 System.out.print("  ");
//                         }
//                         for(int j=1;j<=n;j++){
//                                 System.out.print("* ");
//                         }
//                         System.out.println();
//                 }
//         }
// }

 // Hollow rhombus pattern
// import java.util.*;
// public class JavaBasics {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter number of rows : ");
//                 int n = sc.nextInt();
//                 HollowRhombus(n);
//         }

//         public static void HollowRhombus(int n){
//                 for(int i=1;i<=n;i++){
//                         for(int j=1;j<=(n-i);j++){
//                                 System.out.print("  ");
//                         }
//                         for(int j=1;j<=n;j++){
//                                 if(i == 1 || i == n || j == 1 || j == n){
//                                         System.out.print("* ");
//                                 }else{
//                                         System.out.print("  ");
//                                 }
//                         }
//                         System.out.println();
//                 }
//         }
// }

 //Diamond pattern
// import java.util.*;
// public class JavaBasics {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter number of rows : ");
//                 int n = sc.nextInt();
//                 Diamond(n);
//         }

//         public static void Diamond(int n){
//                 //1st half
//                 for(int i=1;i<=n;i++){
//                         for(int j=1;j<=(n-i);j++){
//                                 System.out.print("  ");
//                         }
//                         for(int j=1;j<=(2*i)-1;j++){
//                                 System.out.print("* ");
//                         }
//                         System.out.println();
//                 }

//                 //2nd half
//                 for(int i=n;i>=1;i--){
//                         for(int j=1;j<=(n-i);j++){
//                                 System.out.print("  ");
//                         }
//                         for(int j=1;j<=(2*i)-1;j++){
//                                 System.out.print("* ");
//                         }
//                         System.out.println();
//                 }
//         }
// }

 // Number pyramid
// import java.util.*;
// public class JavaBasics {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter number of rows : ");
//                 int n = sc.nextInt();
//                 NumberPyramid(n);
//         }

//         public static void NumberPyramid(int n){
//                 for(int i=1;i<=n;i++){
//                         for(int j=1;j<=(n-i);j++){
//                                 System.out.print(" ");
//                         }
//                         for(int j=1;j<=i;j++){
//                                 System.out.print(i+" ");
//                         }
//                         System.out.println();
//                 }


//         }
// }

 // Palindromic numbers pyramid pattern
// import java.util.*;
// public class JavaBasics {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter number of rows : ");
//                 int n = sc.nextInt();
//                 PalindromicPyramid(n);
//         }

//         public static void PalindromicPyramid(int n){
//                 for(int i=1;i<=n;i++){
//                         for(int j=1;j<=(n-i);j++){
//                                 System.out.print("  ");
//                         }
//                         for(int j=i;j>=1;j--){
//                                 System.out.print(j+" ");
//                         }
//                         for(int j=2;j<=i;j++){
//                                 System.out.print(j+" ");
//                         }
//                         System.out.println();
//                 }


//         }
// }
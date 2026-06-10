// // // // // // // // // // // // // import java.util.*;
// // // // // // // // // // // // // public class index {

// // // // // // // // // // // // //     public static void main(String args[]) {
// // // // // // // // // // // // //         // System.out.print("Enter the number of rows:");
// // // // // // // // // // // // //         // Scanner obj = new Scanner(System.in);
// // // // // // // // // // // // //         // int n = obj.nextInt();
// // // // // // // // // // // // //         // for (int i = 1; i<=n; i++) {
// // // // // // // // // // // // //         //     for (int j = i; j <=n; j++) {
// // // // // // // // // // // // //         //         System.out.print("*"+" ");
// // // // // // // // // // // // //         //     }
// // // // // // // // // // // // //         //     System.out.println(" ");
// // // // // // // // // // // // //         // }

// // // // // // // // // // // // //       System.out.print("* * * *\n");
// // // // // // // // // // // // //       System.out.print("* * * \n");
// // // // // // // // // // // // //       System.out.print("* * \n");
// // // // // // // // // // // // //       System.out.print("* \n");

// // // // // // // // // // // // //     }

// // // // // // // // // // // // // }

// // // // // // // // // // // // merge sorting and the time complexity is o(nlogn)
// // // // // // // // // // // // public class index{

// // // // // // // // // // // //     public static void mergeSort(int arr[],int st,int end){
// // // // // // // // // // // //         if(st>=end){
// // // // // // // // // // // //             return ;
// // // // // // // // // // // //         }
// // // // // // // // // // // //         int mid=st+(end-st)/2;
// // // // // // // // // // // //         mergeSort(arr,st,mid);
// // // // // // // // // // // //         mergeSort(arr,mid+1,end);

// // // // // // // // // // // //         Merge(arr,st,mid,end);

// // // // // // // // // // // //     }
// // // // // // // // // // // //     public static void Merge(int arr[],int st,int mid,int end){
// // // // // // // // // // // //         int temp[]=new int[end-st+1];
// // // // // // // // // // // //         int i=st;
// // // // // // // // // // // //         int j=mid+1;
// // // // // // // // // // // //         int k=0;
// // // // // // // // // // // //         while(i<=mid && j<=end){
// // // // // // // // // // // //             if(arr[i]<=arr[j]){
// // // // // // // // // // // //                temp[k++]=arr[i++];

// // // // // // // // // // // //             }
// // // // // // // // // // // //             else{
// // // // // // // // // // // //                 temp[k++]=arr[j++];
// // // // // // // // // // // //             }
// // // // // // // // // // // //         }
// // // // // // // // // // // //         while(i<=mid){
// // // // // // // // // // // //              temp[k++]=arr[i++];
// // // // // // // // // // // //         }
// // // // // // // // // // // //          while(j<=end){
// // // // // // // // // // // //              temp[k++]=arr[j++];
// // // // // // // // // // // //         }
// // // // // // // // // // // //         for(int idx=0;idx<temp.length;idx++){
// // // // // // // // // // // //             arr[st+idx]=temp[idx];
// // // // // // // // // // // //         }

// // // // // // // // // // // //     }
// // // // // // // // // // // //     public static void main(String args[]){
// // // // // // // // // // // //         int arr[]={7,1,4,7,5,9};
// // // // // // // // // // // //         mergeSort(arr,0,arr.length-1);

// // // // // // // // // // // //         for(int x:arr){
// // // // // // // // // // // //             System.out.println(x+" ");
// // // // // // // // // // // //         }
// // // // // // // // // // // //     }
// // // // // // // // // // // // }

// // // // // // // // // // // //practice question 1
// // // // // // // // // // // // in a prigram input 3 numbers a,b,c an dyou have to output the average of these three numbers
// // // // // // // // // // // //  import java .util.Scanner;
// // // // // // // // // // // // public class index{
// // // // // // // // // // // //     public static void main(String args[]){
// // // // // // // // // // // //       int side;
// // // // // // // // // // // //       System.out.println("Enter the side value:");

// // // // // // // // // // // //         Scanner obj=new Scanner(System.in);
// // // // // // // // // // // //         side=obj.nextInt();

// // // // // // // // // // // //           System.out.println("The area of  these square  is"+" "+side *side);

// // // // // // // // // // // //     //   int $=24;
// // // // // // // // // // // //     //   System.out.println($);   
// // // // // // // // // // // //      int $=24;
// // // // // // // // // // // //  System.out.println($); 
// // // // // // // // // // // //     }

// // // // // // // // // // // // }

// // // // // // // // // // // //data type
// // // // // // // // // // // // question is that sum odf two numbers
// // // // // // // // // // // // import java.util.Scanner;
// // // // // // // // // // // //  class index {

// // // // // // // // // // // //   public static void main(String args[]) {
// // // // // // // // // // // // float rad;
// // // // // // // // // // // //  float pi=3.14f;
// // // // // // // // // // // // // int b;
// // // // // // // // // // // // System.out.println("Enter the radius:");
// // // // // // // // // // // // // System.out.println("Enter the second number:");
// // // // // // // // // // // //  Scanner sc=new Scanner(System.in);
// // // // // // // // // // // //  rad=sc.nextFloat();
// // // // // // // // // // // //  System.out.println("area of circle is"+(pi*rad*rad));
// // // // // // // // // // // //   // b=sc.nextInt();

// // // // // // // // // // // // //  System.out.println("product of "+a+" "+"and"+" "+b+" "+ "is"+" "+(a*b));

// // // // // // // // // // // // }

// // // // // // // // // // // // }

// // // // // // // // // // // // public class index{
// // // // // // // // // // // //   public static void main(String args[]){
// // // // // // // // // // // //     byte b=4;
// // // // // // // // // // // //     char c='a';
// // // // // // // // // // // //     short s=512;
// // // // // // // // // // // //     int i=1000;
// // // // // // // // // // // //     float f=3.14f;
// // // // // // // // // // // //     double d=99.9954;
// // // // // // // // // // // //      double result=(f*b)+(i%c)-(d*s);
// // // // // // // // // // // //      System.out.print(result);
// // // // // // // // // // // //   }
// // // // // // // // // // // // }

// // // // // // // // // // // //question is enter the cost of 3 items from the users (using float data type) -a pencil,a pen and a eraser.you have to output total cost of the items back to the user a s their bill..
// // // // // // // // // // // // import java.util.Scanner;

// // // // // // // // // // // // public class  index{
// // // // // // // // // // // //   public static void main(String args[]){

// // // // // // // // // // // //     System.out.println("enter the pencil price:");
// // // // // // // // // // // //    System.out.println("enter the pen price:");
// // // // // // // // // // // //     System.out.println("enter the eraser price:");
// // // // // // // // // // // //     Scanner sc=new Scanner(System.in);
// // // // // // // // // // // //    float pencil=sc.nextFloat();
// // // // // // // // // // // //    float pen=sc.nextFloat();
// // // // // // // // // // // //    float eraser=sc.nextFloat();
// // // // // // // // // // // //    float total=pencil+pen+eraser;
// // // // // // // // // // // //    System.out.println("total cost of the items: "+total);
// // // // // // // // // // // //    float newTotal=total+(0.18f*total);
// // // // // // // // // // // // System.out.println("total cost of the items with 18% GST : "+newTotal);
// // // // // // // // // // // //   }
// // // // // // // // // // // // }
// // // // // // // // // // // import java.util.Scanner;

// // // // // // // // // // // public class index {
// // // // // // // // // // //   public static void main(String args[]) {
// // // // // // // // // // //     // int x=2,y=5;
// // // // // // // // // // //     // int exp1=(x*y/x);//5
// // // // // // // // // // //     // int exp2=(x*(y/x));//4
// // // // // // // // // // //     // System.out.println(exp1 +" ,");
// // // // // // // // // // //     // System.out.println(exp2)
// // // // // // // // // // //     // ;
// // // // // // // // // // //     // int x = 10, y = 5;
// // // // // // // // // // //     // int exp1 = (y * (x / y + x / y));//5*4=>20

// // // // // // // // // // //     // int exp2 = (y * x / y + y * x / y);//10+10=>20
// // // // // // // // // // //     // System.out.println(exp1);//20
// // // // // // // // // // //     // System.out.println(exp2);//20
// // // // // // // // // // //     // }

// // // // // // // // // // //     // print thelargest of 2
// // // // // // // // // // //     // a=1,b=3

// // // // // // // // // // //     // int n = 45632879;
// // // // // // // // // // //     // if ((n / 2) * 2 == n) {
// // // // // // // // // // //     // System.out.println("n is even");

// // // // // // // // // // //     // } else {
// // // // // // // // // // //     // System.out.println("n is odd");
// // // // // // // // // // //     // }
// // // // // // // // // // //     // int income;
// // // // // // // // // // //     // System.out.print("Enter your income:");
// // // // // // // // // // //     // Scanner sc=new Scanner(System.in);
// // // // // // // // // // //     // income=sc.nextInt();
// // // // // // // // // // //     // if(income<500000){
// // // // // // // // // // //     // System.out.println("no tax required");

// // // // // // // // // // //     // }
// // // // // // // // // // //     // else if(income>=500000 && income<=1000000){
// // // // // // // // // // //     // double tax=(0.20*income);
// // // // // // // // // // //     // System.out.print("income tax is: "+tax);
// // // // // // // // // // //     // }
// // // // // // // // // // //     // else if(income>1000000){
// // // // // // // // // // //     // double tax=(0.30*income);
// // // // // // // // // // //     // System.out.print("income tax is: "+tax);
// // // // // // // // // // //     // }

// // // // // // // // // // //     // int A=198,B=10,C=6;
// // // // // // // // // // //     // if(A>=B && A>=C){
// // // // // // // // // // //     // System.out.print("A is larger than B and C");
// // // // // // // // // // //     // }
// // // // // // // // // // //     // else if(B>=A && B>=C){
// // // // // // // // // // //     // System.out.print("B is larger than A and C");
// // // // // // // // // // //     // }
// // // // // // // // // // //     // else{
// // // // // // // // // // //     // System.out.print("C is larger than B and A");
// // // // // // // // // // //     // }

// // // // // // // // // // //     // // write a java program to get a number from the user and print whether it is
// // // // // // // // // // //     // positive or negative
// // // // // // // // // // //     // int n;
// // // // // // // // // // //     // System.out.println("Enter any number:");
// // // // // // // // // // //     // Scanner sourav=new Scanner(System.in);
// // // // // // // // // // //     // n=sourav.nextInt();
// // // // // // // // // // //     // if(n>=0){
// // // // // // // // // // //     // System.out.print("Number is positive");
// // // // // // // // // // //     // }
// // // // // // // // // // //     // else if(n<0){
// // // // // // // // // // //     // System.out.print("Number is negative");
// // // // // // // // // // //     // }
// // // // // // // // // // //     // finish the following code so that it prints you have a fever if your
// // // // // // // // // // //     // temperatire is above and otherwise prints you dont have a fever

// // // // // // // // // // //     // double temp=103.5;
// // // // // // // // // // //     // if(temp>=100){
// // // // // // // // // // //     // System.out.print("you have fever");
// // // // // // // // // // //     // }
// // // // // // // // // // //     // else{
// // // // // // // // // // //     // System.out.print("you don't have any fever");
// // // // // // // // // // //     // }

// // // // // // // // // // //     // write a java program to input week number(1 -7) and print day of week name
// // // // // // // // // // //     // using a\switch case

// // // // // // // // // // //     // int n;
// // // // // // // // // // //     // System.out.print("Enter the week between(1-7):");
// // // // // // // // // // //     // Scanner obj=new Scanner(System.in);
// // // // // // // // // // //     // n=obj.nextInt();
// // // // // // // // // // //     // switch(n){
// // // // // // // // // // //     // case 1:System.out.print("Sunday");
// // // // // // // // // // //     // break;
// // // // // // // // // // //     // case 2:System.out.print("Monday");
// // // // // // // // // // //     // break;
// // // // // // // // // // //     // case 3:System.out.print("Tuesday");
// // // // // // // // // // //     // break;
// // // // // // // // // // //     // case 4:System.out.print("Wedday");
// // // // // // // // // // //     // break;
// // // // // // // // // // //     // case 5:System.out.print("Thursday");
// // // // // // // // // // //     // break;
// // // // // // // // // // //     // case 6:System.out.print("Friday");
// // // // // // // // // // //     // break;
// // // // // // // // // // //     // case 7:System.out.print("Saturday");
// // // // // // // // // // //     // break;
// // // // // // // // // // //     // default:System.out.print("Invalid input");

// // // // // // // // // // //     // }
// // // // // // // // // // //     // int a=63,b=36;
// // // // // // // // // // //     // boolean x= (a<b)?true:false;//false
// // // // // // // // // // //     // int y= (a>b)?a:b;//63
// // // // // // // // // // //     // System.out.println(x);
// // // // // // // // // // //     // System.out.print(y);

// // // // // // // // // // //     // write a java programthat taekesa year from the user and print whether that
// // // // // // // // // // //     // the year is leap or not
// // // // // // // // // // //     // int year;
// // // // // // // // // // //     // System.out.print("Enter any year:");
// // // // // // // // // // //     // Scanner sc=new Scanner(System.in);
// // // // // // // // // // //     // year=sc.nextInt();
// // // // // // // // // // //     // if(year%4==0 || year%100==0 || year%400==0){
// // // // // // // // // // //     // System.out.print("the year is leap year:");
// // // // // // // // // // //     // }
// // // // // // // // // // //     // else{
// // // // // // // // // // //     // System.out.print("the year is not a leap year:");
// // // // // // // // // // //     // }

// // // // // // // // // // //     // int number=9;
// // // // // // // // // // //     // String check=(number%2==0)?"even":"odd";
// // // // // // // // // // //     // System.out.println(check);

// // // // // // // // // // //     // check if a student will pass or fail
// // // // // // // // // // //     // int marks;
// // // // // // // // // // //     // System.out.println("Enter any marks:");
// // // // // // // // // // //     // Scanner sc = new Scanner(System.in);
// // // // // // // // // // //     // marks = sc.nextInt();
// // // // // // // // // // //     // if (marks >= 33) {
// // // // // // // // // // //     // System.out.print("pass");

// // // // // // // // // // //     // } else if (marks < 33) {
// // // // // // // // // // //     // System.out.print("fail");
// // // // // // // // // // //     // }
// // // // // // // // // // //     // String check=(marks>=33)?"pass":"fail";
// // // // // // // // // // //     // System.out.print(check);

// // // // // // // // // // //     // int a,b;
// // // // // // // // // // //     // System.out.println("Enter any number;");
// // // // // // // // // // //     // Scanner sc=new Scanner(System.in);
// // // // // // // // // // //     // System.out.println("Enter the first no:");
// // // // // // // // // // //     // System.out.println("Enter the second no:");

// // // // // // // // // // //     // a=sc.nextInt();
// // // // // // // // // // //     // b=sc.nextInt();
// // // // // // // // // // //     // char n=sc.next().charAt(0);
// // // // // // // // // // //     // switch(n){
// // // // // // // // // // //     // case '+':System.out.println(a+b);
// // // // // // // // // // //     // break;

// // // // // // // // // // //     // case '-':System.out.println(a-b);
// // // // // // // // // // //     // break;

// // // // // // // // // // //     // case '*':System.out.println(a*b);
// // // // // // // // // // //     // break;

// // // // // // // // // // //     // case '/':System.out.println(a/b);
// // // // // // // // // // //     // break;

// // // // // // // // // // //     // case '%':System.out.println(a%b);
// // // // // // // // // // //     // break;

// // // // // // // // // // //     // while(n>0){
// // // // // // // // // // //     // int lastnumber=n%10;
// // // // // // // // // // //     // System.out.print(lastnumber);
// // // // // // // // // // //     // n=n/10;
// // // // // // // // // // //     // }

// // // // // // // // // // //     // keep entering numbers till the user enters a multiple of 10
// // // // // // // // // // //     // while (true) {
// // // // // // // // // // //     //   System.out.println("Enter the number:");
// // // // // // // // // // //     //   int n = sc.nextInt();
// // // // // // // // // // //     //   if (n % 10 == 0) {
// // // // // // // // // // //     //     continue;
// // // // // // // // // // //     //   }

// // // // // // // // // // //     //   System.out.print(n);
// // // // // // // // // // //     // }
// // // // // // // // // // //     //  System.out.print("I am exit the loop");

// // // // // // // // // // //     //   while(true){
// // // // // // // // // // //     // System.out.println("Enter the number:");
// // // // // // // // // // //     //   int n = sc.nextInt();
// // // // // // // // // // //     //   if(n%10==0){

// // // // // // // // // // //     //     continue;

// // // // // // // // // // //     //   }

// // // // // // // // // // //     //   System.out.print("your number is :"+n);

// // // // // // // // // // //     // }

// // // // // // // // // // // // boolean isPrime=true;
// // // // // // // // // // // // if(n==2){
// // // // // // // // // // // //   System.out.print("n is prime");
// // // // // // // // // // // // }
// // // // // // // // // // // // else{
// // // // // // // // // // // // for(int i=2;i<=Math.sqrt(n);i++){
// // // // // // // // // // // //   if(n%i==0){
// // // // // // // // // // // //     isPrime=false;
// // // // // // // // // // // // break;
// // // // // // // // // // // //   }

// // // // // // // // // // // // }
// // // // // // // // // // // // if(isPrime==true){
// // // // // // // // // // // //   System.out.print("its a prime number");

// // // // // // // // // // // // }
// // // // // // // // // // // // else{
// // // // // // // // // // // //   System.out.print("it is not a prime number");
// // // // // // // // // // // // }

// // // // // // // // // // // //   }
// // // // // // // // // // // //for odd integers
// // // // // // // // // // // //  int sum=0;
// // // // // // // // // // // //    int sum1=0;
// // // // // // // // // // // // for(int i=1;i<=n;i=i+2){

// // // // // // // // // // // //   // System.out.println("there are all odd integers:");
// // // // // // // // // // // //    sum=sum+i;

// // // // // // // // // // // // }
// // // // // // // // // // // // System.out.println("addidtion of odd numbers: "+sum);
// // // // // // // // // // // // //for even integers

// // // // // // // // // // // // for(int i=2;i<=n;i=i+2){

// // // // // // // // // // // //   // System.out.println("there are all even integers:");
// // // // // // // // // // // //    sum1=sum1+i;

// // // // // // // // // // // // }
// // // // // // // // // // // // System.out.println("addidtion of even numbers: "+sum1);

// // // // // // // // // // // //  System.out.println("Enter any number:");
// // // // // // // // // // // // S
// // // // // // // // // // // // int fact=1;
// // // // // // // // // // // // for(int i=1;i<=n;i++){
// // // // // // // // // // // //   fact=fact*i;

// // // // // // // // // // // // }
// // // // // // // // // // // // System.out.println("the factorial of that particular number is: "+fact);
// // // // // // // // // // // // write a program to print the multiplication table of a number N,entered by the user

// // // // // // // // // // // // for(int i=0;i<=5;i++){

// // // // // // // // // // // //  System.out.print("i = "+i);
// // // // // // // // // // // // }

// // // // // // // // // // // // System.out.print(" i after the loop =+"+i);
// // // // // // // // // // // // System.out.println("Enter the number of rows:");
// // // // // // // // // // // // Scanner sc=new Scanner(System.in);
// // // // // // // // // // // // int n=sc.nextInt();
// // // // // // // // // // // // char ch='A';
// // // // // // // // // // // // for(int i=1;i<=n;i++){
// // // // // // // // // // // //   for(int j=1;j<=i;j++){
// // // // // // // // // // // //     System.out.print(ch);
// // // // // // // // // // // //     ch++;
// // // // // // // // // // // //   }
// // // // // // // // // // // //   System.out.println();
// // // // // // // // // // // // }

// // // // // // // // // // // // }

// // // // // // // // // // // // }

// // // // // // // // // 1*43+234+51/50=>43+234+1=>536

// // // // // // // // //practice question

// // // // // // // // // hollow rectangle
// // // // // // // // //  import java.util.Scanner;
// // // // // // // // //  public class index{
// // // // // // // // //    public static void main(String[]args){
// // // // // // // // //      System.out.println("Enter the rows:");

// // // // // // // // //    Scanner obj=new Scanner(System.in);
// // // // // // // // //    int n=obj.nextInt();
// // // // // // // // //    for(int i=1;i<=n;i++){
// // // // // // // // //       for(int sp=1;sp<=(n-i);sp++){
// // // // // // // // //         System.out.print(" ");
// // // // // // // // //        }
// // // // // // // // //       for(int j=1;j<=i;j++){
// // // // // // // // //       System.out.print(i+" ");
// // // // // // // // //      }

// // // // // // // // //      System.out.println(" ");
// // // // // // // // //     }

// // // // // // // // //   }  

// // // // // // // // //  }

// // // // // // // // // product of two numbers
// // // // // // // // // import java.util.Scanner;
// // // // // // // // // public class index{
// // // // // // // // //    public static int printFactorial(int n){
// // // // // // // // //  int fact=1;
// // // // // // // // // for(int i=1;i<=n;i++){
// // // // // // // // //   fact=fact*i;

// // // // // // // // //  }
// // // // // // // // // return fact;
// // // // // // // // //  System.out.println("the sum of this two numbers are ="+product);
// // // // // // // // //    }
// // // // // // // // //    public static int bincoeff(int n,int r){
// // // // // // // // //      int fact_n=printFactorial(n);
// // // // // // // // //     int fact_r=printFactorial(r);
// // // // // // // // //      int fact_nmr=printFactorial(n-r);
// // // // // // // // //      int biocoeffi=fact_n/(fact_r*fact_nmr);
// // // // // // // // //   return biocoeffi ;
// // // // // // // // //   }

// // // // // // // // //   public static void main(String[]args){
// // // // // // // // // Scanner obj=new Scanner(System.in);
// // // // // // // // // // int n=obj.nextInt();

// // // // // // // // // System.out.println("the bicoeffecient of the numbers are ="+bincoeff(5,2));
// // // // // // // // //   }
// // // // // // // // // }

// // // // // // // // //check if a number is prime or not
// // // // // // // // import java.util.Scanner;

// // // // // // // // public class index {
// // // // // // // //   public static boolean checkPrime(int n) {
// // // // // // // //     if (n < 2) {
// // // // // // // //       return false;
// // // // // // // //     }
// // // // // // // //     // corner case
// // // // // // // //     if (n == 2) {
// // // // // // // //       return true;
// // // // // // // //     }
// // // // // // // //     // boolean isPrime=true;
// // // // // // // //     for (int i = 2; i <= Math.sqrt(n); i++) {
// // // // // // // //       if (n % i == 0) {
// // // // // // // //         return false;
// // // // // // // //         // return false;// sas i write return false;
// // // // // // // //       }
// // // // // // // //     }

// // // // // // // //     return true;
// // // // // // // //   }

// // // // // // // //   public static void primesrange(int n) {
// // // // // // // //     for (int i = 2; i <= n; i++) {
// // // // // // // //       if (checkPrime(i)) {// true
// // // // // // // //         System.out.print(i + " ");
// // // // // // // //       }
// // // // // // // //     }
// // // // // // // //     System.out.println(" ");
// // // // // // // //   }

// // // // // // // //   public static void main(String args[]) {
// // // // // // // //     Scanner sc = new Scanner(System.in);
// // // // // // // //     int n = sc.nextInt();

// // // // // // // //     primesrange(n);

// // // // // // // //   }
// // // // // // // // }
// // // // // // // // // print all prime in a range (2-10):

// // // // // // // //binary to decimal

// // // // // // // // public class index{
// // // // // // // //   public static int btod(int n){
// // // // // // // //     int dec=0;
// // // // // // // //     int pow=0;
// // // // // // // //     while(n>0){
// // // // // // // //        int ld=n%10;
// // // // // // // //       dec=dec+ (int)(ld*Math.pow(2,pow));
// // // // // // // //       pow++;
// // // // // // // //       n=n/10;
// // // // // // // //     }
// // // // // // // //     return  dec;
// // // // // // // //   }
// // // // // // // //   public static void main(String args[]){
// // // // // // // //     int result= btod(100);
// // // // // // // //     System.out.println(result);
// // // // // // // //   }
// // // // // // // // }

// // // // // // // //decimal to binary

// // // // // // // // public class index{
// // // // // // // //   public static void dtob(int n){
// // // // // // // //     int pow=0;
// // // // // // // //     int myNum=n;
// // // // // // // //     int bin=0;
// // // // // // // //     while(n>0){
// // // // // // // //       int rem=n%2;
// // // // // // // //       bin=bin+rem*(int)Math.pow(10,pow);
// // // // // // // //       pow++;
// // // // // // // //       n=n/2;

// // // // // // // //     }
// // // // // // // //     System.out.println("Binary form of "+ myNum +"is ="+bin);
// // // // // // // //   }
// // // // // // // //   public static void main(String args[]){
// // // // // // // //     dtob(7);
// // // // // // // //   }
// // // // // // // // }

// // // // // // // //practice question
// // // // // // // //write a java code to compute the the average of three numbers
// // // // // // // // import java.util.*;
// // // // // // // // public class index{
// // // // // // // //   public static void  printAvg(int a,int b,int c){
// // // // // // // //     float avg=(a+b+c)/3.0f;
// // // // // // // // System.out.println("the average of these numbers are"+avg);

// // // // // // // //   }

// // // // // // // //   public static void main(String args[]){
// // // // // // // //   Scanner sc=new Scanner(System.in);
// // // // // // // // int a=sc.nextInt();
// // // // // // // // int b=sc.nextInt();
// // // // // // // // int c=sc.nextInt();
// // // // // // // // printAvg(a,b,c);
// // // // // // // //  }
// // // // // // // // }

// // // // // // // //write a method name isEven that accepts an int argument.the method should return true if the argument is even,or false otherwise.also write a program to testt your method

// // // // // // // // import java.util.Scanner;
// // // // // // // // public class index{
// // // // // // // //   public static boolean isEven(int n){
// // // // // // // //     return n%2==0;

// // // // // // // //   }
// // // // // // // //   public static void main(String args[]){
// // // // // // // // Scanner sc=new Scanner(System.in);
// // // // // // // // int n=sc.nextInt();
// // // // // // // // boolean result=isEven(n);
// // // // // // // // System.out.println(result);
// // // // // // // //   }

// // // // // // // // }

// // // // // // // //write a program to check if a number is palindrome or not in java?(121 is a palindrome ,321 is not)
// // // // // // // // import java.util.Scanner;
// // // // // // // // public class index{
// // // // // // // // public class index{
// // // // // // // //   public static int printMenu(String[] menu, String key){
// // // // // // // //      for(int i=0;i<menu.length;i++){
// // // // // // // //       if(menu[i]==key){
// // // // // // // //         return i;
// // // // // // // //       }
// // // // // // // //      }
// // // // // // // //      return -1;
// // // // // // // //   }
// // // // // // // //   public static void main(String args[]){
// // // // // // // //     String[] menu={"dosa","papri chat","fuchka","biriyani"};
// // // // // // // //     String key="fuchka";
// // // // // // // //     int result=printMenu(menu,key);
// // // // // // // //     if(result==-1){
// // // // // // // //       System.out.println("not found");
// // // // // // // //     }
// // // // // // // //     else{
// // // // // // // //       System.out.println("key is at index"+result);
// // // // // // // //     }
// // // // // // // //   }
// // // // // // // // }

// // // // // // // //   public static void printPalindrome(int n){
// // // // // // // //     // int palindrn=0;
// // // // // // // //     int rem;
// // // // // // // //     int c=n;
// // // // // // // //     int palindrome=0;
// // // // // // // //     while(n>0){
// // // // // // // //       rem=n%10;
// // // // // // // //        palindrome=(palindrome*10)+rem;
// // // // // // // //       n=n/10;
// // // // // // // //     }
// // // // // // // //    if(palindrome==c){
// // // // // // // //     System.out.println("it is a palindrome number:");
// // // // // // // //    }
// // // // // // // //    else{
// // // // // // // //     System.out.println("it is not a palindrome number:");
// // // // // // // //    }

// // // // // // // //   }
// // // // // // // //   public static void main(String args[]){
// // // // // // // //     Scanner sc=new Scanner(System.in);
// // // // // // // //     int n=sc.nextInt();
// // // // // // // //     printPalindrome(n);
// // // // // // // //   }
// // // // // // // // }

// // // // // // // //write a java to compute the sum of digits in an integeres
// // // // // // // // import java.util.Scanner;
// // // // // // // // public class index{
// // // // // // // //   public static int printSum(int n){
// // // // // // // //   int sum=0;
// // // // // // // //   while(n>0){
// // // // // // // //   int rem=n%10;//
// // // // // // // //   sum=sum+rem;
// // // // // // // //   n=n/10;
// // // // // // // //   }
// // // // // // // //   return sum;
// // // // // // // // }
// // // // // // // //   public static void main(String args[]){
// // // // // // // //     Scanner sc=new Scanner(System.in);
// // // // // // // //    int n=sc.nextInt();
// // // // // // // //   int result= printSum(n);
// // // // // // // //   System.out.println("the sum of the digits is"+result);
// // // // // // // //   }
// // // // // // // // }
// // // // // // // //123=>3+0
// // // // // // // //
// // // // // // // // import java.util.Scanner;
// // // // // // // // public class index{
// // // // // // // //   public static void PrintHollowRec(int n){
// // // // // // // //     for(int i=n;i>=1;i--){
// // // // // // // //       // for(int sp=1;sp<=n-i;sp++){
// // // // // // // //       //   System.out.print(" ");
// // // // // // // //       // }
// // // // // // // //       for(int j=1;j<=i;j++){//j<=n-i+1
// // // // // // // //        System.out.print(j);
// // // // // // // //       }
// // // // // // // //        System.out.println(" ");
// // // // // // // //     }
// // // // // // // //   }
// // // // // // // //   public static void main(String args[]){
// // // // // // // //     Scanner sc=new Scanner(System.in);
// // // // // // // //    int n=sc.nextInt();
// // // // // // // //   //  int column=sc.nextInt();
// // // // // // // //    PrintHollowRec(n);
// // // // // // // //   }
// // // // // // // // }

// // // // // // // //question for linear search

// // // // // // // // public class index{
// // // // // // // //   public static int returnArray(int nums[], int key){
// // // // // // // //       for(int i=0;i<nums.length;i++){
// // // // // // // //         if(nums[i]==key){
// // // // // // // //           return i;
// // // // // // // //         }
// // // // // // // //       }
// // // // // // // //       return -1;
// // // // // // // //   }
// // // // // // // //   public static void main(String args[]){
// // // // // // // //     int[] nums={2,3,4,5,6,7,8,9};
// // // // // // // //     int key=8;
// // // // // // // //     int result=returnArray(nums,key);
// // // // // // // //     if(result==-1){
// // // // // // // //       System.out.println("the no was not found:");
// // // // // // // //     }
// // // // // // // //     else{
// // // // // // // //       System.out.println("the no was  found at:"+result);
// // // // // // // //     }

// // // // // // // //   }
// // // // // // // // }

// // // // // // // //find the largest no in a given array

// // // // // // // // import java.util.Scanner;
// // // // // // // // public class index{
// // // // // // // //   public static int getLargestele(int arr[]){
// // // // // // // //     int largest=Integer.MIN_VALUE;// for printing the largest element in the given array
// // // // // // // //     for(int i=0;i<arr.length;i++){
// // // // // // // //       if(largest<arr[i]){
// // // // // // // //         largest=arr[i];
// // // // // // // //       }
// // // // // // // //     }
// // // // // // // //     return largest;
// // // // // // // //   }
// // // // // // // //   public static void main(String args[]){
// // // // // // // //     int arr[]={1,2,6,3,9};
// // // // // // // //    System.out.println("the largest value of this arr is  :"+getLargestele(arr));

// // // // // // // //   }
// // // // // // // // }

// // // // // // // //binary search

// // // // // // // // public class index{
// // // // // // // //   public static int binarySearch(int arr[],int key){
// // // // // // // //     int st=0;
// // // // // // // //     int end=arr.length-1;

// // // // // // // //     while(st<=end){
// // // // // // // //         int mid=st+(end-st)/2;
// // // // // // // //       if(arr[mid]==key){
// // // // // // // //         return mid;

// // // // // // // //       }
// // // // // // // //       else if(arr[mid]<key){//right side
// // // // // // // //         st=mid+1;
// // // // // // // //       }
// // // // // // // //       else{//left part
// // // // // // // //         end= mid-1;
// // // // // // // //       }
// // // // // // // //     }
// // // // // // // //     return -1;

// // // // // // // //   }
// // // // // // // //   public static void main(String args[]){
// // // // // // // //     int arr[]={2,4,6,8,10,12,14};
// // // // // // // //     int key=2;
// // // // // // // //     System.out.println("the index is  found at index no :"+binarySearch(arr,key));
// // // // // // // //   }
// // // // // // // // }

// // // // // // // //reverse the array

// // // // // // // // import java.util.Arrays;

// // // // // // // // public class index{
// // // // // // // //   public static void reverse(int arr[]){
// // // // // // // //     int st=0;
// // // // // // // //     int end=arr.length-1;
// // // // // // // //     while(st<=end){
// // // // // // // //       int temp=arr[end];
// // // // // // // //       arr[end]=arr[st];
// // // // // // // //       arr[st]=temp;
// // // // // // // //       st++;
// // // // // // // //       end--;
// // // // // // // //     }
// // // // // // // //   }
// // // // // // // //   public static void main(String args[]){
// // // // // // // //     int arr[]={1,2,3,4,5,6,7,8};
// // // // // // // //     reverse( arr);
// // // // // // // //     // for(int i=0;i<arr.length;i++){
// // // // // // // //       System.out.print(Arrays.toString(arr));
// // // // // // // //     // }

// // // // // // // //   }
// // // // // // // // }
// // // // // // // // pairs in an array

// // // // // // // // public class index{
// // // // // // // //   public static void printPairs(int arr[]){
// // // // // // // //     for(int i=0;i<arr.length;i++){
// // // // // // // //       int current=arr[i];
// // // // // // // //       for(int j=i+1;j<arr.length;j++){
// // // // // // // //         System.out.print("("+current+","+arr[j]+")");
// // // // // // // //       }
// // // // // // // //       System.out.println(" ");
// // // // // // // //     }
// // // // // // // //   }
// // // // // // // //   public static void main(String args[]){
// // // // // // // //     int arr[]={2,4,6,8,10};
// // // // // // // //     printPairs(arr);
// // // // // // // //   }
// // // // // // // // }

// // // // // // // //print subarray
// // // // // // // import java.util.Scanner;
// // // // // // // public class index{
// // // // // // //   public static void printSubarrys(int arr[]){
// // // // // // //     int st=0;int end=0;

// // // // // // //     for(int i=0;i<arr.length;i++){
// // // // // // //       st=i;
// // // // // // //       for(int j=i;j<arr.length;j++){
// // // // // // //         end=j;
// // // // // // //         int sum=0;

// // // // // // //         int maxsum=Integer.MIN_VALUE;
// // // // // // //         int minsum=Integer.MAX_VALUE;
// // // // // // //         for(int k=st;k<=end;k++){

// // // // // // //           System.out.print(arr[k]+" ");
// // // // // // //           sum=sum+arr[k];
// // // // // // //           if(minsum<arr[k]){
// // // // // // //             minsum=arr[k];
// // // // // // //           }

// // // // // // //         }
// // // // // // //          System.out.println(minsum);
// // // // // // //         System.out.println("sum is ="+sum);
// // // // // // //         System.out.println(" ");
// // // // // // //       }
// // // // // // //      System.out.println(" ");

// // // // // // //     }
// // // // // // //   }
// // // // // // //   public static void main(String[]args){
// // // // // // //     int arr[]={2,4,6,8,10};
// // // // // // //     printSubarrys(arr);

// // // // // // //   }
// // // // // // // }

// // // // // // // getting an subarray

// // // // // // // using prefix sum
// // // // // // // import java.util.Scanner;

// // // // // // public class index {
// // // // // // //   public static void getSubarray(int arr[]) {
// // // // // // //     int st = 0;
// // // // // // //     int end = 0;
// // // // // // //     int currentsum = 0;
// // // // // // //     int prefix[]=new int[arr.length];
// // // // // // //     int maxSum = Integer.MIN_VALUE;
// // // // // // // prefix[0]=arr[0];
// // // // // // //     // sum of subarrays
// // // // // // //     for(int i=1;i<prefix.length;i++)
// // // // // // // {
// // // // // // //   prefix[i]=prefix[i-1]+arr[i];
// // // // // // // } 

// // // // // // // //compare the value of subarrays
// // // // // // //      for (int i = 0; i < arr.length; i++) {
// // // // // // //       st = i;
// // // // // // //       for (int j = i; j < arr.length; j++) {
// // // // // // //         end = j;
// // // // // // //         currentsum= st==0?prefix[end]:prefix[end]-prefix[st-1];
// // // // // // //         // currentsum = 0;

// // // // // // //         // for (int k = st; k <= end; k++) {
// // // // // //         //   currentsum += arr[k];

// // // // // //         // }
// // // // // //         // System.out.println(currentsum);

// // // // // //   //       if (maxSum < currentsum) {
// // // // // //   //         maxSum = currentsum;
// // // // // //   //       }

// // // // // //   //     }

// // // // // //   //   }
// // // // // //   //   System.out.println("max sum is =" + maxSum);
// // // // // //   // }
// // // // // //   // by kaden's algorithms
// // // // // //   // public static void kadensSum(int numbers[]){
// // // // // //   //   int cs=0;
// // // // // //   //   int max=Integer.MIN_VALUE;
// // // // // //   //   for(int i=0;i<numbers.length;i++){
// // // // // //   //     cs=cs+numbers[i];
// // // // // //   //     if(cs<0){
// // // // // //   //       cs=0;
// // // // // //   //     }
// // // // // //   //     max=Math.max(cs,max);
// // // // // //   //   }
// // // // // //   //   System.out.println("the max sum is:"+max);
// // // // // //   // }

// // // // // //   public static void main(String args[]) {
// // // // // //     int numbers[] = { -1,-2,-3,-4 };
// // // // // //  kadensSum(numbers);

// // // // // // }
// // // // // // //to find out the minimum value
// // // // // // //  == -1 it means it ais a smallest value in the entire array
// // // // // // public static void kadensSum(int numbers[]) {
// // // // // //     int cs = numbers[0];
// // // // // //     int max = numbers[0];

// // // // // //     for(int i = 1; i < numbers.length; i++) {
// // // // // //         cs =  cs + numbers[i];
// // // // // //         max = Math.max(max, cs);
// // // // // //     }

// // // // // //     System.out.println("the max sum is: " + max);
// // // // // // }
// // // // // // }

// // // // // // // trapped water in that is in 21 no question for leetcode

// // // // // // public class index{
// // // // // //   public static int trappedWater(int height[]) {
// // // // // //     //  int height.length=n;
// // // // // //     // first we have calculate the left max arr
// // // // // //     int leftmax[]=new int[height.length];
// // // // // //     leftmax[0]=height[0];
// // // // // //     for(int i=1;i<height.length;i++){
// // // // // //       leftmax[i]=Math.max(height[i],leftmax[i-1]);
// // // // // //     }

// // // // // //     // we have to calculate the right max boundary
// // // // // //     int rightmax[]=new int[height.length];
// // // // // //     rightmax[height.length-1]=height[height.length-1];
// // // // // //     for(int i=height.length-2;i>=0;i--){
// // // // // //       rightmax[i]=Math.max(height[i],rightmax[i+1]);
// // // // // //     }
// // // // // //     //trapped water// loops
// // // // // //     int trappedwater=0;
// // // // // //     for(int i=0;i<height.length-1;i++){
// // // // // //       int waterlevel=Math.min(leftmax[i],rightmax[i])-height[i];
// // // // // //       trappedwater+=waterlevel;
// // // // // //     }
// // // // // //     return trappedwater;
// // // // // //   }
// // // // // //   public static void main(String[]args){
// // // // // //      int height[]={4,2,0,6,3,2,5};
// // // // // //      System.out.println(trappedWater(height));
// // // // // //   }
// // // // // // }

// // // // // // buy and sell stock 

// // // // // // public class index {
// // // // // //   public static int buySellStock(int[] prices) {
// // // // // //     int buyPrices = Integer.MAX_VALUE;// +infinity
// // // // // //     int maxProfit = 0;
// // // // // //     for (int i = 0; i < prices.length; i++) {
// // // // // //       if (buyPrices < prices[i]) {
// // // // // //         int profit = prices[i] - buyPrices;
// // // // // //         maxProfit=Math.max(profit,maxProfit);

// // // // // //       } else {
// // // // // //         buyPrices = prices[i];
// // // // // //       }

// // // // // //     }
// // // // // //     return maxProfit;
// // // // // //   }

// // // // // //   public static void main(String args[]) {
// // // // // //     int prices[] = { 7, 1, 5, 3, 6, 4 };
// // // // // //     System.out.println(buySellStock(prices));
// // // // // //   }
// // // // // // }

// // // // // // bubble sort algo
// // // // // import java.util.Arrays;

// // // // // import java.util.Collections;
// // // // // public class index {

// // // // //   public static void bubbleSort(int arr[]) {

// // // // //     int swapped = 0;

// // // // //     for (int i = 0; i < arr.length; i++) {

// // // // //       for (int j = 0; j < arr.length - i - 1; j++) {

// // // // //         if (arr[j] > arr[j + 1]) {
// // // // //           int temp = arr[j];
// // // // //           arr[j] = arr[j + 1];
// // // // //           arr[j + 1] = temp;
// // // // //           swapped++;

// // // // //         }

// // // // //       }

// // // // //     }
// // // // //     System.out.println("swapped count is:" + swapped);

// // // // //   }

// // // // //   public static void selectionSort(int arr[]) {
// // // // //     int swapped=0;
// // // // //     for (int i = 0; i < arr.length; i++) {
// // // // //       int smallest = i;//  count index value
// // // // //       for (int j = i + 1; j < arr.length; j++) {//for lookin in unsorted part
// // // // //         if (arr[smallest] > arr[j]) {
// // // // //            smallest=j;
// // // // //         }
// // // // //       }
// // // // //        int temp=arr[i];
// // // // //        arr[i]=arr[smallest];
// // // // //        arr[smallest]=temp;
// // // // //        swapped++;


      
       
// // // // //     }
// // // // //     System.out.println("total swapped is:"+swapped);
// // // // //   }
// // // // //   public static void insertionSort(int arr[]){
// // // // //       for(int i=1;i<arr.length;i++){
// // // // //         int curr=arr[i];
// // // // //         int prev=i-1;// checking the index not the value if we check the value then we have to write prev[i-1]
// // // // //         while(prev >=0 && arr[prev]>curr){
// // // // //           arr[prev+1]=arr[prev];
// // // // //           prev--;
// // // // //         }
// // // // //         arr[prev+1]=curr;
// // // // //       }
// // // // //   }

// // // // //   public static void printtheArray(Integer arr[]) {
// // // // //     for (int i = 0; i < arr.length; i++) {
// // // // //       System.out.print(arr[i] + " ");
// // // // //     }
// // // // //     System.out.println(" ");
// // // // //   }

// // // // //   public static void main(String args[]) {

// // // // //     Integer arr[] = {1,2,8,6,5};
// // // // //     // insertionSort(arr
// // // // //     // );
// // // // //     Arrays.sort(arr,0,5,Collections.reverseOrder());
// // // // //     printtheArray(arr);
// // // // //   }
// // // // // }

// // // // // arays assignment

// // // // //practice question

// // // // // public class index{
// // // // //   public static boolean findTwice(int nums[]){
// // // // //     for(int i=0;i<nums.length;i++){
// // // // //       for(int j=i+1;j<nums.length;j++){
// // // // //       if(nums[i]==nums[j]){
// // // // //         return true;
// // // // //       }
// // // // //     }
// // // // //   }
    
// // // // //     return false;
    
// // // // //   }
// // // // //   public static void main(String args[]){
// // // // //     int nums[]={1,2,3,4};
// // // // //     //  int target=0;
// // // // //    boolean result= findTwice(nums);
// // // // //    System.out.println(result);

// // // // //   }
// // // // // }

// // // // //practice question 2

// // // // // public class index{
// // // // //   public static int findTarget(int nums[], int target){

// // // // //      int st=0;
// // // // //     int  end=nums.length-1;
// // // // //     while(st<=end){
// // // // //       int mid=st+(end-st)/2;
// // // // //       if(nums[mid]==target){
// // // // //         return mid;
// // // // //       }
// // // // //       else if(nums[mid]>target){
// // // // //         end=mid-1;
// // // // //       }
// // // // //       else{
// // // // //           st=mid+1;
// // // // //       }
      
// // // // //     }
// // // // //     return -1;
// // // // //   }
// // // // //   public static void main(String args[]){
// // // // //     int nums[]={0,1,2,3,4,5,6,7,8};
// // // // //     int target=7;
// // // // //     int result=findTarget(nums,target);
// // // // //     System.out.println(result);
// // // // //   }

// // // // // }

// // // // // public class index{
// // // // //   public static int maxProfit(int prices[]){
// // // // //     int maxprofit=0;
// // // // //     int buyPrices=Integer.MAX_VALUE;
// // // // //     for(int i=0;i<prices.length;i++){
// // // // //     if(buyPrices<prices[i]){
// // // // //       int profit=prices[i]-buyPrices;
// // // // //       maxprofit=Math.max(profit,maxprofit);
// // // // //     }
// // // // //     else{
// // // // //       buyPrices=prices[i];
// // // // //     }
// // // // //   }
// // // // //   return maxprofit;
// // // // //   }
// // // // //   public static void main(String args[]){
// // // // //     int prices[]={7,1,5,3,6,4};
// // // // //     int result=maxProfit(prices);
// // // // //     System.out.println("MaxProfit is :"+result);
// // // // //   }
// // // // // }

// // // // //trapping rain water

// // // // public class index{
// // // //   public static void trappedRainwater(int height[]){
// // // //      int n=height.length;
// // // //       int leftMax[]=new int[n];
// // // //       leftMax[0]=height[0];
// // // //      for(int i=1;i<n;i++){
     
// // // //       leftMax[i]=Math.max(leftMax[i-1],height[i]);
// // // //      }
// // // //      //right arr
// // // //      int rightMax[]=new int[n];
// // // //        rightMax[n-1]=height[n-1];
// // // //      for(int i=n-2;i>=0;i--){
     
// // // //       rightMax[i]=Math.max(rightMax[i+1],height[i]);
// // // //      }
// // // //      int trappedwater=0;
// // // //      for(int i=0;i<n;i++){
// // // //      int waterlevel=Math.min(leftMax[i],rightMax[i]);
// // // //        trappedwater=trappedwater+(waterlevel-height[i]);
     

// // // //      }
// // // //      System.out.println(trappedwater);
// // // //   }
// // // //   public static void main(String args[]){
// // // //     int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
// // // //      trappedRainwater(height);
// // // //   }
// // // // }



// // // // 2d array
// // // import java.util.Scanner;
// // // public class index{
// // //   public static boolean searchKey(int arr[][], int target){
// // //      for(int i=0;i<arr.length;i++){
// // //       for(int j=0;j<arr[0].length;j++){
// // //         if(arr[i][j]==target){
          
// // //           System.out.println("the target is found at  ("+i+","+ j+")");
// // //           return true;
// // //         }
// // //       }
// // //      }
// // //      return false;
// // //   }
// // //   public static void main(String args[]){
// // //     int target=9;
// // //     int arr[][]=new int[3][3];
// // //     Scanner sc=new Scanner(System.in);
// // //     for(int i=0;i<arr.length;i++){
// // //       for(int j=0;j<arr[0].length;j++){
// // //        arr[i][j]=sc.nextInt();
// // //       }
// // //     }
// // //     for(int i=0;i<arr.length;i++){
// // //       for(int j=0;j<arr[0].length;j++){
// // //       System.out.print(arr[i][j]+" ");
// // //     }
// // //     System.out.println(" ");
    
// // //   }
// // //   searchKey(arr,target);
// // //   }
// // // }

// // //spiral matices

// // // public class index{
// // //   public static void printSpiral(int matrix[][]){
// // //     int startRow=0;
// // //     int endRow=matrix.length-1;
// // //     int startCol=0;
// // //     int endCol=matrix[0].length-1;
// // //     while(startRow<=endRow &&  startCol<=endCol){
// // //       //top
// // //       for(int j=startCol;j<=endCol;j++){
// // //         if(startCol==endCol){
// // //         break;
// // //       }
// // //         System.out.print(matrix[startRow][j]+" ");
// // //       }
// // //      //right
// // //      for(int i=startRow+1;i<=endRow;i++){
// // //       if(startRow==endRow){
// // //         break;
// // //       }
// // //       System.out.print(matrix[i][endCol]+" ");
// // //      } 
// // //      //bottom
// // //      for(int j=endCol-1;j>=startCol;j--){
// // //       if(startCol==endCol){
// // //         break;
// // //       }
// //   //     System.out.print(matrix[endRow][j]+" ");

// //   //    }
// //   //    //left
// //   //    for(int i=endRow-1;i>=startRow+1;i--){
// //   //     if(startRow==endRow){
// //   //       break;
// //   //     }
// //   //      System.out.print(matrix[i][startCol]+" ");
// //   //    }
// //   //     startRow++;
// //   //   endRow--;
// //   //   startCol++;
// //   //   endCol--;
// //   //   }
// //   //  System.out.println(" ");

// //   // }
// //   // public static int diagonalSum(int matrix[][]){
// //   //   int sum=0;
// //   // int  n=matrix.length;
// //   //   for(int i=0;i<=matrix.length-1;i++){
// //   //     for(int j=0;j<=matrix[0].length-1;j++){// brute force approach and the time complexity is o(n^2) and space complexity is o(1) bcz od no extra space ....are there...
// //   //     if(i==j){
// //   //       sum+=matrix[i][j];
// //   //     }
// //   //     else if((i+j)==n-1){
// //   //        sum+=matrix[i][j];
// //   //     }
// //   //     }
// //   //   }
// //   //   System.out.println("the diagonal sum is" + sum);

// //   // for(int i=0;i<matrix.length;i++){
// //   //   //pd
// //   //   sum+=matrix[i][i];
// //   //   if (i!=matrix.length-i-1){
// //   //     sum+=matrix[i][matrix.length-i-1];// more optimized approach time complexity is o(n) and space complexity is o(1)
// //   //   }

// //   // }
// //   // return sum;
// //   //  }
// //    //starecase sum
  
// //   //  public static boolean straeCase(int matrix[][],int key){
// //   //   int row=0;
// //   //   int col=matrix[0].length-1;
// //   //   while(row < matrix.length &&  col<=0){
// //   //    if(matrix[row][col]==key){
// //   //     System.out.println("the kwy was found at : ("+row+","+col+")");
// //   //         return true;
// //   //    }
// //   //    else if(key<matrix[row][col]){
// //   //     col--;
// //   //    }
// //   //    else if(key>matrix[row][col]){

// //   // row++;
// //   //    }
// //   //   }
// //   //   System.out.println("key was mot found");
// //   //   return false;

// //   //  }
// // //    public class index{
// // //     public static boolean stairCasefromLow(int matrix[][],int key){
// // //       int row=matrix.length-1;
// // //       int col=0;
// // //       while(row >=0  && col<=matrix[0].length-1){
// // //        if(matrix[row][col]==key){
// // //         System.out.println("the key was found at : ("+row+","+col+")");
// // //         return true;
// // //        }
// // //        else if(matrix[row][col]<key){
// // //         col++;

// // //        }
// // //        else{
// // //         row--;
// // //        }
// // //       }
// // //       System.out.println("the key was not found");
// // //       return false;
// // //     }


// // //   public static void main(String args[]){
// // //      int matrix[][]={
// // //       {10,20,30,40},
// // //       {15,25,35,45},
// // //       {27,29,37,48},
// // //       {32,33,39,50},
     
// // //      };
// // //       int key=30;
// // //       stairCasefromLow( matrix, key);
// // //     // System.out.println(diagonalSum(matrix));

// // //     //  printSpiral(matrix);

// // //   }
// // // }

// // // pracetice question no 1
// // // print the number of 7's that are in the 2d array

// // // public class index{
// // //   public static int findNumber(int [][]array){
// // //     int sum=0;
// // //     for(int i=0;i<array.length;i++){
// // //     for(int j=0;j<array[0].length;j++){
// // //       if(array[i][j]==8){
// // //         sum++;
// // //       }
   
// // //     }
// // //     }
// // //     return sum;
// // //   }
// // //   public static void main(String args[]){
// // //     int [][] array={{4,7,8},{8,8,7}};
// // //     int result=findNumber(array);
// // //     System.out.println(result);
// // //   }
// // // }

// // // question no 2
// // // print out the sum of the numbers in second row of the nums array 
// // // public class index{

// // //   public static int sumOfSecondArray(int[][]nums){
// // //     int count=0;
// // //     if(nums.length<2){
// // //       return 0;
// // //     }
// // //     // for(int i=1;i<nums.length-1;i++){
// // //       for(int j=0;j<nums[0].length;j++){
// // //         count+=nums[1][j];
// // //       }
    
// // //     return count;


// // //   }

// // //   public static void main(String args[]){
// // //   int nums[][]={{1,4,9},{11,4,3},{2,2,3}};
// // //   int result=sumOfSecondArray(nums);
// // //   System.out.println(result);
// // // }
// // // }


// // // 3. write a program to find transpose of a matrix
// // public class index{
// //   public static void transposeMatrix(int matrix[][]){
// //     int cols=matrix[0].length;
// //     int rows=matrix.length;
// //     int transpose[][]=new int[cols][rows];
// //     for(int i=0;i<rows;i++){
// //       for(int j=0;j<cols;j++){
// //         transpose[j][i]=matrix[i][j];
// //       }
// //     }
// //     for(int i=0;i<cols;i++){
// //       for(int j=0;j<rows;j++){
// //         System.out.print(transpose[i][j]+" ");
// //       }
// //       System.out.println(" ");
// //     }
// //   }
// // public static void main(String args[]){
// //   int matrix[][]={{11,12,13},{21,22,23}};
// //   for(int i=0;i<matrix.length;i++){
// //     for(int j=0;j<matrix[0].length;j++){
// //   System.out.print(matrix[i][j]+" ");
// //     }
// //     System.out.println(" ");
// //   }

// //   transposeMatrix(matrix);
// // }
// // }


// // chcek tye stringis palindrome or not


// // public class index{
// //   public static boolean palindromeString(String str){
// //     str=str.replace(" ","");
// //   int n=str.length();
// //    for(int i=0;i<n/2;i++){
// //     if(str.charAt(i)!=str.charAt(n-i-1)){
// //       return false;
// //     }
// //    }
// //    return true;
// //   }
// //   public static void main(String args[]){
// //    String str="nurses run";
// //   boolean result= palindromeString(str);
// //   System.out.println(result);
// //   }
// // }


// //given a route containing a direction (e,w,n,s),find the dhortest path to reach destination

// public class index{
//   public static float findShortestPath(String str)
//   {
//   int x=0;
//   int y=0;
//   for(int i=0;i<str.length();i++){
//     int dir=str.charAt(i);
//     if(dir =='S'){
//       y--;
//     }
//     else if(dir =='N'){
//       y++;

//     }
//     else if(dir =='E'){
//       x++;
//     }
//     else{
//       x--;
//     }
//   }
//   int x1=x*x;
//   int y2=y*y;
//   return (float)Math.sqrt(x1+y2);
//   }
//   public static void main(String args[]){
//     String str="SN";
//     System.out.println(findShortestPath( str));
//   }
// }

// convertnonly the first letter for each and every word

// public class index{
//   public static String converToUpperCase(String str){
//     StringBuilder sourav=new StringBuilder("");
//     char ch=Character.toUpperCase(str.charAt(0));
//      sourav.append(ch);
//     for(int i=1;i<str.length();i++ ){
// if(str.charAt(i) ==' '){// looks that if the current cjaracter is space or not
//   sourav.append(str.charAt(i));
//   i++;
//   sourav.append(Character.toUpperCase(str.charAt(i)));

// }
// else{
//   sourav.append(str.charAt(i));
// }
//     }
//     return sourav.toString();
//   }
//   public static void main(String args[]){
//     String str="arghyadeep sarkar";
//     System.out.println(str.length());
//     System.out.println(converToUpperCase(str));
//   }
// }

// string compression

// public class index{
//   public static String stringCompresion(String str){
//     // Integer count=1;
//     String newstr="";
//     for(int i=0;i<str.length();i++){
//       Integer count=1;
//       while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
//         count++;;
//         i++;

//       }
//  newstr +=str.charAt(i);
//  if(count>1){
//   newstr+=count.toString();
//  }
//     }
//     return newstr;
//   }
//   public static void main(String args[]){
//     String str="aaabbcccdd";
//     System.out.println(stringCompresion(str));
//   }
// }


// public class index{
//   public static String stringCompressed(String str){
//     StringBuilder sc=new StringBuilder("");
     
//     for(int i=0;i<str.length();i++){
//      int count=1;
//         while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
//         count++;
//         i++;

//       }
//       sc.append(str.charAt(i));
//       if(count>1){
//         sc.append(count);
//       }
//     }

  
//   return sc.toString();
// }
//   public static void main(String args[]){
//      String str="aaabbcccdd";
//      System.out.println(stringCompressed(str));
     
//   }

// }

// check thenumber is odd or even

// public class index{
  // public static void checkEvenOrOdd(int number){
  //   int bitmask=1;
  //   if((number & bitmask)==0){
  //     System.out.println("it is a even number");
  //   }
  //   else{
  //     System.out.println("it is a odd number");
  //   }
  
// 
  // public static void setBit(int n,int i, int newNumber){
//    int bitMask=1<<i;
//    int notoperation=(~(bitMask));
//  int clearBit=n & notoperation;
//  System.out.println(clearBit); 

// if(newNumber==1){
//    int bitmask=1<<i;
//   int setBit=n | bitmask;
//   System.out.println(setBit);
// }
// else if(newNumber==0){
//    int bitmask=1<<i;
//   int clearBit=(~(bitmask));
//   int clearithBit=n & clearBit;
//   System.out.println(clearithBit);
// }
//     }
  
//   public static void main(String args[]){
    
//     int n=10;
//     int i=1;
//     int newNumber=0;
//     setBit(n,i,newNumber);


//   }
// }

// practice question is
// clear the bit 
// like n=1111,i=2;
// public class index{
// public static void clearIthBit(int n,int i,int j){
//   int a=(-1<<(j+1));
//   int b=(1<<i)-1;
//   int bitMask=a|b;;
//   int clearIthBit=n & bitMask;
//   System.out.println(clearIthBit);
// }
// public static void main(String args[]){

// int n= 10;

// int i=2;
// int j=4;
// clearIthBit(n,i,j);
// }
// }

// check it power of 2  or not
// public class index{
//   public static int checkTheCountBit(int n){

//     int count=0;
//     while(n>0){
//       if(( n &1)!=0){// first check the last bit(Lsb)
//         count++;
//       }
//      n= n>>1;
//     }
//     return count;
//     // int  count=Integer.bitCount(n);

//   //  System.out.println(count);

    
//   }
//   public static int checkTheExponential(int n,int a){
//     int ans=1;
//     while(n>0){
//      if((n &1)!=0){// check the last bit means (Lsb)
//       ans=ans*a;
//      }
//      a=a*a;
//      n=n>>1;
//     }
//     return ans;
//   }
//   public static void main(String args[]){
    
//    System.out.println(checkTheExponential(3,5));

//   }
// }
// recursion 
// public class index{
//   public static int printFibonnaci(int n){
//     if(n==0)
//       {
//         return 0;
//       }
//     if(n==1)
//       {
//         return 1;
//       }
//       int fib1=printFibonnaci(n-1);
//       int fib2=printFibonnaci(n-2);
//       int fibn=fib1+fib2;
     
//       return fibn;
//   }
//   public static void main(String args[]){
// int n=25;
// System.out.println(printFibonnaci(n));
//   }
// }


// //check first the given array is sorted or not
// public class index{
// public static boolean printArraySortedOrNot(int arr[],int i){
//   if(i==arr.length-1){
//     return true ;
//   }
// if(arr[i]>arr[i+1]){
//   return false;
// }
//  return printArraySortedOrNot(arr, i+1);


// }

//   public static void main(String args[])
// {
// int arr[]={1,2,3,4,1};
// int i=0;
// boolean result=printArraySortedOrNot(arr,i);
// System.out.println(result);


// }
// }

// check the first occurances in an array
// public class index{
//   public static int printFirstOccurances(int arr[],int key,int i){
//     if(i==arr.length-1){
//       return -1;
//     }
//     if(arr[i]==key){
//       return i;
//     }
//     return printFirstOccurances(arr, key, i+1) ;
//   }
//   //checks the last occurance
//    public static int printLastOccurances(int arr[],int key,int i){
//     if(i<0){
//       return -1;
//     }
//     if(arr[i]==key){
//       return i;
//     }
//     return printLastOccurances(arr, key, i-1) ;
//   }
//   // now chceks  the power
//   public static int power(int x,int n){
//     if(n==0){
//       return 1;
//     }
//     int pow= x * power(x,n-1);
//     return pow;

//   }

// public static void main(String[] args){
//   int arr[]={8,3,6,9,5,10,2,5,3};
// int key=5;
// int i=arr.length-1;
// int result=printLastOccurances( arr, key,i);
// System.out.println(result);
// //check power
// int x=2;
// int n=10; 
// int res=power(x,n);
// System.out.println("power of "+ x +" "+"is"+" "+res);

// }
// }
// optimized aproach for calculation the power of n number

public class index{
  public static int optimizedPower(int x,int n){
    //base case
    if(n==0){
      return 1;
    }
    //for even numbers
  int powerHalf=optimizedPower(x, n/2)*optimizedPower(x, n/2);
  //for odd numbers
  if(n%2!=0){
     powerHalf= x*powerHalf;
  }
  return powerHalf;


  }
  public static void main(String [] papiya){
    int x=2;
    int n=10;
    System.out.println(optimizedPower(x,n));
  }
}


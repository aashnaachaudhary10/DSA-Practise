// class Hello
// {
//     int a=20;
//     int b=30;
    

//     //single constructor
//     // hello(){
//     //     System.out.println("This is user defined constructor");
//     // }
    
//     //constructor overloading
//     Hello(){
//         System.out.println("This is constructor without parameter");
//     }
    
//     Hello(int n){
//         System.out.println("This is constructor with parameter");
//     }
    
//     void sum()
//     {
//         int result =a+b;
//         System.out.println(result);
//     }
// }
// class revision{
//     public static void main(String[] args) {
//         Hello h1= new Hello(10);
//         Hello h2= new Hello();
//         h1.sum();
//         System.out.println(h1.a);
//     }
// }










// class Hello
// {
//     int a=20;
//     int b=30;
    

//     //method overloading
//     void sum()
//     {
//         int result =a+b;
//         System.out.println(result);
//     }
    
    
//     void sum(int n)
//     {
//         int c=n;
//         int result =a+b;
//         System.out.println(result);
//     }
// }
// class revision{
//     public static void main(String[] args) {
//         Hello h1= new Hello();
//         h1.sum();
//         System.out.println(h1.a);
//     }
// }









//class
//object
//method//method overloading
//constructor//constructor overloading
//method vs constructor
//static variable vs normal variable 
// static method vs normal method 









//inheritance 
// class Hello{
//     int a =10;
//     int b=20;

//     void sum ()
//     {
//         int result = a+b;
//         System.out.println(result);
//     }
// }

// class Hai extends Hello{
//     int c=30;

// }

// public class revision{
//     public static void main(String[] args){
//         Hai h1= new Hai();
//         h1.sum();
//     }
// }










//multilevel inhertance 

// class Hello{
//     int a =10;
//     int b=20;

//     void sum ()
//     {
//         int result = a+b;
//         System.out.println(result);
//     }
// }

// class Hai extends Hello{
//     int c=30;
//     void mul(){
//         int result = a*b*c;
//         System.out.println(result);
//     }

// }

// class Demo extends Hai
// {
//     int d =40;
// }



// public class revision{
//     public static void main(String[] args){
//         Hai h1= new Hai();
//         h1.sum();
//     }
// }












//method overriding 
//single inheritance 


// class Hello{
//     int a =10;
//     int b=20;

//     void sum ()
//     {
//         int result = a+b;
//         System.out.println(result);
//     }
// }

// class Hai extends Hello{
//     int c=30;
//     void sum()
//     {
//         int result = a+b+c;
//         System.out.println(result);
//     }

// }

// public class revision{
//     public static void main(String[] args){
//         Hai h1= new Hai();
//         h1.sum();
//     }
// }













// Multilevel Inheritance: A -> B -> C
//multilevel inheritance means  a class inherits from another classn, which itself inherits from a third class, forming a chain



// class A {
//     void methodA() {
//         System.out.println("This is method of Class A");
//     }
// }

// class B extends A {
//     void methodB() {
//         System.out.println("This is method of Class B");
//     }
// }

// class C extends B {
//     void methodC() {
//         System.out.println("This is method of Class C");
//     }
// }






//Hierarchical inheritance 
//hierarich inheritance means multiple classes inherit from the same parent class 
// Hierarchical Inheritance: A -> D, A -> E
// class D extends A {
//     void methodD() {
//         System.out.println("This is method of Class D");
//     }
// }

// class E extends A {
//     void methodE() {
//         System.out.println("This is method of Class E");
//     }
// }








//interface

// class Hello{
//         int a =10;
//         int b=20;
    
//         void sum ()
//         {
//             int result = a+b;
//             System.out.println(result);
//         }
//     }
    
//     class Hai extends Hello{
//         int c=30;
//         void sum()
//         {
//             int result = a+b+c;
//             System.out.println(result);
//         }
    
//     }
    
//     public class revision{
//         public static void main(String[] args){
//             Hai h1= new Hai();
//             h1.sum();
//         }
//     }







//Function in java
//function is a collection of statements or a block of code that is used to perform some specific task.

//public int max(int x, int y){
//               }


// public class Solution {

//     public int getSum(int a, int b) {
//         int sum = a + b;
//         return sum;
//     }

//     public static void main(String args[]) {

//         Solution obj = new Solution();
//         System.out.println(obj.getSum());
//     }
// }







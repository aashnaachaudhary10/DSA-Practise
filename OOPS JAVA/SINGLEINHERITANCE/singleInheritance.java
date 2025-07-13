                               //EXAMPLE1



import java.util.*;

//superclass
class employee{
    int salary=60000;
}


//subclass
class engineer extends employee{
    int benefits=10000;
}


//driver code 
 public class singleInheritance{
    public static void main(String args[]){
        engineer e1= new engineer();
        System.out.println("Salary:" + e1.salary + "\n benefits:"+ e1.benefits);
    }
 }










                               //EXAMPLE2

// import java.util.*;

// class Animals{
//     void sound(){
//     System.out.println("Animals Sounds");
//     }
// }
// class dogs extends Animals{
//     void bark(){
//     System.out.println("Dogs barkk");
//     }
// }

// public class singleInheritance{
//     public static void main(String args[]){
//         dogs d = new dogs();
//         d.sound();
//         d.bark();
//     }
// }







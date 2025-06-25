// class FirstClass{
//     public static void main(String args[]){
//         System.out.println("HELLO AASHU");
//     }
// }
import  java.util.*;
public class OnedArrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();


        int[] numbers=new int[size];
        for(int i=0;i<3;i++){
            numbers[i]=sc.nextInt();

        } //agr hume datat given hai

        // marks[0]=97;
        // marks[1]=98;
        // marks[2]=95;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);these are for limited outputs for infinite outputs we will use loops

        for(int i=0;i<3;i++){
            System.out.println(numbers[i]);
        }


    }
}


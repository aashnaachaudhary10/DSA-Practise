//Take an array of names as input from the user and print then on the screen.

import java.util.*;
 public class quesarray2 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String names[]= new String[size];

    //input
    for(int i=0; i<size ;i++){
        names[i]=sc.next();
    }

    //output

    for(int i=0;i<names.length ; i++){
        System.out.println("name" + (i+1) +"is:" +names[i]);    }


    }
    
}



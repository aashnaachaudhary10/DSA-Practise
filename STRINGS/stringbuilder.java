import java.util.*;
public class stringbuilder{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //Set char at index 0
        sb.setCharAt(0,'p');
        System.out.println(sb);

        //insert
        sb.insert(2, 'n');
        System.out.println(sb);


        //delete the extra 'n'
        sb.delete(2,3);
         System.out.println(sb);


         //append
         sb.append("C");
         sb.append("H");
         sb.append("II");
         System.out.println(sb);



         //reverse
         for(int i=0; i<sb.length()/2 ; i++){

            //loop chlaya phir front or back index find kia
            int front=i;
            int back = sb.length() -1-i;

            //phir unke characters dekhe 

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);


            //phir setcharat se front or back ki value replace krdi 
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);

         }

         //or print krdia apna reverse string
         System.out.println(sb);
        } 
}
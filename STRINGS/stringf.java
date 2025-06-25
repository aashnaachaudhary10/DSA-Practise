import java.util.*;
public class stringf{
    public static void main(String args[]){
        //concatenation
        String firstname = "AASHNA";
        String lastname = "CHAUDHARY";
        String Fullname = firstname + lastname;
        System.out.println(Fullname);
        System.out.println(Fullname.length());





        //charAT
        for(int i=0;i<Fullname.length();i++){
            System.out.println(Fullname.charAt(i));
        }




        //compare
        String name1="HIIIIIII";
        String name2="BABYYYYYYYY";

        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");

        }else{
            System.out.println("String are not equal");

        }
       


        //substring

        String sentence = "My name is aashna";
        String name=sentence.substring(11,sentence.length());
        System.out.println(name);

    }


}



//What is array??

//It allow multiple values in single variableee {store]
//collection of similar types of elements of same type stored in a contigous location


//key characterstics
// 1.) Fixed Size == Matlb array define krkr hi uska fixed sixe hojata hai uske bd vo change nhi hoga
// 2.) Indexed-Based == indexed based kaam hota hai
// 3.) Homogenous Elements === ek type ke elements hote hai
// 4.) Contiguos Memory Location == adjacent hote hai ek dusre kee


//As there are two types of array : 1D and 2D

//So, first we know how to declare 1D array??
//type variables[];
//int marks[];
//initialise
//marks={20,30,60,..}
 // ab agr values hume pta hai to hum intialization alg se nahi krenge ,, usi m initialize krdenge 








// class array{
//     public static void main(String[] args){

//         //declare+initialize
//         int marks[] = {90,70,30,49};

       
       
//         //initialize
//         int size=4;
        

//         //declare+iniatialoze
//         int failedstudentmarks[]  = new int[size];

//         //access
//         //agr kbhi bhi length ke basis pr access krna ho to phle length print kro then access that element like marks.length
//         System.out.println(marks[0]);


//         //ab agr hum ek esi array ko access krte jha size to hai lekin elements nhi diye hue to phir hume default value o milti h in cae of integer and on other cased default values are different 
//          System.out.println(failedstudentmarks[0]);
         




//          //ab baat aai ki agr sare element access krne ho to hum lgaenge loop

//          for(int i=0;i<=marks.length;i++){
//             System.out.println(marks[i]);
//          }

//          //enchance/for-each
//          for(int value:marks){
//             System.out.println(value);
//          }

//  }

//}












                                                                                   //BEGINNER LEVEL DSA PROBLEMS OF ARRAY


                                                                                   //PART1


                                                                                 // 1.) FIND THE LARGEST ELEMENT IN AN ARRAY

// import java.util.*;
// public class array{
//    public static int LargestElement(int []arr,int n){

//       int max= arr[0];
//       for(int i=1;i<n;i++){
//          if(arr[i]>max){
//             max=arr[i];
//          }
//       }
//    return max;
//    }
// }







                                                                                  //2.) FIND THE SMALLEST ELEMENT IN AN ARRAY


// import java.util.*;
// public class array{
//    public static int SmallestElement(int []arr,int n){

//       int min= arr[0];
//       for(int i=1;i<n;i++){
//          if(arr[i]<min){
//             min=arr[i];
//          }
//       }
//    return min;
//    }
// }






                                                                                        // 3.)SUM OF ALL ELEMENTS IN AN ARRAY

// import java.util.*;
// public class array{
//    public static int SumElements(int []arr , int n){

//       int sum =0;
//       for(int i=0;i<n;i++){
//          sum+=arr[i];
//       }
//       return sum;

//    }

//    public static void main(String args[]){
//       int []arr={2,3,4,5};
//       int Sum =SumElements(arr,arr.length);
//       System.out.println(Sum);
//    }
// }













                                                                       //4.)FIND THE AVERAGE OF ARRAY ELEMENT

// import java.util.*;
// public class Array{
//    public static int AverageElements(int []arr , int n){

//       int sum =0;
//       for(int i=0;i<n;i++){
//          sum+=arr[i];
//       }
//       return sum;

//    }

//    public static void main(String args[]){
//       int []arr={2,3,4,5};
//       int Sum =AverageElements(arr,arr.length);
//       double average = (double) Sum / arr.length;
//       System.out.println(average);
//    }
// }






                                                                    //5.)CHECK IF AN ARRAY IS SORTED OR NOT 

// import java.util.*;
// public class Array{
//    public static boolean SortedArray(int arr[],int n){
//       for(int i=0;i<n-1;i++){
//          if (arr[i]>arr[i+1]){
//             return false;
//          }
//       }
//       return true;
//    }

// }






                                                                  //6.)REVERSE AN ARRAY

// import java.util.*;
// import java.util.Scanner;
// public class array{
//    public static void main(String args[]){
      
//       Scanner sc = new Scanner(System.in);
//       int n=sc.nextInt();

//       int[] arr=new int[n];

//       for(int i=0;i<=n;i++){
//          arr[i]=sc.nextInt();
//       }



//       for(int i=n-1;i>=0;i--){
//          System.out.println(arr[i]);
//       }
//    }
// }












                                                      //7.)COPY ALL ELEMENTS OF ONE ARRAY TO ANOTHER 

// import java.util.Scanner;
// public class array{
//    public static main void(String args[]){

//       Scanner sc = new Scanner(System.in);


//       int n =sc.nextInt();

//       int arr[]= new int[n];
//       int arrnew[]=new int[n];


//       for(int i=0;i<n;i++){

//          arr[i]=sc.nextInt();

//       }

//       for(int i=0;i<n;i++){

//          arrnew[i]=arr[i];
//       }


//       for(int i=0;i<n;i++){
//          System.out.println(arrnew[i]);
//       }

     
//    }
// }                                                     












                                                                    //PART 2

                                                   //8.)COUNT EVEN AND ODD IN AN ARRAY

// import java.util.Scanner;
// public class array{
//    public static void main(String args[]){
//       Scanner sc = new Scanner(System.in);
//       int n=sc.nextInt();
//       int arr[]=new int[n];

//       int evencount=0;
//       int oddcount=0;


//       for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }



//       for(int i=0;i<n;i++){
//          if(arr[i]%2==0){
//             evencount++;
//          }else{
//             oddcount++;
//          }
//       }
//       System.out.println(evencount +oddcount);
   
//    }
// }







                                              //9.) COUNT THE POSITIVE,NEGATIVE AND ZERO ELEMENTS

// import java.util.Scanner;
// public class array{
//   public static void main(String args[]){

//     Scanner sc=new Scanner(System.in);

//     int n =sc.nextInt();

//     int arr[]= new int[n];

//     int positivecount=0;
//     int negativecount=0;
//     int zerocount=0;

//     for(int i=0;i<n;i++){
//       arr[i]=sc.nextInt();
//     }

//     for(int i=0;i<n;i++){
//       if(arr[i]>0){
//         positivecount++;
//       }else if(arr[i]<0){
//         negativecount++;
//       }else{
//         zerocount++;
//       }
//     }

//   }
// }






                                                    //10.)FIND SECOND LARGEST ELEMENT IN AN ARRAY

import java.util.Scanner;
public class array{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);

    
  }
}

                                  
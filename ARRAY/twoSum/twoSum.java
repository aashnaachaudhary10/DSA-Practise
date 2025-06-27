// 🔗 Problem Link: https://leetcode.com/problems/two-sum/
// 🧠 Approach: HashMap to store complement (target - nums[i]) during single pass.





//BRUTE FORCE APPROACH

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if (nums[i] + nums[j]== target){
//                     int a[]={i,j};
//                     return a;
//                 }
//             }
            
//         }
//         return null;
//     }
// }









//HASHMAP
import java.util.HashMap;
class twoSum{
    public int[] twoSums(int[] nums,int target){
        HashMap<Integer, Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];  //Looking for complement


            // If complement exists, we founf the pair
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            

            //store this value and index
            map.put(nums[i],i);
        }

        return new int[] {};
    }


    
}

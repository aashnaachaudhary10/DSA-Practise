public class Majorityelement {
    public int majorityElement(int[] nums) {
        int count =0;
        int candidate=0;


        for(int i=0;i<nums.length;i++){
            int num = nums[i];


            if(count==0){
                candidate=num;
            }

            if(num==candidate){
                count+=1;

            }else{
                count-=1;
            }
        }
        return candidate;
    }
}
//Two pass in place overwrite

public class Movezeroes {
    public void Movezeroes(int[] nums){
        int index=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
        }

        while (index<nums.length){
            nums[index++]=0;
        }
    }
    
}

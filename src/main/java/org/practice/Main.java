package org.practice;


import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
       int []nums={1,2,3,2};
System.out.println(longestBalanced(nums));
    }

  static  public int longestBalanced(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int oddCount=0,evenCount=0,left=0,max=0;
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            if(map.get(nums[right])==1){
                if(nums[right]%2==0){
                    evenCount++;
                }else{
                    oddCount++;
                }
            }
            if(oddCount==evenCount)max=Math.max(max,right-left+1);
            while(left!=right&&right==nums.length-1){
                if(nums[left]%2==0){
                    evenCount--;
                }else{
                    oddCount--;
                }
                if(oddCount==evenCount)max=Math.max(max,right-left+1);
                left++;
            }

        }
        return max;
    }
}
















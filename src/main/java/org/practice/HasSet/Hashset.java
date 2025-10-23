package org.practice.HasSet;


import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        System.out.println(isHappy(60));
    }
   static public boolean isHappy(int n) {
        int check=n;
        String checkLength=Integer.toString(check);
        if(checkLength.length()==1) return false;
        int sum=0;
        HashSet<Integer>set=new HashSet<>();
        while(n!=1){

            while(n!=0){
                int temp=n%10;
                sum+=(temp*temp);
                n/=10;
            }
            if(set.contains(sum)){
                return false;
            }
            else{
                set.add(sum);
            }
            n=sum;
            sum=0;
        }
        return true;
    }
}



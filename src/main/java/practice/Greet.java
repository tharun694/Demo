package practice;

import java.util.Arrays;


public class Greet {
    public static void main(String []args){
        int []arr={8,15,2,4,6,10};
mergeSort(arr,0,arr.length-1);
    }
static void mergeSort(int []arr,int s,int e){
        if(e-s==0){
            return;
        }
         int mid=(s+e)/2;

       mergeSort(arr,s,mid);
      mergeSort(arr,mid+1,e);

}
static int[] merge(int[] first, int[] second){
int i=0,j=0,k=0;
int []mix=new int[first.length+ second.length];
while(i<first.length&&j< second.length){
    if(first[i]<second[j]){
        mix[k]=first[i];
        i++;
    }
    else{
        mix[k]=second[j];
        j++;
    }
    k++;
}
while(i< first.length){
    mix[k]=first[i];
    k++;
    i++;
}
    while(j< second.length){
        mix[k]=second[j];
        k++;
        j++;
    }
    return mix;
}
    }


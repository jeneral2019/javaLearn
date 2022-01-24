package algorithm;

import java.util.Arrays;
import java.util.Date;

public class Sum {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        int target = 6;
        System.out.println(new SumSolution().twoSum(nums,target));
    }
}

class SumSolution {
    public int[] twoSum(int[] nums, int target) {
        customQuickSort(nums,0,nums.length-1);
        for(int i = 0;i<nums.length - 1;i++){
            int j = BinaryTreeSearch(target-nums[i],nums,i+1,nums.length-1);
            if( j > 0 ){
                System.out.println("["+i + "," +j+"]");
                return new int[]{i,j};
            }
        }
        return null;
    }

    public void customQuickSort(int[] arr,int low,int high){
        int i, j, temp;
        if (low >= high){
            return;
        }

        i = low;
        j = high;
        temp = arr[low];
        while (i < j){
            while (temp <= arr[j] && i < j){
                j--;
            }
            while (temp >= arr[i] && i < j){
                i++;
            }
            swap(arr,i,j);
        }
        arr[low] = arr[i];
        arr[i] = temp;
        customQuickSort(arr,low,j-1);
        customQuickSort(arr,j+1,high);
    }

    public void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public int BinaryTreeSearch(int target,int[] ints,int start,int end){

        while (true){
            if (end == start){
                if (target == ints[end]){
                    return end;
                }else {
                    return -1;
                }
            }
            int middle = (start + end)/2;
            if (target == ints[middle]){
                return middle;
            }else if (target > ints[middle]){
                start = middle;
            }else {
                end = middle;
            }
        }

    }
}
package algorithm;

import java.util.Arrays;

/**
 * 排序整理归纳
 * 参考文档 https://blog.csdn.net/weixin_38933749/article/details/108819182
 * @author yuxiangfeng
 * @version 1.0
 */
public class SortV2 {

    public static void main(String[] args) {
//        compareBubbleSort(0,100000,50000);
        compareSort(0,100000,100000);
    }

    public static void compareSort(int min,int max,int num){
        int compareCount = 3;
        int[][] arr = new int[num][];
        arr[0] = getIntList(min,max,num);
        for (int i = 1;i < compareCount ; i++){
            arr[i] = arr[0].clone();
        }

        Long startTime1 =  System.currentTimeMillis();
        bubbleSortV2(arr[0]);
        Long endTime1 =  System.currentTimeMillis();

        Long startTime2 =  System.currentTimeMillis();
        insertSort(arr[1]);
        Long endTime2 =  System.currentTimeMillis();

        Long startTime3 =  System.currentTimeMillis();
        customMergeSort(arr[2],new int[arr[2].length],0,arr[2].length-1);
        Long endTime3 =  System.currentTimeMillis();

        if (!Arrays.equals(arr[0],arr[1]) || !Arrays.equals(arr[2],arr[1])){
            System.out.println("error");
        }else {
            Long executeTime1 = endTime1 - startTime1;
            Long executeTime2 = endTime2 - startTime2;
            Long executeTime3 = endTime3 - startTime3;

            System.out.println("bubbleSortV2、insertSort、customMergeSort 执行时间分别为：\t"
                    + executeTime1 + "ms\t" + executeTime2 + "ms \t" + executeTime3 + "ms");
        }

    }

    /**
     * 冒泡排序优化比较
     * @param min
     * @param max
     * @param num
     */
    public static void compareBubbleSort(int min,int max,int num){
        int[] arr1 = getIntList(min,max,num);
        int[] arr2 = arr1.clone();

        Long startTime1 =  System.currentTimeMillis();
        bubbleSort(arr1);
        Long endTime1 =  System.currentTimeMillis();

        Long startTime2 =  System.currentTimeMillis();
        bubbleSortV2(arr2);
        Long endTime2 =  System.currentTimeMillis();

        if (!Arrays.equals(arr1,arr2)){
            System.out.println("error");
        }else {
            Long executeTime1 = endTime1 - startTime1;
            Long executeTime2 = endTime2 - startTime2;

            System.out.println("v1、v2 执行时间分别为：\t"
                    + executeTime1 + '\t' + executeTime2);
        }
    }


    /**
     * 位置互换
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * 冒泡排序
     * 冒泡排序最好时间复杂度是 O(n),冒泡排序最坏时间复杂度是 O(n*n)
     * 空间复杂度是 O(1)
     * @param arr
     */
    public static void bubbleSort(int[] arr){
        arrCheck(arr);
        for (int i = 1; i < arr.length; i++){
            for (int j=0;j < arr.length - i; j++){
                if (arr[j] > arr[j+1]){
                    swap(arr,j+1,j);
                }
            }
        }
    }

    /**
     * 冒泡排序优化
     * 当某次for循环没有发生数据交换时，说明数据都是有序了，直接break
     * @param arr
     */
    public static void bubbleSortV2(int[] arr){
        arrCheck(arr);
        for (int i = 1; i < arr.length; i++){
            boolean isChange = false;
            for (int j=0;j < arr.length - i; j++){
                if (arr[j] > arr[j+1]){
                    swap(arr,j+1,j);
                    isChange = true;
                }
            }
            if (!isChange){
                break;
            }
        }
    }

    /**
     * 插入排序
     * 插入排序最好时间复杂度是 O(n),最坏时间复杂度则需要 O(n*n),平均时间复杂度是 O(n*n)
     * 空间复杂度是 O(1)
     * @param arr
     */
    public static void insertSort(int[] arr){
        arrCheck(arr);
        for (int i = 1;i < arr.length;i++){
            int temp = arr[i];
            int j = i - 1;
            for (;j >= 0;j--){
                if (arr[j] > temp){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = temp;
        }
    }


    /**
     * 归并排序
     * 采用了二分的迭代方式，复杂度是 log n
     * 执行频次与输入序列无关，因此，归并排序最好、最坏、平均时间复杂度都是 O(n log n)
     * 空间复杂度为 O(n)
     * @param arr
     * @param tmp
     * @param start
     * @param end
     */
    public static void customMergeSort(int[] arr,int[] tmp,int start,int end){
        if (start < end){
            int mid = (start + end)/2;
            //对左侧子序列进行递归排序
            customMergeSort(arr,tmp,start,mid);
            //对右侧子序列进行递归排序
            customMergeSort(arr,tmp,mid+1,end);
            //合并
            customDoubleMerge(arr,tmp,start,mid,end);
        }
    }

    public static void customDoubleMerge(int[] arr,int[] tmp,int left,int mid,int right){
        int p1 = left,p2 = mid +1,k = left;
        while (p1 <= mid && p2 <= right){
            if (arr[p1] <= arr[p2]){
                tmp[k++] = arr[p1++];
            }else {
                tmp[k++] = arr[p2++];
            }
        }
        while (p1 <= mid){
            tmp[k++] = arr[p1++];
        }
        while (p2 <= right){
            tmp[k++] = arr[p2++];
        }
        //复制回原数组
        for(int i = left;i <= right;i++){
            arr[i] = tmp[i];
        }
    }


    /**
     * 快速排序
     * 在快排的最好时间的复杂度下，时间复杂度和归并一样，都是 O(n*logn)
     * 在最坏的时间复杂度下,时间复杂度就退化为 O(n*n) 了
     * 快速排序法在大部分情况下，统计上是很难选到极端情况的。因此它平均的时间复杂度是 O(n*log n)
     * 空间复杂度为 O(1)
     * 快排是不稳定的排序算法
     * @param arr
     * @param low
     * @param high
     */
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








    /**
     * 获取int数组
     * @param min
     * @param max
     * @param num
     * @return
     */
    public static int[] getIntList(int min, int max, int num){
        int[] arr = new int[num];
        for (int i = 0; i< num ; i++){
            arr[i] =  (int)(Math.random()*(max-min)+min);
        }
        return arr;
    }

    public static void arrCheck(int[] arr){
        if(arr == null || arr.length == 0){
            System.out.println("数组为空");
            return;
        }
    }


}

package algorithm;

import java.util.Arrays;

/**
 * 排序
 * @author yuxiangfeng
 */
public class Sort {

    private static int TWO = 2;

    public static void main(String[] args) {
        compareBubbleSort(100,10000,100);
        compareBubbleSort(100,10000,500);
        compareBubbleSort(100,10000,1000);
        compareBubbleSort(100,10000,2000);
    }

    public static void compareBubbleSort(int min,int max,int num){
        int[] arr1 = getIntList(min,max,num);
        int[] arr2 =arr1.clone();
        int[] arr3 =arr1.clone();
        int[] arr4 =arr1.clone();

        Long startTime1 =  System.currentTimeMillis();
        bubbleSortV1(arr1);
        Long endTime1 =  System.currentTimeMillis();

        Long startTime2 =  System.currentTimeMillis();
        bubbleSortV2(arr2);
        Long endTime2 =  System.currentTimeMillis();

        Long startTime3 =  System.currentTimeMillis();
        bubbleSortV3(arr3);
        Long endTime3 =  System.currentTimeMillis();

        Long startTime4 =  System.currentTimeMillis();
        bubbleSortV4(arr4);
        Long endTime4 =  System.currentTimeMillis();

        if (!Arrays.equals(arr1,arr2) || !Arrays.equals(arr1,arr3) || !Arrays.equals(arr1,arr4)){
            System.out.println("error");
        }else {
            Long executeTime1 = endTime1 - startTime1;
            Long executeTime2 = endTime2 - startTime2;
            Long executeTime3 = endTime3 - startTime3;
            Long executeTime4 = endTime4 - startTime4;

            System.out.println("v1、v2、v3、v4执行时间分别为：\t"
                    + executeTime1 + '\t' + executeTime2
                    + '\t' + executeTime3 + '\t' + executeTime4);

            Long[] executeTimes = {executeTime1,executeTime2,executeTime3,executeTime4};
            bubbleSort(executeTimes);
            printList(executeTimes,"executeTimes");
        }

    }


    public static void bubbleSort(Object[] arr){
        if (arr == null || arr.length == 0) {
            return;
        }
        if ( arr[0] instanceof Long || arr[0] instanceof Integer || arr[0] instanceof Short) {

            Object temp;
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if ((Long)arr[j] > (Long)arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }else {
            return;
        }
    }

    /**
     * 冒泡排序(博客思路)
     * 将待插元素，依次与已排序好的子数列元素从后到前进行比较，如果当前元素值比待插元素值大，
     * 则将移位到与其相邻的后一个位置，否则直接将待插元素插入当前元素相邻的后一位置，
     * 因为说明已经找到插入点的最终位置
     * @param arr
     */
    public static void bubbleSortV1(int[] arr){
        if ( arr.length >= TWO ){
            for (int i = 1; i < arr.length;i++ ){
                int x = arr[i];
                int j = i-1;
                while ( j>= 0 && arr[j] > x ){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = x;
            }
        }
    }

    /**
     * 标准冒泡排序，优先确定最后一个元素
     * @param arr
     */
    public static void bubbleSortV2(int[] arr){
        if (arr == null || arr.length == 0) {
            return;
        }
        int temp;
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    /**
     * 标准冒泡排序，优先确定第一个元素
     * @param arr
     */
    public static void bubbleSortV3(int[] arr){
        if (arr == null || arr.length == 0) {
            return;
        }
        int temp;
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    /**
     * 一次比较两个数的大小，将小数的下标记录在min中，遍历一次后，
     * 将第i个数和第min个数进行交换
     * @param arr
     */
    public static void bubbleSortV4(int[] arr){
        if (arr == null || arr.length == 0) {
            return;
        }
        int min;
        for (int i = 0; i < arr.length - 1; i++){
            min=i;
            for (int j = i + 1; j < arr.length ; j++) {
                if ( arr[min] > arr[j]){
                    min = j;
                }
            }
            if (min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }


    /**
     * 分治排序、快速排序
     * @param arr
     */
    public static void quickSort(int[] arr,int begin,int end){
        int a = begin;
        int b = end;

        if ( a >= b ){
            return;
        }

        int x = arr[a];
        while( a < b ){
            while ( a < b && arr[b] >= x){
                b--;
            }
            if ( a < b ){
                arr[b] = arr[a];
                b--;
            }
        }
        arr[a] = x;
        quickSort(arr,begin,a-1);
        quickSort(arr,a+1,end);
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

    /**
     * 打印数组
     * @param arr
     */
    public static void printList(Object[] arr,String otherPrint){
        System.out.println(otherPrint);
        for (Object i:arr){
            System.out.print(i + "\t");
        }
        System.out.println();
//        System.out.println("print over");
    }

}

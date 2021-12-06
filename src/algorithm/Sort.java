package algorithm;

/**
 * 排序
 * @author yuxiangfeng
 */
public class Sort {

    private static int TWO = 2;

    public static void main(String[] args) {

        int[] arr1 = getIntList(0,2000,2000);
        int[] arr2 =arr1.clone();
        printList(arr1);
        Long startTime =  System.currentTimeMillis();
        bubbleSort(arr1);
        Long endTime =  System.currentTimeMillis();
        printList(arr1);
        System.out.println("执行时间为：" + (endTime - startTime));

        System.out.println("++++++++++++++++++++");
        printList(arr2);
        Long startTime2 =  System.currentTimeMillis();
        bubbleSort2(arr1);
        Long endTime2 =  System.currentTimeMillis();
        printList(arr1);
        System.out.println("执行时间为：" + (endTime2 - startTime2));

    }



    /**
     * 冒泡排序
     * 将待插元素，依次与已排序好的子数列元素从后到前进行比较，如果当前元素值比待插元素值大，
     * 则将移位到与其相邻的后一个位置，否则直接将待插元素插入当前元素相邻的后一位置，
     * 因为说明已经找到插入点的最终位置
     * @param arr
     */
    public static void bubbleSort(int[] arr){
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

    public static void bubbleSort2(int[] arr){
        int deep = arr.length;
        while (deep > 1){
            int max = arr[0];
            for (int i = 1;i < deep;i++){
                if (max < arr[i]){
                    int temp = max;
                    max = arr[i];
                    arr[i-1] = temp;
                }else if (max > arr[i]){
                    arr[i-1] = arr[i];
                }else {
                    i++;
                }
            }
            deep--;
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
    public static void printList(int[] arr){
        System.out.println("======> print start:");
        for (int i:arr){
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("print over");
    }

}

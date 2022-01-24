package algorithm;

/**
 * 查找
 * @author yuxiangfeng
 */
public class Search {
    static int searchCount = 0;
    static int searchCount2 = 0;
    public static void main(String[] args) {
        new Search().search();
//        double maxLevel = Math.ceil(logN2(1000000));
//        System.out.println(maxLevel);
//        System.out.println((int)Math.pow(2,10));
//        System.out.println(logN2(1000000));
//        System.out.println(logN2(4));


    }

    public void search(){
        int length = 10000000;
        int[] ints = new int[length];
        for (int i = 0;i < length ;i++){
            ints[i] = i;
        }
        int index = BinaryTreeSearch(500000,ints,0,ints.length);
        int index2 = BinaryTreeSearchV2(500000,ints);
        System.out.println(index + " " + searchCount);
        System.out.println(index2 + " " + searchCount2);
    }


    public int BinaryTreeSearch(int target,int[] ints,int start,int end){

        while (true){
            searchCount++;
            if (end - start <= 1){
                return -1;
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

    public int BinaryTreeSearchV2(int target,int[] ints){
        searchCount2++;
        if (ints == null || ints.length == 0){
            return -1;
        }
        int start = 0;
        int end = ints.length;
        int maxLevel = getMaxLevel(ints.length);
        while (true){
            searchCount2++;
            if (maxLevel == 1){
                if (ints[start] == target){
                    return start;
                }else {
                    return -1;
                }
            }
            for (int n = 0;n< maxLevel;n++){
                searchCount2++;
                if (ints[(int)Math.pow(2,n) - 1 + start ] == target){
                    return (int)Math.pow(2,n) - 1  + start;
                }
                if (ints[(int)Math.pow(2,n) - 1 + start] < target && ints[(int)Math.pow(2,n+1) - 1 + start] > target){
                    start = (int)Math.pow(2,n) - 1  + start;
                    end = (int)Math.pow(2,n+1) - 1  + start;
                    maxLevel =getMaxLevel(end - start + 1);
                    n = 0;
                }
            }
            return -1;
        }

    }

    public int getMaxLevel(int length){
        return  (int)Math.ceil(logN2(length));
    }

    public static double logN2(double x){
        return Math.log(x)/Math.log(2);
    }

}

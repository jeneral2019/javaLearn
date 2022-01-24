package algorithm;

public class MostWater {
    public static void main(String[] args) {
        System.out.println(new Solution().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int area = 0;
        for(int i = 0, j = height.length - 1;i < j;){
            if(height[i] > height[j]){
                area = (j-i) * height[j];
                j--;
            }else if(height[i] < height[j]){
                area = (j-i) * height[i];
                i++;
            }else{
                area = (j-i) * height[i];
                i++;
                j--;
            }
            if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
}
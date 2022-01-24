package base.homework;

public class HomeWork03 {
    public static String reverse(String str,int start,int end){
        if (end > str.length() || start > end){
            throw new RuntimeException("参数错误");
        }
        if (start == end){
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0;i < str.length();i++){
            if (i < start || i > end){
                stringBuilder.append(str.charAt(i));
            }else{
                stringBuilder.append(str.charAt(end + start - i));
            }
        }

        return stringBuilder.toString();
    }

    public static String reverseV2(String str,int start,int end){
        if (str == null || end > str.length() || start > end || start < 0){
            throw new RuntimeException("参数错误");
        }
        char[] chars = str.toCharArray();
        for (int i = start,j = end; i<j;i++,j--){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverse("abcdef",1,4));
        System.out.println(reverseV2("abcdef",1,4));
    }
}

package base.homework;

public class HomeWork05 {
    public static void main(String[] args) {
        System.out.println(getEngName("Willian Jefferson Clinton"));
    }

    public static String getEngName(String chName){
        if (chName == null){
            throw new RuntimeException("姓名错误");
        }
        String[] strings = chName.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        if (strings.length == 2){
            stringBuilder.append(strings[1] + " ." + strings[0].toUpperCase().substring(0,1));
        }else if ( strings.length == 3){
            stringBuilder.append(strings[2] + ", " + strings[0] + " ." + strings[1].toUpperCase().substring(0,1));
        }
        return stringBuilder.toString();
    }
}

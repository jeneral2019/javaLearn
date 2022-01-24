package base.trycatch_;

public class TryCatchExercise {
    public static void main(String[] args) {
        System.out.println(method());
    }

    public static int method(){
        int i = 1;
        try{
            i++;
            String[] names = new String[3];
            if (names[1].equals("tom")){
                System.out.println(names[1]);
            }else {
                names[3] = "lalala";
            }
            return 1;
        }catch (ArrayIndexOutOfBoundsException e){
            return 2;
        }catch (NullPointerException e){
            return i == 2 ?++i:-1;
        }finally {
            ++i;
            System.out.println("i=" + i);
        }
    }
}

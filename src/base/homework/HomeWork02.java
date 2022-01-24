package base.homework;

public class HomeWork02 {
    public static void main(String[] args) {
        try {
            if (args == null || args.length != 2){
                throw new ArrayIndexOutOfBoundsException("");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            cal(n1,n2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
    public static double cal(int n1,int n2){
        return n1 / n2;
    }
}

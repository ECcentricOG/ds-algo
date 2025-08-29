package recursion;

public class Basic {
    
    public static void printOneToN(int num) {
        if(num == 0) return;
        printOneToN(num - 1);
        System.out.println(num);
    }
}

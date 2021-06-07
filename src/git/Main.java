package git;

public class Main {

    public static void main(String[] args) {
        System.out.println(plus(1));
        System.out.println(minus(1));
    }

    public static int plus(int a) {
        return a ++;

    }
    public static int minus(int b) {
        return b--;
    }
}

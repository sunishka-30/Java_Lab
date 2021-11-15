package wrapperclass;

public class NumberTy {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toHexString(n));
        System.out.println(Integer.toOctalString(n));
    }
}

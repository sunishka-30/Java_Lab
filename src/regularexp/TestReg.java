package regularexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestReg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = "9& 98q8 7*& ab";
        Pattern p = Pattern.compile("\\w");
        int ctr=0;
        Matcher m = p.matcher(target);
        while (m.find()) {
            ctr++;
            System.out.println(m.start()+" "+m.end()+" "+m.group());

        }
        System.out.println(ctr);
       // String s1 = ;
       // System.out.println(s1.matches())

    }
}

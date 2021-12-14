package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Name {
    public static void main(String[] args) {



                String target = "navya.nancy.sharma.sunishka";
                Pattern p = Pattern.compile("[N,n][a-z]+");
                Matcher m = p.matcher(target);
                int ctr = 0;
                while(m.find())
                {
                    System.out.println(m.start()+ "--"+m.end()+ "--"+m.group());
                    ctr++;
                }
                System.out.println(ctr);


    }
}

package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Name3 {
    public static void main(String[] args) {


                String target = "navyaj.nancyj.sharmaj.navya";
                Pattern p = Pattern.compile("[N|n][a-z]+[j|J]");
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

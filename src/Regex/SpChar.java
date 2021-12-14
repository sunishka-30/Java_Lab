package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class SpChar {
    public static void main(String[] args) {



                String target = "sunishka#@';5";
                Pattern p = Pattern.compile("[^a-zA-Z0-9]");
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

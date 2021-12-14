package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNo {
    public static void main(String[] args) {


                String target =args[0];
                Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
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

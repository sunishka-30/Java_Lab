package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MailId {
    public static void main(String[] args) {


                String target = "sunishka2002@gmail.com.sunishka20@yahoo.com.sunishka2002@g.com";
                Pattern p = Pattern.compile("[a-zA-Z0-9_.]+[@](gmail|yahoo|rediff)[.]com");
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

package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Name2 {
    public static void main(String[] args) {



    String target = "sunishkaj.sharmajj.sharma";
    Pattern p = Pattern.compile("[a-zA-Z]+[j|J]");
    Matcher m = p.matcher(target);
    int ctr = 0;
            while(m.find())

    {
        System.out.println(m.start() + "--" + m.end() + "--" + m.group());
        ctr++;
    }
            System.out.println(ctr);

}
}

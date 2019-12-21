import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        {
            System.out.println("1. Date");
            String c = "30/04/2003";
            String d = "30-04-2003";
            Pattern pattern = Pattern.compile("\\/");
            String[] date = pattern.split(c, 3);
            System.out.println(date[0]+ " "+date[1]+" " +date[2]);
            String example = "^(0[1-9]|[0-2][0-9]|[3][01])\\/(0[1-9]|1[012])\\/([1-9][0-9]{3})$";
            System.out.println(Pattern.matches(example, c));
            System.out.println(Pattern.matches(example, d));

        }

        {
            System.out.println();
            System.out.println("2. Like abcdefghijklmnopqrstuv18340");
            String example = "abcdefghijklmnopqrstuv18340";
            String a = "abcdefghijklmnopqrstuv18340";
            String b = "abcdefghijklmnoasdfasdpqrstuv18340";
            System.out.println(Pattern.matches(example, a));
            System.out.println(Pattern.matches(example, b));
        }
    }
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertoToClassName {
    public static void main(String[] args) {

        String str = "35. Search Insert Position";

        Pattern pattern = Pattern.compile("^\\d+");
        Matcher matcher = pattern.matcher(str);
        String numbers = "";
        if (matcher.find()) {
            numbers = matcher.group();

        }
        str = str.replaceAll("\\s", "");
        str = str.replaceAll(numbers + ".", "");
        str += numbers;
        System.out.println(str);

    }
}

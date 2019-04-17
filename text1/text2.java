package text1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 取出子字符串"test"
 */
public class text2 {
    public static void main(String[] args) {
        String str = " this is a test of java";
        Pattern pattern = Pattern.compile("s");
        Matcher matcher = pattern.matcher(str);
        System.out.println("取出子字符串："+str.substring(10,15));
    }
}

package text1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 将本字符串复制到一个字符数组Char[] str中.// toCharArray
 */
public class text3 {
    public static void main(String[] args) {
        String str = " this is a test of java";
        Pattern pattern = Pattern.compile("s");
        Matcher matcher = pattern.matcher(str);
        char[] str2=str.toCharArray();
        for (char c : str2) {
            System.out.println(c);
        }
    }
}

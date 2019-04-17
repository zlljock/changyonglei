package text1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class text1 {
    public static void main(String[] args) {
        String str = "this is a test of java";
        Pattern pattern = Pattern.compile("s");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        System.out.println("出现次数:"+count);
    }


}

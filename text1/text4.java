package text1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *(4) 将字符串中每个单词的第一个字母变成大写，
 *  输出到控制台。//用正则表达式
 *
 */
public class text4 {
    public static void main(String[] args) {
        String str = " this is a test of java";
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                StringBuffer stringBuffer=new StringBuffer(matcher.group().toLowerCase());
                stringBuffer.setCharAt(0,Character.toUpperCase(stringBuffer.charAt(0)));
                System.out.println(stringBuffer+" ");
            }

    }
    }


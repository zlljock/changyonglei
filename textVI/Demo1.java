package textVI;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 4. 正则表达式---以下每一个小题，都写一小段程序实现，每一小题提交一次git。
 * （1）检查一个电话号码是否符合(0000)0000-0000
 * （2）将一个字符串中所有的ip地址打印出来
 * （3）将字符串中连续出现的字符压缩成一个。比如aaabbbccccd，压缩后变成abcd。
 * （4）将连续出现的abc用一个abc代替。---选做
 * （5）从控制台输入邮箱地址，验证是否为邮箱地址。从JOptionPane中输入邮箱地址，验证是否是合法的邮箱。----选做
 * （6）输入一个字符串，判断该字符串是否以abc结尾。
 * （7）截取http://地址。在一个网页的源文件中提取静态的http地址。------选做
 * （8）将一个字符串中的所有整数提取出来，保存在一维数组中。比如”ae256dd—w348e6”，提取出256,348,6三个整数
 * （9）文本替换：将字符串中所有的”pupel”替换为”pupil”。
 * （10）从一个字符串中提取以%cxll=开头，右部是%的字符串（不包含%）。
 * 字符串为：
 * "%...%CXLL=add1,31,123.12%CXLL=add2,32,124%CXLL=,33,125.12%LL=-121.11"
 */
public class Demo1 {
    /*
    测试类的使用
    1.方法返回值为void
    2.注意参数列表为空参
    3.给方法前加@test
    4.导入依赖环境
    5.判断结果 绿色为成功，红色为失败（使用断言来处理）
     */

    /**
     * 1）检查一个电话号码是否符合(0000)0000-0000
     */
    @Test
    public void text1(){
        Pattern pattern = Pattern.compile("\\(\\d{4}\\)\\d{4}-\\d{4}");
        Matcher matcher = pattern.matcher("(0000)0000-0000");
        System.out.println("(9999)1234-4567：" + matcher.matches());
        Matcher matcher1 = pattern.matcher("(001)1234-3214");
        System.out.println("(10000)1234-4567：" + matcher1.matches());
    }
}

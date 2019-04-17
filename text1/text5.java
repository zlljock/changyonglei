package text1;

/**
 *  (5) 用两种方式实现该字符串的倒序输出。
 *  (用StringBuffer和for循环方式分别实现)
 */
public class text5 {


    public static void main(String[] args) {
         String  str = " this is a test of java";
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());
//        for循环方式
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}

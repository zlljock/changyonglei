package text1;

/**
 * (6) 将本字符串转换成一个字符串数组，
 * 要求每个数组元素都是一个有意义的英文单词,
 */
public class text6 {
    public static void main(String[] args) {
        String  str = " this is a test of java";
        String [] str2 = str.split("  ");
        for (String s : str2) {
            System.out.print(s);
        }
    }
}

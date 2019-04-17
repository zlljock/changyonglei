package textIII;

/**
 * 写一个例子，实现包装类与基本数据类型之间转换；
 * 实现包装类与字符串相互转换；
 * 实现基本数据类型与字符串之间相互转换
 */
public class Demo1 {
    public static void main(String[] args) {
        //基本类型转成包装类
        Integer  i = Integer.valueOf(12345);
        System.out.println(i);
        System.out.println("---------");

        int i2 = i.intValue();
        System.out.println(i2);
        System.out.println("---------");
        //实现包装类与字符串相互转换；
        //字符串转成包装类
        int  i3 = Integer.parseInt("12345");
        System.out.println(i3);
        System.out.println("---------");
//          包装类转成字符串
        String str = i.toString();
        System.out.println(str);
        System.out.println("---------");

        int  i4 = Integer.parseInt("12345");


        String str2 = i4+"";
        System.out.println(i4);
        System.out.println(str2);




    }
}

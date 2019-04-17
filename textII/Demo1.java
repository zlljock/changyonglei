package textII;

/**
 * 2. 写一个例子，练习String对象与StringBuffer对象互相转换，
 * 测试StringBuffer类的添加、插入、删除、反转操作。
 */
public class Demo1 {
    public static void main(String[] args) {
          String str = "123Oklahoma City Thunder";
          StringBuffer stringBuffer = new StringBuffer(str);
          System.out.println("StringBuffer转成String"+stringBuffer.toString());
        //添加
        stringBuffer.append(" champion");
        System.out.println("添加成功:"+stringBuffer.toString());
        //插入
        stringBuffer.insert(25," is the ");
        System.out.println("插入成功:"+stringBuffer.toString());
        //删除
        stringBuffer.delete(0,3);
        System.out.println("删除成功："+stringBuffer.toString());
        //反转
        stringBuffer.reverse();
        System.out.println("反转："+stringBuffer.toString());

}

}

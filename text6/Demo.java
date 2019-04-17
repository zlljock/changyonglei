package text6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 6. 使用随机数生成十个整数（0--99）保存在一个数组中，
 * 然后使用数组实用类，将数组元素复制到另外一个数组；
 * 将数组元素进行排序；
 * 输入一个数值，再查找该数在数组中哪个位置
 */
public class Demo {
    public static void main(String[] args) {
        Random random = new Random(100);
        int[] in = new int[10];
        for(int i=0;i<10;i++){
            in[i] = random.nextInt(100);
        }
        for(int i=0; i<10;i++){
            System.out.print(in[i]+" ");
        }
        System.out.println();

        int[] in2 = new int[10];
        System.arraycopy(in,0,in2,0,in.length);
        for(int i=0; i<10;i++){
            System.out.print(in2[i]+" ");
        }

        Arrays.parallelSort(in2);
        System.out.println();
        System.out.println("排序后的in2数组");
        for(int i=0; i<10;i++){
            System.out.print(in2[i]+" ");
        }
        System.out.println();
        System.out.println("请输入要查找的数：");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int find = -1;
        if((find=Arrays.binarySearch(in2,key))>-1){
            System.out.println("找到的数："+find+" 位置");
        }else {
            System.out.println("找不到这个数");
        }
    }
}

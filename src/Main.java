/*
学习目标：
实际应用：
概念定义：
另请参阅：- https://en.wikipedia.org/wiki/Integer_(computer_science)
        - https://en.wikipedia.org/wiki/Field_(computer_science)
调用API: - https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html
        - https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
        - https://docs.oracle.com/javase/7/docs/api/java/lang/System.html
*/

// 导入Scanner类
import java.util.Scanner;

public class Main {
    // 创建变量myInteger，但不初始化它
    static float myFloatNumber;

    public static void main(String[] args) {
        // 打印myInteger的默认值:0.0
        System.out.println("The default value of int is: " + myFloatNumber);

        // 实例化一个Scanner类的对象(UserInput)
        // 获取用户的键盘输入值作为参数,赋值给对象UserInput，注意值是字符串，不是整数
        Scanner UserInput = new Scanner(System.in);
        // 调用nextInt()方法把用户的字符串输入值转换为整数值，赋予给myInteger
        myFloatNumber = UserInput.nextFloat();
        System.out.println("The integer you entered was: " + myFloatNumber);

        // 打印封装在Integer类中的成员变量(常量)SIZE: int的二进制位数(32位)
        System.out.println("The number of bits to represent int: " + Float.SIZE);

        // 以科学记数法的形式打印封装在Integer类中的成员变量(常量)MIN_VALUE，即最小值：-2^31
        System.out.println("The minimum number of int is: " + Float.MIN_VALUE);

        // 以科学记数法的形式打印封装在Integer类中的成员变量(常量)MAX_VALUE，即最大值：2^31 - 1
        // 减1是因为0被归入正数，0占用了一个位，导致最大值减1
        System.out.println("The maximum number of int is: " + Float.MAX_VALUE);
    }
}
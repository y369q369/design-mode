package simpleFactory;

import java.util.Scanner;

/**
 * @Author grassPrince
 * @Date 2020/10/28 8:51
 * @Description 第一章： 简单工厂模式的学习
 *                      简单计算器的加减乘除。
 **/
public class Program {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入数字A：  ");
            Double numA = sc.nextDouble();
            System.out.println("请输入运算符号：  (+   -   *   /) ");
            String insignia = sc.next();
            System.out.println("请输入数字B: ");
            Double numB = sc.nextDouble();

            Option option = OperationFactory.createOption(insignia);
            if (option != null) {
                option.setNumA(numA);
                option.setNumB(numB);
                System.out.println(option.getResult());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

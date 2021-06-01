package factoryMethod;

/**
 * @Author grassPrince
 * @Date 2020/10/29 10:11
 * @Description 第八章： 工厂方法模式的学习
 *                       学雷锋的志愿者与大学生
 **/
public class Program {

    public static void main(String[] args) {
        LeiFeng student1 = new UnderGraduateFactory().CreateLeiFeng();
        System.out.println("学雷锋的大学生： ");
        student1.sweep();
        student1.wash();

        LeiFeng student2 = new VolunteerFactory().CreateLeiFeng();
        System.out.println("学雷锋的志愿者： ");
        student2.sweep();
        student2.wash();
    }

}

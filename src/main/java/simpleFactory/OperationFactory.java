package simpleFactory;

/**
 * @Author grassPrince
 * @Date 2020/10/28 9:41
 * @Description 简单运算工厂类
 **/
public class OperationFactory {
    public static Option createOption(String insignia) {
        Option option = null;

        switch (insignia) {
            case "+":
                option = new OptionAdd();
                break;
            case "-":
                option = new OptionSub();
                break;
            case "*":
                option = new OptionMul();
                break;
            case "/":
                option = new OptionDiv();
                break;
            default:
                System.out.println("符号不正确!");
        }

        return option;
    }
}

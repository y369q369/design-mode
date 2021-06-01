package decoratorPattern;

/**
 * @Author grassPrince
 * @Date 2020/10/28 11:39
 * @Description TODO
 **/
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(){}

    public void show() {
        System.out.println("装扮的人：  " + name);
    }
}

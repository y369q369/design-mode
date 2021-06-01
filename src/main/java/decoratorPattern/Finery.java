package decoratorPattern;

/**
 * @Author grassPrince
 * @Date 2020/10/28 11:42
 * @Description 服饰类
 **/
public class Finery extends Person {

    protected Person person;

    public void decorate(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }
}

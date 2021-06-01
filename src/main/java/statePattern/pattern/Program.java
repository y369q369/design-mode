package statePattern.pattern;

/**
 * @Author grassPrince
 * @Date 2020/11/11 11:22
 * @Description 第十六章： 状态模式的学习
 *  *                      替换 if-else
 **/
public class Program {

    public static void main(String[] args) {
        AbstractMovie movie = new GangsterMovie(7);
        System.out.println("警匪片7个价格： " + movie.getPrice());
    }

}

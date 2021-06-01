package statePattern;

import java.math.BigDecimal;

/**
 * @Author grassPrince
 * @Date 2020/11/11 9:26
 * @Description 使用状态模式前的 if-else 操作
 **/
public class InitOperation {

    public static void main(String[] args) {
        System.out.println("买三张动漫片的价格： " + new Movie().getPrice(Movie.ANIMATION_FILM, 3));;
        System.out.println("买四张悬疑片的价格： " + new Movie().getPrice(Movie.SUSPENSE_FILM, 4));;
        System.out.println("买两张警匪片的价格： " + new Movie().getPrice(Movie.GANGSTER_FILM, 2));;
    }
}

class Movie {
    /** 悬疑片标志 */
    public static int SUSPENSE_FILM = 1;
    /** 警匪片标志 */
    public static int GANGSTER_FILM = 2;
    /** 动漫片标志 */
    public static int ANIMATION_FILM = 3;

    /** 电影票价 */
    public BigDecimal getPrice(int type, int num) {
        BigDecimal unitPrice;
        if (type == 1) {
            unitPrice = BigDecimal.valueOf(10.0);
        } else if (type == 2) {
            unitPrice = BigDecimal.valueOf(20.0);
        } else if (type == 3) {
            unitPrice = BigDecimal.valueOf(30.0);
        } else {
            return new BigDecimal(0);
        }

        if (num == 1) {
            unitPrice = unitPrice.multiply(BigDecimal.valueOf(0.9)).setScale(2, BigDecimal.ROUND_HALF_UP);
        } else if (num == 2) {
            unitPrice = unitPrice.multiply(BigDecimal.valueOf(0.8)).multiply(new BigDecimal(2)).setScale(2, BigDecimal.ROUND_HALF_UP);
        } else {
            unitPrice = unitPrice.multiply(BigDecimal.valueOf(0.75)).multiply(new BigDecimal(num)).setScale(2, BigDecimal.ROUND_HALF_UP);
        }

        return unitPrice;
    }
}

package chapter6;

/**
 * Created by Administrator on 2014/12/16.
 */
public class Bot extends PieD {
    @Override
    PieD accept(PieVisitorI ask) {
        return ask.forBot();
    }
}

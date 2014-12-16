package chapter6;

/**
 * Created by Administrator on 2014/12/16.
 */
public class Bot extends PieD {
    @Override
    PieD rem(Object o) {
        return remFn.forBot(o);
    }

    @Override
    PieD subst(Object n, Object o) {
        return substFn.forBot(o);
    }
}

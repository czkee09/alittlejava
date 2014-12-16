package chapter6;

/**
 * Created by Administrator on 2014/12/16.
 */
public class Bot extends PieD {
    @Override
    PieD rem(RemV remFn, Object o) {
        return remFn.forBot(o);
    }

    @Override
    PieD subst(SubstV substFn, Object n, Object o) {
        return substFn.forBot(o);
    }
}

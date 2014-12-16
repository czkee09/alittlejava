package chapter6;

/**
 * Created by Administrator on 2014/12/16.
 */
public class Bot extends PieD {
    @Override
    PieD rem(RemV remFn) {
        return remFn.forBot();
    }

    @Override
    PieD subst(SubstV substFn) {
        return substFn.forBot();
    }
}

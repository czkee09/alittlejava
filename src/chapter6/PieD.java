package chapter6;

/**
 * Created by Administrator on 2014/12/16.
 */
public abstract class PieD {
    RemV remFn = new RemV();
    SubstV substFn = new SubstV();
    abstract PieD rem(Object o);
    abstract PieD subst(Object n, Object o);
}

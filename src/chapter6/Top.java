package chapter6;

/**
 * Created by Administrator on 2014/12/16.
 */
public class Top extends PieD {
    Object t;
    PieD r;

    public Top(Object _t, PieD _r) {
        t = _t;
        r = _r;
    }

    //---------------------------------

    @Override
    PieD rem(RemV remFn) {
        return remFn.forTop(t, r);
    }

    @Override
    PieD subst(SubstV substFn) {
        return substFn.forTop(t, r);
    }
}

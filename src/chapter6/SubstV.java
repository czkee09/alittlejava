package chapter6;

/**
 * Created by Administrator on 2014/12/16.
 */
public class SubstV {
    Object n;
    Object o;

    public SubstV(Object _n, Object _o) {
        n = _n;
        o = _o;
    }

    //-------------------------------------------

    PieD forBot() {
        return new Bot();
    }

    PieD forTop(Object t, PieD r) {
        if (t.equals(o)) {
            return new Top(n, r.subst(this));
        } else {
            return new Top(t, r.subst(this));
        }
    }
}

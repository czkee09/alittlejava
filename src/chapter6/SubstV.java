package chapter6;

/**
 * Created by Administrator on 2014/12/16.
 */
public class SubstV {
    PieD forBot(Object o) {
        return new Bot();
    }

    PieD forTop(Object t, PieD r, Object n, Object o) {
        if (t.equals(o)) {
            return new Top(n, r.subst(this, n, o));
        } else {
            return new Top(t, r.subst(this, n, o));
        }
    }
}

package chapter6;

/**
 * Created by Administrator on 2014/12/16.
 */
public class SubstV implements PieVisitorI {
    Object n;
    Object o;

    public SubstV(Object _n, Object _o) {
        n = _n;
        o = _o;
    }

    //-------------------------------------------

    public PieD forBot() {
        return new Bot();
    }

    public PieD forTop(Object t, PieD r) {
        if (t.equals(o)) {
            return new Top(n, r.accept(this));
        } else {
            return new Top(t, r.accept(this));
        }
    }
}

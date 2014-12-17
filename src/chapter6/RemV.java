package chapter6;

/**
 * Created by Administrator on 2014/12/16.
 */
public class RemV implements PieVisitorI {
    Object o;

    public RemV(Object _o) {
        o = _o;
    }

    //-------------------------------------------

    public PieD forBot() {
        return new Bot();
    }

    public PieD forTop(Object t, PieD r) {
        if (t.equals(o)) {
            return r.accept(this);
        } else {
            return new Top(t, r.accept(this));
        }
    }

}

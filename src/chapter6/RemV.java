package chapter6;

/**
 * Created by Administrator on 2014/12/16.
 */
public class RemV {
    Object o;

    public RemV(Object _o) {
        o = _o;
    }

    //-------------------------------------------

    PieD forBot() {
        return new Bot();
    }

    PieD forTop(Object t, PieD r) {
        if (t.equals(o)) {
            return r.rem(this);
        } else {
            return new Top(t, r.rem(this));
        }
    }

}

package chapter6;

/**
 * Created by Administrator on 2014/12/16.
 */
public class RemV {
    PieD forBot(Object o) {
        return new Bot();
    }

    PieD forTop(Object t, PieD r, Object o) {
        if (t.equals(o)) {
            return r.rem(this, o);
        } else {
            return new Top(t, r.rem(this, o));
        }
    }

}

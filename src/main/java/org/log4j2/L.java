package org.log4j2;

/**
 * Created by liuwen6 on 2018/7/19.
 */
public class L implements I{

    I i;

    public L(I i) {
        this.i = i;
    }

    public void trigger() {
        i.trigger();
    }
}

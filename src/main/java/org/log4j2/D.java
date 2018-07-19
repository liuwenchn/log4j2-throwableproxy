package org.log4j2;

/**
 * Created by liuwen6 on 2018/7/19.
 */
public class D implements I{

    I i;

    public D(I i) {
        this.i = i;
    }

    public void trigger() {
        i.trigger();
    }
}

package org.log4j2;

/**
 * Created by liuwen6 on 2018/7/19.
 */
public class E implements I{

    I i;

    public E(I i) {
        this.i = i;
    }

    public void trigger() {
        i.trigger();
    }
}

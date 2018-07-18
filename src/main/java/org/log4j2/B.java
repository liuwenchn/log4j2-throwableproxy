package org.log4j2;

/**
 * @author zilong6
 */
class B implements I {
    I i;

    public B(I i) {
        this.i = i;
    }

    public void trigger() {
        i.trigger();
    }
}

package org.log4j2;

/**
 * @author zilong6
 */
class A implements I {
    I i;
    public A(I i) {
        this.i = i;
    }
    public void trigger() {
        i.trigger();
    }
}

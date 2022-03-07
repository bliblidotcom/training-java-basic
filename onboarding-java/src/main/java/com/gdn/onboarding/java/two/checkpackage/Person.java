package com.gdn.onboarding.java.two.checkpackage;

public class Person {
    private int thisIsPrivate;
    protected int thisIsProtected;
    int thisIsDefault;
    public int thisIsPublic;

    public Person() {
        this.thisIsPublic=1;
        this.thisIsPrivate=1;
        this.thisIsDefault=1;
        this.thisIsProtected=1;
    }
}

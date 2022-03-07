package com.gdn.onboarding.java.two.checkpackage;

public interface Customer {
    public void shout();

    default public void shout(int integer) {

    }

    public void shout(String words, int integer);

    public void shout(int integer, String words);
}

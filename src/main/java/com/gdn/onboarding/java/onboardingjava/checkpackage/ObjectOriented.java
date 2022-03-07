package com.gdn.onboarding.java.onboardingjava.checkpackage;

public class ObjectOriented {
    public static void main(String[] args) {
        Customer customer = new Customer();
        MemberCustomer memberCustomer = new MemberCustomer();
        MemberCustomer memberCustomer1 = (MemberCustomer) customer;

        if(memberCustomer1 instanceof MemberCustomer){

        }

        Customer customer1 = new MemberCustomer();
        Customer customer2 = new Employee();

        Object customerObj = new Customer();
    }

    static class Customer{
        private String name;

        public void shout(){
            System.out.println(name);
        }
        public void shout(String words, int integer){

        }

        public void shout(int integer ,String words){

        }
    }

    static class MemberCustomer extends Customer{
        private String memberName;

        @Override
        public void shout() {
            System.out.println(memberName);
        }
    }

    static class Employee extends MemberCustomer{

    }
}

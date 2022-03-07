package com.gdn.onboarding.java.two.checkpackage;

public class ObjectOriented {
    public static void main(String[] args){
        Customer customer = new Customer();
        //customer.shout();
        MemberCustomer memberCustomer = new MemberCustomer();
        MemberCustomer memberCustomerCast = (MemberCustomer) customer;

        if (memberCustomerCast instanceof MemberCustomer){

        }

        Customer customerAlt = new MemberCustomer();
        Customer customerAlt2 = new Employee();

        MemberCustomer memberCustomerAlt = new Employee(); //tidak bisa ke customer
    }

    static class Customer{
        private String name;

        public void shout(){
            System.out.println(name);
        }

        public void shout(String words, int integer){
            System.out.println(name);
        }

        public void shout(int integer, String words){
            System.out.println(name);
        }
    }

    static class MemberCustomer extends Customer{
        private String memberName;

        @Override
        public void shout(){
            System.out.println(memberName);
        }
    }
    
    static class Employee extends MemberCustomer{

    }
}

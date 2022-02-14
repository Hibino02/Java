package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        human1.setName("Nuttawut");
        human1.setLastname("Chaloeisap");
        human1.setAge(33);
        human2.setName("haha");
        human2.setLastname("huhu");
        human2.setAge(22);
        human3.setName("hehe");
        human3.setLastname("hoho");
        human3.setAge(11);
        System.out.println(human1.getName());
        System.out.println(human2.getName());
        System.out.println(human3.getName());
    }

}

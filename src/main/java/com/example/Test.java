package com.example;

public class Test {
    public static void main(String[] args) throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
//        System.out.println(cat.getFood());
        Lion lionM = new Lion("Самец");
        System.out.println(lionM.doesHaveMane());
//        System.out.println(lionM.getFood());

//        public void TestCat(){
//            Predator stubCat = new Feline();
//            Cat cat = new Cat(stubCat);
//        }


    }
}

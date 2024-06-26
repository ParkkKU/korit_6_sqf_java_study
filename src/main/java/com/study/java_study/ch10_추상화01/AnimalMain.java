package com.study.java_study.ch10_추상화01;

public class AnimalMain {

    public static void main(String[] args) {
        Dog dog = new Dog("콩이", 11, "말티즈");
        Animal tiger = new Tiger("웅이", 5, 100); // 업캐스팅

        //Animal a = new Dog(); //업
        //Tiger t = (Tiger)a;

        // 업캐스팅한 적 있어야 다운캐스팅할 수 있음

        dog.move();
        tiger.move();
        ((Tiger)tiger).hunt();
        dog.bark();

        System.out.println();

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("이름없는 동물", 10);
        animals[1] = new Dog("콩이", 11, "말티즈");
        animals[2] = new Tiger("웅이", 5, 100);

        for (Animal animal : animals) {
            animal.move();
        }

        System.out.println();

        for (Animal animal : animals) {
            if (animal instanceof Tiger) {
                Tiger t = (Tiger) animal;
                t.hunt();
            }else if (animal instanceof Dog) {
                Dog d = (Dog) animal;
                d.bark();
            }
        }

        System.out.println();


        //instanceof 대신
        for (Animal animal : animals) {
            if (animal.getClass() == Tiger.class) {
                Tiger t = (Tiger) animal;
                t.hunt();
            }else if (animal.getClass() == Dog.class) {
                Dog d = (Dog) animal;
                d.bark();
            }
        }

    }
}

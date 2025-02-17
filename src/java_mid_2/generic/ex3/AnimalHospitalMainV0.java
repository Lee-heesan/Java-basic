package java_mid_2.generic.ex3;

import java_mid_2.generic.animal.Cat;
import java_mid_2.generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String [] args){
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1" , 100);
        Cat cat = new Cat("냐옹이1" , 300);

        dogHospital.set(dog);
        dogHospital.checkup();


        catHospital.set(cat);
        catHospital.checkup();


        //문제 1: 개 병원에 고양이 전달 X
        //dogHospital.set(cat); // 다른 타입을 넣으면 컴파일 오류

        // 문제 2 : 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog  = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}

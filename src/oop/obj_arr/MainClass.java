package oop.obj_arr;

import javax.lang.model.element.PackageElement;
import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {


//        Person kim = new Person("김춘식", 32, "남자");
//        Person Lee = new Person("이영희", 25, "여자");
//        Person park = new Person("박뽀삐", 50, "남자");

//        kim.personInfo();
//        Lee.personInfo();
//        park.personInfo();

//        int[] arr = new int[3];
//        Person[] people = new Person[3];
//        people[0] = new Person("김춘식", 32, "남자");
//        people[1] = new Person...

        int[] arr = {1, 3, 5, 7, 9};
        Person[] people = {
                new Person("김춘식", 32, "남자"),
                new Person("이영희", 25, "여자"),
                new Person("박뽀삐", 50, "남자")
        };

//        System.out.println(Arrays.toString(people));

//        people[0].personInfo();
//        people[1].personInfo();
//        people[2].personInfo();

//        for (int i = 0; i < people.length; i++) {
//            people[i].personInfo();
//        }

        for (Person p : people) {
            p.personInfo();
        }

    }

}
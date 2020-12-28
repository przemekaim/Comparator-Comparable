package pl.java.sort;


import java.util.*;
import java.util.function.IntSupplier;

import pl.java.lambda.*;

// 1. Implementacja interfejsu Comparable<Waifu> i sortowanie zwykle


public class Main {
    public static void main(String[] args) {
        List<Waifu> waifuList = new ArrayList<>();
        waifuList.add(new Waifu("Rem", "-", 17));
        waifuList.add(new Waifu("02", "-", 18));
        waifuList.add(new Waifu("Emilia", "-", 21));
        waifuList.add(new Waifu("Mirai", "Kuriyama", 14));
        waifuList.add(new Waifu("Mai", "Sakurajima", 16));
        waifuList.add(new Waifu("Chika", "Fujiwara", 17));
        waifuList.add(new Waifu("Yukino", "Yukinoshita", 18));
        waifuList.add(new Waifu("Mio", "Akiyama", 17));
        waifuList.add(new Waifu("Yui", "Hirasawa", 17));
        waifuList.add(new Waifu("Yui", "Hirasawa", 13));
        waifuList.add(new Waifu("Yui", "Asawa", 17));
        waifuList.add(new Waifu("Tsumugi", "Kotobuki", 19));


        // -----------------------------------------------------------------------------------
        // 1. Comparable
/*        System.out.println(waifuList);
        System.out.println("------------------------------------");
        Collections.sort(waifuList);
        System.out.println(waifuList);*/

        // -----------------------------------------------------------------------------------
        // 2. Comparator
        //waifuList.sort(new CompareByLength());
        //System.out.println(waifuList);
        //waifuList.sort(new CompareBySurname());
        //System.out.println(waifuList);
        //Collections.reverse(waifuList);
        //System.out.println(waifuList);

        // -----------------------------------------------------------------------------------
        // 3. Lambda expressions
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Rem", "-", 17, 4));
        studentList.add(new Student("02", "-", 18, 5));
        studentList.add(new Student("Emilia", "-", 21, 6));
        studentList.add(new Student("Mirai", "Kuriyama", 14, 3));
        studentList.add(new Student("Mai", "Sakurajima", 16, 4));
        studentList.add(new Student("Chika", "Fujiwara", 17, 4));
        studentList.add(new Student("Yukino", "Yukinoshita", 18, 5));
        studentList.add(new Student("Mio", "Akiyama", 17, 6));
        studentList.add(new Student("Yui", "Hirasawa", 17, 4));
        studentList.add(new Student("Yui", "Hirasawa", 13, 6));
        studentList.add(new Student("Yui", "Hirasawa", 13, 3));
        studentList.add(new Student("Yui", "Hirasawa", 13, 1));
        studentList.add(new Student("Yui", "Asawa", 17, 3));
        studentList.add(new Student("Tsumugi", "Kotobuki", 19, 4));

        //studentList.sort(Comparator.comparingInt(o -> o.getName().length()));
        //studentList.sort((o1, o2) -> Integer.compare(o1.getName().length(), o2.getName().length()));


        //Student student = new Student();
        //IntSupplier intSupplier = student::getAge;
        //IntSupplier gethas = () -> student.hashCode();

        //studentList.forEach(System.out::print);
        //System.out.println(studentList);
        // Sortowanie po imieniu
        //studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        // Sortowanie po ocenie
        //studentList.sort((o1, o2) -> Integer.compare(o1.getGrade(), o2.getGrade()));
        // Sortowanie po imieniu + ocenie
        //studentList.sort(((o1, o2) -> o1.getName().compareTo(o2.getName() + Integer.compare(o1.getGrade(), o2.getGrade()))));
        // Sortowanie po ocenie, jesli ta sama ocena to po imieniu
/*        studentList.sort(((o1, o2) -> {
            int result = Integer.compare(o1.getGrade(), o2.getGrade());
            if (result == 0) {
                return o1.getName().compareTo(o2.getName());
            }
            return result;
        }));*//*

        // 4. Referencje do metod
        // Sortowanie po imieniu
        //studentList.sort(Comparator.comparing(Student::getName));
        // Sortowanie po wieku
        studentList.sort(Comparator.comparingInt(Student::getAge));
        //System.out.println(studentList);

        // 5. Krotki strumien

        studentList.stream()
                .map(Student::getAge)
                .sorted((s, z) -> Integer.compare(z, s))
                .filter(s -> s < 19)
                //.filter(student -> student.getSurname().endsWith("-"))
                .forEach(System.out::println);
        studentList.stream()
                .map(Student::getName)
                .sorted(String::compareTo)
                .forEach(System.out::println);*/

        //studentList.sort(Comparator.comparing(Student::getSurname));
        //studentList.forEach(System.out::print);
        studentList.add(new Student("NULL", null, 17, 3));
        studentList.add(new Student("Ram", "Koto", 17, 3));
        studentList.sort(Comparator.comparing(Student::getSurname, Comparator.nullsFirst(Comparator.naturalOrder()))
                .thenComparingInt(Student::getGrade)
                .reversed());
        studentList.forEach(System.out::print);

        //System.out.println(studentList);
    }


}

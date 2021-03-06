package pl.java.sort;

import java.util.Objects;

public class Waifu implements Comparable<Waifu>{
    private String name;
    private String surname;
    private int age;

    public Waifu(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return  name + " " + surname + " " + age + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Waifu waifu = (Waifu) o;
        return age == waifu.age && Objects.equals(name, waifu.name) && Objects.equals(surname, waifu.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    public int compareTo(Waifu o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.surname.compareTo(o.surname);
            if(result == 0) {
                return Integer.compare(this.age, o.age);
            }
            return result;
        }
        return result;
    }
}

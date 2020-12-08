package pl.java.sort;

import java.util.Comparator;

public class CompareBySurname implements Comparator<Waifu> {
    @Override
    public int compare(Waifu o1, Waifu o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}

package pl.java.sort;

import java.util.Comparator;

public class CompareByLength implements Comparator<Waifu> {

    @Override
    public int compare(Waifu o1, Waifu o2) {
        return Integer.compare(o1.getName().length(), o2.getName().length());
    }
}

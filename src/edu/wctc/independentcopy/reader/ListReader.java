package edu.wctc.independentcopy.reader;

import java.util.ArrayList;
import java.util.Arrays;

public class ListReader implements Reader {
    @Override
    public String readln() {
        ArrayList<String> places = new ArrayList<String>(
                Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));
        return String.valueOf(places);
    }
}

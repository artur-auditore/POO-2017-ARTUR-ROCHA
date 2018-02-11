package Desafios;

import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();

        for (int i=0; i<=1000; i++) {
            numeros.add(i);
        }

        for (Integer x:numeros.descendingSet()) {
            System.out.println(x);
        }
    }
}

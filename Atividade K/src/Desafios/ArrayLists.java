package Desafios;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        for (int i=0; i<=1000; i++) {
            numeros.add(i);
        }

        for (int i=numeros.size(); i>=1; i--){
            System.out.println(i-1);
        }
    }
}

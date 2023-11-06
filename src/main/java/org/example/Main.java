package org.example;


import java.util.ArrayList;
import java.util.List;

import static org.example.TransformadorStrings.transformarLista;

public class Main {
    public static void main(String[] args) {
        List<String> listaOriginal = new ArrayList<>();
        listaOriginal.add("hola");
        listaOriginal.add("mundo");

        List<String> listaMayusculas = transformarLista(listaOriginal, (String str) -> str.toUpperCase());

        System.out.println("Lista original: " + listaOriginal);
        System.out.println("Lista transformada: " + listaMayusculas);
    }
}
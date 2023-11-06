package org.example;

import java.util.ArrayList;
import java.util.List;

public class TransformadorStrings {
    public static List<String> transformarLista(List<String> lista, TransformadorString transformador) {
        List<String> listaTransformada = new ArrayList<>();

        for (String str : lista) {
            String strTransformada = transformador.transformar(str);
            listaTransformada.add(strTransformada);
        }

        return listaTransformada;
    }
}

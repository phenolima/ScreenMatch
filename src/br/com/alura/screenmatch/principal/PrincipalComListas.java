package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Os Vingadores", 2012);
        filme1.avalia(10);
        Filme filme2 = new Filme("Os Incríveis", 2007);
        filme2.avalia(6);
        Filme filme3 = new Filme("Homem Aranha", 2020);
        filme3.avalia(7);
        Serie serie1 = new Serie("Stranger Things", 2016);
        serie1.avalia(3);

        ArrayList<Titulo> titulos = new ArrayList<>();
        titulos.add(filme1);
        titulos.add(filme2);
        titulos.add(filme3);
        titulos.add(serie1);

        for (Titulo item: titulos){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 3) {
                System.out.println("Classificacao: " + filme.getClassificacao());
            }
        }

        ArrayList<String> artistas = new ArrayList<>();
        artistas.add("Pedro");
        artistas.add("Paulo");
        artistas.add("Miguel");
        System.out.println(artistas);
        Collections.sort(artistas);
        System.out.println(artistas);

        System.out.println(titulos);
        Collections.sort(titulos);
        System.out.println(titulos);
        titulos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(titulos);

    }
}
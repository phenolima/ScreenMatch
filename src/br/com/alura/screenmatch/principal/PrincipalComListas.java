package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Os Vingadores", 2012);
        filme1.avalia(10);
        Filme filme2 = new Filme("Os Incríveis", 2007);
        filme2.avalia(6);
        Filme filme3 = new Filme("Homem Aranha", 2004);
        filme3.avalia(7);
        Serie serie1 = new Serie("Stranger Things", 2016);
        serie1.avalia(3);

        ArrayList<Titulo> filmes = new ArrayList<>();
        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);
        filmes.add(serie1);

        for (Titulo item: filmes){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 3) {
                System.out.println("Classificacao: " + filme.getClassificacao());
            }
        }
    }
}
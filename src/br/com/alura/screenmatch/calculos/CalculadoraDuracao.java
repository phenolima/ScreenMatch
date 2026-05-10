package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDuracao {
    private int tempoTotal;

    public void inclui(Titulo titulo){
        tempoTotal = tempoTotal + titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }
}

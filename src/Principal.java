import br.com.alura.screenmatch.calculos.CalculadoraDuracao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Os Vingadores");
        filme1.setAnoDeLancamento(2012);
        filme1.setIncluidoNoPlano(true);
        filme1.setDuracaoEmMinutos(120);

        Filme filme2 = new Filme();
        filme2.setNome("Os Incríveis");
        filme2.setAnoDeLancamento(2007);
        filme2.setIncluidoNoPlano(true);
        filme2.setDuracaoEmMinutos(90);

        Serie serie1 = new Serie();
        serie1.setNome("Stranger Things");
        serie1.setAnoDeLancamento(2015);
        serie1.setIncluidoNoPlano(true);
        serie1.setAtiva(false);
        serie1.setTemporadas(4);
        serie1.setEpisodiosPorTemporada(10);
        serie1.setMinutosPorEpisodio(50);
        System.out.println(serie1.getDuracaoEmMinutos());

        CalculadoraDuracao calc1 = new CalculadoraDuracao();
        calc1.inclui(filme1);
        calc1.inclui(filme2);
        calc1.inclui(serie1);

        System.out.println("Tempo total: " +calc1.getTempoTotal());
    }
}
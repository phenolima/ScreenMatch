import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();

        filme1.setNome("Os Vingadores");
        filme1.setAnoDeLancamento(2012);
        filme1.setIncluidoNoPlano(true);
        filme1.setDuracaoEmMinutos(120);

        filme1.avalia(3);
        filme1.avalia(5);
        filme1.avalia(10);
        filme1.exibeFichaTecnica();

        System.out.println("A media das avaliacoes é: " + filme1.pegaMedia());
    }
}
public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();

        filme1.nome = "Os Vingadores";
        filme1.anoDeLancamento = 2012;
        filme1.incluidoNoPlano = true;
        filme1.duracaoEmMinutos = 120;

        filme1.avalia(3);
        filme1.avalia(5);
        filme1.avalia(10);
        filme1.exibeFichaTecnica();

        System.out.println("A media das avaliacoes é: " + filme1.pegaMedia());
    }
}
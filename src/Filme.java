public class Filme {

    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;


    void exibeFichaTecnica (){
        System.out.println("#### Ficha Tecnica ####");
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lancamento: " + anoDeLancamento);
        System.out.println("Duracao: " + duracaoEmMinutos + " minutos");
        if (incluidoNoPlano){
            System.out.println("Incluido no Plano: Sim" );
        } else {
            System.out.println("Incluido no Plano: Nao" );
        }
        System.out.println("Soma das Avaliacoes: " + somaDasAvaliacoes);
        System.out.println("Total de Avaliacoes: " + totalDeAvaliacoes);
        System.out.println("#######################");
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
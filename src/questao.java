public class questao {
    String pergunta;
    String alternativa01;
    String alternativa02;
    String alternativa03;
    String alternativa04;
    int gabarito;


    public questao(String pergunta, String alternativa01, String alternativa02, String alternativa03, String alternativa04, int gabarito) {
        this.pergunta = pergunta;
        this.alternativa01 = alternativa01;
        this.alternativa02 = alternativa02;
        this.alternativa03 = alternativa03;
        this.alternativa04 = alternativa04;
        this.gabarito = gabarito;
    }

    public void mostrar() {
        System.out.println(pergunta + alternativa01 + alternativa02 + alternativa03 + alternativa04);
    }

    public boolean estaCorreto(int resposta) {
        return (resposta == gabarito);
    }

}

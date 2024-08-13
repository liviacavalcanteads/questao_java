import java.util.Scanner;

public class prova {
    public questao q1;
    public questao q2;
    public questao q3;
    public questao q4;
    public questao q5;

    public Integer r1;
    public Integer r2;
    public Integer r3;
    public Integer r4;
    public Integer r5;

    float nota;
    Scanner scanner;

    public void realizarProva(){
        System.out.println(q1);
        System.out.println("\n Resposta:");
        r1 = scanner.nextInt();

        System.out.println(q2);
        System.out.println("\n Resposta:");
        r2 = scanner.nextInt();

        System.out.println(q3);
        System.out.println("\nResposta:");
        r3 = scanner.nextInt();

        System.out.println(q4);
        System.out.println("\n Resposta:");
        r4 = scanner.nextInt();

        System.out.println(q5);
        System.out.println("\n Resposta:");
        r5 = scanner.nextInt();

    }
    public void corrigirProva(){
        q1.estaCorreto(r1.intValue());
        nota = nota + 2;
        q2.estaCorreto(r2.intValue());
        nota = nota + 2;
        q3.estaCorreto(r3.intValue());
        nota = nota + 2;
        q4.estaCorreto(r4.intValue());
        nota = nota + 2;
        q5.estaCorreto(r5.intValue());
        nota = nota + 2;

    }
    public float getNota(){

        return nota;
    }

    public prova(questao q1, questao q2, questao q3, questao q4, questao q5, Integer r1, Integer r2, Integer r3, Integer r4, Integer r5, float nota, Scanner scanner) {
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.r4 = r4;
        this.r5 = r5;
        this.nota = nota;
        this.scanner = new Scanner(System.in);

    }
}

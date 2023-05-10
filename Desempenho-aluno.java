import java.util.Scanner;

public class Av01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, mediaAluno = 0, mediaTurma = 0, mediaDisciplina = 0, maiorMedia = 0, menorMedia = 10;
        int quantAlunos, quantDisciplina, aprovados, aguardandoFinal, reprovados;
        int totalAlunos = 0, totalReprovados = 0, totalAguardandoFinal = 0, totalAprovados = 0;
        String nomeDisciplina, nomeTurma;

        System.out.println("1AV - Desafio de Lógica de Programação");

        System.out.print("\nNome da turma: ");
        nomeTurma = entrada.nextLine();

        System.out.print("Quantidade de disciplinas: ");
        quantDisciplina = entrada.nextInt();

        for (int i = 1; i <= quantDisciplina; i++) {
            entrada.nextLine();
            System.out.print("\nNome da disciplina " + i + ": ");
            nomeDisciplina = entrada.nextLine();

            System.out.print("Quantidade de alunos: ");
            quantAlunos = entrada.nextInt();
            totalAlunos += quantAlunos;

            aprovados = 0;
            aguardandoFinal = 0;
            reprovados = 0;

            for (int j = 1; j <= quantAlunos; j++) {
                System.out.print("\nDigite a nota da primeira avaliação do aluno " + j + ": ");
                nota1 = entrada.nextDouble();

                System.out.print("Digite a nota da segunda avaliação do aluno " + j + ": ");
                nota2 = entrada.nextDouble();

                mediaAluno = (nota1 + nota2) / 2;
                
                if (mediaAluno < 4) {
                    System.out.println("Aluno " + j + ": Reprovado por média!");
                    reprovados++;

                } else if (mediaAluno >= 7 && mediaAluno <= 10) {
                    System.out.println("Aluno " + j + ": Aprovado por média. Parabéns!");
                    aprovados++;

                } else {
                    System.out.println("Aluno " + j + ": Aguardando final!");
                    aguardandoFinal++;
                }

                mediaDisciplina = (mediaDisciplina * (j - 1) + mediaAluno) / j;

                if (mediaAluno > maiorMedia) {
                    maiorMedia = mediaAluno;
                }

                if (mediaAluno < menorMedia) {
                    menorMedia = mediaAluno;
                }
            }

            totalReprovados += reprovados;
            totalAguardandoFinal += aguardandoFinal;
            totalAprovados += aprovados;

            System.out.println("\n#### RESUMO DA DISCIPLINA ####");
            System.out.println("DISCIPLINA: " + nomeDisciplina);
            System.out.println("QUANTIDADE TOTAL DE ALUNOS: " + quantAlunos);
            System.out.printf("MÉDIA GERAL DA DISCIPLINA: %.2f\n", mediaDisciplina);
            System.out.printf("MAIOR MÉDIA DA DISCIPLINA: %.2f\n", maiorMedia);
            System.out.printf("MENOR MÉDIA DA DISCIPLINA: %.2f\n", menorMedia);
            System.out.println("QUANTIDADE ALUNOS REPROVADOS: " + reprovados);
            System.out.println("QUANTIDADE ALUNOS NA FINAL: " + aguardandoFinal);
            System.out.println("QUANTIDADE ALUNOS APROVADOS: " + aprovados);

            mediaTurma = (mediaTurma * (i - 1) + mediaDisciplina) / i;
            maiorMedia = 0;
            menorMedia = 10;
        }

        System.out.println("\n#### RESUMO DA TURMA ####");
        System.out.println("TURMA: " + nomeTurma);
        System.out.println("QUANTIDADE DE DISCIPLINAS: " + quantDisciplina);
        System.out.printf("MÉDIA GERAL DA TURMA: %.2f\n", mediaTurma);
	  System.out.println("TOTAL DE ALUNOS: " + totalAlunos);
	  System.out.println("TOTAL DE REPROVADOS POR MÉDIA: " + totalReprovados);
	  System.out.println("TOTAL DE ALUNOS AGUARDANDO FINAL: " + totalAguardandoFinal);
	  System.out.println("TOTAL DE APROVADOS POR MÉDIA: " + totalAprovados);
 }
}
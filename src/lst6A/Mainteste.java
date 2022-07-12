import java.util.List;
import java.util.Scanner;

public class Mainteste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System .in);

        Professores professor = new Professores("Pedro","300","00824","Sala de Aula",3000,"Superior","Matemática","8",8,8);
        Coordenadores coordenadores = new Coordenadores("Paulo","301","00825","Cood",4000,0,5,"A");

        //String p1 = professor.getDisciplinaMinistrada();
        //System.out.println(p1);

        Turma t1 = new Turma("A");
        Turma t2 = new Turma("B");
        Turma t3 = new Turma("C");


        professor.adicionaTurma(t1);
        professor.adicionaTurma(t2);
        professor.adicionaTurma(t3);

        List<Turma> mostraTurma = professor.mostrarTurmas();
        for (int i = 0; i < mostraTurma.size(); i++) {
            System.out.println(mostraTurma.get(i).nome);
        }

        /*String p3 = professor.CPF;
        System.out.println(p3);

        double p2 = professor.aumentoSalario();
        System.out.println(p2);

        double c1 = coordenadores.aumentoSalario();
        System.out.println(c1);

        coordenadores.adicionaProfessor();

        String pfS = coordenadores.professoresSupervisionados;
        System.out.println(pfS);*/


    }
}

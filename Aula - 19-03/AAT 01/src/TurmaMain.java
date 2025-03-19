import java.util.*;

public class TurmaMain {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        ObjTurma[] VetorTurmas = new ObjTurma[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Turma " + (i+1));
            VetorTurmas[i] = new ObjTurma();
            VetorTurmas[i].setCurso(cin.nextLine());
            VetorTurmas[i].setDisciplina(cin.nextLine());
        }

        for(int i = 0; i < 5; i++){
            System.out.println("Turma " + (i+1));
            VetorTurmas[i].exibeDados();
        }
    }
}
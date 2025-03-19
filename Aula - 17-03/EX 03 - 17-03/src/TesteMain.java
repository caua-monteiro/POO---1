public class TesteMain {
    public static void main(String[] args){
        ObjUniversidade Uni01 = new ObjUniversidade();
        ObjAluno Aluno01 = new ObjAluno();

        Uni01.Nome = "Unicentro";
        Uni01.Cidade = "Guarapuava";
        Uni01.Estado = "PR";

        Aluno01.Nome = "Jacob Filho Jr";
        Aluno01.Curso = "Ciencia da Computacao";

        Uni01.ExibeUniversidade();
        Aluno01.ExibeAluno();
    }
}
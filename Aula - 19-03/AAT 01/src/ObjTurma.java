
public class ObjTurma {
    String curso, disciplina;

    public ObjTurma(){
        curso = "Nao inicializado";
        disciplina = "Nao inicializado";
    }


    public void setCurso(String curso1){
        curso = curso1;
    }
    public void setDisciplina(String disciplina1){
        disciplina = disciplina1;
    }

    public String getCurso(){
        return curso;
    }
    public String getDisciplina(){
        return  disciplina;
    }

    public void exibeDados(){
        System.out.println("Curso: " + getCurso());
        System.out.println("Disciplina: " + getDisciplina());
    }
}
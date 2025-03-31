public class ObjRetangulo {
    private double comprimento, largura;

    public ObjRetangulo(){
        this.comprimento = 0.0;
        this.largura = 0.0;
    }
    public ObjRetangulo(double C, double L){
        this.comprimento = C;
        this.largura = L;
    }

    public void setComprimento(double C){
        if(C > 0.0)
            this.comprimento = C;
        else
            System.out.println("ERRO, tente novamente com um valor maior que 0");

    }
    public void setLargura(double L){
        if(L > 0.0)
            this.largura = L;
        else
            System.out.println("ERRO, tente novamente com um valor maior que 0");

    }

    public double getComprimento(){
        return comprimento;
    }
    public double getLargura(){
        return largura;
    }

    public double calculaPerimetro(){
        return (2*comprimento) + (2*largura);
    }
    public double calculaArea(){
        return comprimento*largura;
    }
    public boolean isQuadrado(){
        return comprimento == largura;
    }
}

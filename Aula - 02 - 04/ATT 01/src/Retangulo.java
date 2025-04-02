public class Retangulo extends TwoDShape{

    public boolean isQuadrado(){
        return getAltura() == getLargura();
    }
    public double area(){
        return getAltura()*getLargura();
    }
}
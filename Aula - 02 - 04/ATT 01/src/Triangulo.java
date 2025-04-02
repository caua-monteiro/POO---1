public class Triangulo extends TwoDShape {
    private String estilo;
    public double area() {
        return (getLargura() * getAltura()) / 2;
    }

    public void setEstilo(String E){
        this.estilo = E;
    }

    public void mostraEstilo() {
        System.out.println("Triangulo = " + estilo);
    }
}

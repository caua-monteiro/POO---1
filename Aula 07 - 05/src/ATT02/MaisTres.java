package ATT02;

public class MaisTres implements Series{
    private int inicio, valor;

    public MaisTres(){
        inicio = 0;
        valor = 0;
    }

    @Override
    public int getNext() {
        valor += 3;
        return valor;
    }

    @Override
    public void reset() {
        valor = inicio;
    }

    @Override
    public void setStart(int X) {
        inicio = X;
        valor = X;
    }
}

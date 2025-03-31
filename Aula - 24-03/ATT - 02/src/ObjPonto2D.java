public class ObjPonto2D {
    double X, Y;

    public ObjPonto2D(){
        this.X = 0.0;
        this.Y = 0.0;
    }

    public ObjPonto2D(double x, double y){
        this.X = x;
        this.Y = y;
    }

    public void ExibeDados(){
        System.out.println("X: " + X);
        System.out.println("Y: " + Y);
    }
}
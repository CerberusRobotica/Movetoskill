public class vetor {
    public double x;
    public double y;

    public void setcoords(double xnew, double ynew) {
        x = xnew;
        y = ynew;
    }
    public int size() {
        return 2;
    }

    public double norm(){
        return Math.sqrt(x*x + y*y);
    }

}

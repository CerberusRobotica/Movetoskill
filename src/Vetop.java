public class Vetop {

    public static vetor calcularvetor(double xf, double yf, double x0, double y0) {
        vetor vet = new vetor();
        vet.setcoords(xf-x0, yf-y0);
        return vet;
    }

    public static double calculardist(double xf, double yf, double x0, double y0, double xr, double yr){
        double a = 0;
        if(xf != x0) {
            a = (yf - y0) / (xf - x0);
        }
        double b = -1;
        double c = y0 - x0 * a;
        double d = Math.abs(a * xr + b * yr + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(d);
    return d;
    }

    public static vetor calcularnovovetor(double x0, double y0, double xr, double yr, double beta, double inv) {
        vetor v = calcularvetor(xr, yr, x0, y0);
        double knorm = Math.sqrt(Math.pow(v.norm(), 2) - Math.pow(beta, 2));
        double theta = Math.atan((yr - y0) / (xr - x0)) + inv * (Math.atan(beta / knorm) + 0.00000000000001);
        v.setcoords(knorm * Math.cos(theta), knorm * Math.sin(theta));
        return v;
    }

    public static double dot(vetor u, vetor v){
        return v.x * u.x + v.y * u.y;
    }

    public static vetor escalar(double a, vetor vet){
        vet.x *= a;
        vet.y *= a;
        return vet;
    }

    public static vetor soma(vetor u, vetor v){
        vetor vet = new vetor();
        vet.setcoords(u.x + v.x, u.y + v.y);
        return vet;
    }

    public static vetor subt(vetor u, vetor v){
        vetor vet = new vetor();
        vet.setcoords(u.x - v.x, u.y - v.y);
        return vet;
    }

    public static vetor projort(vetor u, vetor v){
        v = Vetop.escalar((Vetop.dot(v, u) / Math.pow(u.norm(), 2)), u);
        return v;
    }

    public static vetor normalizar(double alpha, vetor vet) {
        vet = Vetop.escalar(alpha/vet.norm(), vet);
        return vet;
    }
}

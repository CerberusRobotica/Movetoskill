public class Testedecolisao {


    public static boolean teste(vetor vet, double x0, double y0, double xr, double yr, double beta) {
        vetor u = new vetor();
        u.setcoords(x0, y0);
        u = Vetop.soma(vet, u);
        double xf = u.x;
        double yf = u.y;
        if(Vetop.calculardist(xf, yf, x0, y0, xr, yr) >= beta) {
            return false;
        }
        vetor v = Vetop.calcularvetor(xr, yr, x0, y0);
        vetor v1 = Vetop.projort(vet, v);
        double r = Vetop.subt(v, v1).norm();            //Java eh simplesmente insano
        double w = Math.sqrt(Math.abs(Math.pow(beta, 2) - Math.pow(r, 2)));
        return !(v1.norm() > vet.norm() + w);           //Essa IDE eh insana
    }
}

/* Classe Point */

public class Point {
    private int X;
    private int Y;

    /**
     * Construit un point de coordonnees (a, b)
     *
     * @param a abscisse du point
     * @param b ordonnée du point
     */
    public Point(int a, int b)  {
        X = a;
        Y = b; }

    /**
     * Construit un point de coordonnees (0, 0)
     */
    public Point() {
        X = 0;  /* ou this.X=a, this = dans cette classe, ici pas important mais pour code complexe, imoortant (ex : héritage) */
        Y = 0;}

    /**
     * retourne l'abscisse du point
     */
    /* pas nécessaire si X est public, on peut directement faire p1.X */
    public int getX() {
        return X;}

    /**
     * retourne l'ordonnee du point
     */
    public int getY() {
        return Y; }

    public String toString() {
        return ("Point :(" +X+ "," +Y+ ")");
    }
}



import java.awt.Color;

public class Cercle extends Ellipse {

    public Cercle(int c){
        super(c, c);
    }

    public Cercle (int px, int py, Color c){
        super(px, py, c);
    }

    public void setLargeur(int cote){
        super.gaxe= cote;
        super.paxe = cote;
    }

    public void setBoundingBox(int horizontalBB, int largeurBB){
        this.gaxe = horizontalBB;
        this.paxe = horizontalBB;
    }

    public void setLongueur(int cote){
        super.gaxe = cote;
        super.paxe = cote;
    }
}

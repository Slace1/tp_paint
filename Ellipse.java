import java.awt.Color;
import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;

public class Ellipse extends Figure {
    protected int gaxe;
    protected int paxe;

    public Ellipse(Point p) {
        super (p);
        this.paxe = 0;
        this.gaxe = 0;

    }

    public Ellipse(int ga, int pa) {
        super(new Point());
        gaxe = ga;
        paxe = pa;
    }

    public Ellipse (int px, int py, Color c){
        super(new Point(px, py), c);
        this.paxe = 0;
        this.gaxe = 0;
    }

    //public Ellipse(int ga, int pa) {
    //super(new Point());
    //gaxe = ga;
    //paxe = pa;
    //}

    public void setBoundingBox(int hauteurBB, int largeurBB){
        this.paxe = hauteurBB;
        this.gaxe = largeurBB;
    }

    public void draw(Graphics g) {
        g.setColor(this.c);
        g.fillOval(origine.getX(), origine.getY(), this.paxe, this.gaxe);
    }

    public int getSurface() {
        return (int) (Math.PI*gaxe*paxe/4);  //on caste (impose une classe) car sinon c'est un nombre trop grand qui demande une double précision (type double)
    }

    public int getPerimetre() {
        return (int) (2*Math.PI*Math.sqrt(((paxe*paxe)+(gaxe*gaxe))/2));
    }

    public int getGrandAxe() {
        return gaxe;
    }

    public int getPetitAxe() {
        return paxe;
    }

}

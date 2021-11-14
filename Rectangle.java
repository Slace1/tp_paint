import java.awt.Color;
import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;

public class Rectangle extends Figure {
    protected int longueur;
    protected int largeur;

    public Rectangle(Point p) {
        super (p);
        this.longueur = 0;
    }

    public Rectangle(int lo, int la) {
        super(new Point());  //obligé de créer un point car une Figure possède toujours un point  =/= de création de carré
        longueur = lo;
        largeur = la;
    }

    public Rectangle (int px, int py, Color c){
        super(new Point(px, py), c);
        this.longueur = 0;
        this.largeur = 0;
    }

    public void draw(Graphics g) {
        g.setColor(this.c);
        g.fillRect(origine.getX(), origine.getY(), this.longueur, this.largeur);
    }

    public void setBoundingBox(int hauteurBB, int largeurBB){
        this.longueur = hauteurBB;
        this.largeur = largeurBB;
    }

    public int getPerimetre() {
        return (2*longueur + 2*largeur);
    }

    public int getSurface() {
        return (longueur*largeur);
    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLongueur(int L){
        longueur = L;
    }

    public void setLargeur(int l){
        largeur = l;
    }

    public String toString() {
        return ("O : " +origine.toString()+ ", longueur = " +longueur+ ", largeur = " +largeur+ ".");
    }

    public String affiche() {
        String s = "+";
        for (int i =0; i<longueur; i++) {
            s+="--";
        }
        s+="+ \n";
        for (int j=0; j<largeur; j++) {
            s+="|";
            for (int i = 0; i<longueur; i++){
                s+= "  ";
            }
            s+= "| \n";
        }
        s+="+";
        for (int i =0; i<longueur; i++){
            s+="--";
        }
        s+="+";
        return (s);
    }
}

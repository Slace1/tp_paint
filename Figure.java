import java.awt.Color;
import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;

public abstract class Figure {
    protected Point origine;
    protected Color c;


    public Figure(Point p1)  {
        origine = p1;
    }

    public Figure(Point p, Color co){
        this.origine = p;
        this.c = co;
    }

    public String toString() {
        return ("( " +origine.getX()+ ", "+origine.getY()+")");
    }

    public abstract int getPerimetre();
    public abstract int getSurface();
    public abstract void setBoundingBox(int hauteurBB, int largeurBB);
    public abstract void draw(Graphics g);

}

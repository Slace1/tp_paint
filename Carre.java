import java.awt.Color;

public class Carre extends Rectangle {

    public Carre(int c){
        super(c, c);  //le nouveau carré est un renctangle par défaut donc pas beosin d'en créer un, juste de le paramétrer
    }

    public Carre (int px, int py, Color c){
        super(px, py, c);
    }

    public void setLargeur(int cote){
        super.longueur = cote;  // ou super.setLongueur(cote);  les 2 marchent
        super.largeur = cote;
    }

    public void setBoundingBox(int largeurBB, int hauteurBB){
        this.longueur = largeurBB;
        this.largeur = largeurBB;
    }

    public void setLongueur(int cote){
        super.longueur = cote;
        super.largeur = cote;
    }
}

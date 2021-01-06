import java.util.Date;
public class Voiture {

    private String numeroImm;
    private String marque;
    private String modele;
    private int annee;
    private double prixDeVente;

    public Voiture(String marque, String modele, String numeroImm,int annee, double prixDeVente){
        this.marque = marque;
        this.numeroImm = numeroImm;
        this.modele = modele;
        this.annee = annee;
        this.prixDeVente = prixDeVente;
    }

    public String getNumeroImm() {
        return numeroImm;
    }

    public void setNumeroImm() {
        this.numeroImm = numeroImm;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque() {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele() {
        this.modele = modele;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee() {this.annee =annee;}

        public double getPrixDeVente (){
            return prixDeVente;
        }

        public void setPrixDeVente (){
            this.prixDeVente = prixDeVente;
        }

        @Override
        public String toString () {
            return "Voiture{" +
                    "numeroImm='" + numeroImm + '\'' +
                    ", marque='" + marque + '\'' +
                    ", modele='" + modele + '\'' +
                    ", annee=" + annee +
                    ", prixDeVente=" + prixDeVente +
                    '}';
        }

    }








import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

public class MainVoiture {

    public static void main(String[] args) {

        ArrayList <Voiture> voitureList = new ArrayList <>( );

        Voiture v1 = new Voiture("Peugeot", "3008", "VT236HL", 2019, 600);
        Voiture v2 = new Voiture("Toyota", "Prius", "AB296MP", 1990, 11500);
        Voiture v3 = new Voiture("Renault", "Clio", "VT236HL", 1991, 9000);
        Voiture v4 = new Voiture("Lexus", "RX 450H", "PM254PM", 2018, 15500);
        Voiture v5 = new Voiture("Peugeot", "206", "ML845FR", 1995, 2600);
        Voiture v6 = new Voiture("Toyota", "Rav4", "VT236PL", 1996, 19000);
        Voiture v7 = new Voiture("Seat", "Ibiza", "RS987SR", 1997, 6800);
        Voiture v8 = new Voiture("Seat", "Corona", "LK963QS", 1999, 1000);
        Voiture v9 = new Voiture("Lexus", "IS 300h", "VM147NB", 2015, 20000);
        Voiture v10 = new Voiture("Peugeot", "308", "DF963SZ", 2000, 2000);

        voitureList.add(v1);
        voitureList.add(v2);
        voitureList.add(v3);
        voitureList.add(v4);
        voitureList.add(v5);
        voitureList.add(v6);
        voitureList.add(v7);
        voitureList.add(v8);
        voitureList.add(v9);
        voitureList.add(v10);

        System.out.println("---------- Affichage de la liste-------");
        for (int i = 0; i < voitureList.size( ); i++) {
                        System.out.println(" La liste des voitures :" + voitureList.get(i));

        }
        System.out.println("    ");
        //date mise en circulation

        int miseCirc = 0;

        for (int i = 0; i < voitureList.size( ); i++) {
            if (voitureList.get(i).getAnnee( ) < 2000 && voitureList.get(i).getAnnee( ) > 1990) {
                miseCirc = i;
                System.out.println("les voitures mise en circulation entre 1990 et 2000" + voitureList.get(i));
            }
            System.out.println("    ");
        }

//Prix de vente supp 3000
        int prixSupp = 0;
        for (int j = 0; j < voitureList.size( ); j++) {
            if (voitureList.get(j).getPrixDeVente() > 3000) {
                prixSupp = j;
                System.out.println(" Voitures dont le prix de vente est supérieur à 3000 : " + voitureList.get(j));
            }
        }
            System.out.println("    ");

            // Voiture la plus chere
        Voiture prixMax = voitureList.get(0);
        String result = null;
            for (int i = 0; i < voitureList.size( ); i++) {
                if (voitureList.get(i).getPrixDeVente() > prixMax.getPrixDeVente()) {
                    prixMax = voitureList.get(i); }
                            }
        System.out.println("Voiture la plus chère : " + prixMax);

            // Affiche Toyota
        result = "Toyota";
            System.out.println(result );


        //Voiture la moins chère
Voiture prixMin= voitureList.get(0);
        for (int i = 0; i < voitureList.size( ); i++) {
            if (voitureList.get(i).getPrixDeVente() > prixMin.getPrixDeVente()) {
                prixMax = voitureList.get(i);
            }

        }

            System.out.println("Voiture la moins chère : " + prixMin);
        System.out.println("    ");

    Date today = new Date ();
    int year = Calendar.getInstance().get(Calendar.YEAR);

        for (int i =0; i< voitureList.size(); i++){
        if (year -5 <= voitureList.get(i).getAnnee()){

            System.out.println( "Liste des voitutres de moins de 5 ans : "+ voitureList.get(i).getAnnee());
    }
}
    }
}






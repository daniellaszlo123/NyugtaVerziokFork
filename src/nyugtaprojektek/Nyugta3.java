package nyugtaprojektek;
/* Probléma:
tüntessük el a kézzel beírt szóközöket,
a huf ne tartalmazzon eurót
a kedvezmény helyett legyen szervízdíj, amit hozzá kell adni a végössdzeghez
*/
class Metodusok{
    String csillagok = "********************";
    String duplaVonal = "====================";
    String szaggatottVonal = "--------------------";
    final String HUF = "Ft";
    int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
    int osszesen = tetel1 + tetel2 + tetel3;
    int szervizDijMertek = 10;
    int szervizDij = osszesen / szervizDijMertek;
    int fizetendo = osszesen + szervizDij;
    double euro = fizetendo / 350.0;
    final String eur = "\u20ac";
    String rovidVonal = "_______";
    String rovidVonalValaszto = "      ";
    
    void tetel1Kiir() {
        System.out.printf("%10s: %5d %s\n", "Tétel 1", tetel1, HUF);
    }
    
    void tetel2Kiir(){
        System.out.printf("%10s: %5d %s\n", "Tétel 2", tetel2, HUF);
    }
    
    void tetel3Kiir(){
        System.out.printf("%10s: %5d %s\n", "Tétel 3", tetel3, HUF);
    }
    
    void cimKiir(){
        System.out.printf("%14s\n", "Nyugta 3");
    }
    
    void csillagKiir(){
        System.out.println(csillagok);
    }
    
    void duplaVonalKiir(){
        System.out.println(duplaVonal);
    }
    
    void osszeg(){
        System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, HUF);
    }
    
    void szaggatottVonalKiir(){
        System.out.println(szaggatottVonal);
    }
    
    void szervizDijKiir(){
        System.out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
    }
    
    void fizetendoKiirHUF(){
        System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
    }
    
    void fizetendoKiirEUR(){
        System.out.printf("%10s%7.2f %s\n","", euro, eur);
    }
    
    void rovidVonalKiir(){
        System.out.print(rovidVonal);
    }
    
    void rovidVonalValasztoKiir(){
        System.out.print(rovidVonalValaszto);
    }
    
    void sortores(){
        System.out.println("");
    }
    
    void nyugtaKezd(){
        csillagKiir();
        cimKiir();
        csillagKiir();
    }
    
    void nyugtaVege(){
        System.out.print(" Dátum");
        rovidVonalValasztoKiir();
        System.out.println("   Név");
        csillagKiir();
        System.out.println("        CÉG");
        csillagKiir();
    }
}
public class Nyugta3 {

    public static void main(String[] args) {
        Metodusok mo = new Metodusok();
        mo.nyugtaKezd();
        
        mo.tetel1Kiir();
        mo.tetel2Kiir();
        mo.tetel3Kiir();
        
        mo.duplaVonalKiir();
        mo.osszeg();
        mo.szaggatottVonalKiir();
        mo.szervizDijKiir();
        mo.sortores();
        
        mo.fizetendoKiirHUF();
        mo.fizetendoKiirEUR();
        mo.szaggatottVonalKiir();
        mo.sortores();
        
        mo.rovidVonalKiir();
        mo.rovidVonalValasztoKiir();
        mo.rovidVonalKiir();
        mo.sortores();
        
        mo.nyugtaVege();
        
//        mo.csillagKiir();
//        mo.cimKiir();
//        mo.csillagKiir();
        
//        System.out.print(" Dátum");
//        mo.rovidVonalValasztoKiir();
//        System.out.println("   Név");
//        mo.csillagKiir();
//        System.out.println("        CÉG");
//        mo.csillagKiir();
        
        
//        String csillagok = "********************";
//        System.out.println(csillagok);
        //System.out.println("     Nyugta 3");
//        System.out.printf("%14s\n", "Nyugta 3");
//        System.out.println(csillagok);
        
//        final String HUF = "Ft";
//        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
//        System.out.printf("Tétel 1:     %d %s\n", tetel1, huf);
//        System.out.printf("Tétel 1:      %d %s\n", tetel2, huf);
//        System.out.printf("Tétel 3:    %d %s\n", tetel3, huf);
//        System.out.printf("%10s: %5d %s\n", "Tétel 1", tetel1, HUF);
//        System.out.printf("%10s: %5d %s\n", "Tétel 2", tetel2, HUF);
//        System.out.printf("%10s: %5d %s\n", "Tétel 3", tetel3, HUF);

//        String duplaVonal = "====================";
//        System.out.println(duplaVonal);
        
//        int osszesen = tetel1 + tetel2 + tetel3;
        //System.out.printf("Összesen:   %d %s\n", osszesen, huf);
//        System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, HUF);
        
//        String szaggatottVonal = "--------------------";
//        System.out.println(szaggatottVonal);
        
//        int szervizDijMertek = 10;
//        int szervizDij = osszesen / szervizDijMertek;
        //System.out.printf("Kedvezmény:  %d %s\n", kedvezmeny, huf);
//        System.out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
//        System.out.printf("(%d%%)\n", szervizDijMertek);
        
//        System.out.println();
        
        //int fizetendo = osszesen - szervizDij;
//        int fizetendo = osszesen + szervizDij;
        //System.out.printf("Fizetendő:  %d %s\n", fizetendo, huf);
//        System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
//        double euro = fizetendo / 350.0;
        //HUF = "\u20ac";//EZ NEM JÓ!!!!
//        final String eur = "\u20ac";
        //System.out.printf("            %f %s\n", euro, eur);
        /* 7.2 7 szélesen 2 tizedessel,a max: 1234.99
        *  a %10s  egy "" -t ír ki, ezzel tolom beljebb
        */
//        System.out.printf("%10s%7.2f %s\n","", euro, eur);//
        
//        System.out.println(szaggatottVonal);
        
//        System.out.println("");
//        String rovidVonal = "_______";
//        System.out.print(rovidVonal);
//        String rovidVonalValaszto = "      ";
//        System.out.print(rovidVonalValaszto);
//        System.out.println(rovidVonal);
//        System.out.print(rovidVonalValaszto);
        
//        System.out.println(csillagok);
//        System.out.println(csillagok);
    }

}

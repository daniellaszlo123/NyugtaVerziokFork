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
    
    void rovidVonalKiir(){
        System.out.print(rovidVonal);
    }
    void rovidVonalValasztoKiir(){
        System.out.print(rovidVonalValaszto);
    }
    void sortores(){
        System.out.println("");
    }
    void csillagKiir(){
        System.out.println(csillagok);
    }
    void duplaVonalKiir(){
        System.out.println(duplaVonal);
    }
    void szaggatottVonalKiir(){
        System.out.println(szaggatottVonal);
    }
    
    void cimKiir(){
        System.out.printf("%14s\n", "Nyugta 3");
    }
    
    void tetel1Kiir() {
        System.out.printf("%10s: %5d %s\n", "Tétel 1", tetel1, HUF);
    }
    
    void tetel2Kiir(){
        System.out.printf("%10s: %5d %s\n", "Tétel 2", tetel2, HUF);
    }
    
    void tetel3Kiir(){
        System.out.printf("%10s: %5d %s\n", "Tétel 3", tetel3, HUF);
    }    
    
    void nyugtaKezd(){
        csillagKiir();
        cimKiir();
        csillagKiir();
    }
    
    void tetelekKiir(){
        tetel1Kiir();
        tetel2Kiir();
        tetel3Kiir();
    }
    
    void osszeg(){
        System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, HUF);
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
    
    void nyugtaVege(){
        System.out.print(" Dátum");
        rovidVonalValasztoKiir();
        System.out.printf("%6s\n","Név");
        csillagKiir();
        System.out.printf("%12s\n","CÉG");
        csillagKiir();
    }
}
public class Nyugta3 {

    public static void main(String[] args) {
        Metodusok mo = new Metodusok();
        mo.nyugtaKezd();
        
        mo.tetelekKiir();
        
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
    }

}

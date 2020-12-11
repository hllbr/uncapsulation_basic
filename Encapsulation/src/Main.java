
public class Main {
    /*
    Encapsulation = bir sınıfın detaylarını yani özelliklerini başka bir sınıftan gizlemektir.
    bunin için bir sınıfın özelliklerini public dğeil private olarak tanımlıyorduk (B u genel oalrak uncapsulation özetidir.)
    //Source = Mustafa Murat COŞKUN / UDEMY referans alınarak geliştirilmiştir..
    
    */
    public static void main(String[] args) {
        Abone abone = new Abone();
        abone.isim = "hllbr";
        abone.bakiye = 588 ;
        abone.sehir = "Sivas";
        abone.doğalgaz_kullan(600);
        abone.doğalgaz_kullan(588);
        abone.doğalgaz_kullan(0);
        Gelismis_Abone ga = new Gelismis_Abone("hllbr",120,"istanbul");
    
    
        }
    
}

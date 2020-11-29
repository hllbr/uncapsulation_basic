
public class Abone {
    public String isim ;
    public int bakiye ;
    public String sehir ; 
    //burada public tanımlama ile uncapsulatin'â aykırı birim oluşturduk 
    //şuana kadar sıkıntı olmadı 
    /*
    bakiyeye direk oalrak ulaşabildik
    bir kere bakiye limitini aşacak bir değer verdik ve sıkıntı ile karşılaşmadık 
    public yerine private yapsaydık böyle saçma bir değer vermemize müsade etmezdi
    2)şu ana kadar 3 adet özellik tanımladık eğer biz 15 tane özellik tanımlasaydık tek tgek atama yapmak zorunda KALACAKTIK 
    constructor oluşturarak yapsaydık hem daha kolay olacaktı hemde herhangi bir değeri unutma şansımız ortadan kalkacaktı 
    3)bir özelliğin ismini değiştirirsen tüm projede isimlendirmelerinde oynama yapmak zorunda kalacaktın 
    */
    public void doğalgaz_kullan (int miktar) {
        if((this.bakiye -miktar)< 0){
            System.out.println("Yeterli bakiye yok ");
            
        }else {
            this.bakiye-= miktar ;
            
            System.out.println("bakiye = " +this.bakiye);
            if(this.bakiye<= 0){
                System.out.println("bakiyeniz bitmiştir. Lütfen en yakın abone merekezine gidin...\n" +
                                    "Kredi Lİmiti = 120 TL");
            }else{
                System.out.println("Yeni bakiye = "+ bakiye);
            }
        }
    }
    public void bakiye_ogren(){
        System.out.println("Bakiye : " +bakiye);
    }
    
    
}

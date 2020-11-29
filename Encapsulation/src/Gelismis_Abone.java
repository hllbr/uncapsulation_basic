
public class Gelismis_Abone {
    //abone class içerisinde bulunan ifadelerimizi uncapsulation ile ifade ederek kolaylıkları ve zorlukları test ediyoruz.
    private  int bakıye = 120 ;
    private String isim ;
    private String sehir ;

    Gelismis_Abone(String hllbr, int i, String tanbul) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void Gelismis_Abone(String isim,int bakiye,String sehir){
      
        this.isim = isim ;
        this.sehir = sehir ;
        if(bakiye>=0 && bakiye<=120){
              this.bakıye = bakiye ;
          
        }
    }
        public void doğalgaz_kullan (int miktar) {
        if((this.bakıye -miktar)< 0){
            System.out.println("Yeterli bakiye yok ");
            
        }else {
            this.bakıye-= miktar ;
            
            System.out.println("bakiye = " +this.bakıye);
            if(this.bakıye<= 0){
                System.out.println("bakiyeniz bitmiştir. Lütfen en yakın abone merekezine gidin...\n" +
                                    "Kredi Lİmiti = 120 TL");
            }else{
                System.out.println("Yeni bakiye = "+ bakıye);
            }
        }
    }
    public void bakiye_ogren(){
        System.out.println("Bakiye : " +bakıye);
    }
    /*
    public yapıyı değersiz oluşturmuştuk ama şimdi değer vermeden işlem yapamayız değer vermemzi şart haline geldi 
    eğer 120 den büyük yada 0 dan küçük bir bakiye girersek işlemimiz yapılamayacak .
    bu şekilde koyduğumuz kurallardan biri işler hale gelmiş oldu .
    eğer bir classın isminde değişiklik yapacaksanız sadece burda yapmanız yeterli hale geldi.
    */
}

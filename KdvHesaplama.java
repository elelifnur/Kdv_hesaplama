import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        double urun,ksız,tutar,oran=0.18;

        Scanner inp = new Scanner(System.in);

        System.out.print("Ürünün fiyatı nedir? : ");
        urun = inp.nextDouble();


        tutar = urun * oran ;
        ksız = urun- tutar;

        System.out.println("KDV'siz Fiyat: "+ ksız);
        System.out.println("KDV^li Fiyat: "+ urun);
        System.out.println("KDV tutarı= " + tutar);




    }
}

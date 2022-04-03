package Giris;
import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, yas, tıp;
        System.out.print("mesafeyi kilometre türünden girin: ");
        km = input.nextInt();
        System.out.print("yasinizi girin:");
        yas = input.nextInt();
        System.out.println("yolculuk tipini secin.1-Tek yön ,2-Gidiş-Dönüş");
        tıp = input.nextInt();
        double normaltutar = km * (0.10);
        System.out.println("normal tutar" +normaltutar);
        if (yas < 0) {
            System.out.println("hatalı veri girdiniz...");
        } else if (km < 0) {
            System.out.println("hatalı veri girdiniz...");
        } else if (tıp != 1 && tıp != 2) {
            System.out.println("hatalı veri girdiniz...");
        } else {
            System.out.println("devam edelim");
        }


        if (yas < 12) {
            if (tıp == 2) {
                double indirimlitutar = normaltutar - (normaltutar * 0.5);
                double indirimlitutar2 = indirimlitutar - (indirimlitutar * 0.2);
                System.out.println("tutar" + (2 * indirimlitutar2));
            } else if(tıp==1){
                double indirimlitutar = normaltutar - (normaltutar * 0.5);
                System.out.println("tutar" + indirimlitutar);
            }

        } else if (yas >= 12 && yas <= 24) {

            if (tıp == 2) {
                double indirimlitutar = normaltutar - (normaltutar * 0.1);
                double indirimlitutar2 = indirimlitutar - (indirimlitutar * 0.2);
                System.out.println("tutar" + (2 * indirimlitutar2));
            } else if(tıp==1) {
                double indirimlitutar = normaltutar - (normaltutar * 0.1);
                System.out.println("tutar" + indirimlitutar);

            }

        } else if (yas > 65) {
            if (tıp == 2) {
                double indirimlitutar = normaltutar - (normaltutar * 0.3);
                double indirimlitutar2 = indirimlitutar - (indirimlitutar * 0.2);
                System.out.println("tutar" + (2 * indirimlitutar2));
            } else  if(tıp==1) {
                double indirimlitutar = normaltutar - (normaltutar * 0.3);
                System.out.println("tutar" + indirimlitutar);

            }


        }else if(yas > 24 && yas < 65) {
            if (tıp == 2) {
                double indirimlitutar = normaltutar - (normaltutar * 0.2);
                System.out.println("tutar" + (2 * indirimlitutar));
            } else if (tıp == 1) {
                System.out.println("tutar" + normaltutar);
            }
        }

    }
}

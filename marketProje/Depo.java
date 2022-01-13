package marketProje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Depo {
    Scanner scan = new Scanner(System.in);
    List<Urun> sepet = new ArrayList<>();
    String sec;

    void anaMenu() {

        System.out.println("*******************************\nZeynep Market'e Hoşgeldiniz\n*******************************");
        System.out.println("Bolumler:\n1)Manav\n2)Sarkuteri\n3)Market\n4)Cikis\nAlisveris yapmak istediğiniz bolumu seçiniz: ");
        String secim = scan.next();
        switch (secim) {
            case "1": //manav
                manavUrun();
                break;
            case "2": //sarkuteri
                sarkuteriUrun();
                break;
            case "3": // maerket
                marketUrun();
                break;
            case "4":
                System.out.println("İyi gunler, yine bekleriz");
                break;
            default:
                System.out.println("Hatalı islem...");
                anaMenu();
        }
    }

    void manavUrun() {

        Urun manav1 = new Urun(0, "Domates", 2.10);
        Urun manav2 = new Urun(1, "Patates", 3.20);
        Urun manav3 = new Urun(2, "Biber", 1.50);
        Urun manav4 = new Urun(3, "Havuc", 3.10);
        Urun manav5 = new Urun(4, "Elma", 1.20);
        Urun manav6 = new Urun(5, "Muz", 1.90);
        Urun manav7 = new Urun(6, "Cilek", 6.10);
        Urun manav8 = new Urun(7, "Kavun", 4.30);
        Urun manav9 = new Urun(8, "Uzum", 2.70);
        Urun manav10 = new Urun(9, "Limon", 0.50);
        List<Urun> manav = new ArrayList<>(Arrays.asList(manav1, manav2, manav3, manav4, manav5, manav6, manav7, manav8, manav9, manav10));

        System.out.println("***MANAV BOLUMU***");
        System.out.println(" No\t    Urun \t   Fiyat");
        System.out.println("====    =====      =====");
        for (Urun u : manav) {
            System.out.println(u.getNo() + "\t\t" + u.getUrunAdi() + "\t\t" + u.getFiyat());
        }
        System.out.println("Urun no' su ile seçim yapınız: ");
        int secim = scan.nextInt();
        for (Urun u : manav) {
            if (secim == u.getNo()) {
                System.out.println("Almak istediğiniz urun: " + u.getUrunAdi() + "Fiyatı: " + u.getFiyat() + " Kac kilo almak istediginizi giriniz: ");
                int kilo = scan.nextInt();
                sepet.add(new Urun(u.getNo(), u.getUrunAdi(), (u.getFiyat() * kilo)));
                break;
            }

        }
        System.out.println("Sepetiniz: " + sepet);
        System.out.println("Manav bolumu için 1'e, Ana menu için 2 ye, Odeme islemi icin 3'e basınız.");
        sec = scan.next();
        switch (sec) {
            case "1":
                manavUrun();
                break;
            case "2":
                anaMenu();
                break;
            case "3":
                odeme();
                break;
            default:
                System.out.println("Hatalı tercih..");
                manavUrun();
        }


    }

    void sarkuteriUrun() {
        Urun sar1 = new Urun(1, "Peynir", 5.50);
        Urun sar2 = new Urun(2, "Salam", 7.50);
        Urun sar3 = new Urun(3, "Sucuk", 10.50);
        Urun sar4 = new Urun(4, "Zeytin", 20.50);
        Urun sar5 = new Urun(5, "Sosis", 7.50);
        List<Urun> sarkuteri = new ArrayList<>(Arrays.asList(sar1, sar2, sar3, sar4, sar5));

        System.out.println("***SARKUTERI BOLUMU***");
        System.out.println(" No\t    Urun \t   Fiyat");
        System.out.println("====    =====      =====");

        for (Urun u : sarkuteri) {
            System.out.println(u.getNo() + "\t\t" + u.getUrunAdi() + "\t\t" + u.getFiyat());
        }
        System.out.println("Urun no' su ile seçim yapınız: ");
        int secim = scan.nextInt();
        for (Urun u : sarkuteri) {
            if (secim == u.getNo()) {
                sepet.add(new Urun(u.getNo(), u.getUrunAdi(), u.getFiyat()));
            }

        }
        System.out.println("Sepetiniz: " + sepet);
        System.out.println("Sarkuteri bolumu için 1'e, Ana menu için 2 ye, Odeme islemi icin 3'e basınız.");
        sec = scan.next();
        switch (sec) {
            case "1":
                sarkuteriUrun();
                break;
            case "2":
                anaMenu();
                break;
            case "3":
                odeme();
                break;
            default:
                System.out.println("Hatalı tercih..");
                sarkuteriUrun();
        }


    }

    void marketUrun() {
        Urun market1 = new Urun(1, "Cikolata", 1.5);
        Urun market2 = new Urun(2, "Kola", 2.5);
        Urun market3 = new Urun(3, "Un", 5.0);
        Urun market4 = new Urun(4, "Bulgur", 3.0);
        Urun market5 = new Urun(5, "Princ", 2.5);
        List<Urun> market = new ArrayList<>(Arrays.asList(market1, market2, market3, market4, market5));

        System.out.println("***MARKET BOLUMU***");
        System.out.println(" No\t    Urun \t   Fiyat");
        System.out.println("====    =====      =====");
        for (Urun u : market) {
            System.out.println(u.getNo() + "\t\t" + u.getUrunAdi() + "\t\t" + u.getFiyat());
        }

        secim(market);

        System.out.println("Sepetiniz: " + sepet);
        System.out.println("Market bolumu için 1'e, Ana menu için 2 ye, Odeme islemi icin 3'e basınız.");
        sec = scan.next();
        switch (sec) {
            case "1":
                marketUrun();
                break;
            case "2":
                anaMenu();
                break;
            case "3":
                odeme();
                break;
            default:
                System.out.println("Hatalı tercih..");
                marketUrun();
        }
    }

    void secim(List<Urun> market) {
        System.out.println("Urun no' su ile seçim yapınız: ");
        int secim = scan.nextInt();
        for (Urun u : market) {
            if (secim == u.getNo()) {
                sepet.add(new Urun(u.getNo(), u.getUrunAdi(), u.getFiyat()));
            }

        }
    }


    void odeme() {
        double toplam = 0;
        System.out.println("***Odeme Islemleri***\nSepetteki Urunleriniz: ");
        System.out.println(" No\t    Urun \t   Fiyat");
        System.out.println("====    =====      =====");
        for (Urun u : sepet) {
            System.out.println(u.getNo() + "   " + u.getUrunAdi() + "   " + u.getFiyat());
            toplam += u.getFiyat();

        }
        System.out.println("Odemeniz gereken toplam tutar: " + toplam);
        System.out.println("Sepete urun eklemek icin 1'e, urun cıkarmak icin 2'e, odeme icin 3'e basın.");

        String sec = scan.next();
        switch (sec) {
            case "1":
                anaMenu();
                break;
            case "2":
                urunSil();
                break;
            case "3":
                odemeSon(toplam);
                break;
            default:
                System.out.println("Hatalı tercih..");
                odeme();
        }
    }

    private void odemeSon(double toplam) {

        System.out.println("Odemeniz gereken toplam tutar: " + toplam);
        double nakit = 0;
        do {
            System.out.print("Odemenizi giriniz: ");

            nakit += scan.nextDouble();
            if (nakit < toplam) {
                System.out.println("eksik odeme yaptiniz " + (toplam - nakit) + " daha odeme yapiniz");
            }
        }
        while (nakit < toplam);
        double paraUstu = nakit - toplam;
        if (paraUstu > 0) {
            System.out.println("Para ustunuz : " + paraUstu);
        }

        System.out.println("yine bekleriz iyi gunler");
    }

    void urunSil() {

        boolean kontrol = false;
        if (!sepet.isEmpty()) {
            System.out.println("Cikarmak istediginiz urunun ismini giriniz: ");
            String sil = scan.next();
            for (int i = 0; i < sepet.size(); i++) {
                if (sil.equalsIgnoreCase(sepet.get(i).getUrunAdi())) {
                    System.out.println("Cikardiginiz urun: " + sepet.get(i));
                    sepet.remove(sepet.get(i));
                    kontrol = true;

                }
            }
            if (!kontrol) {
                System.out.println("Lutfen urun ismini dogru giriniz");
                urunSil();
            } else {
                System.out.println("Istenilen urun cikarilmistir");
                odeme();
            }
        } else {
            System.out.println("Sepette urun bulunmamaktadir");
            anaMenu();
        }

    }


}

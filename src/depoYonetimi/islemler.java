package depoYonetimi;

import java.util.*;

import static depoYonetimi.urunTanimlama.*;

public class islemler {
    static Scanner scan=new Scanner(System.in);
    public static List<String> urunList= new ArrayList<>();
    public static void girisPaneli(){
        System.out.println("====================================\nDEPO YONETIM PANELI\n" +
                "====================================\n"
                + "1- URUN TANIMLAMA\n2- URUN LİSTELE\n3- URUN GİRİŞİ\n4- URUNU RAFA KOY\n5- URUN ÇIKIŞI");
        System.out.print("isleminiz seciniz : ");
        String secim= scan.next().toUpperCase(Locale.ROOT);
        switch (secim){
            case "1":
                urunTanımla();
                girisPaneli();
                break;
            case "2": //Jasmina, zeynep, merve
                urunListele();
                girisPaneli();
                break;
            case "3": // oğuzhan, fatih
                urunGirisi();
                girisPaneli();
                break;
            case "4"://gökhan, hüseyin
                urunuRafaKoy();
                girisPaneli();
                break;
            case "5":// defne, şule
                urunCikisi();
                girisPaneli();
                break;
            default:
                System.out.println("hatalı giriş yapınız");
                girisPaneli();
                break;
        }
    }
    private static void urunCikisi() {
        urunListeYazdir();
    }
    private static void urunuRafaKoy() {
        urunListeYazdir();
    }
    private static void urunGirisi() {
        urunListeYazdir();
    }
    private static void urunListele() {
        urunListeYazdir();
    }
    private static void urunTanımla() {
        //List<String> urunList= new ArrayList<>();
        //urunTanimlama     ==>  urunun ismi, ureticisi ve birimi girilecek. id  alınacak.
        System.out.println("ürün ismi giriniz: ");
        urunIsmi=scan.next();
        urunList.add(urunIsmi);
        //scan.next();
        System.out.println("üreticisini giriniz: ");
        uretici=scan.next();
        urunList.add(uretici);
        //scan.next();
        System.out.println("birimi giriniz: ");
        birim=scan.next();
        urunList.add(birim);
        //scan.next();
        System.out.println("id giriniz: ");
        urunId=scan.nextInt();
        Map<Integer, List> urunListesiMap = new HashMap<Integer,List>();
        urunListesiMap.put(urunId,urunList);
        System.out.println(urunListesiMap);
    }
    private static void urunListeYazdir() {
        urunListeYazdir();
    }

    private static void giris() {
        System.out.println("   ***      urun icin giris sayfası     ***");

        System.out.print("Giris yapmak istediginiz urunun ID sini giriniz : ");
        int arananId = scan.nextInt();

        boolean flag = true;
        for (String u : urunList) {
            if (urunId == arananId) {
                System.out.print("girmek istediginiz değeri yazınız : ");
                int giris = scan.nextInt();
                if (giris > 0) {
                    urunMiktar += giris;
                    System.out.println("miktar eklendi....");
                } else {
                    System.out.println("giris yaparken eksi deger girmeyiniz");
                }
                flag = false;
                break;
            }

        }
        if (flag) {
            System.out.println("Giris yapmak istediginiz urun bulunamadı....");
        }


    }


}
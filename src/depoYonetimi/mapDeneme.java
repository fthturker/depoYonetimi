package depoYonetimi;

import java.util.*;

public class mapDeneme {

    static Scanner scan=new Scanner(System.in);
    //id /urunIsmi/ uretici/ miktar/ birim/ raf
    public static int id=1000;
    public static String urunIsmi;
    public static String uretici;
    public static String miktar;
    public static String birim;
    public static String raf="raf1";
    //public static String [] arr={urunIsmi, uretici, miktar, birim, raf};
    public static List<String> list= new ArrayList<>();
    public static void main(String[] args) {
        // List<String> list= Arrays.asList(arr);
        System.out.println("ürün ismi giriniz: ");
        urunIsmi=scan.nextLine();
        list.add(urunIsmi);
        //scan.next();
        System.out.println("üreticisini giriniz: ");
        uretici=scan.nextLine();
        list.add(uretici);
        //scan.next();
        System.out.println("miktarini giriniz: ");
        miktar=scan.nextLine();
        list.add(miktar);
        //scan.next();
        System.out.println("birimi giriniz: ");
        birim=scan.nextLine();
        list.add(birim);
        //scan.next();
        Map<Integer, List> urunListesiMap = new HashMap<Integer,List>();
        urunListesiMap.put(id, list);
        System.out.println(urunListesiMap);
    }
}
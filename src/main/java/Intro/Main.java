package Intro;

public class Main {

    //main javada başlangıç noktasıdır.
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //değişken isimlendirilmeleri javada "camelCase" yazılır.
        String metin = "İlginizi Çekebilir";
        String altMetin = "Vade Süresi";

        System.out.println(metin);
        System.out.println(altMetin);

        int vade = 36; //integer


        double dolarDun = 18.15;
        double dolarBugun = 18.10;

        boolean dolarDustuMu = true;

        String okYonu = "";


        if (dolarBugun < dolarDun) { //true
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun>dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        //array
        String[] krediler = {"Hızlı Kredi", "Maaşını Halkbanktan alanlar","mutlu emekli"};

        for (int i = 0; i<krediler.length; i++){
            System.out.println(krediler[i]);
    }
    }
}


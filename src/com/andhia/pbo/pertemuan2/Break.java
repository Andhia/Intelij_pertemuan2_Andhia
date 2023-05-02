package com.andhia.pbo.pertemuan2;

public class Break {

    public static void main(String[] args) {
        int p = 0;
        while (p <= 100){
            System.out.println("perulangan ke" + p);
            if (p == 50){
                System.out.println("capek bro");
                break;
            }
            p += 10;
        }
    }
}

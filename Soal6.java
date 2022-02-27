package com.sda;
import java.util.ArrayList;

public class Soal6 {
    //Tentukan hasil yang didapat jika dilakukan perintah add(0,e), add(2,f), add(3,g),add(6,h),add(-3,j)
    public static void main(String[] args) {
        //String[] nama = {"A","N","D","A"};
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("A");
        nama.add("N");
        nama.add("D");
        nama.add("A");
    
        nama.add(0,"e");
        System.out.println("Elemen setelah ditambahkan string e " + nama);
    
        nama.add(2,"f");
        System.out.println("Elemen setelah ditambahkan string f " + nama);
    
        nama.add(3,"g");
        System.out.println("Elemen setelah ditambahkan string g " + nama);
    
        nama.add(4,"h");
        System.out.println("Elemen setelah ditambahkan string h " + nama);
    
        nama.add(6,"h");
        System.out.println("Elemen setelah ditambahkan string h " + nama);
    
        nama.add(-3,"j");
        System.out.println("Elemen setelah ditambahkan string j " + nama);
        }
}

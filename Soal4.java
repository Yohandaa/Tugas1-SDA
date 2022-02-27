package com.sda;
import java.util.ArrayList;

public class Soal4 {
    //tentukan hasil yang didapat ketika dilakukan perintah
    //indexof(a),indexof(c),indexof(q)
public static void main(String[] args) {
    //String[] nama = {"A","N","D","A"};
    ArrayList<String> nama = new ArrayList<String>();
    nama.add ("A");
    nama.add ("N");
    nama.add ("D");
    nama.add ("A");
    
    System.out.println(nama.indexOf("a"));
    System.out.println(nama.indexOf("c"));
    System.out.println(nama.indexOf("q"));
    }
}

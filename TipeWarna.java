/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.latihan40;

/**
 *
 * @author
 * NAMA     : aditiya musthafa kamil
 * KELAS    : IF-2
 * NIM      : 10119075
 * Deskripsi Program : Class untuk objek tipe warna
 * 
 * 
 */
public class TipeWarna {
    protected String ANSI_CODE, ANSI_CODE_BACKGROUND, namaWarna, namaWarna_F, 
            stripWarna;
    protected final String ANSI_RESET = "\u001B[0m";
    protected final String ANSI_PUTIH = "\u001B[37m";
    
    protected String warnai(String teks) {
        return ANSI_RESET.concat(ANSI_CODE).concat(teks).concat(ANSI_RESET);
    }
    
    protected void printBoxWarna() {
        System.out.println(ANSI_RESET.concat(ANSI_CODE_BACKGROUND).
                concat(ANSI_PUTIH.concat(stripWarna)).
                concat(ANSI_RESET));
    }
    
    protected void kepribadian(String nama) {}
}
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
 * Deskripsi Program : Class untuk objek hijau
 * 
 * 
 */
public class Toska extends TipeWarna {
    public Toska() {
        ANSI_CODE = "\u001B[36m";
        ANSI_CODE_BACKGROUND = "\u001B[46m";
        namaWarna = "TOSKA";
        namaWarna_F = ANSI_RESET.concat(ANSI_CODE).
                concat(namaWarna).concat(ANSI_RESET);
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class Mahasiswa {
    //atribut class mahasiswa
    private String nim;
    private String nama;
    private String alamat;

    //Constructor
    public Mahasiswa(String nim, String nama, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
    }
    //method untuk mendapatkan nilai nama, nim, dan alamat dari
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
} 
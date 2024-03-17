import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mahasiswa1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in); //objek Scanner untuk input dari pengguna
        boolean next = true; //variabel menentukan apakah akan menambah data mahasiswa lagi 

        while (next) {
            System.out.print("Masukkan NIM : "); //meminta input 
            String nim = scanner.nextLine(); //membaca input 

            System.out.print("Masukkan Nama : "); 
            String nama = scanner.nextLine(); 

            System.out.print("Masukkan Alamat : "); 
            String alamat = scanner.nextLine(); 

            //menambah objek baru ke dalam ArrayList
            mahasiswa1.add(new Mahasiswa(nim, nama, alamat));
            //meminta konfirmasi ingin menambah data lagi atau tidak
            System.out.print("Tambah lagi? "); 
            String tambah = scanner.nextLine();

            if (tambah.equals("t")) { //jika konfirmasi "t", maka menghentikan loop
                next = false; //mengubah nilai next menjadi false agar loop berhenti
            }
        }
        //outup pembatas sebelum menampilkan info
        System.out.println("==================================");
        for (Mahasiswa mahasiswa : mahasiswa1) { //menampilkan informasi mahasiswa
            System.out.println(mahasiswa.getNim() + " | " + mahasiswa.getNama() + " | " + mahasiswa.getAlamat());
        }
    }
}
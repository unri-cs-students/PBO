package com.sammidev.tugas3;

public class App {
    public static void main(String[] args) {

        // obj sammi
        Mahasiswa sammi = new Mahasiswa();
        // obj sam
        Mahasiswa sam = new Mahasiswa();
        // obj dev
        Mahasiswa dev = new Mahasiswa();

        // fill all data for obj sammi
        sammi.setNama("Sammi Aldhi Yanto");
        sammi.setNim("200311xxx");
        sammi.setProdi(Prodi.SISTEM_INFORMASI);
        sammi.setJurusan("ILMU KOMPUTER");
        sammi.setAngkatan(2020);
        sammi.setEmail("sammidev@gmail.com");
        sammi.setNomorTelp("08238732444");
        sammi.setKIP(true);

        // fill all data for obj sam
        sam.setNama("Sam");
        sam.setNim("200312xxx");
        sam.setProdi(Prodi.MANAJEMEN_INFORMATIKA);
        sam.setJurusan("ILMU KOMPUTER");
        sam.setAngkatan(2020);
        sam.setEmail("sam@gmail.com");
        sam.setNomorTelp("08238732444");
        sam.setKIP(false);

        // fill all data for obj dev
        dev.setNama("Dev");
        dev.setNim("200313xxx");
        dev.setProdi(Prodi.MANAJEMEN_INFORMATIKA);
        dev.setJurusan("ILMU KOMPUTER");
        dev.setAngkatan(2020);
        dev.setEmail("dev@gmail.com");
        dev.setNomorTelp("08238732444");
        dev.setKIP(false);

        // show data for sammi
        System.out.println(sammi.toString());
        // show data for sam
        System.out.println(sam.toString());
        // show data for dev
        System.out.println(dev.toString());

        // access totalMahasiswa/static member
        int expected = 3;
        if (Mahasiswa.getTotalMahasiswa() == expected) {
            System.out.println("total mahasiswa : " + Mahasiswa.getTotalMahasiswa());
        }
    }
}

class Mahasiswa {

    // Static or Class members
    private static int totalMahasiswa = 1;

    // Instance members
    private final int id = this.totalMahasiswa;
    private String nama;
    private String nim;
    private Prodi prodi;
    private String jurusan;
    private int angkatan;
    private String email;
    private String nomorTelp;
    private boolean KIP;

    // no args constructor
    Mahasiswa(){
        this.totalMahasiswa++;
    }

    // all args constructor
    public Mahasiswa(String nama,
                     String nim,
                     Prodi prodi,
                     String jurusan,
                     int angkatan,
                     String email,
                     String nomorTelp,
                     boolean KIP) {
        this.totalMahasiswa++;
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
        this.email = email;
        this.nomorTelp = nomorTelp;
        this.KIP = KIP;
    }


    // getter for id
    public int getId() {
        return id;
    }

    // getter and setter for Static or Class members
    public static int getTotalMahasiswa() {
        return totalMahasiswa-1;
    }
    public static void addMahasiswa(int totalMahasiswa) {
        Mahasiswa.totalMahasiswa += 1;
    }

    // getter and setter for name
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    // getter and setter for nim
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }

    // getter and setter for prodi
    public Prodi getProdi() {
        return prodi;
    }
    public void setProdi(Prodi prodi) {
        this.prodi = prodi;
    }

    // getter and setter for jurusan
    public String getJurusan() {
        return jurusan;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    // getter and setter for angkatan
    public int getAngkatan() {
        return angkatan;
    }
    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    // getter and setter for email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // getter and setter for nomorTelp
    public String getNomorTelp() {
        return nomorTelp;
    }
    public void setNomorTelp(String nomorTelp) {
        this.nomorTelp = nomorTelp;
    }

    // getter and setter for isKIP
    public boolean isKIP() {
        return KIP;
    }
    public void setKIP(boolean KIP) {
        this.KIP = KIP;
    }

    // to string
    @Override
    public String toString() {
        return "Mahasiswa [" +
                "id = " + id +
                "] -> nama='" + nama + '\'' +
                ", nim='" + nim + '\'' +
                ", prodi=" + prodi +
                ", jurusan='" + jurusan + '\'' +
                ", angkatan=" + angkatan +
                ", email='" + email + '\'' +
                ", nomorTelp='" + nomorTelp + '\'' +
                ", KIP=" + KIP +
                '}';
    }
}

// enum for Prodi
enum Prodi {
    SISTEM_INFORMASI, MANAJEMEN_INFORMATIKA
}
package com.example.coronadata;

import androidx.constraintlayout.solver.LinearSystem;

import java.io.Serializable;
import java.util.List;

public class Provinsi implements Serializable {
    private String key;
    private float doc_count;
    private long jumlah_kasus;
    private int jumlah_sembuh;
    private int jumlah_meninggal;
    private int jumlah_dirawat;
    private List<Jenkel> jenis_kelamin;
    private List<Umur> kelompok_umur;
    private Tambah penambahan;

    public Provinsi(String key, float doc_count, long jumlah_kasus, int jumlah_sembuh, int jumlah_meninggal, int jumlah_dirawat, List<Jenkel> jenis_kelamin, List<Umur> kelompok_umur, Tambah penambahan) {
        this.key = key;
        this.doc_count = doc_count;
        this.jumlah_kasus = jumlah_kasus;
        this.jumlah_sembuh = jumlah_sembuh;
        this.jumlah_meninggal = jumlah_meninggal;
        this.jumlah_dirawat = jumlah_dirawat;
        this.jenis_kelamin = jenis_kelamin;
        this.kelompok_umur = kelompok_umur;
        this.penambahan = penambahan;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public float getDoc_count() {
        return doc_count;
    }

    public void setDoc_count(float doc_count) {
        this.doc_count = doc_count;
    }

    public long getJumlah_kasus() {
        return jumlah_kasus;
    }

    public void setJumlah_kasus(long jumlah_kasus) {
        this.jumlah_kasus = jumlah_kasus;
    }

    public int getJumlah_sembuh() {
        return jumlah_sembuh;
    }

    public void setJumlah_sembuh(int jumlah_sembuh) {
        this.jumlah_sembuh = jumlah_sembuh;
    }

    public int getJumlah_meninggal() {
        return jumlah_meninggal;
    }

    public void setJumlah_meninggal(int jumlah_meninggal) {
        this.jumlah_meninggal = jumlah_meninggal;
    }

    public int getJumlah_dirawat() {
        return jumlah_dirawat;
    }

    public void setJumlah_dirawat(int jumlah_dirawat) {
        this.jumlah_dirawat = jumlah_dirawat;
    }

    public List<Jenkel> getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(List<Jenkel> jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public List<Umur> getKelompok_umur() {
        return kelompok_umur;
    }

    public void setKelompok_umur(List<Umur> kelompok_umur) {
        this.kelompok_umur = kelompok_umur;
    }

    public Tambah getPenambahan() {
        return penambahan;
    }

    public void setPenambahan(Tambah penambahan) {
        this.penambahan = penambahan;
    }
}
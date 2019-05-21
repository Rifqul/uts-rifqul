package com.example.uts_akb_ammarrifqula_10116116.Model;

public class ModelTeman {

    private String nim;

    private String nama;

    private String kelas;

    private String telepon;

    private String email;

    private String socialmedia;





    public ModelTeman(String nim,String nama,String kelas,String telepon,String email,String socialmedia) {

        this.nama = nama;

        this.nim = nim;

        this.kelas = kelas;

        this.telepon = telepon;

        this.email = email;

        this.socialmedia = socialmedia;



    }





    public void setNama(String nama) {

        this.nama = nama;

    }

    public String getNama() {

        return nama;

    }



    public void setNim(String nim) {

        this.nim = nim;

    }

    public String getNim() {

        return nim;

    }



    public void setKelas(String kelas) {

        this.kelas = kelas;

    }

    public String getKelas() {

        return kelas;

    }



    public void setTelepon(String telepon) {

        this.telepon = telepon;

    }

    public String getTelepon() {

        return telepon;

    }



    public void setEmail(String email) {

        this.email = email;

    }

    public String getEmail() {

        return email;

    }



    public void setSocialmedia(String socialmedia) {

        this.socialmedia = socialmedia;

    }

    public String getSocialmedia() {

        return socialmedia;

    }











}

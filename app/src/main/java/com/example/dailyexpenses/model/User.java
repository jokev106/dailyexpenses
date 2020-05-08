package com.example.dailyexpenses.model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    private String uang;
    private String tanggal;
    private String catatan;
    private String nama;


    public User( String uang, String tanggal, String catatan, String nama) {
        this.uang = uang;
        this.tanggal = tanggal;
        this.catatan = catatan;
        this.nama = nama;
    }


    public User(Parcel in) {
        uang = in.readString();
        tanggal = in.readString();
        catatan = in.readString();
        nama = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getUang() {
        return uang;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getCatatan() {
        return catatan;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(uang);
        dest.writeString(tanggal);
        dest.writeString(catatan);
        dest.writeString(nama);
    }
}

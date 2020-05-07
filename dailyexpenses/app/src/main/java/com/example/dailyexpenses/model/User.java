package com.example.dailyexpenses.model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    private String uang;
    private String tanggal;
    private String catatan;

    public User( String uang, String tanggal, String catatan) {
        this.uang = uang;
        this.tanggal = tanggal;
        this.catatan = catatan;

    }

    protected User(Parcel in) {
        uang = in.readString();
        tanggal = in.readString();
        catatan = in.readString();
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(uang);
        dest.writeString(tanggal);
        dest.writeString(catatan);
    }
}

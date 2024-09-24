/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Reader {
    private String ma, ten, gioi_tinh, dia_chi, email, sdt;
    private String ngay_sinh, ngay_lap_the, ngay_het_han;
    private int stt;

    public Reader(String ma, String ten, String gioi_tinh, String dia_chi, String email, String sdt, String ngay_sinh, String ngay_lap_the, String ngay_het_han, int stt) {
        this.ma = ma;
        this.ten = ten;
        this.gioi_tinh = gioi_tinh;
        this.dia_chi = dia_chi;
        this.email = email;
        this.sdt = sdt;
        this.ngay_sinh = ngay_sinh;
        this.ngay_lap_the = ngay_lap_the;
        this.ngay_het_han = ngay_het_han;
        this.stt = stt;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setNgay_sinh(String ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public void setNgay_lap_the(String ngay_lap_the) {
        this.ngay_lap_the = ngay_lap_the;
    }

    public void setNgay_het_han(String ngay_het_han) {
        this.ngay_het_han = ngay_het_han;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public String getEmail() {
        return email;
    }

    public String getSdt() {
        return sdt;
    }

    public String getNgay_sinh() {
        return ngay_sinh;
    }

    public String getNgay_lap_the() {
        return ngay_lap_the;
    }

    public String getNgay_het_han() {
        return ngay_het_han;
    }

    public int getStt() {
        return stt;
    }

 
    
    public Object[] toObject(){
        return new Object[]{
          stt, ma, ten, ngay_sinh, gioi_tinh, dia_chi, email, sdt, ngay_lap_the, ngay_het_han
        };
    }
    
}

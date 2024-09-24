/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Book {
    
    private String ma, ten, tg, nxb, tl;
    private int stt, sl, price;

    public Book() {
        
    }

    public Book(String ma, String ten, String tg, String nxb, String tl, int stt, int sl, int price) {
        this.ma = ma;
        this.ten = ten;
        this.tg = tg;
        this.nxb = nxb;
        this.tl = tl;
        this.stt = stt;
        this.sl = sl;
        this.price = price;
    }
    
    
    public Object[] toObject(){
        return new Object[]{
            stt, ma, ten, tl, tg, nxb,  sl, price
        };
    }
    
    
    
    
}

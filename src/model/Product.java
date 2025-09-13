package model;

import java.time.LocalDate;

public class Product {
     private String pro_name;
    private int pro_id;
    private double pro_price;
    private LocalDate pro_expirarion;

    public Product(int pro_id, String pro_name, double pro_price, LocalDate pro_expirarion){
        this.pro_name=pro_name;
        this.pro_id=pro_id;
        this.pro_price=pro_price;
        this.pro_expirarion=pro_expirarion;
    }

    public String getPro_name(){
        return pro_name;
    }

    public int getPro_id(){
        return pro_id;
    }

    public double getPro_price(){
        return pro_price;
    }


    public LocalDate getPro_expirarion() {
        return pro_expirarion;
    }

    public void setPro_expirarion(LocalDate pro_expirarion) {
        this.pro_expirarion = pro_expirarion;
    }

    

    @Override
    public String toString() {
        return "Product [pro_name=" + pro_name + ", pro_id=" + pro_id + ", pro_price=" + pro_price + ", pro_expirarion="
                + pro_expirarion + "]";
    }

    public void pro_showInfo(){
        System.out.println("Product Information--------- "+"\nProduct name: "+pro_name+"\nID: "+pro_id+"\nPrice: "+pro_price+"\nExpiration: "+pro_expirarion);
    }
}
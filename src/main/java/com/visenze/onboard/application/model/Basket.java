package com.visenze.onboard.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Basket {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;

    @Column(name="itemName")
    private String itemName;

    @Column(name="price")
    private double price;

    @Column(name = "qty")
    private int qty;

    public String getItemName() { return itemName; }
    public void setItemName(String s_ItemName) { this.itemName = s_ItemName; }

    public int getId() { return id; }
    public void setId(int i_ItemID) { this.id = i_ItemID; }

    public double getPrice() { return price; }
    public void setPrice(double d_Price) { this.price = d_Price; }

    public int getQty() { return qty; }
    public void setQty(int i_Quantity) { this.qty = i_Quantity; }
}

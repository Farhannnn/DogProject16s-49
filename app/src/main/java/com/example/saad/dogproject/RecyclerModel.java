package com.example.saad.dogproject;

public class RecyclerModel {
    public String ProductName;
    public String ProductPrice;
    public RecyclerModel(String ProductName, String ProductPrice)
    {
        this.ProductName = ProductName;
        this.ProductPrice = ProductPrice;
    }
    public String getProductName()
    {
        return ProductName;
    }
    public void setProductName(String ProductName)
    {
        this.ProductName = ProductName;
    }
    public String getProductPrice()
    {
        return ProductPrice;
    }
    public void setProductPrice(String ProductPrice)
    {        this.ProductPrice = ProductPrice;    }
}

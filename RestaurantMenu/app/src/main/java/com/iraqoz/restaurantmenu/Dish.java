package com.iraqoz.restaurantmenu;

public class Dish {
    public String Title, Description;
    public  int Price;

    public Dish(String title, String description, int price ){
        this.Title=title;
        this.Description=description;
        this.Price=price;
    }

    @Override
    public String toString() {
        return Title+"\n"+Price+" Ksh\n"+Description;
    }
}

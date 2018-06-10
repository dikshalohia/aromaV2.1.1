package com.example.android.aroma;

public class Ingredients {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    private String name,quantity,unit;

    public Ingredients(String name,String quantity, String unit){
        this.setName(name);
        this.setQuantity(quantity);
        this.setUnit(unit);
    }

}

package Clases;

public class SmartWatch extends SmartDevice{

    String material;
    int price;
    boolean waterproof;
    String colour;
    boolean touch;

    public SmartWatch(){}
    public SmartWatch(String material,int price, boolean waterproof,String colour,boolean touch){
        this.material = material;
        this.price = price;
        this.colour = colour;
        this.touch = touch;
        this.waterproof = waterproof;
    }
}



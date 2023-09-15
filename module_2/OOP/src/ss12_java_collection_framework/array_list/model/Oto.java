package ss12_java_collection_framework.array_list.model;

import java.util.Objects;

public class Oto {
    private String nameCar;
    private String describe;// mo ta
    private String segment; // phan khuc
    private int priceCar;

    public Oto(){

    }
    public Oto(String name , String describe , String segment, int price){
        this.nameCar = name;
        this.describe = describe;
        this.segment = segment;
        this.priceCar = price;
    }
    public Oto(String name){
        this.nameCar = name;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public int getPriceCar() {
        return priceCar;
    }

    public void setPriceCar(int priceCar) {
        this.priceCar = priceCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameCar='" + nameCar + '\'' +
                ", describe='" + describe + '\'' +
                ", segment='" + segment + '\'' +
                ", priceCar=" + priceCar +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oto oto = (Oto) o;
        return  Objects.equals(nameCar, oto.nameCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCar, describe, segment, priceCar);
    }
}

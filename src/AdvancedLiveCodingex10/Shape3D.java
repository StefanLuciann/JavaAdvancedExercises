package AdvancedLiveCodingex10;

public abstract class Shape3D extends Shape implements Fillable{


    public Shape3D(int numberOfSides) {
        super(numberOfSides);
    }

    public abstract double calculateVolume();

    @Override
    public void fill(double liters) {
        if(liters>calculateVolume()){
            System.out.println("Water overflow");
        } else if(liters < calculateVolume()){
            System.out.println("Water not enough");
        } else {
            System.out.println("Figure filled to the brim");
        }
    }
}

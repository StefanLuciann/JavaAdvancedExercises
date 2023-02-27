package AdvancedLiveCodingex4;

import java.util.LinkedList;

public class WeaponMagazine {

    private int capacity;
    private final LinkedList<String> magazine = new LinkedList<>();

    public WeaponMagazine(int capacity) {
        this.capacity = capacity;
    }
    
    public void loadBullet(String bullet){
        int size = magazine.size();
        if(size<capacity){
            magazine.add(bullet);
        } else{
            System.out.println("Maximum capacity reached");
        }
    }

    public void isLoaded(){
        if(magazine.isEmpty()){
            System.out.println("Weapon is empty");
        } else{
            System.out.println("Weapon is loaded");
        }
    }

    public void shot(){
        if(!magazine.isEmpty()){
            System.out.println(magazine.removeFirst());
        } else{
            System.out.println("Magazine is empty");
        }
    }

}

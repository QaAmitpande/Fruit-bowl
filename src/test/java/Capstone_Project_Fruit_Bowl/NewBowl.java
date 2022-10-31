package Capstone_Project_Fruit_Bowl;

import java.util.ArrayList;

public class NewBowl {
    private OldBowl oldBowl;


    private ArrayList<Fruit> smallSize = new ArrayList<>();

    private ArrayList<Fruit> mediumSize = new ArrayList<>();

    private ArrayList<Fruit> largeSize = new ArrayList<>();



    public void putFruitsInNewBowlFromOldBowl(){
        ArrayList<Fruit> oldBowlFruits = new ArrayList<>(oldBowl.getFruits());
        for(Fruit fruit: oldBowlFruits){
            if(fruit.getSize() == 1){
                smallSize.add(fruit);
            }
            if(fruit.getSize() == 2){
                mediumSize.add(fruit);
            }
            if(fruit.getSize() == 3){
                largeSize.add(fruit);
            }
        }
    }



    public OldBowl getOldBowl() {
        return oldBowl;
    }

    public void setOldBowl(OldBowl oldBowl) {

        this.oldBowl = oldBowl;
    }

    public ArrayList<Fruit> getSmallSize() {
        return smallSize;
    }

    public void setSmallSize(ArrayList<Fruit> smallSize) {

        this.smallSize = smallSize;
    }

    public ArrayList<Fruit> getMediumSize() {
        return mediumSize;
    }

    public void setMediumSize(ArrayList<Fruit> mediumSize) {

        this.mediumSize = mediumSize;
    }

    public ArrayList<Fruit> getLargeSize() {

        return largeSize;
    }

    public void setLargeSize(ArrayList<Fruit> largeSize) {
        this.largeSize = largeSize;
    }
}

package Capstone_Project_Fruit_Bowl;

import java.util.ArrayList;

    public class SortFruitsToBowl {
        public void showFruitArrayList(ArrayList<Fruit> fruitArrayList){
            for(Fruit fruit : fruitArrayList){
                System.out.println("Name: "+fruit.getName()+" Size: "+fruit.getSize());
            }
        }

        public static void main(String[] args) {
            OldBowl oldBowl = new OldBowl();
            NewBowl newBowl = new NewBowl();

            ArrayList<Fruit> oldBowlFruits = new ArrayList<>();

            oldBowlFruits.add(new Fruit("Banana","Yellow","sweet",3));
            oldBowlFruits.add(new Fruit("Apple","Red","sweet",2));
            oldBowlFruits.add(new Fruit("grape","Black","sour sweet",1));


            oldBowl.setFruits(oldBowlFruits);
            newBowl.setOldBowl(oldBowl);
            newBowl.putFruitsInNewBowlFromOldBowl();


            SortFruitsToBowl sort = new SortFruitsToBowl();
            System.out.println("  Fruits in top-bowl");
            sort.showFruitArrayList(newBowl.getSmallSize());
            System.out.println("  Fruits in middle-bowl");
            sort.showFruitArrayList(newBowl.getMediumSize());
            System.out.println("  Fruits in bottom-bowl");
            sort.showFruitArrayList(newBowl.getLargeSize());
        }
    }



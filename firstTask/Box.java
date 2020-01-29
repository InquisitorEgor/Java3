package firstTask;

import java.util.ArrayList;


public class Box<T extends Fruit> {

    private ArrayList<T> arrayList = new ArrayList<>();

    private float getWeight() {
        return arrayList.size() * arrayList.get(0).getWeight();
    }

    public void addFruitToBox(T f) {
        arrayList.add(f);
    }

    public boolean compare(Box<?> b) {
        return getWeight() == b.getWeight();
    }


    public void transferAllFruits(Box<?> b){
        for (int i = 0; i <b.arrayList.size() ; i++) {
            arrayList.add((T) b.arrayList.get(i));
        }

    }

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruitToBox(new Apple());
        appleBox.addFruitToBox(new Apple());
        appleBox.addFruitToBox(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruitToBox(new Orange());
        orangeBox.addFruitToBox(new Orange());

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));

        Box<Apple> newAppleBox = new Box<>();
        newAppleBox.addFruitToBox(new Apple());
        newAppleBox.addFruitToBox(new Apple());
        newAppleBox.transferAllFruits(appleBox);
        System.out.println(newAppleBox.getWeight());
    }
}

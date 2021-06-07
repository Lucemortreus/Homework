package hw3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitList = new ArrayList<>();

    public ArrayList<T> getFruitList() {
        return fruitList;
    }

    public void setFruitList(ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

    public float getBoxWeight() {
        return fruitList.size() * fruitList.get(0).weight;
    }

    public boolean compare(Box<?> box) {
        return getBoxWeight() == box.getBoxWeight();
    }

    public void transferFruits(Box<T> box) {
        fruitList.addAll(box.fruitList);
        box.fruitList.clear();
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruitList=" + fruitList +
                '}';
    }
}

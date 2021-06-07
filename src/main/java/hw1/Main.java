package hw1;

public class Main {
    public static void main(String[] args) {
        CanJump [] jumpers = {new Cat(10, 10), new Human(12, 12), new Robot(14, 14)};
        CanRun [] runners = {new Cat(10, 10), new Human(12, 12), new Robot(14, 14)};

        Competitable [] competitors = {new Cat(10, 10), new Human(12, 12), new Robot(12, 12)};

        Overcomable [] obstacles = {new Wall(10), new Road(100)};

        for (Overcomable overcomable: obstacles) {
            for (Competitable competitable: competitors) {
                overcomable.overcome(competitable);
            }
        }
    }
}

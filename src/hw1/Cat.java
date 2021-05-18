package hw1;

public class Cat implements Competitable {
    private int jumpHeight;
    private int runLength;

    public Cat(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public void jump(int height) {
        if (jumpHeight >= height ) {
            System.out.println("Я кот, я перепрыгнул!");
        } else {
            System.out.println("Я кот, я не смог перепрыгнуть");
        }
    }

    @Override
    public void run(int length) {
        if (runLength >= length) {
            System.out.println("Я кот, я пробежал!");
        } else {
            System.out.println("Я кот, я не смог пробежать");
        }

    }
}

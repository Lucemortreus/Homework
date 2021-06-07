package hw1;

public class Robot implements Competitable {
    private int jumpHeight;
    private int runLength;

    public Robot(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public void jump(int height) {
        if (jumpHeight >= height ) {
            System.out.println("Я робот, я перепрыгнул!");
        } else {
            System.out.println("Я робот, я не смог перепрыгнуть");
        }
    }

    @Override
    public void run(int length) {
        if (runLength >= length) {
            System.out.println("Я робот, я пробежал!");
        } else {
            System.out.println("Я робот, я не смог пробежать");
        }

    }
}

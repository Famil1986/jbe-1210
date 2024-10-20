import bird.Birds_voice;
import dog.Dogs_voice;
import cat.Cats_voice;

public class Main {
    public static void main(String[] args) {
        Birds_voice bird = new Birds_voice();
        bird.sing();
        Cats_voice cat = new Cats_voice();
        cat.meow();
        Dogs_voice dog = new Dogs_voice();
        dog.bark();
    }

}

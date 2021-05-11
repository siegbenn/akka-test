import akka.actor.ActorSystem;

public class AkkaTestProgram {
    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create("test-system");
        System.out.println("Hello, Akka.");
    }
}

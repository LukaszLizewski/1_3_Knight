package kodilla_1_3_knight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        Knight dead = new Knight(new DeadIslandQuest());
        dead.doMission();
        Knight elite = new Knight(new EliteKnightQuest());
        elite.doMission();

    }
}

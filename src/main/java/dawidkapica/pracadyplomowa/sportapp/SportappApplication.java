package dawidkapica.pracadyplomowa.sportapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class SportappApplication {

    public static void main (String[] args) {
        SpringApplication.run(SportappApplication.class, args);
    }

}

package txw.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class App 
{
    public static void main(String[] args) {
        
        System.out.println("dddddddddddddd");
        SpringApplication.run(App.class, args);
    }

}

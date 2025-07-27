package me.sathish.allsummer.sathish_test_spring.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("me.sathish.allsummer.sathish_test_spring")
public class SathishTestSpringApplication {

    public static void main(final String[] args) {
        SpringApplication.run(SathishTestSpringApplication.class, args);
    }

}

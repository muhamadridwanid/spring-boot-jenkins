package me.muhamadridwan.jenkinsexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsExampleApplication.class, args);
    }

    @GetMapping("/")
    String index(){
        return "Hello World!!";
    }

}

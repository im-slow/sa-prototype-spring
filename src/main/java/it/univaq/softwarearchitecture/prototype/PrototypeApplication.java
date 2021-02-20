package it.univaq.softwarearchitecture.prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrototypeApplication {

    @GetMapping("/test")
    public String test() {
        return "Servizio T1";
    }

    public static void main(String[] args) {
        SpringApplication.run(PrototypeApplication.class, args);
    }

}

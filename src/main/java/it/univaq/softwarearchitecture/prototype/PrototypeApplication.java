package it.univaq.softwarearchitecture.prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrototypeApplication {

    @GetMapping("/")
    public String start() {
        return "Servizio T1";
    }

    @GetMapping("/test")
    public String test() {
        return "Worker in esecuzione";
    }

    @GetMapping("/t2")
    public String t2() {
        return "Servizio T2";
    }

    public static void main(String[] args) {
        SpringApplication.run(PrototypeApplication.class, args);
    }

}

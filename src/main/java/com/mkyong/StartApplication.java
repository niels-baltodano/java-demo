package com.mkyong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        model.addAttribute("title", "Docker + Spring Boot");
        model.addAttribute("msg", "Welcome to the k8s pod : "+ inetAddress.getHostName());
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}

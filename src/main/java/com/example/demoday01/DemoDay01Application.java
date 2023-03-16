package com.example.demoday01;

import com.example.demoday01.springstyle.Drawing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoDay01Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoDay01Application.class, args);

        Drawing drawing1 = context.getBean("drawing", Drawing.class);
        Drawing drawing2 = context.getBean("drawing", Drawing.class);

        drawing1.setDescription("Drawing 1");
        drawing2.setDescription("Drawing 2");

        System.out.println(drawing1.getDescription());
        System.out.println(drawing2.getDescription());

        drawing1.drawing();
    }
}

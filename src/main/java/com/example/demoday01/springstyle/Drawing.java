package com.example.demoday01.springstyle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Drawing {

    @Autowired
    @Qualifier("triangle")
    private Shape shape;

    private String description;

    public Drawing() {
    }

    public Drawing(Shape shape, String description) {
        this.shape = shape;
        this.description = description;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void drawing() {
        this.shape.draw();
    }

    @PostConstruct
    public void init() {
        System.out.println("Init Drawing");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy Drawing");
    }
}

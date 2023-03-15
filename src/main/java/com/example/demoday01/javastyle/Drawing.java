package com.example.demoday01.javastyle;

public class Drawing {

    private Shape shape;

    public Drawing() {
    }

    public Drawing(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void drawing() {
        this.shape.draw();
    }
}

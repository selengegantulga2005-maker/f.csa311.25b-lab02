package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

/**
 * Renderer нь дүрсний дотоод хэрэгжилтээс үл хамаарна.
 * Зөвхөн Shape интерфэйсийг ашиглаж draw() дуудах үүрэгтэй.
 */
public class Renderer {
    private Shape shape; // BITUUMJLEL

    public Renderer(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        System.out.println("Shape printed");
        shape.draw();
    }
}


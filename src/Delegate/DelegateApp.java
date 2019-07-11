package Delegate;

import com.sun.imageio.plugins.gif.GIFImageReader;

public class DelegateApp {
    public static void main(String[] args) {
       Painter painter = new Painter();
       painter.setGraphics(new Square());
       painter.draw();

       painter.setGraphics(new Triangle());
       painter.draw();




    }
}

class A {
    void f() {
        System.out.println("f()");
    }
}

class B {
    A a = new A();

    void f() {
        a.f();
    }
}

interface Graphics {
    void draw();
}

class Triangle implements Graphics {
    public void draw() {
        System.out.println("Paint a triangle");
    }
}

class Square implements Graphics {
    public void draw() {
        System.out.println("Paint a square");
    }
}

class Painter {
    Graphics graphics;

    void setGraphics(Graphics g) {
        graphics = g;
    }

    void draw() {
        graphics.draw();
    }
}
package WrapperPattern;

public class DecoratorApp {
    public static void main(String[] args) {
        PrinterInterface printer = new Right(new Left(new Printer("Hello")));
        printer.print();


    }
}

interface PrinterInterface {
    void print();
}

class Printer implements PrinterInterface {
    String value;

    public Printer(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}

class QuotesDecorator implements PrinterInterface {
    PrinterInterface component;

    public QuotesDecorator(PrinterInterface component) {
        this.component = component;
    }

    @Override
    public void print() {
        System.out.print("\"");
        component.print();
        System.out.print("\"");
    }
}

class Left implements PrinterInterface {
    PrinterInterface component;

    public Left(PrinterInterface component) {
        this.component = component;
    }

    @Override
    public void print() {
        System.out.print("[");
        component.print();

    }
}

class Right implements PrinterInterface {
    PrinterInterface interface1;

    public Right(PrinterInterface interface1) {
        this.interface1 = interface1;
    }

    @Override
    public void print() {
        interface1.print();
        System.out.print("]");
    }
}
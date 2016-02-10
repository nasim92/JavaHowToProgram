package main.java.JavaHowToProgram.ch2;

/**
 * Created by saeed on 2/10/16.
 */
public enum ShapeType {
    TRIANGLE("مثلت"), SQUARE("مربع"), RECTANGULAR("مستطیل")

    ;

    ShapeType(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}

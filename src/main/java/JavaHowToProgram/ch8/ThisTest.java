package main.java.JavaHowToProgram.ch8;

public class ThisTest {
    public static void main(String[] args) {
        SimpleTime time = new SimpleTime(24,34,05);
        System.out.println(time.buildString());


    }
}

class SimpleTime {
    private int hour;
    public int minute;
    public int second;

    public SimpleTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String buildString() {
        return String.format("%s: %s%n%s: %s",
                "this.toUniversalString()",
                "toUniversalString()",
                this.toUniversalString(),
                toUniversalString());
    }

    public String toUniversalString() {
        // "this" is not required here to access instance variables,
        // because method does not have local variables with same
        // names as instance variables
        return String.format("%d:%d:%d",
                this.hour, this.minute, this.second);
    }
}

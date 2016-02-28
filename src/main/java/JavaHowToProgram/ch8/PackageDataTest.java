package main.java.JavaHowToProgram.ch8;

public class PackageDataTest {
    public static void main(String [] args)
    {

    }
}

class PackageData{
    int number;
    String string;

    public PackageData()
    {
        number = 0;
        string = "hello";
    }

    public String toString()
    {
        return String.format("number: %d; string: %s", number, string);
    }
}

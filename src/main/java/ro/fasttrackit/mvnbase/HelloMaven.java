package ro.fasttrackit.mvnbase;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class HelloMaven {

    public static void main(String[] args) throws IOException {
        String hello = new HelloMaven().sayHello();
        String asciiArt = FigletFont.convertOneLine(hello);
        System.out.println(asciiArt);
    }

    public String sayHello() {
        return "Hello Maven";
    }

}

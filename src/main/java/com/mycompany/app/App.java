package com.mycompany.app;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(colorize("Hello World!", BOLD(), BLUE_TEXT()));
        System.out.println(colorize("Hello World!", BOLD(), RED_TEXT(), YELLOW_BACK()));
        System.out.println("Hello World!");

    }
}

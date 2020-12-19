package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Iehor Funtusov, created 16/12/2020 - 8:44 PM
 */

public class ConsoleInput {

    public int getConsoleResult() {
        System.out.println("this = " + this);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String value = null;
        try {
            value = reader.readLine();
        } catch (NumberFormatException | IOException e) {
            System.out.println("e = " + e.getMessage());
        }
        return Integer.parseInt(value);
    }

    public static int sum() {
        return 10;
    }
}

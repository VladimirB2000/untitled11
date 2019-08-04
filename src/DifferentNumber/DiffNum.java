package DifferentNumber;

import java.io.*;
import java.util.*;

public class DiffNum {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        int a = Integer.parseInt(number1);
        String number2 = reader.readLine();
        int b = Integer.parseInt(number2);
        String number3 = reader.readLine();
        int c = Integer.parseInt(number3);

        if (a == b)
            System.out.println("3");
        else if (a == c )
            System.out.println("2");
        else if (b == c )
            System.out.println("1");
}}

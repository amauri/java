package fundamentos;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Byte b = 100;
        Short s = 1000;
        // Integer i = Integer.parseInt("10000");
        // Integer i = Integer.parseInt(entrada.next());
        Integer i = 10000;
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i);

        Float f = 123F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);


        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';
        System.out.println(c.toString());


    }
}

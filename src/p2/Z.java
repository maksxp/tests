package p2;

import p1.X;

import java.io.*;

class Z extends X implements F{

    int a;
    {
       a=5;
        System.out.println("test");
        System.out.println(a);
    }


    public static void main(String[] args) throws IOException {

        String d = new String("AA");
        String f = new String("QQ");

        System.out.println(d);
        System.out.println(f);
        f=d;
        d.replace('A','B');
        System.out.println(d);
        System.out.println(f);

    }

}

interface F {}

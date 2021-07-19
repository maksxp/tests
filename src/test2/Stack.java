package test2;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Stack {
    public static void testSup (Supplier <HH> supplier){
        for ( int i=0; i<3; i++) {
            System.out.println(supplier.get()+" "+i);
        }
    }

    public static void testCon (HH hh, Consumer<HH> consumer){
        consumer.accept(hh);
    }

    public static Integer testFun (List <HH> hh, Function <HH, Integer> function) {
        Integer res = 0;
        for (HH h : hh){
            res +=function.apply(h);
                    }
        return res;
    }


    public static void main(String[] args) {

        HH hh2 = new HH("fun");
        HH hh3 = new HH("funFun");
        ArrayList<HH> arrayList = new ArrayList<>();
        arrayList.add(hh2);
        arrayList.add(hh3);

        testSup(()->new HH("one"));
        testCon(new HH("hello"), zz -> {
                zz.s="two";
            System.out.println(zz.s);}
        );
        System.out.println(testFun(arrayList, (hh -> hh.s.length())));


}
    }

    class HH {
    String s;
    public HH (String s){
        this.s=s;
    }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            HH hh = (HH) o;
            return Objects.equals(s, hh.s);
        }

        @Override
        public int hashCode() {
            return 2;
        }

        @Override
        public String toString() {
            return "HH{" +
                    "s='" + s + '\'' +
                    '}';
        }
    }


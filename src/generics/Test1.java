package generics;

import java.util.*;

public class Test1 extends TT{
    public void test (){
        System.out.println("generics");
    }
    public static void  abc (){
        System.out.println("Test1");
    }
    static ArrayList<String> al;

    public static void main(String[] args) {

Vector <String> list = new Vector<>();
list.add("a");
list.add("b");
list.add("c");
list.add("d");
        System.out.println(list);
    }
}

class TT implements II{
    public void test (){
        System.out.println("TT");
    }
    public static void  abc (){
        System.out.println("TT");
    }

}
interface II {}
class H <M extends TT>{
M m;
public void hh (){
    System.out.println(m.getClass());
}
}


class Mmm {

final int s=23;

static void ttt (){
    System.out.println("mmm");
}

}

class Zzz extends Mmm {

    final String s="2";

   static void ttt (){
        System.out.println("zzz");
    }
}

public class Program {

    public static void main(String[] args)  {
        Mmm m = new Zzz();
        System.out.println(m.s);

    }
    }




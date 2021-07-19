package IO_NIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
    public static void main(String[] args) throws IOException {
        String rubai = "ooov vdvdsv kfdsmvslmv, fdf.\n" +
                "fdfgdsv vdsg vlf,ssldglsbmvvdgr.\n"+
                "fedv feg fbcsdc sdcdfvvv!\n"+
                "cdvd vfbfbb vldvf gf kghoeopm.\n";
        String s ="hello";

        try (FileWriter writer = new FileWriter("test2.txt", true)) {
            //            for (int i=0; i<rubai.length();i++){
//                writer.write(rubai.charAt(i));
//            }
            writer.write(rubai);
            writer.write(s);
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package IO_NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try (
             RandomAccessFile file = new RandomAccessFile("test9.txt", "rw");
             FileChannel channel = file.getChannel();){
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder poem = new StringBuilder();

            int byteRead = channel.read(buffer);
            while (byteRead>0){
                System.out.println("read "+byteRead);

                buffer.flip();

                while (buffer.hasRemaining()){
                    poem.append((char) buffer.get());
                }

                buffer.clear();
                byteRead=channel.read(buffer);
            }

            System.out.println(poem);

            String text ="\nThere are only two ways to live your life." +
                    " One is as though nothing is a miracle. The other is as"+
                    " though everything is a miracle.";

//            ByteBuffer buffer1 = ByteBuffer.allocate(text.getBytes().length);
//            buffer1.put(text.getBytes());
//            buffer1.flip();
//            channel.write(buffer1);

            //do the same as previous 4 strings
            ByteBuffer buffer1 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer1);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

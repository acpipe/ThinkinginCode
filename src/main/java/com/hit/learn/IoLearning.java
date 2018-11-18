package com.hit.learn;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IoLearning {
    public static void main (String [] args)
        throws Exception {

        long startTime = System.currentTimeMillis();

        Path path = Paths.get("C:\\\\Users\\Acceml\\Downloads\\\\data.txt");
        FileChannel fileChannel = FileChannel.open(path);

        ByteBuffer buffer = ByteBuffer.allocateDirect(1024 * 10);
//        ByteBuffer buffer = ByteBuffer.allocate(1024 * 10);

        System.out.println("Is a direct buffer: " + buffer.isDirect());
        System.out.println("Buffer has a backing array: " + buffer.hasArray());
        System.out.println("Reading file... ");

        int noOfBytesRead = fileChannel.read(buffer);

        for (int i = 0; i < 25; i++) {

            while (noOfBytesRead != -1) {

                buffer.clear();
                noOfBytesRead = fileChannel.read(buffer);
            }

            buffer.clear();
            fileChannel.position(0);
            noOfBytesRead = fileChannel.read(buffer);
        }

        fileChannel.close();

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken (millis): " + (endTime - startTime));
    }
}

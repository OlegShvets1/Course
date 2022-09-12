package Lesson_10.Task_1;
/*   1. Read about java.nio package(Path, Paths, Files, File) and try to use it to read the data
from the first file and write this data to the second file. Delete the initial file from the disk.


Java NIO Package
The NIO classes are contained in a package called java.nio package. It is important to understand that
the NIO subsystem does not replace the stream based I/O classes available in java.io package, and good
 working knowledge of stream-based I/O in java.io is helpful for understanding NIO.

The above groups are based on what is the use of NIO classes from developer point of view. The purpose behind this grouping is the representation of file system or the level of interaction with file system.

        The NIO classes are contained in the packages as given below:

        Package	Purpose
        java.nio	It is top-level package for NIO system. The various types of buffers are encapsulated by this NIO system.
        java.nio.charset	It encapsulates the character sets and also supports encoders and decoders operation that convert characters to bytes and bytes to characters, respectively.
        java.nio.charset.spi	It supports the service provider for character sets.
        java.nio.channels	It support the channel, which are essentially open the I/O connections.
        java.nio.channels.spi	It supports the service providers for channels.
        java.nio.file	It provides the support for files.
        java.nio.file.spi	It supports the service providers for file system.
        java.nio.file.attribute	It provides the support for file attributes.*/


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        String path = "src/Lesson_10/Task_1/File_1.txt";

        File file = new File(path);

    FileInputStream inputStream = new FileInputStream(file);
        Scanner sc = new Scanner(inputStream);
        StringBuffer buffer = new StringBuffer();
        while(sc.hasNext()) {
            buffer.append(" "+sc.nextLine());
        }
        file.delete();
        System.out.println("Contents of the file: "+buffer);
        File storage = new File("src/Lesson_10/Task_1/File_2.txt");
        FileWriter writer = new FileWriter(storage);
        writer.write(buffer.toString());
        writer.flush();
        inputStream.close();
        writer.close();
        System.out.println("File copied successfully ...  ...  ...");
//        if(file.delete())          //part of the code is completed because when the file (File_1)
//        {                          //is deleted it is impossible to restart the program
//            System.out.println(file.getName() + " deleted");   //getting and printing the file name
//        }
//        else
//        {
//            System.out.println("failed");
//        }
    }
}





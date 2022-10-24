import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main1 {


    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Ivan\\OneDrive\\Рабочий стол\\Java\\java.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Ivan\\OneDrive\\Рабочий стол\\Java\\Homework\\homework.txt", true);

        fileInputStream.available();

        byte [] buffer = new byte[fileInputStream.available()];

        fileInputStream.read(buffer);

        fileOutputStream.flush();
        fileOutputStream.write(buffer);

        System.out.println("-------------------------------");

        File file = new File("C:\\Users\\Ivan\\OneDrive\\Рабочий стол\\Java");

        openAllPaths(file);

    }

    public static void openAllPaths(File file){

        File[] list = file.listFiles();
        for (int i = 0; i < list.length; i++) {
            if(list[i].isFile())
                System.out.println(list[i].getName());
            else {
                System.out.println(list[i].getName());
                openAllPaths(new File(list[i].getPath()));
            }
        }
    }
}

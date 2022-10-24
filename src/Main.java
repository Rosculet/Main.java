import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
    }

    private static void directoryPass(File dir) {
        Stack<File> stack = new Stack<>();
        stack.push(dir);
        while (stack.empty()) {
            File[] files = stack.pop().listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    System.out.println(files[i].getName());
                }
                if (files[i].isDirectory()) {
                    stack.push(files[i]);
                }
            }
        }
    }

    private static void fileCOpy(String file1, String file2) throws IOException {
        FileInputStream  fileInputStream = new FileInputStream(file1);
        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        fileInputStream.close();

        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        fileOutputStream.write(buffer);
        fileOutputStream.flush();
        fileOutputStream.close();
    }


}
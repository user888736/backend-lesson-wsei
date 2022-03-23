package run;

import java.io.FileInputStream;

public class zad1 {

    public static void main(String args[]) {

        try {
            FileInputStream input = new FileInputStream("C:\\Users\\user\\IdeaProjects\\backend-lesson-wsei\\src\\run\\input.txt");
            int i = input.read();
            while(i != -1) {
                System.out.print((char)i);
                i = input.read();
            }
            input.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
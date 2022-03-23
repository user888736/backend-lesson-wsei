import java.io.*;

public class zad6 {

    static void splitText() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\IdeaProjects\\backend-lesson-wsei\\src\\run\\text.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            String[] splitText = everything.split(" ");


            for(int i = 0; i < splitText.length; i++) {
                System.out.println(i +1  + "." + splitText[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }

    }
    public static void main(String[] args) throws IOException {
            splitText();
    }
}
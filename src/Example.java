import java.io.*;

/**
 * Created by sergei on 25.03.2015.
 */

//Задание 0-4
public class Example {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(new File("text"));
        int ch;
        char[] text = new char[100];
        int k = 0;
        System.out.println("Исходная строка");
        while ((ch = fileReader.read()) != -1) {
            text[++k] = (char) ch;
            System.out.print((char) ch);
        }
        fileReader.close();
        String l = "";
        text[0] = ' ';
        for (int i = 1; i < text.length; i++) {
            if (text[i - 1] == ' ' || text[i - 1] == ' ' && text[i + 1] == ' ' ||
            !Character.isLetterOrDigit(text[i-1]) ) {
                l = l.concat(String.valueOf(text[i]).toUpperCase());
            } else {
                l = l.concat(String.valueOf(text[i]).toLowerCase());
            }
        }
        System.out.print("\n" + l);
    }

}

package studyJavaSE;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLDemo {
    public static void main (String[] args) throws Exception {
        URL url = new URL("http", "www.baidu.com", 80, "/index.html");
        InputStream input = url.openStream();
        Scanner scan = new Scanner(input);
        scan.useDelimiter("\n");
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
    }
}

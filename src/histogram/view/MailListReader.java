package histogram.view;

import histogram.model.Mail;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * Class responsible for reading the data from a text
 * file and creating a list of valid e-mail domains.
 *
 * @author Brian Suárez Santiago
 * @version 1.0.0
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/io/FileReader.html">Class FileReader</a>
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/io/package-summary.html">Package java.io</a>
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">Class ArrayList</a>
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/List.html">Interface List</a>
 */
public class MailListReader {

    /**
     * Reads a text file where the domains of e-mail
     * and returns the list of those valid domains.
     *
     * @param fileName Data file name.
     * @return List of valid e-mail domains.
     */
    public static List<Mail> read(String fileName) {
        List<Mail> list = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            while(true) {
                String line = reader.readLine();

                if(line == null) break;
                if(Mail.isMail(line)) {
                    list.add(new Mail(line));
                }
            }
        } catch(FileNotFoundException exception) {
            System.out.println("ERROR MailHistogramReader::read (FileNotFound)" + exception.getMessage());
        } catch(IOException exception) {
            System.out.println("ERROR MailHistogramReader::read (IOException)" + exception.getMessage());
        }
        return list;
    }
}
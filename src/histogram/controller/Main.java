package histogram.controller;

import histogram.model.*;
import histogram.view.*;
import java.util.List;
/**
 * Controller class that instances the necessary objects
 * for the construction of a histogram and represents it
 * by calling to execute() method implemented in the
 * HistogramDisplay class.
 *
 * @author Brian Suárez Santiago
 * @version 2.0.0
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/List.html">Interface List</a>
 */
public class Main {
    private static List<String> mailList;
    private static Histogram<String> histogram;

    /**
     * Initializes the objects needed to the construction
     * of a histogram, and represents it making use of to
     * execute() method.
     */
    public static void main(String[] args) {
        execute();
    }

    /**
     * Reads a list of email domains passed as parameter
     * in the text file "email.txt"
     */
    public static void input() {
        mailList = MailListReaderDB.read();
    }

    /**
     * Process the list of email domains passed as a
     * parameter and to build the final list of domains
     * of valid emails that will be used in the
     * histogram representation.
     */
    public static void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }

    /**
     * Initializes the objects needed to the construction of
     * a histogram, and represents it making use of to execute()
     * method.
     */
    public static void output() {
        HistogramDisplay histogramDisplay = new HistogramDisplay("Histogram", histogram);
        histogramDisplay.execute();
    }

    /**
     * Represents the histogram from data from input and
     * processing of these depending on whether they are
     * email domains valid or not.
     */
    public static void execute() {
        input();
        process();
        output();
    }
}
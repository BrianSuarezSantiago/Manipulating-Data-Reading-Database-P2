package histogram.view;

import histogram.model.*;
import java.util.List;
/**
 * Class responsible for building from a valid e-mail
 * list a histogram obtaining thus, the frequency of
 * each domain
 *
 * @author Brian Suárez Santiago
 * @version 1.0.0
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/List.html">Interface List</a>
 */
public class MailHistogramBuilder {

    /**
     * Builds a histogram from a list of e-mail
     * domains passed as an argument.
     *
     * @param mailList Valid e-mail list.
     * @return Histogram with keys of type String.
     */
    public static Histogram<String> build(List<Mail> mailList) {
        Histogram<String> histogram = new Histogram<>();

        for(Mail mail: mailList) {
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }
}
package histogram.model;

/**
 * Class responsible for separating from a text string
 * passed as argument, which represents an e-mail address,
 * the corresponding substring with the domain.
 *
 * @author Brian Suárez Santiago
 * @version 1.0.0
 */
public class Mail {
    private final String mail;

    /**
     * Constructor that receives a String as a parameter
     * called mail that is used for the initialization
     * of the attribute that represents the email domain.
     *
     * @param mail E-mail address.
     */
    public Mail(String mail) {
        this.mail = mail;
    }

    /**
     * Separates from a string text with an email address
     * the corresponding substring with the domain.
     *
     * @return Substring with the e-mail domain.
     */
    public String getDomain() {
        return this.mail.substring(this.mail.indexOf("@") + 1);
    }

    /**
     * Checks if a certain string of text passed as argument
     * corresponds with a valid e-mail address or not.
     *
     * @param line String text line.
     * @return True if the line of text passed as
     * argument corresponds to an e-mail address
     * or false otherwise.
     */
    public static boolean isMail(String line) {
        return line.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+" + "(?:\\.[a-zA-Z0-9-]+)*$");
    }
}
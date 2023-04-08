package histogram.view;

import histogram.model.Histogram;
import javax.swing.JPanel;
import java.awt.Dimension;
import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
/**
 * Class that graphically represents a histogram from a set
 * of email domains making use of the JFreeChart and JCommon
 * libraries of Java. This class is a base class for the creation
 * of the main structure of simple bar chart graphical applications.
 *
 * @author Brian Suárez Santiago
 * @version 2.0.0
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/javax/swing/package-summary.html">Package javax.swing</a>
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/awt/package-summary.html">Package java.awt</a>
 * @see <a href="https://www.jfree.org/jfreechart/api/javadoc/index.html">JFreeChart API</a>
 * @see <a href="https://www.jfree.org/jcommon/">JCommon API</a>
 */
public class HistogramDisplay extends ApplicationFrame {
    private final Histogram<String> histogram;

    /**
     * Constructor that sets a container of type chartPanel
     * where the histogram will be arranged represented.
     *
     * Is set this way the container to insert a chartPanel
     * which is a Swing component that will be inserted to
     * display a JFreeChart object representing the desired
     * bar chart histogram.
     */
    public HistogramDisplay(String title, Histogram<String> histogram) {
        super(title);
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();    // The window takes the smallest possible size that allows all components to be seen
    }

    /**
     * Makes the frame or window visible, making use
     * of the setVisible() method.
     *
     * @see #setVisible(boolean)
     */
    public void execute() {
        setVisible(true);
    }

    /**
     * Creates a panel where will place the histogram.
     * The panel has been configured with 500px wide
     * and 400px of high.
     *
     * @return Main panel where the histogram will be
     * arranged.
     */
    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }

    /**
     * Creates the bar chart that will be displayed
     * on the screen. In his creation, the title of
     * the diagram, the name of the axes that make
     * up the histogram, the dataset to be used in
     * the representation, and the orientation of
     * the legend is defined.
     *
     * @param dataset Dataset comprising of email domains.
     * @return Bar chart diagram.
     */
    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart("JFreeChart Histogram", "Email Domains",
                "Nº Domains", dataset, PlotOrientation.VERTICAL,
                false, false, rootPaneCheckingEnabled);
        return chart;
    }

    /**
     * Initializes a set of data that represents
     * domains of email. The dataset is formed by
     * the number of occurrences for a specific
     * email domain as well as the name of said
     * domain.
     *
     * @return Dataset composed of email domains.
     */
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for(String key : this.histogram.keySet()) {
            dataset.addValue(this.histogram.get(key), "", key);
        }
        return dataset;
    }
}
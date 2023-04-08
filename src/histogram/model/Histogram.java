package histogram.model;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
/**
 * Class that represents a histogram. The purpose of the
 * class is to serve as a control class for a certain
 * histogram, where the necessary methods are available
 * to obtain information from the map such as key, the
 * value associated with a key, or a method to fill in
 * the histogram.
 *
 * @param <T> Generic Java type.
 * @author Brian Suárez Santiago
 * @version 2.0.0
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Map.html">Interface Map</a>
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html">Class HashMap</a>
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Set.html">Interface Set</a>
 */
public class Histogram<T> {
    private final Map<T, Integer> map = new HashMap<>();

    /**
     * Returns the value associated with a key.
     *
     * @param key Search key on the map.
     * @return Value associated with the key.
     */
    public Integer get(T key) {
        return this.map.get(key);
    }

    /**
     * Returns the keys that make up the map.
     *
     * @return Set view of map keys.
     */
    public Set<T> keySet() {
        return this.map.keySet();
    }

    /**
     * Fills the map depending on whether it exists a certain
     * key or not. If the map contains the key we put the
     * corresponding value for said key to that key +1 and if
     * not, only the value 1.
     *
     * @param key Search key on the map.
     */
    public void increment(T key) {
        this.map.put(key, this.map.containsKey(key) ? this.map.get(key) + 1 : 1);
    }
}
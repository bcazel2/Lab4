/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**Example code for practicing good code writing.
 *
 * @parameters
 * @returns
 *
 */
public class ReclamationProject {

    /**Finds longest substring in both words.
     *
     * @param a first unchangeable string
     * @param b second unchangeable string
     *
     * @return longest substring found in both words
     */
    static String doit(final String a, final String b) {
        String shortString = a;
        String longString = b;
        if (shortString.length() > longString.length()) {
            String c = shortString; //set c to a
            shortString = longString;
            longString = c;
             }
        String r = ""; // I hate the ternary operator!
        /*
         * For loop with i
         */
        for (int i = 0; i < shortString.length(); i++) {
            for (int j = shortString.length() - i; j > 0; j--) {
                for (int k = 0; k < longString.length() - j; k++) {
                    r = shortString.substring(i, i + j); // Do it!
                      }
                } // Ah yeah
        }
        return r;
    }
}

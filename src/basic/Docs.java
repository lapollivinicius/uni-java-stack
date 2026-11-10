package src.basic;

/**
 * This is a documentation information
 *
 * @author My Name
 * @version 1.2.0
 * @since 1.1
 */
// use to define something as deprecated (don't use cuz this will be desperate)
@Deprecated(since = "1.2", forRemoval = true)
// SuppressWarning is used to hide warnings to compiler
@SuppressWarnings("unused")
public class Docs {

    /**
     * This is a doc to method
     * @param n1 integer
     * @param n2 integer
     * @since 1.0
     * @return n1 + n2
     */

    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    // TODO this is a task

    public static void main(String[] args) {
        Docs myDocs = new Docs();
        int i = 10;
        int j = 20;
        System.out.println(j);
        System.out.println(myDocs.sum(j, 10));
    }

}

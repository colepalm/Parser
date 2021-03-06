package ast;

/** Abstract syntax for  basic types.
 */
public class Type {

    String typename;

    /** Default constructor.
     */
    private Type(String typename) {
        this.typename = typename;
    }

    /** Represents the type of integers.
     */
    public static final Type INT = new Type("int");

    /** Represents the type of booleans.
     */
    public static final Type BOOLEAN = new Type("boolean");

    /** Generate a printable name for this type.
     */
    public String toString() {
        return typename;
    }
}

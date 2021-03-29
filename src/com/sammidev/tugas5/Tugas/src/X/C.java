package X;

import W.B;

/**
 *
 * @author sam
 */
public class C extends B{
    public C(String name, int age) {
        super(name, age);
    }

    public String getNameFromC() {
        return super.getName();
    }

    public int getAgeFromC() {
        return super.getAge();
    }
}

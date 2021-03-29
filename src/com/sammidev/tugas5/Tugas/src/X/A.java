package X;

import W.B;

/**
 *
 * @author sam
 */
public class A extends B{

    public A(String name, int age) {
        super(name, age);
    }
    
    public String getNameFromA() {
        return super.getName();
    }
    
    public int getAgeFromA() {
        return super.getAge();
    }
}

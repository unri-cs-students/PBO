package W;

/**
 *
 * @author sam
 */
public class B {
    private String name;
    private int age;
    
    public B(String name, int age){
        this.name = name;
        this.age = age;
    }
        
    protected String getName() {
        return this.name;
    }
    
    protected int getAge() {
        return this.age;
    }
}

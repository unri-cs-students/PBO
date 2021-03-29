import X.*;

/**
 *
 * @author sam
 */
public class MainApplication {
    public static void main(String[] args) {
        A a = new A("sammi", 19);
        C c = new C("dev", 20);
        
        System.out.println(a.getNameFromA());
        System.out.println(a.getAgeFromA());
        
        
        System.out.println(c.getNameFromC());
        System.out.println(c.getAgeFromC());
    }
}

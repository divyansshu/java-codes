//java program to demonstrate that object og both super class and subclass
//refers to same object

package refersToSameObject;
import java.util.*;

public class fruits {

    public fruits() {

        System.out.println("super class constructor");

        System.out.println("super class object hashcode : "+ this.hashCode());

        System.out.println(this.getClass().getName());
    }
}

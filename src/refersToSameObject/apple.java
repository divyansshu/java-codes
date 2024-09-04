package refersToSameObject;
import java.util.*;

public class apple extends fruits {

    public apple() {

        System.out.println("subclass constructor invoked");

        System.out.println("sub class object hashcode : "+ this.hashCode());

        System.out.println(this.hashCode()+" "+super.hashCode());

        System.out.println(this.getClass().getName()+" "+super.getClass().getName());
    }
}

package inheritance;

//child class of box
public class boxWeight extends box {

 double weight;

     boxWeight() {

        this.weight = -1;
    }

    public boxWeight(double l, double h, double w, double weight) {
        super(l, h, w); //call the parent class constructor
        /* used to initialize values present in parent class */
        this.weight = weight;


    }

}

package OOP.Inheritance;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight(){
//        super();
//        NOTE: If super( ) is not used in subclass' constructor,
//        then the default or parameterless constructor of each superclass will be executed.
        this.weight = 0.0;
    }

    public BoxWeight(double w, double h, double d, double weight){
        super(w , h , d); //using super keyword to calss the superclass constructor
        this.weight = weight;
    }
}

package OOP.Inheritance;

public class Box {
     double width;
     double height;
     double depth;

     public Box(){
         this.width = 0.0;
         this.height = 0.0;
         this.depth = 0.0;
     }
    public Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    //here you can see we are the name of the constructor is same but the parameter is different
    //this is the exmaple of the method overloading



}

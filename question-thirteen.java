/*T
he MallardDuck and RubberDuck derived classes extend the Duck base class. In the MallardDuck and RubberDuck derived 
classes, define an overridden method named getBehavior that returns the string "squeaks" and "flies", respectively.
 
Write code in the derived class of RubberDuck.java that has the following method:
getBehavior: an overridden method that returns the string "squeaks"
 
Write code in the derived class of MallardDuck.java that has the following method:
getBehavior: an overridden method that returns the string "flies"
 
If the input is:
 
Mallard Austin
Rubber Squeaker
 
the output when "Mallard" is the duck type, "Austin" is the duck name, "Rubber" is the duck type, and 
"Squeaker" is the duck name is:
 
Duck Information:
Austin the Mallard duck flies!
Squeaker the Rubber duck squeaks!
 */

 /*MALLARD DUCK .JAVA */
 public class MallardDuck extends Duck {
    public MallardDuck(String name) {
        super(name, "Mallard");
    }

    @Override
    public String getBehavior() {
        return "flies";
    }
}

/*RUBBER DUCK.JAVA */
public class RubberDuck extends Duck {
    public RubberDuck(String name) {
        super(name, "Rubber");
    }

    @Override
    public String getBehavior() {
        return "squeaks";
    }
}

package src.DifferenceObjectsClasses.src;


public class DifferenceObjectsClasses {
    
    // class definition
    public static class Parent {

        // class properties (instance variables)
        private String name;
        private int age;
        private int kidCount;

        // the template of all objects (parameterized constructor)
        public Parent (String name, int age) {
            this.name = name;
            this.age = age;
            this.kidCount = 0;
        }

        // class methods (behavior)
       
        // getter methods - access private data
        public String getName() { return this.name; }
        public int getAge() { return this.age; }
        public int getKidCount() { return this.kidCount; }

        // setter methods - change the behavior
        public void addKid () { kidCount++; }

    }
    // use main to create and use objects of the class
    public static void main(String[] args) {
        // create 2 Parent objects (instances of the parent class)
        DifferenceObjectsClasses.Parent p1 = new DifferenceObjectsClasses.Parent("Kelly Davis", 45);
        DifferenceObjectsClasses.Parent p2 = new DifferenceObjectsClasses.Parent("Logan Walters", 48);

        // use the parent class method to add children to these objects
        p1.addKid();
        p1.addKid();
        p2.addKid();
        p2.addKid();
        p2.addKid();

        // display the unique differences between the 
        // two objects from the same class

        System.out.println("Object 1: " + p1.getName() + ", " 
        + p1.getAge() + " has " + p1.getKidCount() + " children.");

        System.out.println(); // blank line
        
        System.out.println("Object 2: " + p2.getName() + ", " 
        + p2.getAge() + " has " + p2.getKidCount() + " children.");
        
    }
}

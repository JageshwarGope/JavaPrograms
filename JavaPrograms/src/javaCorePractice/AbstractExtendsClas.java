

package javaCorePractice;

abstract class abstractClass {  // removed "public" need to add public if this class will be in another file
    public abstract String getName();
   // public abstract int a; // abstract variable is not allowed but normal we can write
    public int b;
}

public class AbstractExtendsClas extends abstractClass {
    
    private String name;
    
    public AbstractExtendsClas(String name) {
        this.name = name;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    public static void main(String[] args) {
    	AbstractExtendsClas normal = new AbstractExtendsClas("Jagu");
        System.out.println(normal.getName()); 
        
       // abstractClass AC = new abstractClass("Hello"); // errorwe cannot create object for abstract class
        
        
    }
}

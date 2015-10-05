package week5;

public class LectureNote {

    public static void main(String[] args)
    {
        outputRecord();
        System.out.println("");
        
        sayHi("Kihoon");
        System.out.println("");
        
        mashup("hello", "world");
        System.out.println("");
        
        double A1=sphereArea(3.5);
        System.out.println(A1);
        System.out.println("");
        
        double A2=cylinderArea(10,5);
        System.out.println(A2);
        System.out.println("");
    }
    
    public static void outputRecord()
    {
        System.out.println("My First name : Ki-hoon");
        System.out.println("My Last name : Lee");
        System.out.println("My College : Lambton College");
    }
    
    public static void sayHi(String name)
    {
        System.out.println("Hi "+name+"!");
    }
    
    public static void mashup(String a, String b)
    {
        System.out.println(a+b+a+b);
    }
    
    public static double sphereArea( double r )
    {
        double A;
        
        A=4*Math.PI*Math.pow(r,2);
    
        return A;
    }
    
    public static double cylinderArea( double r, double h )
    {
        double A;
        
        return A=2*Math.PI*r*h+2*Math.PI*Math.pow(r,2);
    }
}
    

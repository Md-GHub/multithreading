package Synchronization;

public class singleton {
    private static volatile singleton Singleton = null ; 
    
    private singleton(){
            this.Singleton = new singleton();
    }



    public static synchronized singleton createObj(){
        if(Singleton!=null) return Singleton;
        System.out.println("Object created!");
        Singleton = new singleton();
        return Singleton;
    }
}

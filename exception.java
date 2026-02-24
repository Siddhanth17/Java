class exception{
    static void fun(){
        try{
            throw new nullpointereception("demo")
        }
    }
    catch(NullPointerException e){
        System.out.println("caught inside fun().");
        throw e; // rethrowing the exception
    }
}

public class Assi4 {
    public static void main(String[] args) {
        try{
            fun();
        }
        catch(NullPointerException e){
            System.out.println("caught in main.");
        }
    }
}
class parent{
    void display(){
        System.out.println("This is the parent class.");
    }
}

class child extends parent{
    @Override
    void display(){
        throw new NullPointerException("Unchecked Exception: Null Pointer Exception");
    }
}

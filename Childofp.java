import java.io.IOException;

class parent{
    void display() throws IOException{
        System.out.println("This is the parent class.");
    }
}

class Childofp extends parent{
    @Override
    void display() throws IOException{
        throw new IOException("Checked Exception: IO Exception");
    }
}

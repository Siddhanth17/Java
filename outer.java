class outer{
    class inner{
        void display(){
            System.out.println("Inner class method called");
        }
    }    public static void main(String args[]){
            outer.inner obj = new outer().new inner();
            obj.display();
    }
}


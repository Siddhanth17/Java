class account{
    void display(){
        System.out.println("This is account class");
    }
}

class savings extends account{
    void show(){
        System.out.println("This is savings account");
    }
    void interest(){
        System.out.println("Savings account interest rate is 4%");
    }
    void balance(){
        System.out.println("Savings account balance is 10000");
    }
}

class current extends account{
    void show(){
        System.out.println("This is current account");
    }
    void interest(){
        System.out.println("Current account interest rate is 5%");
    }
    void balance(){
        System.out.println("Current account balance is 20000");
}
}
class accountjava{
    public static void main(String args[]){
        savings s = new savings();
        current c = new current();
        
        s.display();
        s.show();
        s.interest();
        s.balance();
        
        c.display();
        c.show();
        c.interest();
        c.balance();
    }
}
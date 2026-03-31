abstract class casestudy3a {
    protected double basefee;

    public casestudy3a(double basefee) {
        this.basefee = basefee;
    }

    abstract double calculatebill(double usage);
}

class basicplan extends casestudy3a {
    public basicplan() {
        super(100);
    }

    double calculatebill(double usage) {
        return basefee;
    }
}

class premiumplan extends casestudy3a {
    public premiumplan() {
        super(200);
    }
    double calculatebill(double usage) {
        if (usage <= 1000) {
            return basefee;
        } else {
            return basefee + (usage - 1000) * 0.1;
        }
    }
}

class goldplan extends casestudy3a {
    public goldplan() {
        super(500);
    }

    double calculatebill(double usage) {
        double amount = basefee + usage * 0.05;
        return amount * 0.9;
    }
}

interface discountable {
    double applydiscount(double amount);
}

class bill {
    public static void main(String[] args) {
        casestudy3a p1 = new basicplan();
        casestudy3a p2 = new premiumplan();
        casestudy3a p3 = new goldplan();

        double b1 = p1.calculatebill(1000);
        double b2 = p2.calculatebill(2000);
        double b3 = p3.calculatebill(1000);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
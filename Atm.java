package HelloWorld;

class Atm {
    void withdraw() {
        System.out.println("withdraw logic");
    }

    void depoiste() {
        System.out.println("deposite logic");
    }
}

 class Demo extends Atm {
    public static void main(String[] args) {
        Atm ff = new Atm();
        ff.withdraw();
        ff.depoiste();
    }
}
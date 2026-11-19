public class Main{
    public static void main(){
        Customer customer1 = new Customer("철수",10000, false);
        Barista barista = new Barista(3000, 2);

        customer1.order(barista, "아메리카노");

        System.out.println("----");

        Customer customer2 = new Customer("영희",5000, false);
        customer2.order(barista, "아메리카노");

        System.out.println("----");

        customer1.order(barista, "아메리카노");
    }
}
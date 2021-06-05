import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Do you want to enter information about two goods?(y/n) ");
        char answer = (char) System.in.read();
        if (answer == 'y') {
            System.out.print("Enter name of the first good: ");
            String name1 = in.next();
            System.out.print("Enter price of the first good: ");
            double price1 = in.nextDouble();
            System.out.print("Enter the quantity of delivered ones of first good: ");
            int num_d1 = in.nextInt();
            System.out.print("Enter the quantity of purchased ones of first good: ");
            int num_p1 = in.nextInt();
            GoodInStore ob1 = new GoodInStore(name1, price1, num_d1, num_p1);
            ob1.increase_price();
            System.out.printf("Price of first good increased by 5%%: %.3f\n", ob1.getPrice());
            System.out.printf("Profit from selling first good per month: %.3f\n", ob1.profit_per_month());
            int num_of_purchased_goods1 = ob1.getNumber_of_purchased_goods_per_month();
            ob1.buy_good();
            if (ob1.getNumber_of_purchased_goods_per_month() - num_of_purchased_goods1> 0) {
                System.out.println("The quantity of purchased ones of first good after buying one more:" + ob1.getNumber_of_purchased_goods_per_month());
            }
            GoodInStore ob2 = new GoodInStore();
            System.out.print("Enter name of the second good: ");
            String name2 = in.next();
            ob2.setName(name2);
            System.out.print("Enter price of the second good: ");
            double price2 = in.nextDouble();
            ob2.setPrice(price2);
            System.out.print("Enter the quantity of delivered ones of second good: ");
            int num_d2 = in.nextInt();
            ob2.setNumber_of_delivered_goods_per_month(num_d2);
            System.out.print("Enter the quantity of purchased ones of second good: ");
            int num_p2 = in.nextInt();
            ob2.setNumber_of_purchased_goods_per_month(num_p2);
            System.out.print("Enter the procent for increasing price of second good: ");
            double percent = in.nextDouble();
            ob2.increase_price(percent);
            System.out.printf("Price of second good increased by %.2f%%: %.3f\n", percent,ob2.getPrice());
            System.out.printf("Profit from selling second good per month: %.3f\n", ob2.profit_per_month());
            System.out.print("Enter the quantity ones of second good for buying: ");
            int number_goods_for_buying = in.nextInt();
            int num_of_purchased_goods2 = ob2.getNumber_of_purchased_goods_per_month();
            ob2.buy_good(number_goods_for_buying);
            if(ob2.getNumber_of_purchased_goods_per_month() - num_of_purchased_goods2 > 0) {
                System.out.printf("The quantity of purchased ones of second good after buying %d ones: %d", number_goods_for_buying, ob2.getNumber_of_purchased_goods_per_month());
            }
            }
        else{
            GoodInStore ob1 = new GoodInStore("Bicycle",5850.5,30,18);
            System.out.println("First good: "+ob1.toString());
            ob1.increase_price();
            System.out.printf("Price of first good increased by 5%%: %.3f\n", ob1.getPrice());
            System.out.printf("Profit from selling first good per month: %.3f\n", ob1.profit_per_month());
            int num_of_purchased_goods1 = ob1.getNumber_of_purchased_goods_per_month();
            ob1.buy_good();
            if (ob1.getNumber_of_purchased_goods_per_month() - num_of_purchased_goods1 > 0) {
                System.out.println("The quantity of purchased ones of first good after buying one more:" + ob1.getNumber_of_purchased_goods_per_month());
            }
            GoodInStore ob2 = new GoodInStore();
            ob2.setName("Scooter");
            ob2.setPrice(3250);
            ob2.setNumber_of_delivered_goods_per_month(20);
            ob2.setNumber_of_purchased_goods_per_month(12);
            System.out.println("Second good: "+ob2.toString());
            double percent = 7.5;
            ob2.increase_price(percent);
            System.out.printf("Price of second good increased by %.2f%%: %.3f\n", percent,ob2.getPrice());
            System.out.printf("Profit from selling second good per month: %.3f\n", ob2.profit_per_month());
            int num_of_purchased_goods2 = ob2.getNumber_of_purchased_goods_per_month();
            int number_goods_for_buying = 4;
            ob2.buy_good(number_goods_for_buying);
            if (ob2.getNumber_of_purchased_goods_per_month()-num_of_purchased_goods2 > 0) {
                System.out.printf("The quantity of purchased ones of second good after buying %d ones: %d",number_goods_for_buying, ob2.getNumber_of_purchased_goods_per_month());
            }
        }
    }
}

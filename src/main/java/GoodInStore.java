public class GoodInStore {
    private String name;
    private double price;
    private int number_of_delivered_goods_per_month;
    private int number_of_purchased_goods_per_month;

    GoodInStore(String name, double price, int numd, int nump){
        this.setName(name);
        this.setPrice(price);
        this.setNumber_of_delivered_goods_per_month(numd);
        this.setNumber_of_purchased_goods_per_month(nump);
    }

    GoodInStore(){
        this.setName("");
        this.setPrice(1);
        this.setNumber_of_delivered_goods_per_month(0);
        this.setNumber_of_purchased_goods_per_month(0);
    }
    //Функция для получения прибыли за месяц
    double profit_per_month(){
        return price*number_of_purchased_goods_per_month;
    }
    //Функция для увелечения цены на заданный пользователем процент
    void increase_price(double percent){
        if(percent>100||percent<0){
            System.out.println("Procents must be between 0 and 100!");
            System.exit(1);
        }
        price = price + price * percent / 100;
    }
    //Функция для увелечения цены на 5%
    void increase_price(){
        price = price + price * 5 / 100;
    }
    //Функция для увелечения количества купленных товаров на 1
    void buy_good(){
        if(number_of_delivered_goods_per_month-number_of_purchased_goods_per_month>=1){
            number_of_purchased_goods_per_month++;
        }
        else{
            System.out.println("Unfortunately, there is no available ones.");
        }
    }
    //Функция для увелечения количества купленных товаров на заданное пользователем число
    void buy_good(int k){
        if(number_of_delivered_goods_per_month-number_of_purchased_goods_per_month>=k){
            number_of_purchased_goods_per_month+=k;
        }
        else{
            System.out.println("Unfortunately, there is no available ones.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if(this.name == null){
            System.out.println("String can`t be empty!");
            System.exit(1);
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        if(this.price<0){
            System.out.println("Price can`t be negative!");
            System.exit(1);
        }
        else if(this.price==0){
            System.out.println("Price can`t be zero!");
            System.exit(1);
        }
    }

    public int getNumber_of_delivered_goods_per_month() {
        return number_of_delivered_goods_per_month;
    }

    public void setNumber_of_delivered_goods_per_month(int number_of_delivered_goods_per_month) {
        this.number_of_delivered_goods_per_month = number_of_delivered_goods_per_month;
        if(this.number_of_delivered_goods_per_month<0){
            System.out.println("Quantity can`t be negative!");
            System.exit(1);
        }
    }

    public int getNumber_of_purchased_goods_per_month() {
        return number_of_purchased_goods_per_month;
    }

    public void setNumber_of_purchased_goods_per_month(int number_of_purchased_goods_per_month) {
        this.number_of_purchased_goods_per_month = number_of_purchased_goods_per_month;
        if(this.number_of_purchased_goods_per_month<0){
            System.out.println("Quantity can`t be negative!");
            System.exit(1);
        }
        else if(this.number_of_delivered_goods_per_month<this.number_of_purchased_goods_per_month){
            System.out.println("Quantity of purchased goods can`t be more than delivered ones!");
            System.exit(1);
        }
    }

    @Override
    public String toString() {
        return "GoodInStore{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", number_of_delivered_goods_per_month=" + number_of_delivered_goods_per_month +
                ", number_of_purchased_goods_per_month=" + number_of_purchased_goods_per_month +
                '}';
    }
}


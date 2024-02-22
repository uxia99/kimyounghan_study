package intermediate.class1;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder tofu = new ProductOrder();
        tofu.productName = "두부";
        tofu.price = 2000;
        tofu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder cola = new ProductOrder();
        cola.productName = "콜라";
        cola.price = 1500;
        cola.quantity = 2;

        ProductOrder[] products = new ProductOrder[] {tofu, kimchi, cola};

        int sum = 0;

        for (ProductOrder p : products) {
            System.out.println("상품명 : " + p.productName + ", 가격 : ₩" + p.price + ", 수량 : " + p.quantity + "개");
            sum += p.price * p.quantity;
        }

        System.out.println("총 결제 금액 : ₩" + sum);
    }
}

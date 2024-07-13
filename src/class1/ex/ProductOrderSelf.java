package class1.ex;

public class ProductOrderSelf {

    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열
        ProductOrder[] orders = new ProductOrder[3];

        // 상품 주문 정보를 'ProductOder' 타입의 변수로 받아 저장
        ProductOrder tofu = new ProductOrder();
        tofu.productName = "Tofu";
        tofu.price = 2000;
        tofu.quantity = 2;
        orders[0] = tofu;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "Kimchi";
        kimchi.price = 5000;
        kimchi.quantity = 1;
        orders[1] = kimchi;

        ProductOrder cola = new ProductOrder();
        cola.productName = "Cola";
        cola.price = 1500;
        cola.quantity = 2;
        orders[2] = cola;

        // 상품 주문 정보와 최종 금액을 출력
        int total = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명:" + order.productName + ", 가격 :" + order.price + ", 수량:" + order.quantity);
           total += order.price * order.quantity;
        }

        System.out.println("총 결제 금액:" + total);
        
    }
}

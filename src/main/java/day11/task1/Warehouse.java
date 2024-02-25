package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }
    public String toString(){
        return "количество собранных заказов" + getCountPickedOrders() + " количество доставленных заказов: "
                + getCountDeliveredOrders();
    }
    public void upCountPickedOrders(){
        countPickedOrders++;
    }
    public void upCountDeliveredOrders() {
        countDeliveredOrders++;
    }
}


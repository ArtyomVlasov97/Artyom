package day11.task1;


public class Courier implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse w;

    public Courier(Warehouse w){
        this.w=w;
    }
    public void doWork(){
        salary+=100;
        w.upCountDeliveredOrders();
    }
    public void bonus(){
        if(isPayed==true){
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if(w.getCountDeliveredOrders()>=10000){
            salary+=50000;
            isPayed=true;
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }
    public String toString(){
        return "заработная плата: " + getSalary() + " Бонус: " + isPayed();
    }
    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }
}

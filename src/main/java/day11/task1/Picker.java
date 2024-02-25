package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed = false;
    private Warehouse w;

    public Picker(Warehouse w){
        this.w = w;
    }
    public void doWork(){
        salary+=80;
        w.upCountPickedOrders();
    }
    public void bonus(){
        if(isPayed==true){
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if(w.getCountPickedOrders()>=10000){
            salary+=70000;
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
package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse sklad = new Warehouse();
        Picker picker1 = new Picker(sklad);
        Courier courier1 = new Courier(sklad);
        Warehouse sklad1 = new Warehouse();
        Picker picker2 = new Picker(sklad);
        businessProcess(picker1);
        businessProcess(courier1);
        System.out.println(picker1);
        System.out.println(courier1);
        businessProcess(picker2);
        System.out.println(picker2);
        System.out.println(picker1);
    }
    static void businessProcess(Worker worker){
        for(int i = 0; i<10000; i++){
            worker.doWork();
        }
        worker.bonus();
    }
}

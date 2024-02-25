package day11.task2;

public abstract class Hero {
    protected int health;
    protected double physDef;
    protected double magicDef;
    protected int physAtt;
    protected int magicAtt;

    public Hero(){
        this.health = 100;
    }
    double getHealth (){
        return health;
    }
    double getPhysDef (){
        return physDef;
    }
    double getMagicDef () {
        return magicDef;
    }
    double getPhysAtt(){
        return physAtt;
    }
    double getMagicAtt () {
        return magicAtt;
    }
}

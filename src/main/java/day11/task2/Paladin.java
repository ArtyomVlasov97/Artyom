package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack{
    public Paladin(){
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }
    public void physicalAttack(Hero hero){
        double axe = (physAtt - (physAtt * hero.physDef));
        if(hero.health - axe < 0){
            hero.health = 0;
        } else {
            hero.health -= axe;
        }
    }
    public void healHimself() {
        if(health>100){
            health=100;
        } else {
            health+=25;
        }
    }
    public void healTeammate(Hero hero) {
        hero.health+=10;
        if(hero.health>100){
            hero.health=100;
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}

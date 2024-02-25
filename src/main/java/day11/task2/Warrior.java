package day11.task2;

public class Warrior extends Hero implements PhysAttack{

public Warrior(){
    physAtt = 30;
    physDef = 0.8;
    magicDef = 0;
}
 public void physicalAttack(Hero hero){
double axe = (physAtt - (physAtt * hero.physDef));
if(hero.health - axe < 0){
    hero.health = 0;
} else {
    hero.health -= axe;
}
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}

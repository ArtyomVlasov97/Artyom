package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{
    public Magician(){
        physDef = 0;
        magicDef = 0.8;
        physAtt = 5;
        magicAtt = 20;
    }
    public void magicalAttack(Hero hero){
        double magic = (magicAtt - (magicAtt * hero.magicDef));
        if(hero.health - magic < 0){
           hero.health = 0;
        } else {
            hero.health -= magic;
        }
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
        return "Magician{" +
                "health=" + health +
                '}';
    }
}

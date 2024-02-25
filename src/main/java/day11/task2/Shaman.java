package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer{

    public Shaman(){
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 10;
        magicAtt = 15;
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
    public void healHimself() {
        if(health>100){
            health=100;
        } else {
            health+=50;
        }
    }
    public void healTeammate(Hero hero) {
        hero.health+=30;
        if(hero.health>100){
            hero.health=100;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}

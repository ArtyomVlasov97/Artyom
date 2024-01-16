package day6;

public class Teacher {
    private String name;
    private String object;
    public Teacher(String name, String object) {
        this.name = name;
        this.object = object;
    }
     public void evaluate (Student name){
        name.equals(name);
        int point = (int)(Math.random()*4) +2;
        String vZachet = "";
        switch(point) {
            case 2:
                vZachet = "неудовлетворительно";
                break;
            case 3:
                vZachet = "удовлетворительно";
                break;
            case 4:
                vZachet = "хорошо";
                break;
            default:
                vZachet = "отлично";
                break;
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + name.getName() + " по предмету " + this.object + " на оценку " + vZachet);
    }
}

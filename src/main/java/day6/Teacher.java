package day6;

public class Teacher {
    private String name;
    private String object;
    public Teacher(String name, String object) {
        this.name = name;
        this.object = object;
    }
     void evaluate (Student name){
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
            case 5:
                vZachet = "отлично";
                break;
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + name.getName() + " по предмету " + this.object + " на оценку " + vZachet);
    }
}

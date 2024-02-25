package day13;

public class Task1 {
    public static void main(String[] args) {
User user1 = new User("Bob");
User user2 = new User("John");
User user3 = new User("Logan");
user1.sendMessage(user2,"Привет, John!");
        user1.sendMessage(user2,"Как дела?");
        user2.sendMessage(user1,"Привет!");
        user2.sendMessage(user1,"Хорошо!");
        user2.sendMessage(user1,"У тебя как?");
        user3.sendMessage(user1,"Привет, Bob!");
        user3.sendMessage(user1,"Как оно?");
        user3.sendMessage(user1,"Все хорошо?");
        user1.sendMessage(user3,"Привет, Logan!");
        user1.sendMessage(user3,"Все отлично");
        user1.sendMessage(user3,"У тебя как?");
        user3.sendMessage(user1,"Отлично");
        MessageDatabase.showDialog(user1,user3);
        user1.subscribe(user3);
            System.out.println(user1.getSubscriptions());
            System.out.println(user1.isSubscribed(user3));
            System.out.println(user1.isFriend(user3));
            user3.subscribe(user1);
            System.out.println(user3.getSubscriptions());
            System.out.println(user3.isSubscribed(user1));
            System.out.println(user1.isFriend(user3));
    }
}

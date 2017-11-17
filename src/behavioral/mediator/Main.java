package behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        SimpleTextChat chat=new SimpleTextChat();
        User admin=new Admin("Admin", chat);

        User user1=new SimpleUser("User 1",chat);
        User user2=new SimpleUser("User 2",chat);

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Holla, I am User 1");
        admin.sendMessage("Holla, I am Admin");


    }
}

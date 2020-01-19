package day44;

public class SlackUser {

    protected String name;
    protected String status;

    // sendMessage
//	 callSomeone
//	 addEmoji
    public void sendMessage() {
        System.out.println("SlackUser " + name + " typing");
    }

    public void callSomeone() {
        System.out.println("SlackUser " + name + " calling");
    }

    public void addEmoji() {
        System.out.println("SlackUser " + name + " adding emoji :) ");
    }


}

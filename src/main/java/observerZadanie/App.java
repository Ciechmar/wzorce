package observerZadanie;

public class App {
    public static void main(String[] args) {
        Button button = new Button();
//        SmsSender smsSender = new SmsSender();
//        SmsSender smsSender2 = new SmsSender();
//        EmailSender emailSender = new EmailSender();
        button.addLisneter(new SmsSender());
        button.addLisneter(new SmsSender());
        button.addLisneter(new EmailSender());
        button.addLisneter(new EmailSender());
        button.click();


    }
}

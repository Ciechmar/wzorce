package observerZadanie;

public class App {
    public static void main(String[] args) {
        Button button = new Button();
        SmsSender smsSender = new SmsSender();
        SmsSender smsSender2 = new SmsSender();
        EmailSender emailSender = new EmailSender();
        button.addLisneter(smsSender);
        button.addLisneter(smsSender2);
        button.addLisneter(emailSender);
        button.click();


    }
}

package Module3KonstruktorObjekts;

/**
 * Created by user on 05.12.2016.
 */
public class User {

    String name;
    int age ;
    String comany;


    public User(String name, int age, String comany) {
        this.name = name;
        this.age = age;
        this.comany = comany;
    }

    void speak() {
        System.out.println("FFF");
    }

    void sendEmail(){

    }
}

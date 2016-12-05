package Module3KonstruktorObjekts;

/**
 * Created by user on 05.12.2016.
 */
public class Main {


    public static void main(String[] args) {

        testUser();
        testUser1();

    }


    static void testUser(){

        User user = new User("alex",20,"ddd");
        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.name);

        user.speak();
        user.sendEmail();


    }

    static  void  testUser1(){

        User user1  = new User("Alex",20,"Alexx");
        System.out.println(user1.comany);
        System.out.println(user1.age);
        System.out.println(user1.name);


    }
}

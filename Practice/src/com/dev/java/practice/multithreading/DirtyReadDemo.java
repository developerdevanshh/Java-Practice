package Practice.src.com.dev.java.practice.multithreading;

class UserProfile {
    private String firstName = "John";
    private String lastName = "Doe";

    // Writer - Updates both fields
//    void update(){
//        firstName = "Jane";
//        try {Thread.sleep(1000);} catch (InterruptedException e) { }
//        // Reader reads here - sees "Jane Doe" - inconsistent!
//        lastName = "Smith";
//    }

    // Writer - Updates both fields using synchronized keyword
    synchronized void update(){
        firstName = "Jane";
        try {Thread.sleep(1000);} catch (InterruptedException e) { }
        lastName = "Smith";
    }

    // Reader - reads both fields
    void display(){
        System.out.println("Name : " + firstName + " " + lastName);
        // Either sees "John Doe" or "Jane Smith" — never mixed
    }
}


public class DirtyReadDemo {
    public static void main(String[] args) {
        UserProfile profile = new UserProfile();

        Thread writer = new Thread( () -> profile.update());

        Thread reader = new Thread(() -> {
            try { Thread.sleep(50);} catch (InterruptedException e){ }
            profile.display();
        });

        writer.start();
        reader.start();

    }
}

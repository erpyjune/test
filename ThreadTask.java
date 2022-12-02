
public class ThreadTask extends Thread {
    
}

public static void main(String[] args) {
    ThreadTask task = new ThreadTask();
    task.run();
    System.out.println("test");
}

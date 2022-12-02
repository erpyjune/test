
public class ThreadTask extends Thread {
    private int a = 0;    
    private int c = 0;    
}

public static void main(String[] args) {
    ThreadTask task = new ThreadTask();
    task.run();
    System.out.println("test");
    System.out.println("test");
}

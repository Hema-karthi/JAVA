import java.io.*;

class Table implements Runnable {

    String message;

    Table(String message) {
        this.message = message;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(message + " " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
}

class RunnableInterfacetask {
    public static void main(String args[]) {

        Table t1 = new Table("Reading");
        Table t2 = new Table("Writing");

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);

        th1.start();
        th2.start();
    }
}
class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Thread is running");
    }
}

class ThreadDemo
{
    public static void main(String args[])
    {
        MyThread t = new MyThread();   // New State
        
        t.start();                     // Runnable State
        
        System.out.println("Main method finished");
    }
}

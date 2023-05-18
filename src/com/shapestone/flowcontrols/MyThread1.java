package com.shapestone.flowcontrols;

// Case 1
// Java Program to illustrate Creation and execution of
// thread via start() and run() method in Single inheritance
  
// Class 1
// Helper thread Class extending main Thread Class
class MyThread1 extends Thread {
  
    // Method inside MyThread2
    // run() method which is called as
    // soon as thread is started
	
    public void run()
    {
    	for (int i=0; i<=10; i++) {
    		// Print statement when the thread is called
            System.out.println("Thread1 is running ::"+ i + getName());
    	}
        
    }
    
    public static void main(String[] args) {
		MyThread1 m1 = new MyThread1();
		MyThread1 m2 = new MyThread1();
		m2.setName("Second");
		m1.setName("First");
		m1.start();
		m1.start();
		

    }
}
package com2;

import java.time.LocalTime;


public class DaemonThreadDemo {

	public static void main(String[] args)  {
		
		Thread t = new Thread(new displayTime());
		 t.setDaemon(true);
		 t.start();
		 
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
class displayTime implements Runnable {
    public void run() {
    		while(true) {
       System.out.println(LocalTime.now());
       try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
       }
    }
}



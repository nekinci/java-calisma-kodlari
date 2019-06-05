package com.org.y;

public class threadOrnegiRunnable implements Runnable {

	Thread kanal;
	
	public void threadOrnegiRunnablee() {
		kanal=new Thread(this);
		kanal.start();
		try {
			kanal.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		threadOrnegiRunnablee();
	}

	
	
}

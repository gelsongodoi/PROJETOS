package br.com.deserve.xml.model;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class BatchExecution {
	Timer timer;

	public BatchExecution(int seconds) {
		timer = new Timer();
		timer.schedule(new RemindTask1(), 0, seconds * 2500L);
	}

	class RemindTask1 extends TimerTask {
		@Override
		public void run() {
			try {
				Toolkit.getDefaultToolkit().beep();
				String data = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
						.format(new Date());
				System.out.println("Hora:" + data);
				System.out.println("Rodando a cada 5 segundos");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[]) {
		new BatchExecution(2);
	}
}
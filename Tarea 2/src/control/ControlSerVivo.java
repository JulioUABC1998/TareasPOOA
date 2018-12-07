package control;

import entity.SerVivo;

public class ControlSerVivo extends Thread{
	
	private SerVivo serVivo;

	public ControlSerVivo(SerVivo serVivo) {
		super();
		this.serVivo = serVivo;
	}

	@Override
	public void run() {
		
		int incrementoX = 1;
		int incrementoY = 1;
		
		while(true) {
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		serVivo.setX(serVivo.getX()+incrementoX);
		
		if(serVivo.getX() > 500)
			incrementoX = -1;
		if (serVivo.getX() < 0)
			incrementoX = 1;
		
		serVivo.setY(serVivo.getY()+incrementoY);
		
		if(serVivo.getY() > 500)
			incrementoY = -1;
		if (serVivo.getY() < 0)
			incrementoY = 1;
		
		System.out.println(serVivo.getName()  + " (" + serVivo.getX() + "," + serVivo.getY() + ")");
		
		}
	}



}

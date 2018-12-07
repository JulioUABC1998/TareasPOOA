package entity;

import java.io.Serializable;

public class SerVivo implements Serializable{
	
	int x = 0;
	int y = 0;
	String name = "";
	Biotopo biotopo = null;
	
	public SerVivo(int x, int y, String name, Biotopo biotopo) {
		super();
		this.x = x;
		this.y = y;
		this.name = name;
		this.biotopo = biotopo;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Biotopo getBiotopo() {
		return biotopo;
	}

	public void setBiotopo(Biotopo biotopo) {
		this.biotopo = biotopo;
	}

}

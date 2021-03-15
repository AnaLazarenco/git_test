

public class Cerc implements Shape {

	protected float raza;
	
	public Cerc(float raza) {
		super();
		this.raza = raza;
	}
	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return raza*raza*PI;
	}
	public float getRaza() {
		return raza;
	}
	public void setRaza(float raza) {
		this.raza = raza;
	}
	
}

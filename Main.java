import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Cerc> vectorulDeCercuri= new  Vector<Cerc>();
		List<Cerc> listaDeCercuri= new  ArrayList<Cerc>();
		
		System.out.println("Vectorul de cercuri are urmatoarele arii");
		for(int i=0 ;i<10;i++)
		{
			vectorulDeCercuri.add(new Cerc(i+1));
			System.out.println("\tCercul "+(i+1)+" are aria "+vectorulDeCercuri.elementAt(i).getArea());
		}
		
		System.out.println("\nLista de cercuri are urmatoarele arii");
		for(int i=0;i<10;i++)
		{
			listaDeCercuri.add(new Cerc(i+1));
			System.out.println("\tCercul "+i+1+" are aria "+listaDeCercuri.get(i).getArea());
		}
		
		
	}

}

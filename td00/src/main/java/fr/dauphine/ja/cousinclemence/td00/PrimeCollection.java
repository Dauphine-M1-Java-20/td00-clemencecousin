package fr.dauphine.ja.cousinclemence.td00;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PrimeCollection 
{	
	private ArrayList<Integer> numbers;
	
	public PrimeCollection() {
		this.numbers = new ArrayList<>();		
	}
	
	public void initRandom(int n,int m) {
		for(int i=0; i < n; i++) {
			this.numbers.add(ThreadLocalRandom.current().nextInt(0, m) * (m + 1));
		}
	}
	
	public void addNumber(int a) {
		this.numbers.add(a);
	}
	
	boolean isPrime(int p) {
		if(Math.sqrt(p) <= 1) {
			return true;
		}
		else if(p == 2) {
			return true;
		}
		boolean indicator = true;
		for(double i = 2; i < Math.sqrt(p)+1;i++) {
			if(p%i == 0) {
				indicator = false;
				break;
			}
		}
		return indicator;
		
	}
	
	public void printPrimes() {
		for(int numb : this.numbers) {
			if(isPrime(numb)) {
				System.out.println(numb);
			}
		}
	}
	
    public static void main( String[] args )
    {
        PrimeCollection p = new PrimeCollection();
        p.initRandom(100, 1000);
        p.printPrimes();
    }
}

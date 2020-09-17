package fr.dauphine.ja.cousinclemence.td00;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PrimeCollectionTest 
    extends TestCase
{
	PrimeCollection p = new PrimeCollection();
 
     public void testPrimeCollection()
    {
        assertTrue(true);
    }
     
    public void testZeroIsPrime() {
      	assertTrue(p.isPrime(0));
    }
    
    public void testTwoIsPrime() {
    	assertTrue(p.isPrime(2));
    }
    
    public void testNineIsPrime() {
    	assertFalse(p.isPrime(9));
    }

}

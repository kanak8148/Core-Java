package set;

import java.util.HashSet;
import java.util.Set;

//set contaion only unique elements 
//set contaion only one null value
// hashset in unorderd 
// null value ko sort nahi hoti hai

public class TestHashSet {
	
	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		s.add(null);
		s.add(null);
		s.add('a');
		s.add('b');
		s.add('c');
		s.add('k');
		s.add('e');
		s.add('f');
		s.add('g');
		s.add('a');
		s.add('a');
		s.add('a');
		
		System.out.println("Set:" + s);
		
		
	}

}

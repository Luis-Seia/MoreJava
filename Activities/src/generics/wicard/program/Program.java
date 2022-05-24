package generics.wicard.program;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String args[]) {
		List<Object> obj = new ArrayList<Object>(); 
		List<Integer> in = new ArrayList<Integer>();
		//obj = in Erro de compilacao 
		// List<Object> nao e supertipo de qualquer tipo de lsita;
		
		// O supertipo de qualquer tipo e um tipo curinga
		List<?> obj1 = new ArrayList<Object>(); 
		List<Integer> inter = new ArrayList<Integer>();
		obj1 = inter;
	}
}

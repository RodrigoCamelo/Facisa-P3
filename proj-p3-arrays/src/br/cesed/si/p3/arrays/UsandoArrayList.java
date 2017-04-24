package br.cesed.si.p3.arrays;

import java.util.ArrayList;

public class UsandoArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> meuAl = new ArrayList<String>(); //não tem limite
		
		meuAl.add("Daniel");
		meuAl.add("Wesley Safadão com Cabelo Cortado");

		for (String string : meuAl) {
			System.out.println(string);
		}
	}
}

package br.com.java.io.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializacion {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		String dato = "Diego";
		Cliente dato = new Cliente("Diego", 123456L, 29);
		// Output -> Quien envia
//		ObjectOutputStream objectOutputStream = 
//				new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		objectOutputStream.writeObject(dato);
//		objectOutputStream.close();
		
		// Input -> Quien lee o recibe 
		ObjectInputStream objectInputStream =
				new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente resultado = (Cliente) objectInputStream.readObject();
		System.out.println(resultado.getDocumento());
	}

}

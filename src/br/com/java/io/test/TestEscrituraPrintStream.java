package br.com.java.io.test;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

public class TestEscrituraPrintStream {
	
	public static void main(String[] args) throws IOException {
		OutputStream fileOutputStream = new FileOutputStream("texto-generado.txt");
		// Proceso el archivo
		Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		// Escribir el archivo
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		
		bufferedWriter.write("Primera linea de mi archivo generado");
		bufferedWriter.newLine();
		bufferedWriter.write("Segunda linea de mi archivo generado");
		
		bufferedWriter.close();
		
		PrintStream printStream = new PrintStream("texto-print-stream.txt");
		printStream.println("Primera linea generada via print stream");
		printStream.close();
	}

}

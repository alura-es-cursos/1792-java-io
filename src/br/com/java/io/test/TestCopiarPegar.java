package br.com.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TestCopiarPegar {

	public static void main(String[] args) throws IOException {

		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		OutputStream fileOutputStream = new FileOutputStream("texto-copia.txt");
		Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);


		String linea;

		while ((linea = bufferedReader.readLine()) != null) {
			bufferedWriter.write(linea);
			bufferedWriter.newLine();
		}
		
		bufferedWriter.close();
	}

}

package com.shapestone.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleFileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("students.json");

		System.out.println(file.isFile());

		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.canExecute());

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream(file);
			out = new FileOutputStream("output.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}

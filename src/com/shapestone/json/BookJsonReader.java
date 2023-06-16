package com.shapestone.json;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class BookJsonReader {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper ojm = new ObjectMapper();
		Book[] book = ojm.readValue(new java.io.File("book.json"), Book[].class);

		for (int i = 0; i < book.length; i++) {
			System.out.println(book[i].getTitle());
			System.out.println(book[i].getIsbn());
			System.out.println(book[i].getYear());
			System.out.println(book[i].getLanguage());
			System.out.println(book[i].getPages());
			System.out.println(book[i].getAuthors());
			System.out.println(book[i].getPublishers());

		}
	}
}
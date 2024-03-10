package com.jspider.serializationanddeserialization.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.jspider.serializationanddeserialization.objects.User;

public class Serialization {
	public static void main(String[] args) throws IOException {
		File file=new File("D:/File/Demo.txt");
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(new User(1,"Ram","ram@gmail.com",9960528903l));
		System.out.println("Object has been created");
		objectOutputStream.close();
		fileOutputStream.close();
		

}
}

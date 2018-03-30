package com.corejava.serializable;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyExternalizableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		externizationTest();
		
		deExternizationTest();
		
	}
	
	public static void deExternizationTest() {
		
		Employee1 emp1 ;
		Employee1 emp2 ;
		
		try {
			InputStream in = new FileInputStream("emp1.txt");
			ObjectInput objIn = new ObjectInputStream(in);
			
			System.out.println("DeExternization process starts....s");
			emp1 = (Employee1)objIn.readObject();
			emp2 = (Employee1)objIn.readObject();
			
			System.out.println(emp1.toString());
			System.out.println(emp2.toString());
			objIn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void externizationTest() {
		
		Employee1 emp = new Employee1("Arun", "Pune");
		Employee1 emp1 = new Employee1("Pankaj", "Bangalore");
		
		OutputStream out;
		try {
			out = new FileOutputStream("emp1.txt");
			ObjectOutput objOut = new ObjectOutputStream(out);
			System.out.println("Externization process starts....s");
			objOut.writeObject(emp);
			objOut.writeObject(emp1);
			objOut.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


class Employee1 implements Externalizable{
	
	
	private String name;
	private String city;
	

	public Employee1(String name, String city) {
		super();
		System.out.println("In Employee1 Constructor...");
		this.name = name;
		this.city = city;
	}
	

	public Employee1() {
		super();
		System.out.println("In Employee1 Default Constructor...");
	}



	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("In writeExternal..");
		out.writeObject(name);
		out.writeObject(city);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		System.out.println("In readExternal..");
		this.name = (String)in.readObject();
		this.city = (String)in.readObject();
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + "]";
	}
	
}

package com.corejava.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class MySerializableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		objectSerilized();
		System.out.println("Serilization Complete..");
		objectDeserilized();
		System.out.println("Deserilization Complete..");

	}
	
	
	
	public static void objectDeserilized() {
		Employee emp ;
		try {
			InputStream in = new FileInputStream("employee.txt");
			ObjectInput onjIn = new ObjectInputStream(in);
			System.out.println("Deserilization process started..");
			emp = (Employee)onjIn.readObject();
			System.out.println(emp.toString());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	// Serilization method
	public static void objectSerilized() {
		
		Employee emp = new Employee("Arun", "Baner");
		
		try {
			OutputStream out = new FileOutputStream("employee.txt");
			ObjectOutput objOut = new ObjectOutputStream(out); 
			System.out.println("Serilization process has started...");
			objOut.writeObject(emp);
			
			objOut.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private transient String address;
	private String city;
	private Deparment dept;
	
	public Employee(String name, String address) {
		super();
		System.out.println("Employee constructor called...");
		this.name = name;
		this.address = address;
		//this.dept = new Deparment("IT");
	}
	
	public void readObject(ObjectInputStream obj) throws Exception  {
		
		System.out.println("In readObject method..");
		
		name = (String)obj.readObject();
		
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", city=" + city + "]";
	}
	
}

class Deparment{
	
	private String deptName;

	public Deparment(String deptName) {
		super();
		this.deptName = deptName;
	}
	
}
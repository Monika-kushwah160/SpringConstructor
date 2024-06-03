package com.springProject.constructor;

public class Student1 
{
	private int StudentId;
	private String StudentName;
	private int maths;
	private int english;
	private int science;
	public Student1(int studentId, String studentName, int maths, int english, int science)
	{
		this.StudentId = studentId;
		this.StudentName = studentName;
		this.maths = maths;
		this.english = english;
		this.science = science;
	}

	public void run()
	{
		System.out.print("student Id: "+StudentId +"\n"+"Student Name: "+StudentName+"\n"+"maths mark: "+maths+"\n"+"English mark: "+english+"\n"+"Science mark: "+science+"\n");
		
		
		int total = maths+english+science;
		double average = total/3;
		
		if(average>=70)
		{
			System.out.println("Grade : A");
		}
		else if(average<=69 && average>=60)
		{
			System.out.println("Grade : B");
		}
		else if(average<=59 && average>=40)
		{
			System.out.println("Grade : C");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}

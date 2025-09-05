package com.a59;

class Sender
{
	public void send(String msg)
	{
		System.out.println("Sending "+msg);
		
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(msg+" Sent");
	}
}
class Threadsend extends Thread
{
	Sender sender;
	String msg;
	public Threadsend(Sender sender,String msg) 
	{
		this.sender =sender;
		this.msg=msg;
	}
	
	@Override
	public void run() 
	{
		synchronized (sender) 
		{
			sender.send(msg);
		}
		
	}
}


public class Example3 
{
	public static void main(String[] args) 
	{
		Sender sender = new Sender();
		
		Threadsend t1 = new Threadsend(sender,"Hii");
		Threadsend t2 = new Threadsend(sender,"Byee");
		
		t1.start();
		t2.start();
	}
}

package org.jan26.mockExam;

import java.util.*;
interface Notification{
	void send();
}

class EmailNotification implements Notification{
	public void send(){
		System.out.println("Notification Send via Email....");
	}
}
class SMSNotification implements Notification{
	public void send(){
		System.out.println("Notification Send via SMS....");
	}
}

public class Q5{
	public static void main(String[] args){
		
		Notification n1 = new EmailNotification();
		n1.send();
		
		Notification n2 = new SMSNotification();
		n2.send();
	}
}
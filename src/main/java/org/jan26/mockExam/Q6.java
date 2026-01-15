package org.jan26.mockExam;

import java.util.*;

class Food{
	private int id;
	private String name;
	private int price;
	private String category;
	
	public Food(int id, String name, int price, String category){
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public int getId(){return id;}
	public String getName(){return name;}
	public int getPrice(){return price;}
	public String getCategory(){return category;}
}

public class Q6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Food> foodList = new ArrayList<Food>(); 
		do{
			System.out.println("Enter your Choice : ");
			System.out.println("1. Add All Food Details\n2. Display All Food Details\n3. Display Bill Details\n4. Exit...");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter Food id, name, Price And Category:");
					int fid = sc.nextInt();
					sc.nextLine();
					String fName = sc.nextLine();
					int fprice = sc.nextInt();
					sc.nextLine();
					String fcategory = sc.nextLine();
					foodList.add(new Food(fid, fName, fprice, fcategory));
					break;
				case 2:
					System.out.println("Given Foods are :");
					System.out.println("--------------------------------------------------------------");
					System.out.println("Foodid\tFoodName\tPrice\tCategory");
					System.out.println("--------------------------------------------------------------\n");
					for(Food f : foodList)	System.out.println(f.getId()+"\t"+f.getName()+"\t"+f.getPrice()+"\t"+f.getCategory());
					System.out.println("\n--------------------------------------------------------------\n\n");
					break;
				case 3:
					int total = 0;
					for(Food f : foodList){
						total += f.getPrice();
					};
					
					int billWithGst = (total + (total*18/100));
					
					System.out.println("--------------------------------------------------------------");
					System.out.println("Total bill of Food is : "+total);
					System.out.println("\nTotal bill of Food Without GSt : "+total);
					System.out.println("\nTotal bill of Food With Gst : "+billWithGst);
					System.out.println("--------------------------------------------------------------");
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("You Enterd Wrong Choice");
			}
		}while(true);
	}
}
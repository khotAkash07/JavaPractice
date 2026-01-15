package org.jan26.mockExam;

import java.util.*;
import java.util.stream.*;
class Product{
    private int id;
    private String name;
    private String category;

	public Product(int id, String name, String category){
		this.id = id;
		this.name = name;
		this.category = category;
	}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatagory() {
        return category;
    }

    public void setCatagory(String category) {
        this.category = category;
    }
	
	public String toString(){
		return ("Product [ id = " + id + ", name= '" + name + "', Category= '" + category + "' ]");
	}
}

public class Q10{
    public static void main(String [] args){
		
		
		Scanner sc = new Scanner(System.in);
		List<Product> productList  = new ArrayList<Product>();
		
		for(int i=0; i<3; i++){
			System.out.println("Enter Product id, name, category ");
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String category = sc.nextLine();
			productList.add(new Product(id,name,category));
		}
		
		Map<String, List<Product>> map = productList.stream().collect(Collectors.groupingBy(p -> p.getCatagory()));
		
		
		map.entrySet().stream().forEach((m) -> {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		});
    }
}

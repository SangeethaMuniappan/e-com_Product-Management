//package day04.lab;

import java.util.LinkedList;
import java.util.Scanner;

public class W5D4lab {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> products =new LinkedList<String>();
		products.add("Laptop");
		products.add("TV");
		products.add("Fan");

		System.out.println("Enter Username :");
		String username=sc.next();
		System.out.println("Enter Password :");
		String password=sc.next();
		if(username.equals("Admin") && password.equals("1234")) {
			System.out.println("Available products are :");
			for(int i=0;i<products.size();i++) {
				System.out.print(products.get(i)+" ");
			}			
			int choice;
			do {
				System.out.println("\n1.Add Product : Press '1' to add");
				System.out.println("2.Update Product : Press '2' to update");
				System.out.println("3.Delete Product : Press '3' to delete");
				System.out.println("4.Search Product : Press '4' to search");
			
				System.out.println("Enter your choice :");
				 choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Enter the product you want to add :");
					String addElement=sc.next();
					addproduct(addElement,products);
					break;
				case 2:
					System.out.println("Enter the available product to update :");
					String availableElement=sc.next();
					System.out.println("Enter the new product you want to update :");
					String updateElement=sc.next();
					updateproduct(availableElement,updateElement,products);
					break;
				case 3:
					System.out.println("Enter the product you want to remove :");
					String deleteElement=sc.next();
					deleteproduct(deleteElement,products);
					break;
				case 4:
					System.out.println("Enter the product you want to search :");
					String searchElement=sc.next();
					searchproduct(searchElement,products);
					break;
				}
				System.out.println("\nPress any number to continue");
				System.out.println("If you want to end the task press '0'");
				choice=sc.nextInt();
			}while(choice!=0);
			
		}else
			System.out.println("You Are Not Admin.Only Admin Can logged in!!!");

	}

	private static void searchproduct(String searchElement, LinkedList<String> products) {
		// TODO Auto-generated method stub
		int index=products.indexOf(searchElement);
		if(index==-1) {
			System.out.println("The Product you searched is not available");
		}else {
			System.out.println("The Product you searched is available in the index of :"+index);
		}
	     
		
	}

	private static void updateproduct(String availableElement, String updateElement, LinkedList<String> products) {
	
		int index=products.indexOf(availableElement);
		if(index==-1) {
			System.out.println("The Product is not available in the list");
		}else {
		products.remove(index);
		products.add(index, updateElement);
		System.out.println("Your Product Updated Successfully!!!");
		System.out.println("Products List after update the product is :");
		for(int i=0;i<products.size();i++) {
			System.out.print(products.get(i)+" ");
		}
		}
		
	}

	private static void deleteproduct(String deleteElement, LinkedList<String> products) {
		
		int index=products.indexOf(deleteElement);
		if(index==-1) {
			System.out.println("The Product is not available in the list");
		}else {
		products.remove(index);
		System.out.println("Your Product Removed Successfully!!!");
		System.out.println("Products List after remove the product is :");
		for(int i=0;i<products.size();i++) {
			System.out.print(products.get(i)+" ");
		}
		}
	}

	private static void addproduct(String addElement, LinkedList<String> products) {
		products.add(addElement);
		System.out.println("Your Product Added Successfully!!!");
		System.out.println("Added products are :");
		for(int i=0;i<products.size();i++) {
			System.out.print(products.get(i)+" ");
		}
	}
	
	

}

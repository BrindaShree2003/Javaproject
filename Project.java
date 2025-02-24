package Project;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		
		Phone obj=new Phone();
		
	
		Scanner display = new Scanner(System.in);
		System.out.println("Do you want a phone(yes/no):");	
		
			String a = display.next();	
			if(a.equals("yes")) {
				System.out.println("Which Phone do you want(Samsung/Apple):");
				String b = display.next();
				if(b.equals("Apple")) {
					System.out.println("Which model do you want(iphone14/iphone15/iphone16):");
					String c= display.next();
					if(c.equals("iphone14")||c.equals("iphone15")||c.equals("iphone16"))
							 {
						System.out.println("Which colour do you want(Black/Blue/White");
						String d= display.next();
						if(d.equals("Black")||d.equals("Blue")||d.equals("White")) {
							System.out.println("Which Variant do you want(256GB/512GB):");
							String e=display.next();
							if(e.equals("256GB")||e.equals("512GB")) {
								System.out.println("Specifications for your phone");
								System.out.println("Brand:Apple");
								System.out.println("Model:"+c);
								System.out.println("Colour:"+d);
								System.out.println("Variant:"+e);
								obj.Apple();
							}
							else {
								System.out.println("No other Variant are available");
							}
							
						}
						else {
							System.out.println("No other colours are available");
						}
					}
					else {
						System.out.println("No other models are available");
					}
				
					
				}
				else if(b.equals("Samsung")) {

					System.out.println("Which model do you want(S22/S23/S24):");
					String c= display.next();
					if(c.equals("S22")||c.equals("S23")||c.equals("S24"))
							 {
						System.out.println("Which colour do you want(Black/Blue/White");
						String d= display.next();
						if(d.equals("Black")||d.equals("Blue")||d.equals("White")) {
							System.out.println("Which Variant do you want(256GB/512GB):");
							String e=display.next();
							if(e.equals("256GB")||e.equals("512GB")) {
								System.out.println("Specifications for your phone");
								System.out.println("Brand:Samsung");
								System.out.println("Model:"+c);
								System.out.println("Colour:"+d);
								System.out.println("Variant:"+e);
								obj.Samsung();
							}
							else {
								System.out.println("No other variants are available");
							}
							
						}
						else {
							System.out.println("No other colours are available");
						}
					}
					else {
						System.out.println("No other Models are available");
					}
					
				
				}
				else {
					System.out.println("No others mobile brands are available!!!!");
				}
			}
			
			
			else {
				System.out.println(" please visit again");
			}
			
			
	


			
	}	

	}



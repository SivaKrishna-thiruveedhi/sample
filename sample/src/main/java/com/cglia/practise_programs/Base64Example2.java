package com.cglia.practise_programs;

import java.util.Base64;
import java.util.Scanner;

public class Base64Example2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name to store in DB");
		String encrytedName = sc.next();
		System.out.println("Enter the password to store in DB");
		String encrytedPass = sc.next();
		
		Base64.Encoder encode = Base64.getEncoder();

		/* Low Security 
		 * encrytedName = encode.encodeToString(encrytedName.getBytes());
		 * encrytedPass = encode.encodeToString(encrytedPass.getBytes());
		 */
		
		
//		High Security
		for (int i = 0; i < 5; i++) {
			encrytedName = encode.encodeToString(encrytedName.getBytes());
			encrytedPass = encode.encodeToString(encrytedPass.getBytes());
		}
		
		
		System.out.println(encrytedName+"\n"+encrytedPass);
		
		System.out.println("\n\nEncrypted Name length : ----->>>  "+encrytedName.length());
		System.out.println("Encrypted Password length : ----->>>  "+encrytedPass.length());
		sc.close();
		System.out.println("***************");
		System.out.println("***************");
		System.out.println("***************");
	}
}
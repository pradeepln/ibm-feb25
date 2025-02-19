package com.ibm.training.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopier {

	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("you've to pass src and dest files as cmd line args");
			System.exit(0);
		}
		
		String srcFile = args[0];
		String destFile = args[1];
		
		try {
			FileInputStream in = new FileInputStream(srcFile);
			FileOutputStream out = new FileOutputStream(destFile);
			int aByte;
			while((aByte = in.read()) != -1) {
				out.write(aByte);
			}
			
			in.close();
			out.close();
			System.out.println("\t1 file(s) copied.");
		}catch (FileNotFoundException e) {
			System.out.println(srcFile+" not found!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

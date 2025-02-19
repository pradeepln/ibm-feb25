package com.ibm.training.io;

import java.io.File;
import java.util.Date;

public class DirLister {

	public static void main(String[] args) {
		String path = (args.length > 0) ? args[0] : ".";
		
		File folderToList = new File(path);
		if(folderToList.exists() && folderToList.isDirectory()) {
			File[] contents = folderToList.listFiles();
			for(int i = 0; i < contents.length; i++) {
				File current = contents[i];
				System.out.print(new Date(current.lastModified()) + "\t");
				System.out.print((current.isDirectory()) ? "<DIR>" : "     ");
				System.out.print("\t" + ((current.isFile()) ? current.length() : "     "));
				System.out.println("\t" + current.getName());
			}
		}else {
			System.out.println(path + " either doesn't exist or not a directory");
		}
	}

}

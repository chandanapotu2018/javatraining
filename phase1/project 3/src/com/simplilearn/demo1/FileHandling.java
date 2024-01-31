package com.simplilearn.demo1;

	import java.io.FileWriter;
	import java.util.Scanner;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.io.FileReader;
	import java.io.PrintWriter;

	public class FileHandling {
		public static void main(String[] args) {
			char ch;
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter a word to write w to read r and to append a");
				ch=sc.next().charAt(0);
				switch(ch) {
				case 'w':
				{
					System.out.println("enter a text to be written to a file");
					sc.nextLine();
					String text=sc.nextLine();
					FileWriter fwriter=new FileWriter("C:\\readwriteappend\\filehandling");
					fwriter.write(text);
					fwriter.close();
					System.out.println("File with data given has been written successfully");
					break;
				}
				case 'r':
				{
					FileReader fr=new FileReader("C:\\readwriteappend\\filehandling");
					int i;
					while((i=fr.read())!=-1)
						System.out.println((char)i);
					fr.close();
					break;
				}
				case 'a':
				{
					PrintWriter pw=new PrintWriter("C:\\readwriteappend\\filehandling");
					pw.append('s');
					System.out.println("File after append");
					pw.flush();
					break;
				}
				default:
					System.out.println("Invalid character");
					break;
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
}

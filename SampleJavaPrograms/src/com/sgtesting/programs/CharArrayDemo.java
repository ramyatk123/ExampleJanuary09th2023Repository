package com.sgtesting.programs;

public class CharArrayDemo {

	public static void main(String[] args) {
		
		char ch[][]= {{'A','S','D','F'},{'Q','W','E','R'}};
		int i=0;
		while(i<ch.length)
		{
			int j=0;
			while(j<ch[i].length) {
				System.out.print(ch[i][j]+"  ");
				j++;
			}
			i++;
			System.out.println();
		}

	}

}

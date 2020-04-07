package container;

import java.util.ArrayList;

public class NoteBook {
	private ArrayList<char[]> notes = new ArrayList<char[]>();
	
	public void add(char[] e){
		notes.add(e);
	}
	public void add(int index, char[] element){
		notes.add(index, element);
	}
	public void remove(int index){
		notes.remove(index);
	}
	public void set(int index, char[] element){
		notes.set(index, element);
	}
	public int size(){
		return notes.size();
	}
	public String toString(){
		return notes.toString();
	}
	public static void main(String[] args) {
//		NoteBook n = new NoteBook();
//		char[] s = new char[3];
//		for 
//		n.add(s);
//		System.out.println("s="+s+", n="+n);
//		
//		s[0] = 'h';
//		System.out.println("s="+s+", n="+n);
//		
//		n.notes.set(0, "mmm");
//		System.out.println("s="+s+", n="+n);
		
		
	}
}

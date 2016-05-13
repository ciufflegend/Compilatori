package antlr.antlr;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {

	public int a;
	public int b;
	
	FileWriter w = new FileWriter(".//output.txt");
	BufferedWriter writer = new BufferedWriter(w);
	
	public Main(){
		
	}
	
	public void setBattuta(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void writeNota(int c, int t){
		//TODO
	}
	
	
	public void writeChord(char n){
		//TODO
	}
	
	public void writePowerchord(char n){
		//TODO
	}
	
	public void writeStrumming(int a, int b, int c, int d, int e, int f){
		//TODO
	}
	
	public void writeSlideup( int c, int t1, int t2){
		//TODO
	}
	
	public void writeSlidedown( int c, int t1, int t2){
		//TODO
	}
	
	public void writeHammer( int c, int t1, int t2){
		//TODO
	}
	
	public void writePulloff( int c, int t1, int t2){
		//TODO
	}
	
	
}

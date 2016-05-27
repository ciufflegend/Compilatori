package antlr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.antlr.runtime.*;


public class ParserTester  {
	static ScannerParser parser;
	public String fout;
  
	
	public static void main(String[] args) {
		CommonTokenStream tokens;
  String fileIn = ".\\src\\resources\\input.file";
  	String fileOut1 = ".\\src\\resources\\parser.ANTLR.out.txt";
//  	String fileOut2 = ".\\resources\\parser.JFLEX.out.txt";
  	String fileErr1 = ".\\src\\resources\\parser.ANTLR.err.txt";
//  	String fileErr2 = ".\\resources\\parser.JFLEX.err.txt";
  	
  	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  	System.out.println("Insert Input File Relative Path:");
    try {
		String s1 = br.readLine();
	fileIn=".\\"+s1;

    } catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		try {
			System.out.println ("Parsing con ANTLR lexer");
			System.out.println ("-----------------------");
			ScannerLexer lexer = new ScannerLexer(new ANTLRReaderStream(new FileReader(fileIn))); 
	    tokens = new CommonTokenStream(lexer);
	    parse (tokens, fileOut1, fileErr1);
		} catch (Exception e) {
			System.out.println ("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}

/*		try {
			System.out.println ("Parsing con JFLEX lexer");
			System.out.println ("-----------------------");
	    JFLEXScannerSemanticLexer jl = new JFLEXScannerSemanticLexer(new FileReader(fileIn));
	    tokens = new CommonTokenStream(jl);
	    parse (tokens, fileOut2, fileErr2);
		} catch (Exception e) {
			System.out.println ("Parsing con JFLEX abortito\n");
			e.printStackTrace();
		}*/

  }
  static void parse (CommonTokenStream tokens, String fileOut, String fileErr) throws IOException, RecognitionException {
    parser = new ScannerParser(tokens);
    parser.start();

   if (parser.getErrors().size() == 0)
   System.out.println ("Parsing completato con successo\n\n");
   else 
   System.out.println ("Parsing completato con " + parser.getErrors().size() + " errori semantici\n\n");
/*
    FileWriter fOut = new FileWriter (fileOut);
  	fOut.append(parser.getTranslation());
    fOut.close();

    fOut = new FileWriter (fileErr);
  //	for (int i=0; i<parser.getErrors().size(); i++)
  //		fOut.append((i+1) + ":" + parser.getErrors().get(i) + "\n");    	
    fOut.close();
    */
  }
}

package antlr;

import java.io.BufferedReader;
import java.io.FileReader;

import org.antlr.runtime.*;


public class Test {

	static String fileIn = ".\\src\\resources\\input.file";
  	static String fileOut1 = ".\\src\\resources\\lexer.ANTRL.txt";
  	/**
	 * @param args
	 * @throws RecognitionException 
	 */
	public static void main(String[] args) throws RecognitionException {
		// leggiamo file da interpretare
		String content = "";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileIn));
		    
			String line;
		    while ((line = reader.readLine()) != null) {
		    	content = content + line + "\n\r";
		    }
		    reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// eseguiamo il parsing del file
		CharStream charStream = new ANTLRStringStream(content);
		ScannerLexer lexer = new ScannerLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        ScannerParser parser = new ScannerParser(tokens);
        //parser.setOutputPath("/Users/andreabusi/Desktop/");
        
		try {
			parser.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore nel parsing!");
		}
				
        System.out.println("\nDone!");
	}

}

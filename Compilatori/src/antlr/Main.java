package antlr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {

	public int a;
	public int b;
	public int count = 0;
	public int l;
	String fileOut = null;//".\\src\\resources\\output.txt";


	public Main() {
		//String fileOut = ".\\src\\resources\\output.txt";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  	
		 System.out.println("Insert Output File Relative Path:");
		String s2 = null;
		try {
			s2 = br.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    fileOut=".\\"+s2;

		List<String> lines = Arrays.asList(" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
				" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
				" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
				" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
				" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
				" ", " ", " ", " ", " ", " ", " ", " ", " ");

		try {
			Files.write(Paths.get(fileOut), lines, Charset.forName("UTF-8"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void writeTitle(String t) {
		List<String> lines;
		try {
			lines = Files.readAllLines(Paths.get(fileOut));
			lines.set(0, t.toUpperCase());
			Files.write(Paths.get(fileOut), lines);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void writeAuthor(String t) {
		List<String> lines;
		try {
			lines = Files.readAllLines(Paths.get(fileOut));
			lines.set(1, t.toUpperCase());
			Files.write(Paths.get(fileOut), lines);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void writeBar() {
		write('|', '|', '|', '|', '|', '|', false);
	}

	public void writeBattuta(int a, int b) {
		List<String> lines;
		try {
			lines = Files.readAllLines(Paths.get(fileOut));
			lines.set(2, a + "\\" + b);
			Files.write(Paths.get(fileOut), lines);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void write(char a, char b, char c, char d, char e, char f) {

		// ReadFile file = new ReadFile(path);
		try {
			List<String> lines = Files.readAllLines(Paths.get(fileOut));

			lines.set(5 + l, lines.get(5 + l) + a);
			lines.set(6 + l, lines.get(6 + l) + b);
			lines.set(7 + l, lines.get(7 + l) + c);
			lines.set(8 + l, lines.get(8 + l) + d);
			lines.set(9 + l, lines.get(9 + l) + e);
			lines.set(10 + l, lines.get(10 + l) + f);

			Files.write(Paths.get(fileOut), lines);

			count++;
			if (count % this.a == 0) {
				writeBar();
				count = 0;
			}

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	// @Overload per le grafiche che non fanno avanzare il contatore di battuta
	public void write(char a, char b, char c, char d, char e, char f, boolean flag) {

		if (flag) {
			write(a, b, c, d, e, f);
			return;
		}
		// ReadFile file = new ReadFile(path);
		try {
			List<String> lines = Files.readAllLines(Paths.get(fileOut));
			/*
			 * if (count % a == 0) { count++; writeBar(); count = 0; }
			 */
			lines.set(5 + l, lines.get(5 + l) + a);
			lines.set(6 + l, lines.get(6 + l) + b);
			lines.set(7 + l, lines.get(7 + l) + c);
			lines.set(8 + l, lines.get(8 + l) + d);
			lines.set(9 + l, lines.get(9 + l) + e);
			lines.set(10 + l, lines.get(10 + l) + f);

			Files.write(Paths.get(fileOut), lines);

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void setBattuta(int a, int b) {
		this.a = 2*a;
		this.b = b;
	}

	public void newLine() {
		l += 8;
	}

	public void writeNota(int c, int t) {
		switch (c) {
		case 1:
			write('-', '-', '-', '-', '-', Character.forDigit(t, 10));
			break;
		case 2:
			write('-', '-', '-', '-', Character.forDigit(t, 10), '-');
			break;
		case 3:
			write('-', '-', '-', Character.forDigit(t, 10), '-', '-');
			break;
		case 4:
			write('-', '-', Character.forDigit(t, 10), '-', '-', '-');
			break;
		case 5:
			write('-', Character.forDigit(t, 10), '-', '-', '-', '-');
			break;
		case 6:
			write(Character.forDigit(t, 10), '-', '-', '-', '-', '-');
			break;
		default:
			break;
		}
	}

	public void writeChord(String n) {
		switch (n) {
		case "C":
			write('0', '1', '0', '2', '3', '-');
			break;
		case "D":
			write('2', '3', '2', '0', '-', '-');
			break;
		case "E":
			write('0', '0', '1', '2', '2', '0');
			break;
		case "F":
			write('1', '1', '2', '3', '3', '1');
			break;
		case "G":
			write('3', '0', '0', '0', '2', '3');
			break;
		case "A":
			write('0', '2', '2', '2', '0', '-');
			break;
		case "B":
			write('2', '4', '4', '4', '2', '-');
			break;
		default:
			break;
		}
	}

	public void writePowerchord(int c, int t) {
		switch (c) {
		case 5:
			write('-', Character.forDigit(t, 10), Character.forDigit(t + 2, 10), Character.forDigit(t + 2, 10), '-',
					'-');
			break;
		case 6:
			write(Character.forDigit(t, 10), Character.forDigit(t + 2, 10), Character.forDigit(t + 2, 10), '-', '-',
					'-');
			break;
		}

	}

	public void writeStrumming(char a, char b, char c, char d, char e, char f) {
		write(f,e,d,c,b,a);
	}

	public void writeSlideup(int c, int t1, int t2) {

		// prima nota
		switch (c) {
		case 1:
			write(' ', ' ', ' ', ' ', ' ', Character.forDigit(t1, 10), false);
			break;
		case 2:
			write(' ', ' ', ' ', ' ', Character.forDigit(t1, 10), ' ', false);
			break;
		case 3:
			write(' ', ' ', ' ', Character.forDigit(t1, 10), ' ', ' ', false);
			break;
		case 4:
			write(' ', ' ', Character.forDigit(t1, 10), ' ', ' ', ' ', false);
			break;
		case 5:
			write(' ', Character.forDigit(t1, 10), ' ', ' ', ' ', ' ', false);
			break;
		case 6:
			write(Character.forDigit(t1, 10), ' ', ' ', ' ', ' ', ' ', false);
			break;
		default:
			break;
		}
		// barra su
		switch (c) {
		case 1:
			write('-', '-', '-', '-', '-', '/', false);
			break;
		case 2:
			write('-', '-', '-', '-', '/', '-', false);
			break;
		case 3:
			write('-', '-', '-', '/', '-', '-', false);
			break;
		case 4:
			write('-', '-', '/', '-', '-', '-', false);
			break;
		case 5:
			write('-', '/', '-', '-', '-', '-', false);
			break;
		case 6:
			write('/', '-', '-', '-', '-', '-', false);
			break;
		default:
			break;
		}

		switch (c) {
		case 1:
			write(' ', ' ', ' ', ' ', ' ', Character.forDigit(t2, 10));
			break;
		case 2:
			write(' ', ' ', ' ', ' ', Character.forDigit(t2, 10), ' ');
			break;
		case 3:
			write(' ', ' ', ' ', Character.forDigit(t2, 10), ' ', ' ');
			break;
		case 4:
			write(' ', ' ', Character.forDigit(t2, 10), ' ', ' ', ' ');
			break;
		case 5:
			write(' ', Character.forDigit(t2, 10), ' ', ' ', ' ', ' ');
			break;
		case 6:
			write(Character.forDigit(t2, 10), ' ', ' ', ' ', ' ', ' ');
			break;
		default:
			break;
		}
	}

	public void writeSlidedown(int c, int t1, int t2) {
		// prima nota
		switch (c) {
		case 1:
			write(' ', ' ', ' ', ' ', ' ', Character.forDigit(t1, 10), false);
			break;
		case 2:
			write(' ', ' ', ' ', ' ', Character.forDigit(t1, 10), ' ', false);
			break;
		case 3:
			write(' ', ' ', ' ', Character.forDigit(t1, 10), ' ', ' ', false);
			break;
		case 4:
			write(' ', ' ', Character.forDigit(t1, 10), ' ', ' ', ' ', false);
			break;
		case 5:
			write(' ', Character.forDigit(t1, 10), ' ', ' ', ' ', ' ', false);
			break;
		case 6:
			write(Character.forDigit(t1, 10), ' ', ' ', ' ', ' ', ' ', false);
			break;
		default:
			break;
		}
		// barra giù
		switch (c) {
		case 1:
			write('-', '-', '-', '-', '-', '\\', false);
			break;
		case 2:
			write('-', '-', '-', '-', '\\', '-', false);
			break;
		case 3:
			write('-', '-', '-', '\\', '-', '-', false);
			break;
		case 4:
			write('-', '-', '\\', '-', '-', '-', false);
			break;
		case 5:
			write('-', '\\', '-', '-', '-', '-', false);
			break;
		case 6:
			write('\\', '-', '-', '-', '-', '-', false);
			break;
		default:
			break;
		}
		switch (c) {
		case 1:
			write(' ', ' ', ' ', ' ', ' ', Character.forDigit(t2, 10));
			break;
		case 2:
			write(' ', ' ', ' ', ' ', Character.forDigit(t2, 10), ' ');
			break;
		case 3:
			write(' ', ' ', ' ', Character.forDigit(t2, 10), ' ', ' ');
			break;
		case 4:
			write(' ', ' ', Character.forDigit(t2, 10), ' ', ' ', ' ');
			break;
		case 5:
			write(' ', Character.forDigit(t2, 10), ' ', ' ', ' ', ' ');
			break;
		case 6:
			write(Character.forDigit(t2, 10), ' ', ' ', ' ', ' ', ' ');
			break;
		default:
			break;
		}
	}

	public void writeHammer(int c, int t1, int t2) {
		// prima nota
		switch (c) {
		case 1:
			write(' ', ' ', ' ', ' ', ' ', Character.forDigit(t1, 10), false);
			break;
		case 2:
			write(' ', ' ', ' ', ' ', Character.forDigit(t1, 10), ' ', false);
			break;
		case 3:
			write(' ', ' ', ' ', Character.forDigit(t1, 10), ' ', ' ', false);
			break;
		case 4:
			write(' ', ' ', Character.forDigit(t1, 10), ' ', ' ', ' ', false);
			break;
		case 5:
			write(' ', Character.forDigit(t1, 10), ' ', ' ', ' ', ' ', false);
			break;
		case 6:
			write(Character.forDigit(t1, 10), ' ', ' ', ' ', ' ', ' ', false);
			break;
		default:
			break;
		}
		// h
		switch (c) {
		case 1:
			write('-', '-', '-', '-', '-', 'h', false);
			break;
		case 2:
			write('-', '-', '-', '-', 'h', '-', false);
			break;
		case 3:
			write('-', '-', '-', 'h', '-', '-', false);
			break;
		case 4:
			write('-', '-', 'h', '-', '-', '-', false);
			break;
		case 5:
			write('-', 'h', '-', '-', '-', '-', false);
			break;
		case 6:
			write('h', '-', '-', '-', '-', '-', false);
			break;
		default:
			break;
		}
		switch (c) {
		case 1:
			write(' ', ' ', ' ', ' ', ' ', Character.forDigit(t2, 10));
			break;
		case 2:
			write(' ', ' ', ' ', ' ', Character.forDigit(t2, 10), ' ');
			break;
		case 3:
			write(' ', ' ', ' ', Character.forDigit(t2, 10), ' ', ' ');
			break;
		case 4:
			write(' ', ' ', Character.forDigit(t2, 10), ' ', ' ', ' ');
			break;
		case 5:
			write(' ', Character.forDigit(t2, 10), ' ', ' ', ' ', ' ');
			break;
		case 6:
			write(Character.forDigit(t2, 10), ' ', ' ', ' ', ' ', ' ');
			break;
		default:
			break;
		}
	}

	public void writePulloff(int c, int t1, int t2) {
		// prima nota
		switch (c) {
		case 1:
			write(' ', ' ', ' ', ' ', ' ', Character.forDigit(t1, 10), false);
			break;
		case 2:
			write(' ', ' ', ' ', ' ', Character.forDigit(t1, 10), ' ', false);
			break;
		case 3:
			write(' ', ' ', ' ', Character.forDigit(t1, 10), ' ', ' ', false);
			break;
		case 4:
			write(' ', ' ', Character.forDigit(t1, 10), ' ', ' ', ' ', false);
			break;
		case 5:
			write(' ', Character.forDigit(t1, 10), ' ', ' ', ' ', ' ', false);
			break;
		case 6:
			write(Character.forDigit(t1, 10), ' ', ' ', ' ', ' ', ' ', false);
			break;
		default:
			break;
		}
		// p
		switch (c) {
		case 1:
			write('-', '-', '-', '-', '-', 'p', false);
			break;
		case 2:
			write('-', '-', '-', '-', 'p', '-', false);
			break;
		case 3:
			write('-', '-', '-', 'p', '-', '-', false);
			break;
		case 4:
			write('-', '-', 'p', '-', '-', '-', false);
			break;
		case 5:
			write('-', 'p', '-', '-', '-', '-', false);
			break;
		case 6:
			write('p', '-', '-', '-', '-', '-', false);
			break;
		default:
			break;
		}
		switch (c) {
		case 1:
			write(' ', ' ', ' ', ' ', ' ', Character.forDigit(t2, 10));
			break;
		case 2:
			write(' ', ' ', ' ', ' ', Character.forDigit(t2, 10), ' ');
			break;
		case 3:
			write(' ', ' ', ' ', Character.forDigit(t2, 10), ' ', ' ');
			break;
		case 4:
			write(' ', ' ', Character.forDigit(t2, 10), ' ', ' ', ' ');
			break;
		case 5:
			write(' ', Character.forDigit(t2, 10), ' ', ' ', ' ', ' ');
			break;
		case 6:
			write(Character.forDigit(t2, 10), ' ', ' ', ' ', ' ', ' ');
			break;
		default:
			break;
		}
	}

	void writePause() {
		write('-', '-', '-', '-', '-', '-');
	}

	void writePauseG() {
		write('-', '-', '-', '-', '-', '-', false);
	}
}

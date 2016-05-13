package antlr.antlr;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

	public int a;
	public int b;
	public int count = 0;

	public Path path;

	public Main() {

	}

	public void write(char a, char b, char c, char d, char e, char f) {

		// ReadFile file = new ReadFile(path);
		try {
			List<String> lines = Files.readAllLines(path);

			lines.set(0, lines.get(0) + a);
			lines.set(1, lines.get(1) + b);
			lines.set(2, lines.get(2) + c);
			lines.set(3, lines.get(3) + d);
			lines.set(4, lines.get(4) + e);
			lines.set(5, lines.get(5) + f);

			Files.write(path, lines);

			if (count == a) {
				for (int i = 0; i < 6; i++) {
					lines.set(i, lines.get(i) + "|");
				}
				count = 0;
			}

			count++;
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
			List<String> lines = Files.readAllLines(path);

			if (count == a) {
				for (int i = 0; i < 6; i++) {
					lines.set(i, lines.get(i) + "|");
				}
				count = 0;
			}

			lines.set(0, lines.get(0) + a);
			lines.set(1, lines.get(1) + b);
			lines.set(2, lines.get(2) + c);
			lines.set(3, lines.get(3) + d);
			lines.set(4, lines.get(4) + e);
			lines.set(5, lines.get(5) + f);

			Files.write(path, lines);

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void setBattuta(int a, int b) {
		this.a = a;
		this.b = b;
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

	public void writeChord(char n) {
		switch (n) {
		case 'C':
			write('-', '3', '2', '0', '1', '0');
			break;
		case 'D':
			write('-', '-', '0', '2', '3', '2');
			break;
		case 'E':
			write('0', '2', '2', '1', '0', '0');
			break;
		case 'F':
			write('1', '3', '3', '2', '1', '1');
			break;
		case 'G':
			write('3', '2', '0', '0', '0', '3');
			break;
		case 'A':
			write('-', '0', '2', '2', '2', '0');
			break;
		case 'B':
			write('-', '2', '4', '4', '4', '2');
			break;
		default:
			break;
		}
	}

	public void writePowerchord(char n) {
		// TODO
	}

	public void writeStrumming(int a, int b, int c, int d, int e, int f) {
		write(Character.forDigit(a, 10), Character.forDigit(b, 10), Character.forDigit(c, 10),
				Character.forDigit(d, 10), Character.forDigit(e, 10), Character.forDigit(f, 10));
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
			write('-', '-', '-', '-', '-', 'p' , false);
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

}

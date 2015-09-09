package FileIO;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;


public class FileIO {

	public static int add(Scanner input) {

		System.out.println("enter the integer");
		int resultAdd = 0;
		int  num1 = input.nextInt();
		int num2 = input.nextInt();
		resultAdd = num1 + num2;

		System.out.println("the sum of numbers is:"+resultAdd);

		return resultAdd;
	}


	public static int multiply(DataInputStream input2){
		int resultMul = 0;
		System.out.println("enter the integer");

		try {
			while (true) {	
				int num3 = Integer.parseInt(input2.readLine());
				int num4 = Integer.parseInt(input2.readLine());
				resultMul = num3 * num4;
				System.out.println("result:" + resultMul);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				input2.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		return resultMul;
	}




	public static void main(String args[]) {
		//Scanner input = new Scanner(System.in);
		//int add = add(input);

		//DataInputStream input2 = new DataInputStream(System.in);
		//int multiply = multiply(input2);

		Console input3 = System.console();
		int div = divide(input3);


	}


	public static int divide(Console input3) {
		int num5 = 0;
		int num6 = 0;
		String line = null;
		 
		if (input3 != null) {
			System.out.println("enter 2 integers for division:");

			line = input3.readLine();
			if (line != null) {
				num5 = Integer.parseInt(line);
			}

			line = input3.readLine();
			if (line != null) {
				num5 = Integer.parseInt(line);
			}


			while (true) {	
				num6 = Integer.parseInt(input3.readLine());
				break;
			}
			System.out.println(num5);
			System.out.println(num6);


		}
		int  resultdiv = (num5)/(num6);
		System.out.println(" resultdiv: " +resultdiv );

		return resultdiv;
	}
}

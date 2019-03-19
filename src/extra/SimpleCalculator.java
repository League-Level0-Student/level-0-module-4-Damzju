package extra;

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
		// 1. Get 2 numbers from the user and convert them to integer.
		String num0 = JOptionPane.showInputDialog("Pick a certain numero.");
		int ber0 = Integer.parseInt(num0);
		String num1 = JOptionPane.showInputDialog("Pick a certain numero. Pt.2");
		int ber1 = Integer.parseInt(num1);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Which operation do you like", "PEMDAS", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" }, null);
		System.out.println(operation); 
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate
		// operation.
		if (operation==0) {
			add(ber0, ber1);
		}
		
		if (operation==1) {
			subtract(ber0, ber1);
		}
		
		if (operation==2) {
			multiply(ber0, ber1);
		}
		
		if (operation==3) {
			divide(ber0, ber1);
		}
		/*add(ber0, ber1);
		subtract(ber0, ber1);
		multiply(ber0, ber1);
		divide(ber0, ber1);*/
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
		
			
		}
	}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }
	static void add(int ber0, int ber1) {
		JOptionPane.showMessageDialog(null, ber0 + "+" + ber1 + "=" + (ber0 + ber1));
	}

	// 4. Create similar methods for subtraction, multiplication and division.
	static void subtract(int ber0, int ber1) {
		JOptionPane.showMessageDialog(null, ber0 + "-" + ber1 + "=" + (ber0 - ber1));
	}

	static void multiply(int ber0, int ber1) {
		JOptionPane.showMessageDialog(null, ber0 + "x" + ber1 + "=" + (ber0 * ber1));
	}

	static void divide(int ber0, int ber1) {
		JOptionPane.showMessageDialog(null, ber0 + "/" + ber1 + "=" + (ber0 / ber1));
	}
}
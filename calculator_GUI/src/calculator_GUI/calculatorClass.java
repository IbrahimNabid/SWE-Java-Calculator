package calculator_GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class calculatorClass extends JFrame {

	private JPanel contentPane;
	private JTextField num1textField;
	private JTextField anstextField;
	private JTextField num2textField;
	double total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatorClass frame = new calculatorClass();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculatorClass() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// add button, adds both numbers when clicked on
		JButton addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
			    double num1 = Double.parseDouble(num1textField.getText());
           	    double num2 = Double.parseDouble(num2textField.getText());
           	    String n1 = num1textField.getText();
           	    String n2 = num2textField.getText();
           	    total = num1 + num2;
           	 
           	    String str = Double.toString(total);
           	    anstextField.setText(str);
           	    
           	    
			}
		});
		// sets bounds
		addButton.setBounds(19, 266, 117, 29);
		contentPane.add(addButton);
		
		// subtract button, subtracts both numbers when clicked on
		JButton subtractButton = new JButton("Subtract");
		subtractButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// convert to double
			    double num1 = Double.parseDouble(num1textField.getText());
           	    double num2 = Double.parseDouble(num2textField.getText());
           	 
           	    total = num1 - num2;
           	 
           	    String str = Double.toString(total);
           	    anstextField.setText(str);
			}
		});
		//sets bounds
		subtractButton.setBounds(142, 266, 117, 29);
		contentPane.add(subtractButton);
		
		//multiply button, multiplies both numbers when clicked on
		JButton multiplyButton = new JButton("Multiply");
		multiplyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    double num1 = Double.parseDouble(num1textField.getText());
           	    double num2 = Double.parseDouble(num2textField.getText());
           	    
           	    total = num1 * num2;
           	 
           	    String str = Double.toString(total);
           	    anstextField.setText(str);
				
			}
		});
		//sets bounds
		multiplyButton.setBounds(271, 266, 117, 29);
		contentPane.add(multiplyButton);
		
		//divide button, divides both numbers, returns error if user tries to divide by 0
		JButton divideButton = new JButton("Divide");
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    double num1 = Double.parseDouble(num1textField.getText());
           	    double num2 = Double.parseDouble(num2textField.getText());
           	    // checks whether dividing by 0 and blockss the user for doing so.
           	    
           	    if(num2 != 0)
           	    {
           	    	total = num1 / num2;
                  	 
               	    String str = Double.toString(total);
               	    anstextField.setText(str);
           	    }
           	    else
           	    {
           	    	JOptionPane.showMessageDialog(null, "ERROR! Cannot divide by 0! Try again.");
           	    }
           	    
			}
		});
		//sets bounds
		divideButton.setBounds(400, 266, 117, 29);
		contentPane.add(divideButton);
		
		// clear button, clears all textfields and initializes number values
		JButton clearButton = new JButton("Clear");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = 0;
				int num2 = 0;
				num1textField.setText("");
				num2textField.setText("");
				anstextField.setText("");
				
			}
		});
		clearButton.setBounds(400, 324, 117, 29);
		contentPane.add(clearButton);
		
		// set up exit button, when clicked on, exit
		JButton exit = new JButton("EXIT");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{			
                    //
                    //exit screen
                    //
				    dispose();
			}
			
		});
		exit.setBounds(19, 324, 117, 29);
		contentPane.add(exit);		
		
		// set labels for different text fields
		JLabel num1Label = new JLabel("Number 1 :");
		num1Label.setBounds(19, 90, 111, 16);
		contentPane.add(num1Label);
		
		JLabel num2label = new JLabel("Number 2 :");
		num2label.setBounds(19, 143, 81, 16);
		contentPane.add(num2label);
		
		JLabel ansLabel = new JLabel("Answer :");
		ansLabel.setBounds(19, 194, 61, 16);
		contentPane.add(ansLabel);
		
		// set up different text fields with proper bounds
		num1textField = new JTextField();
		num1textField.setBounds(112, 85, 130, 26);
		contentPane.add(num1textField);
		num1textField.setColumns(10);
		
		anstextField = new JTextField();
		anstextField.setBounds(112, 189, 276, 26);
		contentPane.add(anstextField);
		anstextField.setColumns(10);
		anstextField.setEditable(false);
		
		num2textField = new JTextField();
		num2textField.setBounds(112, 138, 130, 26);
		contentPane.add(num2textField);
		num2textField.setColumns(10);
		
		// add title label
		JLabel titleLabel = new JLabel("Calculator GUI");
		titleLabel.setBounds(220, 32, 117, 16);
		contentPane.add(titleLabel);
		
	}
}

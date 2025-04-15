import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ChildFrame extends JFrame implements ActionListener, KeyListener {

	//THE DECLARATION OF THE GUI COMPONENTS
	JPanel TextfieldPanel;
	JPanel KeyPanel;
	JPanel JComboboxPanel;
	JTextField Input = new JTextField();
	JTextField DisplayField = new JTextField();
	JButton Nine = new JButton("9");
	JButton Eight = new JButton("8");
	JButton Seven = new JButton("7");
	JButton Six = new JButton("6");
	JButton Five = new JButton("5");
	JButton Four = new JButton("4");
	JButton Three = new JButton("3");
	JButton Two = new JButton("2");
	JButton One = new JButton("1");
	JButton Zero = new JButton("0");
	JButton Multiply = new JButton("x");
	JButton Divide = new JButton("/"); 
	JButton Add = new JButton("+");
	JButton Subtract = new JButton("-");
	JButton Clear = new JButton("C");
	JButton Equal = new JButton("=");
	JButton Point = new JButton(".");
	Font header = new Font("Segoe UI Semibold", Font.BOLD, 36);
	Font TexFieldFont = header.deriveFont(Font.BOLD, 70);
	Font mainText = header.deriveFont(Font.BOLD, 15);
	double valueOne, operationResult = 0, valueTwo = 0;
	char Operator;
	JMenuBar bar;
	JMenu themeOptions, History;
	JMenuItem darkTheme, lightTheme, Statement;
	//ANY FIGURE INVOLVING DECIMAL POINTS WILL ALWAYS BE ROUNDED OFF TO FOUR DECIMAL PLACES
	DecimalFormat format = new DecimalFormat("#.####");
	
	public ChildFrame() {
		
		this.setTitle("Calculator Implementation #2");
		this.setSize(498, 686);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setBackground(Color.green);
		
		
		//THE FOLLWOING BIT OF CODE IS RESPONSIBLE FOR IMPLEMENTING THE MENU SYSTEM OF THE FRAME
		bar = new JMenuBar();
		
		themeOptions = new JMenu("Theme");
		History = new JMenu("History");
		
		darkTheme = new JMenuItem("Dark");
		lightTheme = new JMenuItem("Light");
		Statement = new JMenuItem("Feature is still in development");
		themeOptions.add(darkTheme);
		themeOptions.add(lightTheme);
		History.add(Statement);
		
		darkTheme.addActionListener(this);
		lightTheme.addActionListener(this);
		
		bar.add(themeOptions);
		bar.add(History);
		this.setJMenuBar(bar);
		
		//THE FOLLOWING ARE ALL SPECIFICATIONS FOR THE VARIOUS KEYS OF THE CALCULATOR
		Input.setPreferredSize(new Dimension(468, 90));
		Input.setBorder(null);
		Input.setFont(TexFieldFont);
		Input.setHorizontalAlignment(JTextField.RIGHT);
		Input.setEditable(false);
		Input.addKeyListener(this);
		//Input.setBackground(Color.GRAY);
				
		DisplayField.setPreferredSize(new Dimension(468, 40));
		DisplayField.setBorder(null);
		DisplayField.setFont(mainText);
		DisplayField.setHorizontalAlignment(JTextField.RIGHT);
		DisplayField.setForeground(Color.gray);
		DisplayField.setEditable(false);
		
		Seven.setPreferredSize(new Dimension(90, 90));
		Seven.setBackground(new Color(44, 44, 44));
		Seven.setBorder(null);
		Seven.setForeground(Color.white);
		Seven.setFont(header);
		Seven.addActionListener(this);
		Seven.addKeyListener(this);
		
		Eight.setPreferredSize(new Dimension(90, 90));
		Eight.setBackground(new Color(44, 44, 44));
		Eight.setBorder(null);
		Eight.setForeground(Color.white);
		Eight.setFont(header);
		Eight.addActionListener(this);
		Eight.addKeyListener(this);
		
		Nine.setPreferredSize(new Dimension(90, 90));
		Nine.setBackground(new Color(44, 44, 44));
		Nine.setBorder(null);
		Nine.setForeground(Color.white);
		Nine.setFont(header);
		Nine.addActionListener(this);
		Nine.addKeyListener(this);
		
		Multiply.setPreferredSize(new Dimension(90, 90));
		Multiply.setBackground(new Color(44, 44, 44));
		Multiply.setBorder(null);
		Multiply.setForeground(Color.white);
		Multiply.setFont(header);
		Multiply.addActionListener(this);
		
		/*Add.setPreferredSize(new Dimension(90, 90));
		Add.setBackground(new Color(44, 44, 44));
		Add.setBorder(null);
		Add.setForeground(Color.white);
		Add.setFont(header);*/
		
		Four.setPreferredSize(new Dimension(90, 90));
		Four.setBackground(new Color(44, 44, 44));
		Four.setBorder(null);
		Four.setForeground(Color.white);
		Four.setFont(header);
		Four.addActionListener(this);
		Four.addKeyListener(this);
		
		Five.setPreferredSize(new Dimension(90, 90));
		Five.setBackground(new Color(44, 44, 44));
		Five.setBorder(null);
		Five.setForeground(Color.white);
		Five.setFont(header);
		Five.addActionListener(this);
		Five.addKeyListener(this);
		
		Six.setPreferredSize(new Dimension(80, 90));
		Six.setBackground(new Color(44, 44, 44));
		Six.setBorder(null);
		Six.setForeground(Color.white);
		Six.setFont(header);
		Six.addActionListener(this);
		Six.addKeyListener(this);
		
		Subtract.setPreferredSize(new Dimension(90, 90));
		Subtract.setBackground(new Color(44, 44, 44));
		Subtract.setBorder(null);
		Subtract.setForeground(Color.white);
		Subtract.setFont(header);
		Subtract.addActionListener(this);
		
		One.setPreferredSize(new Dimension(90, 90));
		One.setBackground(new Color(44, 44, 44));
		One.setBorder(null);
		One.setForeground(Color.white);
		One.setFont(header);
		One.addActionListener(this);
		One.addKeyListener(this);
		
		Two.setPreferredSize(new Dimension(90, 90));
		Two.setBackground(new Color(44, 44, 44));
		Two.setBorder(null);
		Two.setForeground(Color.white);
		Two.setFont(header);
		Two.addActionListener(this);
		Two.addKeyListener(this);
		
		Three.setPreferredSize(new Dimension(90, 90));
		Three.setBackground(new Color(44, 44, 44));
		Three.setBorder(null);
		Three.setForeground(Color.white);
		Three.setFont(header);
		Three.addActionListener(this);
		Three.addKeyListener(this);
		
		Add.setPreferredSize(new Dimension(90, 90));
		Add.setBackground(new Color(44, 44, 44));
		Add.setBorder(null);
		Add.setForeground(Color.white);
		Add.setFont(header);
		Add.addActionListener(this);
		Add.addKeyListener(this);
		
		Divide.setPreferredSize(new Dimension(90, 90));
		Divide.setBackground(new Color(44, 44, 44));	
		Divide.setBorder(null);
		Divide.setForeground(Color.white);
		Divide.setFont(header);
		Divide.addActionListener(this);
		Divide.addKeyListener(this);
		
		Zero.setBackground(new Color(44, 44, 44));
		Zero.setPreferredSize(new Dimension(90, 90));
		Zero.setBorder(null);
		Zero.setForeground(Color.white);
		Zero.setFont(header);
		Zero.addActionListener(this);
		Zero.addKeyListener(this);
		
		Point.setPreferredSize(new Dimension(90, 90));
		Point.setBackground(new Color(44, 44, 44));
		Point.setBorder(null);
		Point.setForeground(Color.white);
		Point.setFont(header);
		Point.addActionListener(this);
		Point.addKeyListener(this);
		
		Clear.setPreferredSize(new Dimension(90, 90));
		Clear.setBackground(new Color(204, 102, 0));
		Clear.setBorder(null);
		Clear.setForeground(Color.white);
		Clear.setFont(header);
		Clear.addActionListener(this);
		Clear.addKeyListener(this);
		
		Equal.setPreferredSize(new Dimension(90, 90));
		Equal.setBackground(new Color(44, 44, 44));
		Equal.setBorder(null);
		Equal.setForeground(Color.white);
		Equal.setFont(header);
		Equal.addActionListener(this);
		Equal.addKeyListener(this);
		
		//THE JPANEL FOR THE TEXTFIELD
		TextfieldPanel = new JPanel();
		TextfieldPanel.setBackground(null);
		TextfieldPanel.setBounds(2, 2, 480, 163);
		TextfieldPanel.add(DisplayField);
		TextfieldPanel.add(Input);
		TextfieldPanel.addKeyListener(this);
		
		//THE JPANEL FOR THE CALCULATOR KEYS
		KeyPanel = new JPanel();
		KeyPanel.setBackground(null);
		KeyPanel.setBounds(2, 165, 480, 460);
		KeyPanel.addKeyListener(this);
		//KeyPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		KeyPanel.setLayout(new GridLayout(5, 4, 2, 2));
		KeyPanel.add(Seven);
		KeyPanel.add(Eight);
		KeyPanel.add(Nine);
		KeyPanel.add(Multiply);
		KeyPanel.add(Four);
		KeyPanel.add(Five);
		KeyPanel.add(Six);
		KeyPanel.add(Subtract);
		KeyPanel.add(One);
		KeyPanel.add(Two);
		KeyPanel.add(Three);
		KeyPanel.add(Add);
		KeyPanel.add(Zero);
		KeyPanel.add(Equal);
		KeyPanel.add(Point);
		KeyPanel.add(Divide);
		KeyPanel.add(Clear);
		
		this.add(TextfieldPanel);
		this.add(KeyPanel);
		
		this.addKeyListener(this);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object eventSource = e.getSource();
		
		if(eventSource == darkTheme) {
			
			KeyPanel.setBackground(new Color(44, 44, 44));
			TextfieldPanel.setBackground(new Color(44, 44, 44));
			Input.setBackground(new Color(44, 44, 44));
			Input.setForeground(Color.white);
			DisplayField.setBackground(new Color(44, 44, 44));
			DisplayField.setForeground(Color.white);
			
			Seven.setBackground(Color.gray);
			Seven.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			
			Eight.setBackground(Color.gray);
			Eight.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			
			Nine.setBackground(Color.gray);
			Nine.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			
			Multiply.setBackground(Color.black);
			Multiply.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			
			Four.setBackground(Color.gray);
			Four.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			
			Five.setBackground(Color.gray);
			Five.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			
			Six.setBackground(Color.gray);
			Six.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			
			Subtract.setBackground(Color.black);
			Subtract.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			
			One.setBackground(Color.gray);
			One.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			
			Two.setBackground(Color.gray);
			Two.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			
			Three.setBackground(Color.gray);
			Three.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			
			Add.setBackground(Color.black);
			Add.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			
			Divide.setBackground(Color.black);
			Divide.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			
			Zero.setBackground(Color.gray);
			Zero.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			
			Point.setBackground(Color.black);
			Point.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			
			Clear.setBackground(new Color(204, 102, 0));
			Clear.setBorder(BorderFactory.createLineBorder(new Color(204, 102, 0), 2));
			
			Equal.setBackground(Color.black);
			Equal.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			
		}else if(eventSource == lightTheme) {
			
			KeyPanel.setBackground(Color.white);
			TextfieldPanel.setBackground(Color.white);
			Input.setBackground(Color.white);
			Input.setForeground(Color.black);
			DisplayField.setBackground(Color.white);
			DisplayField.setBackground(Color.white);
			
			Seven.setBackground(new Color(44, 44, 44));
			Seven.setBorder(null);
			
			Eight.setBackground(new Color(44, 44, 44));
			Eight.setBorder(null);
			
			Nine.setBackground(new Color(44, 44, 44));
			Nine.setBorder(null);
			
			Multiply.setBackground(new Color(44, 44, 44));
			Multiply.setBorder(null);
			
			Six.setBackground(new Color(44, 44, 44));
			Six.setBorder(null);
			
			Five.setBackground(new Color(44, 44, 44));
			Five.setBorder(null);
			
			Four.setBackground(new Color(44, 44, 44));
			Four.setBorder(null);
			
			Subtract.setBackground(new Color(44, 44, 44));
			Subtract.setBorder(null);
			
			One.setBackground(new Color(44, 44, 44));
			One.setBorder(null);
			
			Two.setBackground(new Color(44, 44, 44));
			Two.setBorder(null);
			
			Three.setBackground(new Color(44, 44, 44));
			Three.setBorder(null);
			
			Add.setBackground(new Color(44, 44, 44));
			Add.setBorder(null);
			
			Divide.setBackground(new Color(44, 44, 44));
			Divide.setBorder(null);
			
			Zero.setBackground(new Color(44, 44, 44));
			Zero.setBorder(null);
			
			Point.setBackground(new Color(44, 44, 44));
			Point.setBorder(null);
			
			Clear.setBackground(new Color(204, 102, 0));
			Clear.setBorder(null);
			
			Equal.setBackground(new Color(44, 44, 44));
			Equal.setBorder(null);
			
		}else if(eventSource == History) {
			
			//THIS FEATURE IS STILL IN DEVELOPMENT
				
		}else if(eventSource == One) {
			
			Input.setText(Input.getText() + "1");
			
		}else if(eventSource == Two) {
			
			Input.setText(Input.getText() + "2");
			
		}else if(eventSource == Three) {
			
			Input.setText(Input.getText() + "3");
			
		}else if(eventSource == Four) {
			
			Input.setText(Input.getText() + "4");
			
		}else if(eventSource == Clear) {
			
			Input.setText(null);
			DisplayField.setText(null);
			
		}else if(eventSource == Five) {
			
			Input.setText(Input.getText() + "5");
			
		}else if(eventSource == Six) {
			
			Input.setText(Input.getText() + "6");
			
		}else if(eventSource == Seven) {
			
			Input.setText(Input.getText() + "7");
			
		}else if(eventSource == Eight) {
			
			Input.setText(Input.getText() + "8");
			
		}else if(eventSource == Nine) {
			
			Input.setText(Input.getText() + "9");
			
		}else if(eventSource == Zero) {
			
			Input.setText(Input.getText() + "0");
			
		}else if(eventSource == Add) {
			
			//THIS BIT OF CODE WILL HANDLE ALL THE EVENTS RELATED TO THE 'ADD' FUNCTIONALITY 
			valueOne = Double.parseDouble(Input.getText());
			Input.setText(null);
			Operator = '+';
			
		}else if(eventSource == Point) {
			
			Input.setText(Input.getText() + ".");
			
		}else if(eventSource == Subtract) {
			
			//THIS BIT OF CODE WILL ALL THE EVENTS RELATED THE 'SUBTRACT' FUNCTIONALITY
			valueOne = Double.parseDouble(Input.getText());	
			Input.setText(null);
			Operator = '-';
			DisplayField.setText(String.valueOf(valueOne) + " " + String.valueOf(Operator));
			
		}else if(eventSource == Multiply) {
			
			//THIS PIECE OF CODE WILL ALL EVENTS RELATED TO THE 'MULTIPLY FUNCTIONALITY'
			valueOne = Double.parseDouble(Input.getText());
			Input.setText(null);
			Operator = 'x';
			DisplayField.setText(String.valueOf(valueOne) + " " + String.valueOf(Operator));
			
		}else if(eventSource == Divide) {
			
			//THIS BLOCK OF CODE HERE IS RESPONSIBLE FOR THE EVENTS RELATED TO THE 'DIVIDE' FUNTIONALLITY
			valueOne = Double.parseDouble(Input.getText());
			Input.setText(null);
			Operator = '/';
			DisplayField.setText(String.valueOf(valueOne) + " " + String.valueOf(Operator));
			
		}else if(eventSource == Equal) {
			
			valueTwo = Double.parseDouble(Input.getText());
			
			//THE FOLLOWING WILL HANDLE ALL THE CALCULATOR OPERATERIONS, DEPENDING ON THE OPERATOR CHOSEN
			if(Operator == '+') {
				
				operationResult = (Double) (valueOne + valueTwo);
				
			}else if(Operator == '-') {
				
				operationResult = (Double) (valueOne - valueTwo);
				
			}else if(Operator == 'x') {
				
				operationResult = (Double) (valueOne * valueTwo);
				
			}else if(Operator == '/') {
				
				/*operationResult = valueOne / valueTwo;
				if(valueOne == 0|| valueTwo == 0) {
					Input.setText("Cannot Divide by Zero");
				}*/
				try {
					
					operationResult = valueOne / valueTwo;
					
				}catch(ArithmeticException ex) {
					Input.setFont(mainText);
					Input.setText("Cannot divide by zero");
				}
				
			}
			
			format.format(operationResult);
			Input.setText(String.valueOf(operationResult));
			DisplayField.setText(String.valueOf(valueOne) + " " + String.valueOf(Operator) + " " + String.valueOf(valueTwo) + " " +  "=");
			valueOne = (double) operationResult;
			
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		//WITH THIS IMPLEMENTATION, THE 'e.getKeyChar()' WILL BE RESPONSIBLE FOR RETIEVING THE SOURCE OF THE EVENT
		
				if(e.getKeyChar() == '0') {
					
					Input.setText(Input.getText() + "0");
					
				}else if(e.getKeyChar() == '1') {
					
					Input.setText(Input.getText() + "1");
					
				}else if(e.getKeyChar() == '2') {
					
					Input.setText(Input.getText() + "2");
					
				}else if(e.getKeyChar() == '3') {
					
					Input.setText(Input.getText() + "3");
					
				}else if(e.getKeyChar() == '4') {
					
					Input.setText(Input.getText() + "4");
					
				}else if(e.getKeyChar() == '5') {
					
					Input.setText(Input.getText() + "5");
					
				}else if(e.getKeyChar() == '6') {
					
					Input.setText(Input.getText() + "6");
					
				}else if(e.getKeyChar() == '7') {
					
					Input.setText(Input.getText() + "7");
					
				}else if(e.getKeyChar() == '8') {
					
					Input.setText(Input.getText() + "8");
					
				}else if(e.getKeyChar() == '9') {
					
					Input.setText(Input.getText() + "9");
					
				}else if(e.getKeyChar() == '.') {
					
					Input.setText(Input.getText() + ".");
					
				}else if(e.getKeyChar() == '/') {
					
					valueOne = Double.parseDouble(Input.getText());
					Input.setText(null);
					Operator = '/';
					DisplayField.setText(String.valueOf(valueOne) + " " + String.valueOf(Operator));
					
				}else if(e.getKeyChar() == '+') {
					
					valueOne = Double.parseDouble(Input.getText());
					Input.setText(null);
					Operator = '+';
					DisplayField.setText(String.valueOf(valueOne) + " " + String.valueOf(Operator));
					
				}else if(e.getKeyChar() == '-') {
					
					valueOne = Double.parseDouble(Input.getText());
					Input.setText(null);
					Operator = '-';
					DisplayField.setText(String.valueOf(valueOne) + " " + String.valueOf(Operator));
					
				}else if(e.getKeyChar() == '*') {
					
					valueOne = Double.parseDouble(Input.getText());
					Input.setText(null);
					Operator = 'x';
					DisplayField.setText(String.valueOf(valueOne) + " " + String.valueOf(Operator));
					
				}else if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					
					valueTwo = Double.parseDouble(Input.getText());
					
					if(Operator == '+') {
						
						operationResult = (Double) (valueOne + valueTwo);
						
					}else if(Operator == '-') {
						
						operationResult = (Double) (valueOne + valueTwo);
						
					}else if(Operator == '/') {
						
						operationResult = (Double) (valueOne / valueTwo);
						
					}else if(Operator == 'x') {
						
						operationResult = (Double) (valueOne * valueTwo);
						
					}
					
					format.format(operationResult);
					Input.setText(String.valueOf(operationResult));
					DisplayField.setText(String.valueOf(valueOne) + " " + String.valueOf(Operator) + " " + String.valueOf(valueTwo) + " " +  "=");
					valueOne = (double) operationResult;
					
				}else if(e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
					
					Input.setText("");
					
				}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		//THE 'getKeyCode' METHOD WILL HELP RETRIEVE THE SOURCE OF THE KEY EVENT
		
				valueTwo = Double.parseDouble(Input.getText());
				
				/*if(e.getKeyCode() == 10) {
					
					if(Operator == '+') {
						
						operationResult = (double) (valueOne + valueTwo);
						
					}else if(Operator == '-') {
						
						operationResult = (double) (valueOne + valueTwo);
						
					}else if(Operator == '/') {
						
						operationResult = (double) (valueOne / valueTwo);
						
					}else if(Operator == '*') {
						
						operationResult = (double) (valueOne * valueTwo);
						
					}
					
					format.format(operationResult);
					Input.setText(String.valueOf(operationResult));
					DisplayField.setText(String.valueOf(valueOne) + " " + String.valueOf(Operator) + " " + String.valueOf(valueTwo) + " " +  "=");
					valueOne = (double) operationResult;
					
				}*/
				//JOptionPane.showMessageDialog(null, "The Enter key was pressed");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

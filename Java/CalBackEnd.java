import java.awt.*;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class CalBackEnd extends JPanel implements ActionListener {
	
			DecimalFormat df = new DecimalFormat("0.00");
			private JButton reg;
			private JButton custom;
			double PayAmount,Items,ItemsCost,FinalAmount;
			private JLabel PayInL;
			private JLabel ItemsL;
			private JLabel FinalAmountL;
			
			private static String PayS = "Pay Amount after deductions: ";
			private static String ItemsS = "Enter the Items you're buying prices: ";
			private static String FinalS = "Final amount of paycheck left after purchases: ";
			
			private JTextField PayAmountF;
			private JTextField ItemsF;
			
			public CalBackEnd() {
				setLayout(null);
				PayInL = new JLabel(PayS);
				ItemsL = new JLabel(ItemsS);
				FinalAmountL = new JLabel(FinalS);
				
				PayAmountF = new JTextField();
				ItemsF = new JTextField();
				
				JPanel labels = new JPanel(new GridLayout(0,1));
				labels.add(PayInL);
				labels.add(ItemsL);
				labels.add(FinalAmountL);
				
				JPanel Fields = new JPanel(new GridLayout(0,1));
				Fields.add(PayAmountF);
				Fields.add(ItemsF);
				
				setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
				add(labels, BorderLayout.CENTER);
				add(Fields, BorderLayout.LINE_END);
				
				/*
					HandlerClass handler = new HandlerClass();
					reg.addActionListener(handler);
					custom.addActionListener(handler);
				 */

				
			}
			
			public static void main(String[] args) {
				JFrame frame = new JFrame("Pay Advisor");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(new CalBackEnd());
				frame.setSize(300,200);
				frame.setVisible(true);
				
			}
		
			private class HandlerClass implements ActionListener {
				public void actionPerformed(ActionEvent event){

				}
		}

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			
			
}
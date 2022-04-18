import java.awt.*;   
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import javax.swing.*;
import javax.swing.Timer;   

public class SpeedTester{    
	JFrame f;
	JTextField missesField;
	JTextField hitsField;
	JButton b1;	
	JButton b2;	
	JButton b3;	
	JButton b4;
	int activeBtn = 1;
	public int hits = 0;
	public int misses = 0;

	
	SpeedTester(){    
		f=new JFrame(); 
		missesField = new JTextField();
			missesField.setText("M66das: 0");
			missesField.setHorizontalAlignment(JTextField.CENTER);
		
		hitsField = new JTextField();	
			hitsField.setText("Pihtas: 0");
			hitsField.setHorizontalAlignment(JTextField.CENTER);
		
		b1=new JButton();
		b1.setBackground(Color.green);
		clickCount(b1, 1);
		
		b2=new JButton();
		b2.setBackground(Color.yellow);
		clickCount(b2, 2);
		
		b3=new JButton();
		b3.setBackground(Color.red);
		clickCount(b3, 3);
		
		b4=new JButton();
		b4.setBackground(Color.blue);
		clickCount(b4, 4);		
			  
		f.add(b1); f.add(b2); 
		f.add(b3); f.add(b4); 
		f.add(missesField); f.add(hitsField);    
	    
		f.setLayout(new GridLayout(3,2));    
		f.setSize(500,500);    
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
	}
	
	  
	public static void main(String [] args) throws Exception {    
		SpeedTester speedTester = new SpeedTester();

		ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
				if(speedTester.misses>=10){
					
					((Timer)evt.getSource()).stop();
					speedTester.missesField.setText("Jama lugu, kaotasid :(");
					speedTester.b1.setEnabled(false);
					speedTester.b2.setEnabled(false);
					speedTester.b3.setEnabled(false);
					speedTester.b4.setEnabled(false);
								
				}
				if(speedTester.hits>=10){
					
					((Timer)evt.getSource()).stop();
					speedTester.hitsField.setText("Juhuu, v6itsid!");
					speedTester.b1.setEnabled(false);
					speedTester.b2.setEnabled(false);
					speedTester.b3.setEnabled(false);
					speedTester.b4.setEnabled(false);					
				}
            	JButton btn = speedTester.randButton();
				speedTester.blinkOnce(btn);				
            }
        };
        Timer timer = new Timer(1000, taskPerformer);
		timer.setInitialDelay(2000);
		timer.start();
	}
	
	public void clickCount(JButton btn, int num) {
		btn.addActionListener(e -> {
			if(activeBtn==num){
				hits++;
				hitsField.setText("Pihtas: "+hits);
			} else {
				misses++;
				missesField.setText("M66das: "+misses);
			}
        });	
	}
	
 	public void blinkOnce(JButton btn) {
		Color origColor = btn.getBackground();
		btn.setBackground(Color.white);
		ActionListener taskPerformer = new ActionListener(){
			public void actionPerformed(ActionEvent e){ 
				btn.setBackground(origColor);
			}
		};	 
		Timer blinkTimer = new Timer(50, taskPerformer);
		blinkTimer.setRepeats(false);	 
		blinkTimer.start();
	}
	

	public JButton randButton() {
		JButton btn = new JButton();
		int rand = (int)(Math.random() * 5);
/* 		while (activeBtn==rand) {
			rand = (int)(Math.random() * 5);
		} */	
		switch (rand) {
		  case 1:
			btn = b1;
			activeBtn = 1;			
			break;
		  case 2:
			btn = b2;
			activeBtn = 2;
			break;
		  case 3:
			btn = b3;
			activeBtn = 3;
			break;
		  case 4:
			btn = b4;
			activeBtn = 4;
			break;
		}
		return btn;
	}
	
}    
   
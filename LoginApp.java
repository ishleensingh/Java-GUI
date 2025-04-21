package group1;
	import javax.swing.*;
	import java.awt.Button;
    import java.awt.CheckboxGroup;
    import java.awt.Font;
    import java.awt.Frame;
    import java.awt.Label;
    import java.awt.TextField;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.awt.event.WindowAdapter;
    import java.awt.event.WindowEvent;
    public class LoginApp extends Frame implements ActionListener{
        Label l2, l3, l4;
         TextField txt1, txt2;
         Button b5, b6, b7;
         CheckboxGroup cbg;

	     public LoginApp() {
	         super("LoginApp");
	       
			 setSize(1000, 600);
	         setLayout(null);
	         setVisible(true);
	
	         l2 = new Label("Login");
	         l2.setFont(new Font("Serif", Font.BOLD, 18));
	         l2.setBounds(10, 50, 250, 30);
	
	         cbg = new CheckboxGroup();
	         b5 = new Button("Government User");
	         b5.setFont(new Font("Serif", Font.BOLD, 18));
	         b5.setBounds(10, 100, 250, 30);
	         b5.addActionListener(this);
	
	         cbg = new CheckboxGroup();
	         b6 = new Button("Public User");
	         b6.setFont(new Font("Serif", Font.BOLD, 18));
	         b6.setBounds(300, 100, 250, 30);
	         b6.addActionListener(this);
	
	         add(b6);
	         add(b5);
	         add(l2);
	  
	         this.addWindowListener(new WindowAdapter() {
	             public void windowClosing(WindowEvent we) {
	                 System.exit(0);
	             }
	         });
	     }
	  @Override
	  public void actionPerformed(ActionEvent e) {
	   if(e.getSource() == b5) {
	    Login3 obj = new Login3();
	   } else if(e.getSource() == b6) {
	    TestClimate obj = new TestClimate();
	   }
	  }
	    public static void main(String[] args) {
	          LoginApp application = new LoginApp();
	      }
	}


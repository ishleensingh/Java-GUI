	package group1;
	
	import java.awt.Button;

    import java.awt.CheckboxGroup;

        import java.awt.Font;
    import java.awt.Frame;
        
        import java.awt.Label;
        
        import java.awt.TextArea;
        
        import java.awt.TextField;
        
        import java.awt.event.ActionEvent;
        
        import java.awt.event.ActionListener;
        
        import java.awt.event.WindowAdapter;
        
        import java.awt.event.WindowEvent;
        
        public class Login3 extends Frame implements ActionListener {
            Label l2, l3, l4, l5;
            TextField txt1, txt2;
            TextArea textArea;
            Button b5, b6, b7;
            CheckboxGroup cbg;
        
            public Login3() {
                super("Login3");
                setSize(1000, 600);
                setLayout(null);
                setVisible(true);
                
                l3 = new Label("Username ");
                l3.setFont(new Font("Serif", Font.BOLD, 18));
                l3.setBounds(10, 50, 250, 30);
        
            txt1 = new TextField();
                txt1.setFont(new Font("Serif", Font.BOLD, 18));
                txt1.setBounds(300, 50, 250, 30);
        
                l4 = new Label("Password");
                l4.setFont(new Font("Serif", Font.BOLD, 18));
                l4.setBounds(10, 100, 250, 30);
                
                txt2 = new TextField();
            txt2.setFont(new Font("Serif", Font.BOLD, 18));
            txt2.setBounds(300, 100, 250, 30);
                
                cbg = new CheckboxGroup();
            b7 = new Button("Login");
                b7.setFont(new Font("Serif", Font.BOLD, 18));
                b7.setBounds(10, 150, 250, 30);
                b7.addActionListener(this);
        
                textArea = new TextArea("", 10, 60);
                textArea.setBounds(10, 200, 960, 350);
                textArea.setEditable(false);
                
                add(l3);
                add(txt1);
                add(l4);
                add(txt2);
                add(b7);
                add(textArea);
                
                this.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent we) {
                        System.exit(0);
                    }
                });
            }
        @Override
        public void actionPerformed(ActionEvent e) {
        String s1 = txt1.getText();
        String s2 = txt2.getText();
    if (s1.isEmpty() || s2.isEmpty()) {
        
                    l5.setText("Please Enter The Data");
                } else try {
                    String username = s1;
                    String password = s2;
                    if (!username.matches("[a-zA-Z]+[@][gov]+$") || !password.matches("[a-zA-Z]+[@][0-9]+$")) {
                        textArea.setText("Invalid username or password format. Please use alphabets followed by @ and ending with gov for username and alphabets followed by @ and ending with numbers for password.");
                        
                    } else {
                        TestClimate1 obj = new TestClimate1();
                    }} catch (NumberFormatException ex) {
                        textArea.setText("Invalid input");
                }
                }
        public static void main(String[] args) {
                Login3 app = new Login3();
        }
        }

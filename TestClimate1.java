package group1;

    import java.awt.*;
    import java.awt.event.*;
    import java.util.*;

    public class TestClimate1 extends Frame implements ActionListener {
        Label l1;
        Button b1, b2, b3, b4, b19;
        TextArea textArea, textArea2;
        CheckboxGroup cbg;
                 public TestClimate1() {
                super("TestClimate");
                setSize(1000, 600);
                setLayout(null);
                setVisible(true);
                l1 = new Label("Click the button of your choice ");
                l1.setFont(new Font("Serif", Font.BOLD, 18));
                l1.setBounds(10, 50, 150, 30);
                b1 = new Button("Flood");
                b1.setFont(new Font("Serif", Font.BOLD, 18));
                b1.setBounds(10, 100, 150, 30);
                b1.addActionListener(this);
                b2 = new Button("Landslide");
                b2.setFont(new Font("Serif", Font.BOLD, 18));
                b2.setBounds(170, 100, 150, 30);
                b2.addActionListener(this);
                b3 = new Button("Earthquake");
                b3.setFont(new Font("Serif", Font.BOLD, 18));
                b3.setBounds(10, 150, 150, 30);
                b3.addActionListener(this);
                b4 = new Button("Wildfire");
                b4.setFont(new Font("Serif", Font.BOLD, 18));
                b4.setBounds(170, 150, 150, 30);
                b4.addActionListener(this);
                b19 = new Button("Add");
                b19.setFont(new Font("Serif", Font.BOLD, 18));
                b19.setBounds(860, 120, 80, 40);
                b19.addActionListener(this);

        textArea = new TextArea("", 10, 60);
        textArea.setBounds(10, 200, 960, 350);
        textArea.setEditable(false);
        textArea2 = new TextArea("", 10, 60);
        textArea2.setBounds(350, 100, 500, 80);
        textArea2.setEditable(true);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b19);
        add(l1);
        add(textArea);
        add(textArea2);
        this.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    System.exit(0);
                    }
                });
        setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
        String userInput = textArea2.getText();
        if (e.getSource() == b1) {
        textArea.setText("Preventive Measures for Flood:\n"
        + "- Stay informed about the weather conditions.\n"
        + "- Create an emergency evacuation plan.\n"
        + "- Store important documents in a waterproof container.\n"
        + "- Avoid walking or driving through floodwaters.");
        } else if (e.getSource() == b2) {
        textArea.setText("Preventive Measures for Landslide:\n"
        + "- Avoid building homes near steep slopes.\n"
        + "- Plant ground cover on slopes to reduce erosion.\n"
        + "- Consult a geotechnical expert for advice on landslide-prone areas.\n"
        + "- Pay attention to warning signs of an impending landslide.");
        } else if (e.getSource() == b3) {
        textArea.setText("Preventive Measures for Earthquake:\n"
        + "- Secure heavy furniture to walls.\n"
        + "- Create an earthquake preparedness kit.\n"
        + "- Identify safe spots in each room of your home.\n"
        + "- Practice 'Drop, Cover, and Hold On' during earthquakes.");
        } else if (e.getSource() == b4) {
        textArea.setText("Preventive Measures for Wildfire:\n"
        + "- Clear dry leaves and debris from around your home.\n"
        + "- Create a defensible space by removing flammable materials.\n"
        + "- Keep a hose and firefighting tools readily available.\n"
        + "- Follow local wildfire warnings and evacuation orders.");
        } else if(e.getSource() ==b19){
                if(!userInput.trim().isEmpty()){
                textArea.append("\n- " + userInput);
                }
                textArea2.setText("");
        }
}

        public static void main(String[] args) {
        TestClimate1 app = new TestClimate1();
        }
}

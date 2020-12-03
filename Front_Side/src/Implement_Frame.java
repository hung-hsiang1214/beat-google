import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Implement_Frame extends JFrame {
	private JButton exitBtn, googleBtn;
	private JLabel brand_label, brand_title, requirement;
	private JPanel panel = new JPanel();
	private JTextArea textArea;
	private JCheckBox checkbox,checkbox1,checkbox2,checkbox3,checkbox4,checkbox5,checkbox6;
	public Implement_Frame() {
		super("Implement_frame");
		setSize(900, 900);
		ImageIcon start_background = new ImageIcon("bground_implement.jpg");
		start_background.setImage(
				start_background.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
		panel.add(new JLabel(start_background));
		label_function();
		exitBtn();
		googleBtn();
		textArea_function();
		checkBox_function();
		checkBox_function1();
		checkBox_function2();
		checkBox_function3();
		checkBox_function4();
		checkBox_function5();
		checkBox_function6();
		add(panel);
	}

	public void exitBtn() {
		exitBtn = new JButton(new ImageIcon("exit.png"));
		exitBtn.setBounds(620, 10, 200, 80);
		add(exitBtn);
		class ExitListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		}
		ActionListener listener = new ExitListener();
		exitBtn.addActionListener(listener);
	}

	public void googleBtn() {
		googleBtn = new JButton(new ImageIcon("googleS.png"));
		googleBtn.setBounds(600, 100, 250, 220);
		add(googleBtn);
		class GoogleListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {

			}
		}
		ActionListener listener = new GoogleListener();
		googleBtn.addActionListener(listener);
	}

	public void label_function() {
		brand_label = new JLabel(new ImageIcon("brand_title.png"));
		brand_title = new JLabel(new ImageIcon("brand_labelL.png"));
		requirement = new JLabel(new ImageIcon("requirement.png"));
		brand_label.setBounds(10, 10, 300, 100);
		brand_title.setBounds(10, 80, 490, 170);
		requirement.setBounds(10, 250, 490, 100);
		add(brand_label);
		add(brand_title);
		add(requirement);
	}

	public void textArea_function() {
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		JScrollPane scrollPane=new JScrollPane(textArea);
		scrollPane.setBounds(40, 600, 800, 250);
		add(scrollPane);
	}
	public void checkBox_function() {
		checkbox=new JCheckBox("corded");
		checkbox.setFont(new Font("Consolas",Font.PLAIN,30));
		checkbox.setForeground(Color.CYAN);
		checkbox.setBackground(Color.darkGray);
		checkbox.setBounds(40, 400, 130, 30);
		add(checkbox);
	}public void checkBox_function1() {
		checkbox1=new JCheckBox("powerplay");
		checkbox1.setFont(new Font("Consolas",Font.PLAIN,30));
		checkbox1.setForeground(Color.CYAN);
		checkbox1.setBackground(Color.darkGray);
		checkbox1.setBounds(200, 400, 180, 30);
		add(checkbox1);
	}public void checkBox_function2() {
		checkbox2=new JCheckBox("wired");
		checkbox2.setFont(new Font("Consolas",Font.PLAIN,30));
		checkbox2.setForeground(Color.CYAN);
		checkbox2.setBackground(Color.darkGray);
		checkbox2.setBounds(420, 400, 110, 30);
		add(checkbox2);
	}public void checkBox_function3() {
		checkbox3=new JCheckBox("bluetooth");
		checkbox3.setFont(new Font("Consolas",Font.PLAIN,30));
		checkbox3.setForeground(Color.CYAN);
		checkbox3.setBackground(Color.darkGray);
		checkbox3.setBounds(580, 400, 180, 35);
		add(checkbox3);
	}public void checkBox_function4() {
		checkbox4=new JCheckBox("lightspeed wireless");
		checkbox4.setFont(new Font("Consolas",Font.PLAIN,25));
		checkbox4.setForeground(Color.CYAN);
		checkbox4.setBackground(Color.darkGray);
		checkbox4.setBounds(40, 470, 300, 30);
		add(checkbox4);
	}public void checkBox_function5() {
		checkbox5=new JCheckBox("Optical sensor");
		checkbox5.setFont(new Font("Consolas",Font.PLAIN,25));
		checkbox5.setForeground(Color.CYAN);
		checkbox5.setBackground(Color.darkGray);
		checkbox5.setBounds(400, 470, 230, 30);
		add(checkbox5);
	}public void checkBox_function6() {
		checkbox6=new JCheckBox("laser sensor");
		checkbox6.setFont(new Font("Consolas",Font.PLAIN,25));
		checkbox6.setForeground(Color.CYAN);
		checkbox6.setBackground(Color.darkGray);
		checkbox6.setBounds(40, 550, 200, 30);
		add(checkbox6);
	}
}

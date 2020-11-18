import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
public class Start_Frame extends JFrame {
	private JButton startBtn, ruleBtn, resetBtn,languageBtn, logitechBtn, razerBtn,steelseriesBtn ;
	private Implement_Frame impelment_frame;
	private Rule_Frame rule_frame;
	private JPanel panel = new JPanel();
	private JLabel title;
	private Border selected_border = BorderFactory.createLineBorder(Color.GREEN),unselected_border= BorderFactory.createLineBorder(null);
	public HashSet<String> set = new HashSet();
	public Start_Frame() {
		super("Mouse Engine");
		setSize(900, 900);
		ImageIcon start_background = new ImageIcon("bground_start.png");
		start_background.setImage(
				start_background.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
		panel.add(new JLabel(start_background));
		setIconImage(Toolkit.getDefaultToolkit().getImage("mouse.png"));
		title();
		start_function();
		rule_function();
		langauage_function();
		resetBtn_function();
		logitech_function();
		razer_function();
		steelseries_function();
		add(panel);
	}
	public void title() {
		title=new JLabel(new ImageIcon("mouseEngine.jpg"));
		title.setBounds(10,50,850,100);
		add(title);
	}
	public void start_function() {
		startBtn = new JButton(new ImageIcon("start.jpg"));
		startBtn.setBounds(100,500,300,100);
		startBtn.setEnabled(false);
		add(startBtn);
		impelment_frame = new Implement_Frame();
		class StartListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				dispose();
				impelment_frame.setDefaultCloseOperation(impelment_frame.EXIT_ON_CLOSE);
				impelment_frame.setVisible(true);
			}
		}
		ActionListener listener = new StartListener();
		startBtn.addActionListener(listener);

	}

	public void rule_function() {
		ruleBtn = new JButton(new ImageIcon("rule.jpg"));
		ruleBtn.setBounds(500,500,300,100);
		add(ruleBtn);
		rule_frame = new Rule_Frame();
		class RuleListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				rule_frame.setDefaultCloseOperation(rule_frame.HIDE_ON_CLOSE);
				rule_frame.setVisible(true);
			}
		}
		ActionListener listener = new RuleListener();
		ruleBtn.addActionListener(listener);
	}

	public void langauage_function() {
		languageBtn = new JButton(new ImageIcon("Language.jpg"));
		languageBtn.setBounds(500,700,300,90);
		add(languageBtn);
		class LanguageListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				
			}
		}
		ActionListener listener = new LanguageListener();
		languageBtn.addActionListener(listener);
	}

	public void logitech_function() {
		logitechBtn = new JButton(new ImageIcon("logitech.jpg"));
		logitechBtn.setBorder(BorderFactory.createLoweredBevelBorder());
		logitechBtn.setBounds(100,300,150,150);
		add(logitechBtn);
		class logitechListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				set.add("logitech");
				logitechBtn.setBorder(BorderFactory.createRaisedBevelBorder());
				logitechBtn.setBorder(selected_border);
				logitechBtn.setEnabled(false);
				startBtn.setEnabled(true);
			}
		}
		ActionListener listener = new logitechListener();
		logitechBtn.addActionListener(listener);
	}

	public void razer_function() {
		razerBtn = new JButton(new ImageIcon("Razer.jpg"));
		razerBtn.setBorder(BorderFactory.createLoweredBevelBorder());
		razerBtn.setBounds(380,300,140,140);
		add(razerBtn);
		class razerListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				set.add("razer");
				razerBtn.setBorder(BorderFactory.createRaisedBevelBorder());
				razerBtn.setBorder(selected_border);
				razerBtn.setEnabled(false);
				startBtn.setEnabled(true);
			}
		}
		ActionListener listener = new razerListener();
		razerBtn.addActionListener(listener);
	}

	public void steelseries_function() {
		steelseriesBtn = new JButton(new ImageIcon("Steelseries.jpg"));
		steelseriesBtn.setBorder(BorderFactory.createLoweredBevelBorder());
		steelseriesBtn.setBounds(650,300,140,150);
		add(steelseriesBtn);
		class steelseriesListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				set.add("steelseries");
				steelseriesBtn.setBorder(BorderFactory.createRaisedBevelBorder());
				steelseriesBtn.setBorder(selected_border);
				steelseriesBtn.setEnabled(false);
				startBtn.setEnabled(true);
			}
		}
		ActionListener listener = new steelseriesListener();
		steelseriesBtn.addActionListener(listener);
	}

	public void resetBtn_function() {
		resetBtn=new JButton(new ImageIcon("reset.jpg"));
		resetBtn.setBounds(750,200,100,70);
		add(resetBtn);
		class resetListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				set.clear();
				logitechBtn.setBorder(BorderFactory.createLoweredBevelBorder());
				razerBtn.setBorder(BorderFactory.createLoweredBevelBorder());
				steelseriesBtn.setBorder(BorderFactory.createLoweredBevelBorder());
				logitechBtn.setBorder(unselected_border);
				razerBtn.setBorder(unselected_border);
				steelseriesBtn.setBorder(unselected_border);
				logitechBtn.setEnabled(true);
				razerBtn.setEnabled(true);
				steelseriesBtn.setEnabled(true);
				startBtn.setEnabled(false);
			}
		}
		ActionListener listener = new resetListener();
		resetBtn.addActionListener(listener);
	}
	//check selected button
	public HashSet<String> getSet() {
		return set;
	}
}
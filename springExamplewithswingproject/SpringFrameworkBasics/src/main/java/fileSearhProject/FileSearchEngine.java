package fileSearhProject;

/* Imports the required I/O classes. */
/* Imports the required Util classes. */
/* Imports the required AWT classes */
import java.awt.event.*;
import java.awt.*;
/* Imports the required Swing classes */
import javax.swing.*;
		import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;


public class FileSearchEngine extends JFrame implements ActionListener,ItemListener {

	JLabel labelText;
	JLabel labelLook;
	JLabel labelSearch;
	JLabel labelResult;

	JTextField textText;
	JTextField textLook;

	JButton search;
	JButton cancel;
	JButton browse;
	JButton help;

	JPanel panel;
	JPanel paneLeft;
	JPanel paneRight;

	JScrollPane scrollpane;

	JCheckBox doc, vid, aud, img;
	JRadioButton lan, local, both;
	
	static String strText;
	static String strLook;
	String file1 = "";
	JTable table;
	ButtonGroup btngrp;
	int count = 0;
	int FLAG = 0;

	DefaultTableModel model;

	int countFile;

	public FileSearchEngine() {
		try {

			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (Exception e) {

			System.out.println(e);
		}

		setSize(800, 600);

		setTitle("File Search Utility");

		panel = new JPanel();

		panel.setLayout(new GridLayout(0, 2));

		getContentPane().add(panel);

		paneLeft = new JPanel();
		paneLeft.setSize(400, 600);
		paneRight = new JPanel();
		paneLeft.setLayout(null);
		panel.add(paneLeft);
		panel.add(paneRight);
		help = new JButton("Help");
		help.setBounds(200, 500, 100, 40);
		paneLeft.add(help);

		labelText = new JLabel("What do you want to search?");
		labelText.setFont(new Font("Verdana", Font.BOLD, 12));
		labelText.setBounds(20, 20, 300, 30);
		paneLeft.add(labelText);

		textText = new JTextField(50);
		textText.setFont(new Font("Verdana", Font.PLAIN, 12));
		textText.setBounds(20, 60, 300, 20);
		paneLeft.add(textText);

		labelText = new JLabel("Search by Type");
		labelText.setFont(new Font("Verdana", Font.BOLD, 12));
		labelText.setBounds(20, 100, 200, 20);
		paneLeft.add(labelText);

		doc = new JCheckBox("Documents(Word, text and ppt files...)");
		doc.setFont(new Font("Verdana", Font.PLAIN, 12));
		doc.setBounds(30, 130, 300, 20);
		paneLeft.add(doc);

		aud = new JCheckBox("Audio files");
		aud.setFont(new Font("Verdana", Font.PLAIN, 12));
		aud.setBounds(30, 160, 300, 20);
		paneLeft.add(aud);

		vid = new JCheckBox("Video files");
		vid.setFont(new Font("Verdana", Font.PLAIN, 12));
		vid.setBounds(30, 190, 300, 20);
		paneLeft.add(vid);

		img = new JCheckBox("Images(png,jpg,bmp files)...");
		img.setFont(new Font("Verdana", Font.PLAIN, 12));
		img.setBounds(30, 220, 300, 20);
		paneLeft.add(img);

		labelText = new JLabel("Look in...");
		labelText.setFont(new Font("Verdana", Font.BOLD, 12));
		labelText.setBounds(20, 260, 300, 20);
		paneLeft.add(labelText);
		
		btngrp = new ButtonGroup();
		local = new JRadioButton("My PC");
		local.setFont(new Font("Verdana", Font.PLAIN, 12));
		local.setBounds(30, 290, 80, 20);
		btngrp.add(local);
		paneLeft.add(local);

		lan = new JRadioButton("LAN");
		lan.setFont(new Font("Verdana", Font.PLAIN, 12));
		lan.setBounds(120, 290, 80, 20);
		btngrp.add(lan);
		paneLeft.add(lan);
		
		both = new JRadioButton("Both");
		both.setFont(new Font("Verdana", Font.PLAIN, 12));
		both.setBounds(210, 290, 80, 20);
		btngrp.add(both);
		paneLeft.add(both);
		//paneLeft.add(btngrp);
		search = new JButton("Search");
		cancel = new JButton("Cancel");
		search.setBounds(20, 320, 80, 30);
		cancel.setBounds(110, 320, 80, 30);
		paneLeft.add(search);
		paneLeft.add(cancel);

		labelSearch = new JLabel("Search Result(s): ");
		labelSearch.setFont(new Font("Verdana", Font.BOLD, 12));
		labelResult = new JLabel("0 files.");
		labelResult.setFont(new Font("Verdana", Font.BOLD, 12));
		labelSearch.setBounds(20, 370, 150, 30);
		labelResult.setBounds(180, 370, 80, 30);
		paneLeft.add(labelSearch);
		paneLeft.add(labelResult);
		// pane3.add(pane4);

		paneRight.setLayout(new BorderLayout());
		model = new DefaultTableModel();
		table = new JTable(model);
		scrollpane = new JScrollPane(table);
		paneRight.add(scrollpane, BorderLayout.CENTER);
		cancel.addActionListener(this);
		search.addActionListener(this);
		show();

	}

	/*public static void main(String[] args) {
		new FileSearchEngine();

	}*/

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == search) {
			
			file1 = textText.getText();
		//	System.out.println(file1);
			new MyFile().main(file1);

		}
		if (ae.getSource() == cancel) {
			System.exit(0);
	}

	}

	
	public void itemStateChanged(ItemEvent e) {
	    
	    Object source = e.getItemSelectable();

	    if (source == doc) {
	      
	    } else if (source == vid) {
	    	
	    	
	    } else if (source == aud) {
	      
	    } else if (source == img) {
	      
	    }

	    if (e.getStateChange() == ItemEvent.DESELECTED){}
	       
	   	   
	}}

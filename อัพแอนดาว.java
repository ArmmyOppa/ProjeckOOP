import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.ImageIcon;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.ScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import java.awt.TextField;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;
import java.awt.Button;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import java.awt.TextArea;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import java.awt.CardLayout;
import java.awt.List;
import java.awt.Label;
import javax.swing.JFileChooser;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
public class MainFrame extends JFrame {
	int i=0,x=0,j=0,row=0,colum=0,cost=0,cost1=0,y=0,z=0,g=0;
	String[][] sum1 = new String[0][0];
	String asd;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private final JButton btnNewButton_3 = new JButton("Exit Program");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
					frame.setUndecorated(true);
					frame.setLocale(null);
					frame.setTitle("Program Gas");
					frame.setVisible(true);
				} catch (Exception e) {}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		//setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\OOP\\Untitled-1.png"));
		//JLabel background;		
		//setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 1270, 882);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel_9 = new Panel();
		panel_9.setBounds(926, 659, 30, 30);
		contentPane.add(panel_9);
		panel_9.setBackground(new Color(0, 255, 0));
		panel_9.setLayout(new CardLayout(0, 0));
		
		Label label = new Label("More Gas");
		label.setBounds(966, 659, 65, 30);
		label.setBackground(SystemColor.inactiveCaption);
		contentPane.add(label);
		
		Panel panel_10 = new Panel();
		panel_10.setBounds(926, 729, 30, 30);
		contentPane.add(panel_10);
		panel_10.setBackground(new Color(255, 255, 0));
		
		Label label_1 = new Label("Gas Medium");
		label_1.setBounds(966, 729, 90, 21);
		label_1.setBackground(SystemColor.inactiveCaption);
		contentPane.add(label_1);
		
		Panel panel_11 = new Panel();
		panel_11.setBounds(1086, 659, 30, 30);
		contentPane.add(panel_11);
		panel_11.setBackground(new Color(255, 0, 0));
		
		Label label_2 = new Label("No Gas");
		label_2.setBounds(1126, 664, 59, 21);
		label_2.setBackground(SystemColor.inactiveCaption);
		contentPane.add(label_2);
		
		Panel panel_12 = new Panel();
		panel_12.setBounds(1086, 729, 30, 30);
		contentPane.add(panel_12);
		panel_12.setBackground(new Color(255, 140, 0));
		
		Label label_3 = new Label("Gas Quite a Few");
		label_3.setBounds(1126, 734, 90, 21);
		label_3.setBackground(SystemColor.inactiveCaption);
		contentPane.add(label_3);
		
		Panel panel_8 = new Panel();
		panel_8.setBounds(916, 649, 420, 124);
		panel_8.setBackground(SystemColor.inactiveCaption);
		contentPane.add(panel_8);
		
		Panel panel = new Panel();
		panel.setBounds(10, 13, 300, 760);
		panel.setBackground(Color.PINK);
		panel.setLayout(null);
		//panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		
		Panel panel_1 = new Panel();
		panel_1.setForeground(new Color(64, 64, 64));
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(9, 10, 281, 79);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setBounds(51, 5, 220, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		Panel panel_2 = new Panel();
		panel_2.setBounds(316, 13, 1100, 600);
		panel_2.setBackground(SystemColor.windowBorder);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		setVisible(true);
		
		JButton btnNewButton = new JButton("Open File");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileopen = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Text/CSV file", "txt", "csv");
				fileopen.addChoosableFileFilter(filter);
				int ret = fileopen.showDialog(null, "Open File");
				if (ret == JFileChooser.APPROVE_OPTION) {
					textField.setText(fileopen.getSelectedFile().toString());
					 asd=fileopen.getSelectedFile().toString();
				}//settext
				try {
					BufferedReader text = new BufferedReader(new FileReader(fileopen.getSelectedFile().toString()));
					BufferedReader text1 = new BufferedReader(new FileReader(fileopen.getSelectedFile().toString()));
					String line,line1;
					while ((line = text.readLine()) != null) {
						String[] arr = line.split(" ");
						row++;
						for (i=0 ;i< arr.length;i++,j++) {
							colum++;
						}
					}text.close();//close
					j=0;
					String[] arr1 = new String[colum];
					while ((line1 = text1.readLine()) != null) {
						String[] arr = line1.split(" ");
						for (i=0 ;i< arr.length;i++,j++) {
							arr1[j]=arr[i];
							//System.out.println("Out :"+arr1[j]);//arr1[j]=Splitค่าและเก็บเป็นArrat 1 D
						}
					}text1.close();//close
					sum1 = new String[row][colum/row];
					j=0;
					for (z = 0; z < sum1.length; z++) {//เก็บข้อมูล Array 1 D เป็น 2 D
						for (g = 0; g < sum1[z].length; g++) {
							sum1[z][g]=arr1[j];
							System.out.print(" "+sum1[z][g]);
							j++;
						}System.out.println();
					}
//					for ( i = 0; i <arr1.length; i++) {
//						//cost=Integer.parseInt(arr1[i][j]);
//						System.out.println("cost-1"+cost);
//					}
					//metCO(cost);
				} catch (FileNotFoundException e1) {}
				catch (IOException e1) {}
			}//Action
		});
		TextArea textArea = new TextArea(" ",0,0,TextArea.SCROLLBARS_BOTH);
		textArea.setBounds(316, 646, 594, 127);
		textArea.setBackground(UIManager.getColor("Button.disabledForeground"));
		contentPane.add(textArea);
		setVisible(true);
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(72, 34, 75, 21);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(186, 34, 85, 21);
		panel_1.add(btnNewButton_1);
		
		JLabel lblFile = new JLabel("File :");
		lblFile.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFile.setBounds(10, 8, 46, 13);
		panel_1.add(lblFile);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaption);
		panel_3.setBounds(9, 96, 281, 165);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 40, 199, 19);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("OK");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str;
				str=textField_1.getText();
				int rejus = Integer.parseInt(str);//ค่าที่inputเข้ามา
				for (j = 0; j < row; j++){
					for (i = 0 ; i < colum/row; i++,x=x+(1100/(colum/row))) {
						JButton btnNewButton_4 = new JButton(sum1[j][i]);
//						btnNewButton_4.addActionListener(new ActionListener() {
//							public void actionPerformed(ActionEvent e) {
//								JOptionPane.showMessageDialog(btnNewButton_4,"Error ! ! ! ");
//							}
//						});
						btnNewButton_4.setBounds(x, y,(1100/(colum/row)),(600/row));//1100, 600
						panel_2.add(btnNewButton_4);
//						System.out.println("Out cost:"+cost);
//						System.out.println("Out cost1:"+cost1);
						setVisible(true);
					}
					y=y+(600/row);
					x=0;
					setVisible(true);
				}
//				150*150(ค่าinput - (ค่าในไฟล์ -200))
//				metstr(rejus, row, colum);
				}
		});
		
		btnNewButton_2.setBounds(10, 69, 85, 21);
		panel_3.add(btnNewButton_2);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClear.setBounds(124, 69, 85, 21);
		panel_3.add(btnClear);
		
		Label label_4 = new Label("Input The depth of the abyss");
		label_4.setBounds(10, 13, 180, 21);
		panel_3.add(label_4);
		
		Label label_5 = new Label("m.");
		label_5.setBounds(212, 38, 59, 21);
		panel_3.add(label_5);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.inactiveCaption);
		panel_4.setBounds(9, 268, 280, 138);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		Label label_8 = new Label("Total :");
		label_8.setBounds(10, 10, 59, 21);
		panel_4.add(label_8);
		
		Label label_9 = new Label("Average :");
		label_9.setBounds(10, 40, 59, 21);
		panel_4.add(label_9);
		
		Label label_10 = new Label("Maximum :");
		label_10.setBounds(10, 67, 84, 21);
		panel_4.add(label_10);
		
		Label label_11 = new Label("Minimum :");
		label_11.setBounds(10, 94, 84, 21);
		panel_4.add(label_11);
		
		Label label_12 = new Label("0.00");
		label_12.setBounds(140, 10, 59, 21);
		panel_4.add(label_12);
		
		Label label_13 = new Label("0.00");
		label_13.setBounds(140, 40, 59, 21);
		panel_4.add(label_13);
		
		Label label_14 = new Label("0.00");
		label_14.setBounds(140, 67, 59, 21);
		panel_4.add(label_14);
		
		Label label_15 = new Label("0.00");
		label_15.setBounds(140, 94, 59, 21);
		panel_4.add(label_15);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.inactiveCaption);
		panel_5.setBounds(9, 412, 280, 298);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(51, 204, 255));
		panel_6.setBounds(10, 35, 260, 100);
		panel_5.add(panel_6);
		panel_6.setLayout(null);
		
		Label label_6 = new Label("Gas AREA 0 m.");
		label_6.setBounds(92, 45, 111, 21);
		panel_6.add(label_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 153, 0));
		panel_7.setBounds(10, 165, 260, 100);
		panel_5.add(panel_7);
		panel_7.setLayout(null);
		
		Label label_7 = new Label("DISTANCE 0 m.");
		label_7.setBounds(88, 45, 111, 21);
		panel_7.add(label_7);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		
		JLabel lblMassage = new JLabel("Massage");
		lblMassage.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMassage.setBounds(316, 613, 80, 30);
		contentPane.add(lblMassage);
		
		contentPane.add(panel);
		panel.setLayout(null);
		btnNewButton_3.setBounds(9, 720, 280, 36);
		panel.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}//Main
//	protected int metCO(int cost) {
//		//cost=Integer.parseInt(arr1);
//		System.out.println("MetCo :"+cost);
//		return cost;
//	}

	protected void metstr(int rejus, int row, int colum) {//สร้างเฉดสี
		System.out.println("Metstr rejus :"+rejus);
		System.out.println("Metstr row :"+row);
		System.out.println("Metstr colum :"+colum/row);
	}
}

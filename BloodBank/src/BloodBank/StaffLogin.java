package BloodBank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class StaffLogin {

	private JFrame frmLogin;
	private JTextField txtEmail;
	sqlQueries msql=new sqlQueries();
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffLogin window = new StaffLogin();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StaffLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 512, 318);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Login", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 51)));
		panel.setBounds(58, 51, 383, 144);
		frmLogin.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblemail = new JLabel("Staff's Email : ");
		lblemail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblemail.setHorizontalAlignment(SwingConstants.LEFT);
		lblemail.setBounds(35, 36, 140, 21);
		panel.add(lblemail);
		
		JLabel lblpassword = new JLabel("Password : ");
		lblpassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblpassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblpassword.setBounds(35, 92, 140, 21);
		panel.add(lblpassword);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtEmail.setBounds(203, 36, 140, 21);
		panel.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(203, 93, 140, 20);
		panel.add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String st[]=new String[2];
				st[0]=getText();
				
			}
		});
		btnLogin.setBackground(new Color(255, 0, 51));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setMnemonic('L');
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogin.setBounds(81, 212, 89, 23);
		frmLogin.getContentPane().add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtEmail.setText("");
				txtPassword.setText("");
			}
		});
		btnCancel.setBackground(new Color(255, 0, 51));
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setMnemonic('C');
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancel.setBounds(206, 212, 89, 23);
		frmLogin.getContentPane().add(btnCancel);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBackground(new Color(255, 0, 51));
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExit.setMnemonic('E');
		btnExit.setBounds(332, 212, 89, 23);
		frmLogin.getContentPane().add(btnExit);
	}
}

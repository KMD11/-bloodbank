package BloodBank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Request {

	private JFrame frmReuest;
	private JTextField txtHosptialName;
	private JTextField txtBQty;
	private JTextField txtReqDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Request window = new Request();
					window.frmReuest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Request() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmReuest = new JFrame();
		frmReuest.setTitle("Reuest");
		frmReuest.setBounds(100, 100, 311, 247);
		frmReuest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmReuest.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Request", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 276, 188);
		frmReuest.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblhosptial = new JLabel("Hosptial Name : ");
		lblhosptial.setHorizontalAlignment(SwingConstants.RIGHT);
		lblhosptial.setBounds(10, 21, 116, 20);
		panel.add(lblhosptial);
		
		JLabel lblbloodtype = new JLabel("Blood Type : ");
		lblbloodtype.setHorizontalAlignment(SwingConstants.RIGHT);
		lblbloodtype.setBounds(10, 52, 116, 20);
		panel.add(lblbloodtype);
		
		JLabel lblqty = new JLabel("Blood Quantity : ");
		lblqty.setHorizontalAlignment(SwingConstants.RIGHT);
		lblqty.setBounds(10, 83, 116, 20);
		panel.add(lblqty);
		
		JLabel Request = new JLabel("Request Date : ");
		Request.setHorizontalAlignment(SwingConstants.RIGHT);
		Request.setBounds(10, 114, 116, 20);
		panel.add(Request);
		
		txtHosptialName = new JTextField();
		txtHosptialName.setBounds(136, 21, 116, 20);
		panel.add(txtHosptialName);
		txtHosptialName.setColumns(10);
		
		txtBQty = new JTextField();
		txtBQty.setBounds(136, 83, 116, 20);
		panel.add(txtBQty);
		txtBQty.setColumns(10);
		
		txtReqDate = new JTextField();
		txtReqDate.setBounds(136, 114, 116, 20);
		panel.add(txtReqDate);
		txtReqDate.setColumns(10);
		
		JComboBox combobBType = new JComboBox();
		combobBType.setBounds(136, 52, 116, 20);
		panel.add(combobBType);
		
		JButton btnRequest = new JButton("Request");
		btnRequest.setBounds(34, 155, 89, 23);
		panel.add(btnRequest);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(156, 155, 89, 23);
		panel.add(btnCancel);
	}
}

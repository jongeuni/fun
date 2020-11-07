package frame;

import java.awt.Font;
import java.awt.GridLayout;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import db.DBManager;

public class LoginFrame extends BaseFrame{
	private JTextField tfName = new JTextField();
	private JPasswordField tfPasswd = new JPasswordField(); //��й�ȣ �Ⱥ��̰� �Ϸ��� JPasswordField
	

	public LoginFrame() {
		super("�α���",300,200);
		setLayout(null); // setBounds ���ַ��� null�� �������
		
		//���۷�Ʈ
		JLabel lbTitle = new JLabel("������ �α���", JLabel.CENTER);
		JLabel lbName = new JLabel("�̸�");
		JLabel lbPasswd = new JLabel("��й�ȣ");
		
		
		JButton btnOK = new JButton("Ȯ��");
		JButton btnClose = new JButton("����");
		
		JPanel pnlCenter = new JPanel(new GridLayout(2,2,-80,10)); //center ĭ�� 2, 2���� ����
		// ���̾ƿ� ����: BorderLayout, FlowLayout, GridLayout
		JPanel pnlSouth = new JPanel();
		
		// ������� ����. add �������
		pnlCenter.add(lbName);
		pnlCenter.add(tfName);
		pnlCenter.add(lbPasswd);
		pnlCenter.add(tfPasswd);
		
		pnlSouth.add(btnOK);
		pnlSouth.add(btnClose);
		
	
		
		//�¹ٿ�� ������� ���۷�Ʈ ����
		lbTitle.setFont(new Font("����", Font.PLAIN, 24));
		lbTitle.setBounds(0,0,285,30); //��ġ ������
		pnlCenter.setBounds(50,50,200,50);
		pnlSouth.setBounds(0,120,285,40);
			
		add(lbTitle); // jframe�� ����
		add(pnlCenter);
		add(pnlSouth);
		
		/*btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});*/
		
		btnOK.addActionListener(e->login());
		
	}
	public static void main(String[] args) {
		LoginFrame frame = new LoginFrame();
		frame.setVisible(true); // â�� �����
		// new LoginFrame.setVisible(true);��� �ᵵ �ȴ�
	}
	private void login() {
		String name = tfName.getText(); //getText�� ���� ��������
		String passwd = tfPasswd.getText();
		if(name.isEmpty()||passwd.isEmpty()) { //���������
			//JOptionPane.showMessageDialog(null, "��ĭ�� ä�� �ּ���.", "��ĭ����", JOptionPane.ERROR_MESSAGE);
			eMessage("��ĭ�� ä�� �ּ���");
		} else {
			/*ResultSet rs = DBManager.executeQuery("SELECT * FROM admin WHERE name = ? AND passwd=?", name, passwd);
			if(rs.next()) {
				iMessage("�α��� ����");
			}else {
				eMessage("�α��� ����");
			}*/
			
		}
		
	}
	
	

}

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
	private JPasswordField tfPasswd = new JPasswordField(); //비밀번호 안보이게 하려고 JPasswordField
	

	public LoginFrame() {
		super("로그인",300,200);
		setLayout(null); // setBounds 해주려면 null로 해줘야함
		
		//컨퍼런트
		JLabel lbTitle = new JLabel("관리자 로그인", JLabel.CENTER);
		JLabel lbName = new JLabel("이름");
		JLabel lbPasswd = new JLabel("비밀번호");
		
		
		JButton btnOK = new JButton("확인");
		JButton btnClose = new JButton("종료");
		
		JPanel pnlCenter = new JPanel(new GridLayout(2,2,-80,10)); //center 칸을 2, 2개씩 나눔
		// 레이아웃 종류: BorderLayout, FlowLayout, GridLayout
		JPanel pnlSouth = new JPanel();
		
		// 순서대로 들어간다. add 순서대로
		pnlCenter.add(lbName);
		pnlCenter.add(tfName);
		pnlCenter.add(lbPasswd);
		pnlCenter.add(tfPasswd);
		
		pnlSouth.add(btnOK);
		pnlSouth.add(btnClose);
		
	
		
		//셋바운드 방식으로 컨퍼런트 적용
		lbTitle.setFont(new Font("굴림", Font.PLAIN, 24));
		lbTitle.setBounds(0,0,285,30); //위치 정해줌
		pnlCenter.setBounds(50,50,200,50);
		pnlSouth.setBounds(0,120,285,40);
			
		add(lbTitle); // jframe에 적용
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
		frame.setVisible(true); // 창이 띄워짐
		// new LoginFrame.setVisible(true);라고 써도 된다
	}
	private void login() {
		String name = tfName.getText(); //getText는 값을 가져와줌
		String passwd = tfPasswd.getText();
		if(name.isEmpty()||passwd.isEmpty()) { //비어있으면
			//JOptionPane.showMessageDialog(null, "빈칸을 채워 주세요.", "빈칸오류", JOptionPane.ERROR_MESSAGE);
			eMessage("빈칸을 채워 주세요");
		} else {
			/*ResultSet rs = DBManager.executeQuery("SELECT * FROM admin WHERE name = ? AND passwd=?", name, passwd);
			if(rs.next()) {
				iMessage("로그인 성공");
			}else {
				eMessage("로그인 실패");
			}*/
			
		}
		
	}
	
	

}

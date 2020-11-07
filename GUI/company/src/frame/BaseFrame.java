package frame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BaseFrame extends JFrame{ // JFrame을 상속받아야한다
	
	//생성자 
	public BaseFrame(String title, int width, int height) {
		setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(null); // 창이 가운데에 뜨게
	}
	// main함수 필요 x
	protected void iMessage(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	protected void eMessage(String msg) {
		JOptionPane.showMessageDialog(null, "빈칸을 채워 주세요.", "빈칸오류", JOptionPane.ERROR_MESSAGE);
	}
}

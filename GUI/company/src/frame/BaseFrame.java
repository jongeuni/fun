package frame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BaseFrame extends JFrame{ // JFrame�� ��ӹ޾ƾ��Ѵ�
	
	//������ 
	public BaseFrame(String title, int width, int height) {
		setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(null); // â�� ����� �߰�
	}
	// main�Լ� �ʿ� x
	protected void iMessage(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	protected void eMessage(String msg) {
		JOptionPane.showMessageDialog(null, "��ĭ�� ä�� �ּ���.", "��ĭ����", JOptionPane.ERROR_MESSAGE);
	}
}

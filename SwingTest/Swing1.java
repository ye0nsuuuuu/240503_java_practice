package ex_240503.SwingTest;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {

}


public class Swing1 extends JFrame{
	public Swing1() {
		
		setTitle("300x300 스윙 프레임 만들기");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(300, 300);
		
		
		
		// 프레임의 컨텐트팬을 알아낸다.
		Container contentPane = getContentPane();
		

	
//		Container contentPane = getContentPane(); // 컨텐트팬 알아내기
		contentPane.setBackground(Color.ORANGE); // 오렌지색 배경 설정
		
		
		
		contentPane.setLayout(new FlowLayout()); // 컨텐트팬에 FlowLayout
		// 배치관리자 달기
		
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,100,100));
		
		
		contentPane.add(new JButton("OK")); // OK 버튼 달기
		contentPane.add(new JButton("Cancel")); // Cancel 버튼 달기
		contentPane.add(new JButton("Ignore")); // Ignore 버튼 달기
		
		// 버튼 컴포넌트 생성
		JButton button = new JButton("Click");
		contentPane.add(button); // 컨텐트팬에 버튼 부착

		
		
		setVisible(true);

	}

	public static void main(String[] args) {
		Swing1 swing1 =new Swing1();
		
		
	}

}

package ex_240503.SwingTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;




public class Swing2 extends JFrame{
	public Swing2() {
		
		setTitle("300x300 스윙 프레임 만들기");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(300, 300);
		
		
		
		// 프레임의 컨텐트팬을 알아낸다.
		Container contentPane = getContentPane();
		

	
//		Container contentPane = getContentPane(); // 컨텐트팬 알아내기
		contentPane.setBackground(Color.ORANGE); // 오렌지색 배경 설정
		
		
		
		contentPane.setLayout(new FlowLayout()); // 컨텐트팬에 FlowLayout
		// 배치관리자 달기
		
		contentPane.setLayout(new BorderLayout(50,30));
		
		
		contentPane.add(new JButton("OK"),BorderLayout.CENTER); // OK 버튼 달기
		contentPane.add(new JButton("Cancel"),BorderLayout.EAST); // Cancel 버튼 달기
		contentPane.add(new JButton("Ignore"),BorderLayout.WEST); // Ignore 버튼 달기
		contentPane.add(new JButton("Click"),BorderLayout.NORTH);
		// 버튼 컴포넌트 생성
		
		

		
		
		setVisible(true);

	}

	public static void main(String[] args) {
		Swing2 swing1 =new Swing2();
		
		
	}

}

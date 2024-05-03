package ex_240503.SwingTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Swing4 extends JFrame {
	public Swing4() {

		setTitle("300x300 스윙 프레임 만들기");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(1000, 800);

		// 프레임의 컨텐트팬을 알아낸다.
		Container contentPane = getContentPane();

//		Container contentPane = getContentPane(); // 컨텐트팬 알아내기
		contentPane.setBackground(Color.gray); // 오렌지색 배경 설정

//		contentPane.setLayout(new FlowLayout()); // 컨텐트팬에 FlowLayout
		// 배치관리자 달기

		contentPane.setLayout(null);

		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50); // la를 (130,50) 위치로 지정
		la.setSize(200, 20); // la를 200x20 크기로 지정
		contentPane.add(la); // la를 컨텐트팬에 부착
		// 9개의 버튼 컴포넌트를 생성하고 동일한 크기로 설정한다.
		// 위치는 서로 겹치게 설정한다.
		for (int i = 1; i <= 9; i++) {
			JButton b = new JButton("버튼" + Integer.toString(i)); // 버튼 생성
			b.setLocation(i * 15, i * 15); // 버튼의 위치 설정
			b.setSize(200, 150); // 버튼의 크기는 동일하게 50x20
			contentPane.add(b); // 버튼을 컨텐트팬에 부착
		}

		JButton tempButton = new JButton("TempBotton");
		tempButton.setLocation(500, 400);
		tempButton.setSize(300, 200);
		contentPane.add(tempButton);

		// 버튼 컴포넌트 생성

		setVisible(true);

	}

	public static void main(String[] args) {
		Swing4 swing1 = new Swing4();

	}

}

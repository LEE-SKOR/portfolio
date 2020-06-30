package swingTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Memo extends JFrame{
	JTextArea ta;
	File f;
	public Memo(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenu mfile = new JMenu("파일");
		
		JMenuItem mOpen = new JMenuItem("열기");
		JMenuItem mNew = new JMenuItem("새파일");
		JMenuItem mSave = new JMenuItem("저장");
		JMenuItem mSaveAs = new JMenuItem("다른 이름으로 저장");
		JMenuItem mExit = new JMenuItem("끝내기");
		mfile.add(mOpen);
		mfile.add(mNew);
		mfile.add(mSave);
		mfile.add(mSaveAs);
		mfile.addSeparator();
		mfile.add(mExit);
		JMenuBar mb = new JMenuBar();
		mb.add(mfile);
		setJMenuBar(mb);
		
		ta = new JTextArea();
		//JScrollPane jsp = new JScrollPane(ta);
		JScrollPane jsp = new JScrollPane();
		jsp.setViewportView(ta);
		
		add(jsp);
	
		mOpen.addActionListener(new ActionListener() {//열기
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				if(fc.showOpenDialog(Memo.this)
						== JFileChooser.CANCEL_OPTION) return;
				f = fc.getSelectedFile();//선택된 파일
				setTitle(f.getName());
				fileRead(f);
				
				
			}
		});
		mNew.addActionListener(new ActionListener() {//새파일
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
				setTitle("제목없음");
				
			}
		});
		mSave.addActionListener(new ActionListener() {//저장
			public void actionPerformed(ActionEvent e) {
				if(getTitle().equals("제목없음")) {
//					JFileChooser fc = new JFileChooser();
//					if(fc.showSaveDialog(Memo.this)
//							== JFileChooser.CANCEL_OPTION) return;
//					f = fc.getSelectedFile();
//					fileSave(f);
//					setTitle(f.getName());
					mSaveAs.doClick();//doClick 메소드를 사용해서 명령어를 단축할 수 있다.
				}else {//기존 파일이 있음
					fileSave(f);
				}
			}
		});
		mSaveAs.addActionListener(new ActionListener() {//다른이름으로 저장
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				if(fc.showSaveDialog(Memo.this)
						== JFileChooser.CANCEL_OPTION) return;
				f = fc.getSelectedFile();
				fileSave(f);
				setTitle(f.getName());
			}
		});
		mExit.addActionListener(new ActionListener() {//끝내기
			public void actionPerformed(ActionEvent e) {
								
			}
		});
		
		setSize(500,400);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Memo("제목없음");

	}
	//파일 읽기 메소드
	private void fileRead(File f) {
		try {
		FileReader fr = new FileReader(f);
		StringWriter sw = new StringWriter();
		while(true) {
			int ch = fr.read();
			if(ch ==-1)break;
			sw.write(ch);
		}
		ta.setText(sw.toString());
		sw.close();
		fr.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//파일 저장 메소드
	private void fileSave(File f) {
		try {
			PrintStream ps = new PrintStream(f);
			ps.println(ta.getText());
			ps.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

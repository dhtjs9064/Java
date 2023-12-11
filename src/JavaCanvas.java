import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

//프로그램 진입점 및 GUI 생성
public class JavaCanvas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});

	}

	private static void createAndShowGUI() {
		System.out.println("Created GUI on EDT?" + SwingUtilities.isEventDispatchThread());
		JFrame f = new JFrame("Swing Paint Demo");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RectPanel rectPanel = new RectPanel();
		f.add(rectPanel, BorderLayout.NORTH);
		f.pack();
		f.setVisible(true);

	}

}

// RectPanel 클래스 - 그림 그리기 패널 및 이벤트 핸들링
class RectPanel extends JPanel implements ActionListener, MouseListener, MouseMotionListener {

	String shapeString = ""; // 도형의 형태를 담는 변수
	Point firstPointer = new Point(0, 0);
	Point secondPointer = new Point(0, 0);
	BufferedImage bufferedImage;
	private BufferedImage borderImage;

	// 패널에 금색 테두리를 추가
	private final BufferedImage partialImage;

	Color colors = Color.black;
	Float stroke = (float) 5;
	JComboBox<String> colorComboBox;
	JComboBox<String> strokeComboBox; // float로 설정해주는 이유는 setStroke에서 받는 인자 자료형이 float

	int width;
	int height;
	int minPointx;
	int minPointy;


	public RectPanel() {
		// 테두리 이미지 로드
		try {
			borderImage = ImageIO.read(new File("C:\\image\\Golden Border Frame.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 배경 이미지 생성 및 그리기
		partialImage = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2d = partialImage.createGraphics();

		// 배경 이미지 로드
		try {
			Image img = ImageIO.read(new File("C:\\image\\Silver Button Background.jpg"));
			g2d.drawImage(img, 0, 0, 200, 200, null);
		} catch (IOException e) {
			e.printStackTrace();
		}

		g2d.dispose();

		// JComboBox 초기화
		colorComboBox = new JComboBox<String>();
		strokeComboBox = new JComboBox<String>();

		// "전체지우기" 버튼
		ImageIcon originalIcon1 = new ImageIcon ("C:\\image\\ClearAll.png");
		Image originalImag1e1 = originalIcon1.getImage();
		Image resizedImage = originalImag1e1.getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		ImageIcon resizedIcon1 = new ImageIcon(resizedImage);
		JButton eraseAllButton = new JButton(resizedIcon1);
		eraseAllButton.setPreferredSize(new Dimension(80, 80));
		// 코드 내부에서 인식할 텍스트
		eraseAllButton.setActionCommand("전체지우기");
		
		// "네모" 버튼
		ImageIcon originalIcon2 = new ImageIcon("C:\\image\\Square.png");
		Image originalImage2 = originalIcon2.getImage();
		Image resizedImage2 = originalImage2.getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		ImageIcon resizedIcon2 = new ImageIcon(resizedImage2);
		JButton rectButton = new JButton(resizedIcon2);
		rectButton.setPreferredSize(new Dimension(80, 80));
		// 코드 내부에서 인식할 텍스트
		rectButton.setActionCommand("네모");

		// "선" 버튼
		ImageIcon originalIcon3 = new ImageIcon("C:\\image\\Line.png");
		Image originalImage3 = originalIcon3.getImage();
		Image resizedImage3 = originalImage3.getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		ImageIcon resizedIcon3 = new ImageIcon(resizedImage3);
		JButton lineButton = new JButton(resizedIcon3);
		lineButton.setPreferredSize(new Dimension(80, 80));
		// 코드 내부에서 인식할 텍스트
		lineButton.setActionCommand("선");

		// "원" 버튼
		ImageIcon originalIcon4 = new ImageIcon("C:\\image\\Circle.png");
		Image originalImage4 = originalIcon4.getImage();
		Image resizedImage4 = originalImage4.getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		ImageIcon resizedIcon4 = new ImageIcon(resizedImage4);
		JButton circleButton = new JButton(resizedIcon4);
		circleButton.setPreferredSize(new Dimension(80, 80));
		// 코드 내부에서 인식할 텍스트
		circleButton.setActionCommand("원");

		// "펜" 버튼
		ImageIcon originalIcon5 = new ImageIcon("C:\\image\\Pen.png");
		Image originalImage5 = originalIcon5.getImage();
		Image resizedImage5 = originalImage5.getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		ImageIcon resizedIcon5 = new ImageIcon(resizedImage5);
		JButton penButton = new JButton(resizedIcon5);
		penButton.setPreferredSize(new Dimension(80, 80));
		// 코드 내부에서 인식할 텍스트
		penButton.setActionCommand("펜");

		// "지우개" 버튼
		ImageIcon originalIcon6 = new ImageIcon("C:\\image\\Eraser.png");
		Image originalImage6 = originalIcon6.getImage();
		Image resizedImage6 = originalImage6.getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		ImageIcon resizedIcon6 = new ImageIcon(resizedImage6);
		JButton eraseButton = new JButton(resizedIcon6);
		eraseButton.setPreferredSize(new Dimension(80, 80));
		// 코드 내부에서 인식할 텍스트
		eraseButton.setActionCommand("지우개");

		// "Save" 버튼
		ImageIcon originalIcon7 = new ImageIcon("C:\\image\\Save.png");
		Image originalImage7 = originalIcon7.getImage();
		Image resizedImage7 = originalImage7.getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		ImageIcon resizedIcon7 = new ImageIcon(resizedImage7);
		JButton saveButton = new JButton(resizedIcon7);
		saveButton.setPreferredSize(new Dimension(80, 80));
		// 코드 내부에서 인식할 텍스트
		saveButton.setActionCommand("Save");

		// "Open" 버튼
		ImageIcon originalIcon8 = new ImageIcon("C:\\image\\Open.png");
		Image originalImage8 = originalIcon8.getImage();
		Image resizedImage8 = originalImage8.getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
		ImageIcon resizedIcon8 = new ImageIcon(resizedImage8);
		JButton openButton = new JButton(resizedIcon8);
		openButton.setPreferredSize(new Dimension(80, 80));
		// 코드 내부에서 인식할 텍스트
		openButton.setActionCommand("Open");

		// Color를 String으로 변환
		String[] colorStrings = { "Black", "Red", "Blue", "Green", "Yellow", "Pink", "Magenta" };
		String[] strokeStrings = { "5", "10", "15", "20", "25" };

		// ColorComboBox의 모델 변경
		colorComboBox.setModel(new DefaultComboBoxModel<String>(colorStrings));

		// StrokeComboBox의 모델 변경
		strokeComboBox.setModel(new DefaultComboBoxModel<String>(strokeStrings));

		// GUI에 버튼 및 콤보박스 등 추가
		add(eraseAllButton);
		add(penButton);
		add(lineButton);
		add(rectButton);
		add(circleButton);
		add(colorComboBox);
		add(strokeComboBox);
		add(eraseButton);

		add(saveButton);
		add(openButton);

		Dimension d = getPreferredSize();
		bufferedImage = new BufferedImage(d.width, d.height, BufferedImage.TYPE_INT_ARGB);
		setImageBackground(bufferedImage); // save 할 때 배경이 default로 black이여서 흰색으로

		eraseAllButton.addActionListener(this);
		rectButton.addActionListener(this);
		lineButton.addActionListener(this);
		circleButton.addActionListener(this);
		penButton.addActionListener(this);
		eraseButton.addActionListener(this);
		colorComboBox.addActionListener(this);
		strokeComboBox.addActionListener(this);
		saveButton.addActionListener(new SaveL(this, bufferedImage));
		openButton.addActionListener(new OpenL(this, bufferedImage));

		addMouseListener(this);
		addMouseMotionListener(this);

	}

	public void mousePressed(MouseEvent e) {

		// 다시 클릭됐을경우 좌표 초기화
		firstPointer.setLocation(0, 0);
		secondPointer.setLocation(0, 0);

		firstPointer.setLocation(e.getX(), e.getY());

	}

	public void mouseReleased(MouseEvent e) {

		if (shapeString != "펜") {
			secondPointer.setLocation(e.getX(), e.getY());
			updatePaint();
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource().getClass().toString().contains("JButton")) {
			shapeString = e.getActionCommand();
		} else if (e.getSource().equals(colorComboBox)) {
			colors = convertStringToColor((String) colorComboBox.getSelectedItem());
		} else if (e.getSource().equals(strokeComboBox)) {
			stroke = Float.parseFloat((String) strokeComboBox.getSelectedItem());
		}
	}
	
	// 색깔 변환 (도형 색, 글자 색 등 같이 사용)
	private Color convertStringToColor(String colorString) {
		switch (colorString) {
			case "Black":
				return Color.black;
			case "Red":
				return Color.red;
			case "Blue":
				return Color.blue;
			case "Green":
				return Color.green;
			case "Yellow":
				return Color.yellow;
			case "Pink":
				return Color.pink;
			case "Magenta":
				return Color.magenta;
			default:
				return Color.black; // 기본값은 검은색으로 설정
		}
	}
	
	// 패널 기본 크기
	public Dimension getPreferredSize() {
		return new Dimension(900, 700);
	}

	// 그림을 업데이트하는 메서드
	public void updatePaint() {

		// 그림의 폭과 높이 계산
		width = Math.abs(secondPointer.x - firstPointer.x);
		height = Math.abs(secondPointer.y - firstPointer.y);

		// 그림의 최소 좌표 계산
		minPointx = Math.min(firstPointer.x, secondPointer.x);
		minPointy = Math.min(firstPointer.y, secondPointer.y);

		// 그림을 그리기 위한 Graphics2D 객체 생성
		Graphics2D g = bufferedImage.createGraphics();
		
		// 모양에 따라 그림을 그리는 용도
		switch (shapeString) {

			case ("선"):
				g.setColor(colors);
				g.setStroke(new BasicStroke(stroke));
				g.drawLine(firstPointer.x, firstPointer.y, secondPointer.x, secondPointer.y);

				break;

			case ("네모"):
				g.setColor(colors);
				g.setStroke(new BasicStroke(stroke));
				g.drawRect(minPointx, minPointy, width, height);

				break;

			case ("원"):
				g.setColor(colors);
				g.setStroke(new BasicStroke(stroke));
				g.drawOval(minPointx, minPointy, width, height);
				break;

			case ("펜"):
				g.setColor(colors);
				g.setStroke(new BasicStroke(stroke));
				g.drawLine(firstPointer.x, firstPointer.y, secondPointer.x, secondPointer.y);
				break;

			case ("지우개"):
				g.setColor(Color.white);
				g.setStroke(new BasicStroke(stroke));
				g.drawLine(firstPointer.x, firstPointer.y, secondPointer.x, secondPointer.y);
				break;

			case ("전체지우기"):
				setImageBackground(bufferedImage);
				shapeString ="";
				break;

			default:
				break;

		}

		g.dispose();

		repaint();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(bufferedImage, 0, 0, null);

		if (borderImage != null) {
			int width = getWidth();
			int height = getHeight();

			// 이미지를 패널 크기에 맞게 스케일링
			Image scaledImage = borderImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);

			// Graphics 객체를 이용하여 이미지를 그림
			g.drawImage(scaledImage, 0, 0, null);
		}
		
		// 이미지 스케일링
		int x = 0;
		int y = 0;
		int width = 900;
		int height = 100;
		g.drawImage(partialImage, x, y, width, height, null);
	}

	// 내가 원하는 이미지로 배경 바꿈
	public void setImageBackground(BufferedImage bi) {
		this.bufferedImage = bi;
		Graphics2D g = bufferedImage.createGraphics();
		g.setColor(Color.white);
		g.fillRect(0, 0, 1000, 1200);
		g.dispose();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

		width = Math.abs(secondPointer.x - firstPointer.x);
		height = Math.abs(secondPointer.y - firstPointer.y);

		minPointx = Math.min(firstPointer.x, secondPointer.x);
		minPointy = Math.min(firstPointer.y, secondPointer.y);



		if (shapeString == "펜" | shapeString == "지우개") {
			if (secondPointer.x != 0 && secondPointer.y != 0) {
				firstPointer.x = secondPointer.x;
				firstPointer.y = secondPointer.y;
			}
			secondPointer.setLocation(e.getX(), e.getY());
			updatePaint();
		} else if (shapeString == "선") {

			Graphics g = getGraphics();


			g.drawLine(firstPointer.x, firstPointer.y, secondPointer.x, secondPointer.y);
			secondPointer.setLocation(e.getX(), e.getY());
			repaint();
			g.dispose();
		} else if (shapeString == "네모") {

			Graphics g = getGraphics();
			g.setColor(Color.BLACK);
			g.setXORMode(getBackground());

			g.drawRect(minPointx, minPointy, width, height);
			secondPointer.setLocation(e.getX(), e.getY());
			repaint();
			g.dispose();
		} else if (shapeString == "원") {

			Graphics g = getGraphics();
			g.setColor(Color.BLACK);
			g.setXORMode(getBackground());

			g.drawOval(minPointx, minPointy, width, height);
			secondPointer.setLocation(e.getX(), e.getY());

			g.dispose();
			repaint();
		}


	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}// Class dotButton

class OpenL implements ActionListener {

	RectPanel rectPanel;
	BufferedImage bufferedImage;
	JFileChooser jFileChooser = new JFileChooser();;

	OpenL(RectPanel rectPanel, BufferedImage bufferedImage) {
		this.rectPanel = rectPanel;
		this.bufferedImage = bufferedImage;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG", "jpeg", "jpg", "png", "bmp", "gif");
		jFileChooser.addChoosableFileFilter(filter);

		int rVal = jFileChooser.showOpenDialog(null);
		if (rVal == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jFileChooser.getSelectedFile();
			try {
				rectPanel.bufferedImage = ImageIO.read(new File(selectedFile.getAbsolutePath()));
				rectPanel.repaint();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (rVal == JFileChooser.CANCEL_OPTION) {

		}

	}

}// class OpenL

class SaveL implements ActionListener {

	RectPanel rectPanel;
	BufferedImage bufferedImage;
	JFileChooser jFileChooser;

	SaveL(RectPanel rectPanel, BufferedImage bufferedImage) {
		this.rectPanel = rectPanel;
		this.bufferedImage = bufferedImage;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jFileChooser = new JFileChooser();
		jFileChooser.setFileFilter(new FileNameExtensionFilter("*.png", "png"));
		int rVal = jFileChooser.showSaveDialog(null);
		if (rVal == JFileChooser.APPROVE_OPTION) {
			File file = jFileChooser.getSelectedFile();
			try {
				ImageIO.write(bufferedImage, "png", new File(file.getAbsolutePath()));
				System.out.println("saved Correctly " + file.getAbsolutePath());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println("Failed to save image");
			}
		}
		if (rVal == JFileChooser.CANCEL_OPTION) {
			System.out.println("No file choosen");
		}

	}

}
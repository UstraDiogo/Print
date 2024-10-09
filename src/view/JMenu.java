package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.SearchPrint;
import model.ModelConexao;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;

public class JMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_SELB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMenu frame = new JMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JMenu() {
		setTitle("copyright © DustDev");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\diogo.ustra\\Pictures\\Saved Pictures\\hacker-logo.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Etiqueta VERDE");
		lblNewLabel.setBounds(314, 99, 112, 14);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel);
		
		textField_SELB = new JTextField();
		textField_SELB.setBounds(16, 61, 263, 37);
		textField_SELB.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(textField_SELB);
		textField_SELB.setColumns(10);
		
		
		JLabel ID_text = new JLabel("Digite a SELB da impressora");
		ID_text.setBounds(0, 11, 294, 60);
		ID_text.setHorizontalAlignment(SwingConstants.CENTER);
		ID_text.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(ID_text);
		
		JButton btnSearch = new JButton("Procurar");
		btnSearch.setBounds(314, 131, 99, 55);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModelConexao texto = new ModelConexao(textField_SELB.getText());
				String texto1 = texto.getCampoTexto();
				
				SearchPrint search = new SearchPrint();
				search.percorrePlanilha();		
				
				System.out.println(texto1); //teste
			}
		});
		
		
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnSearch);
		
		JList list = new JList();
		list.setBounds(16, 99, 263, 153);
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		list.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(list);
		
		
		JButton btnMap = new JButton("Mapear");
		btnMap.setBounds(314, 197, 100, 55);
		btnMap.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnMap);
		
		JLabel Icon_Label = new JLabel("");
		Icon_Label.setBounds(304, 11, 122, 100);
		Icon_Label.setIcon(new ImageIcon("E:\\eclipse-workspace\\Clientes\\src\\view\\images\\imp.jpg"));
		Icon_Label.setHorizontalAlignment(SwingConstants.CENTER);
		Icon_Label.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(Icon_Label);
	}
}

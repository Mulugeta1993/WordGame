import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame {
    private JPanel mainPanel;
    private JLabel prizeLabel;
    private JMenuBar menuBar;
    private JMenu aboutMenu;
    private JMenuItem attributionItem;
    private JMenuItem imageItem;
    private JMenuItem soundItem;

    public GUI() {
        setTitle("Prize Winner Game");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        prizeLabel = new JLabel();
        prizeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(prizeLabel, BorderLayout.CENTER);

        menuBar = new JMenuBar();
        aboutMenu = new JMenu("About");

        attributionItem = new JMenuItem("Attribution");
        attributionItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display attribution for images and sounds
                JOptionPane.showMessageDialog(null, "Images: Pixabay, Sounds: Freesound");
            }
        });

        imageItem = new JMenuItem("image");
        imageItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    BufferedImage image = ImageIO.read(getClass().getResource("twilight.jpg"));
                    prizeLabel.setIcon(new ImageIcon(image));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        soundItem = new JMenuItem("Abraham.mp3");
        soundItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        aboutMenu.add(attributionItem);
        aboutMenu.add(imageItem);
        aboutMenu.add(soundItem);
        menuBar.add(aboutMenu);

        setJMenuBar(menuBar);
        add(mainPanel);
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.setVisible(true);
    }
}
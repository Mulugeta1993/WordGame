import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GUI extends JFrame {

        private JLabel prizeLabel;
        private JLabel animationLabel;
        private JMenu attributionMenu;
        private JMenuItem imageAttributionItem;
        private JMenuItem soundAttributionItem;

        public GUI() {
                setTitle("Prize Game");
                setSize(800, 600);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JMenuBar menuBar = new JMenuBar();
                JMenu aboutMenu = new JMenu("About");
                attributionMenu = new JMenu("Attribution");
                imageAttributionItem = new JMenuItem("Image Attribution");
                soundAttributionItem = new JMenuItem("Sound Attribution");
                attributionMenu.add(imageAttributionItem);
                attributionMenu.add(soundAttributionItem);
                aboutMenu.add(attributionMenu);
                menuBar.add(aboutMenu);
                setJMenuBar(menuBar);

                prizeLabel = new JLabel();
                prizeLabel.setHorizontalAlignment(SwingConstants.CENTER);
                add(prizeLabel, BorderLayout.CENTER);

                animationLabel = new JLabel();
                animationLabel.setHorizontalAlignment(SwingConstants.CENTER);
                add(animationLabel, BorderLayout.NORTH);
                ImageIcon prizeImage = new ImageIcon("C:\\Users\\mulug\\Desktop\\assignmnet 9\\twilight.jpg");
                ImageIcon animationImage = new ImageIcon(
                                "C:\\Users\\mulug\\Desktop\\assignmnet 9\\animation_image.jpg");
                Image image = prizeImage.getImage();
                Image newPrizeImage = image.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
                prizeLabel.setIcon(new ImageIcon(newPrizeImage));
                Timer timer = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                Random random = new Random();
                                int rand = random.nextInt(10);
                                if (rand % 2 == 0) {
                                        animationLabel.setIcon(animationImage);
                                        animationLabel.setVisible(true);
                                } else {
                                        animationLabel.setVisible(false);
                                }
                        }
                });
                timer.start();

                imageAttributionItem.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                JOptionPane.showMessageDialog(null, "twilight.jpg");
                        }
                });

                soundAttributionItem.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                JOptionPane.showMessageDialog(null, "Abraham.mp3");
                        }
                });
        }

        public static void main(String[] args) {
                GUI gui = new GUI();
                gui.setVisible(true);
        }
}
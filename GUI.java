import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
        private JTextArea messageArea;
        private JCheckBox saveMessagesCheckBox;

        public GUI() {
                setTitle("Game Application");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JMenuBar menuBar = new JMenuBar();
                setJMenuBar(menuBar);
                JMenu gameMenu = new JMenu("Game");
                gameMenu.setMnemonic('G'); // Alt-G shortcut
                menuBar.add(gameMenu);
                JMenuItem addPlayerMenuItem = new JMenuItem("Add Player");
                addPlayerMenuItem.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                        }
                });
                gameMenu.add(addPlayerMenuItem);
                JMenuItem addHostMenuItem = new JMenuItem("Add Host");
                addHostMenuItem.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                        }
                });
                gameMenu.add(addHostMenuItem);
                JMenu aboutMenu = new JMenu("About");
                aboutMenu.setMnemonic('A'); // Alt-A shortcut
                menuBar.add(aboutMenu);
                JMenuItem layoutMenuItem = new JMenuItem("Layout");
                layoutMenuItem.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                JOptionPane.showMessageDialog(GUI.this, "Description of chosen layout...");
                        }
                });
                aboutMenu.add(layoutMenuItem);
                JPanel mainPanel = new JPanel();
                mainPanel.setLayout(new BorderLayout());
                add(mainPanel);
                messageArea = new JTextArea();
                messageArea.setEditable(false);
                JScrollPane scrollPane = new JScrollPane(messageArea);
                mainPanel.add(scrollPane, BorderLayout.CENTER);
                saveMessagesCheckBox = new JCheckBox("Save Messages");
                saveMessagesCheckBox.setToolTipText("Check to save messages");
                mainPanel.add(saveMessagesCheckBox, BorderLayout.SOUTH);
                saveMessagesCheckBox.setToolTipText("Check to save messages history");

                setSize(400, 300);
                setLocationRelativeTo(null);
        }

        public static void main(String[] args) {
                SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                                GUI gui = new GUI();
                                gui.setVisible(true);
                        }
                });
        }
}

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;
/*
 * Created by JFormDesigner on Sat Sep 23 15:11:10 CDT 2023
 */



/**
 * @author Braeden
 */
public class Main {
    public Main() {
        initComponents();
    }

    public static void main(String[] args) {
        new Main();
    }

    private void enter_button(ActionEvent e) {
        // TODO add your code here
        String userText = userBox.getText();
        userText = userText.toLowerCase();
        Response response = new Response();

        label5.setText(response.reply(userText));

        if (userText.contains("system:convert")){
            userBox.setText("null");
            conversion();
        }
    }

    private void conversion() {
        MainFrame.setContentPane(convertPanel);
        convertPanel.setVisible(true);
        String firstQuestion = "Type 'c' to convert from Celsius to Fahrenheit, or 'f' to convert from Fahrenheit to Celsius.";
        label6.setText(firstQuestion);
    }

    static int attemptNumber = 10;
    private void logIn(ActionEvent e) {
        // TODO add your code here
        char[] password = {'p','a','s','s','w','o','r','d'};
        char[] userInput = passwordField.getPassword();

        if (Arrays.equals(userInput, password)) {
            // Input Window Switch
            MainFrame.setContentPane(chatPanel);
            chatPanel.setVisible(true);
        } else {
            attemptNumber--;
            passwordError.setText("The provided password is incorrect. You have " + attemptNumber + " attempts remaining.");
            if(attemptNumber <= 0){
                MainFrame.dispose();
            }
        }
    }

    boolean c = false;
    private void enter_button2(ActionEvent e) {
        // TODO add your code here
        Voice voice = new Voice();
        String userA1 = userBox2.getText();
        userA1 = userA1.toLowerCase();
        if (userA1.equals("c")) {
            label6.setText("Type in your number.");
            voice.voiceBox("Type in your number.");
            c = true;
        }
        if (userA1.equals("f")){
            label6.setText("Type in your number.");
            voice.voiceBox("Type in your number.");
            c=false;
        }

        try {
            double userA2 = Double.parseDouble(userA1);
            if (c){
                double num = ((Double.parseDouble(String.valueOf(userA2))) * 1.8 + 32);

                label6.setText(userA1 + " Celsius is " + num + " Fahrenheit.");
                voice.voiceBox(userA1 + " Celsius is " + num + " Fahrenheit.");
            } else {
                double num = (5.0 / 9.0 * (Double.parseDouble(String.valueOf(userA2 - 32))));

                label6.setText(userA1 + " Fahrenheit is " + num + " Celsius.");
                voice.voiceBox(userA1 + " Fahrenheit is " + num + " Celsius.");
            }
        } catch (Exception exception){
            System.out.println("Error");
        }



    }

    private void back_button(ActionEvent e) {
        // TODO add your code here
        MainFrame.setContentPane(chatPanel);
        chatPanel.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Braeden Connors (Braeden C Connors)
        MainFrame = new JFrame();
        SwitchPanel = new JPanel();
        lockPanel = new JPanel();
        lockScreen = new JLayeredPane();
        passwordError = new JLabel();
        logInButton = new JButton();
        samLogo = new JLabel();
        passwordField = new JPasswordField();
        signInLogo = new JLabel();
        backgroundImage = new JLabel();
        convertPanel = new JPanel();
        userBox2 = new JTextArea();
        enter_button2 = new JButton();
        label6 = new JLabel();
        back_button = new JButton();
        chatPanel = new JPanel();
        label5 = new JLabel();
        scrollPane1 = new JScrollPane();
        userBox = new JTextArea();
        enter_button = new JButton();

        //======== MainFrame ========
        {
            MainFrame.setVisible(true);
            MainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            MainFrame.setResizable(false);
            MainFrame.setTitle("SAM");
            MainFrame.setPreferredSize(new Dimension(800, 450));
            MainFrame.setIconImage(new ImageIcon(getClass().getResource("/Introduction.png")).getImage());
            var MainFrameContentPane = MainFrame.getContentPane();

            //======== SwitchPanel ========
            {
                SwitchPanel.setLayout(new CardLayout());

                //======== lockPanel ========
                {
                    lockPanel.setBackground(Color.darkGray);
                    lockPanel.setVerifyInputWhenFocusTarget(false);

                    //======== lockScreen ========
                    {
                        lockScreen.setVerifyInputWhenFocusTarget(false);

                        //---- passwordError ----
                        passwordError.setHorizontalAlignment(SwingConstants.CENTER);
                        passwordError.setForeground(Color.red);
                        passwordError.setFont(new Font("Inter", Font.ITALIC, 14));
                        lockScreen.add(passwordError, JLayeredPane.DEFAULT_LAYER);
                        passwordError.setBounds(335, 270, 430, 25);

                        //---- logInButton ----
                        logInButton.setText("Log in");
                        logInButton.addActionListener(e -> logIn(e));
                        lockScreen.add(logInButton, JLayeredPane.DEFAULT_LAYER);
                        logInButton.setBounds(70, 295, 240, 25);

                        //---- samLogo ----
                        samLogo.setIcon(new ImageIcon(getClass().getResource("/Introduction.png")));
                        samLogo.setVerifyInputWhenFocusTarget(false);
                        lockScreen.add(samLogo, JLayeredPane.DEFAULT_LAYER);
                        samLogo.setBounds(new Rectangle(new Point(85, 25), samLogo.getPreferredSize()));

                        //---- passwordField ----
                        passwordField.setBackground(Color.white);
                        passwordField.setBorder(null);
                        passwordField.setVerifyInputWhenFocusTarget(false);
                        lockScreen.add(passwordField, JLayeredPane.DEFAULT_LAYER);
                        passwordField.setBounds(70, 270, 240, passwordField.getPreferredSize().height);

                        //---- signInLogo ----
                        signInLogo.setText("Securely Sign In");
                        signInLogo.setForeground(Color.black);
                        signInLogo.setHorizontalAlignment(SwingConstants.CENTER);
                        signInLogo.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
                        signInLogo.setVerifyInputWhenFocusTarget(false);
                        lockScreen.add(signInLogo, JLayeredPane.DEFAULT_LAYER);
                        signInLogo.setBounds(70, 220, 240, 25);

                        //---- backgroundImage ----
                        backgroundImage.setText("text");
                        backgroundImage.setIcon(new ImageIcon(getClass().getResource("/BackgroundWelcome.png")));
                        backgroundImage.setVerifyInputWhenFocusTarget(false);
                        lockScreen.add(backgroundImage, JLayeredPane.DEFAULT_LAYER);
                        backgroundImage.setBounds(0, 0, 798, 415);
                    }

                    GroupLayout lockPanelLayout = new GroupLayout(lockPanel);
                    lockPanel.setLayout(lockPanelLayout);
                    lockPanelLayout.setHorizontalGroup(
                        lockPanelLayout.createParallelGroup()
                            .addComponent(lockScreen, GroupLayout.Alignment.TRAILING)
                    );
                    lockPanelLayout.setVerticalGroup(
                        lockPanelLayout.createParallelGroup()
                            .addComponent(lockScreen, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    );
                }
                SwitchPanel.add(lockPanel, "card1");

                //======== convertPanel ========
                {
                    convertPanel.setBackground(new Color(0x666666));

                    //---- userBox2 ----
                    userBox2.setWrapStyleWord(true);
                    userBox2.setToolTipText("Input Text");
                    userBox2.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));
                    userBox2.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED), "User", TitledBorder.TRAILING, TitledBorder.ABOVE_BOTTOM, null, Color.white));
                    userBox2.setBackground(new Color(0x333333));
                    userBox2.setLineWrap(true);
                    userBox2.setForeground(Color.white);
                    userBox2.setCaretColor(new Color(0xcccccc));

                    //---- enter_button2 ----
                    enter_button2.setIcon(new ImageIcon(getClass().getResource("/Enter_Button_Icon.png")));
                    enter_button2.setBorderPainted(false);
                    enter_button2.setFocusPainted(false);
                    enter_button2.setContentAreaFilled(false);
                    enter_button2.addActionListener(e -> {
			enter_button(e);
			enter_button2(e);
		});

                    //---- label6 ----
                    label6.setAutoscrolls(true);
                    label6.setFont(new Font("Inter", Font.PLAIN, 14));
                    label6.setBorder(new TitledBorder(new CompoundBorder(
                        new BevelBorder(BevelBorder.LOWERED, null, new Color(0x333333), null, null),
                        null), "SAM", TitledBorder.LEFT, TitledBorder.BELOW_TOP,
                        new Font("Inter", Font.BOLD, 13), Color.white));
                    label6.setBackground(new Color(0x333333));
                    label6.setText("When interacting with SAM, please ensure you use correct spelling and proper grammar.");
                    label6.setToolTipText("SAM Output");
                    label6.setVerticalAlignment(SwingConstants.TOP);
                    label6.setForeground(Color.white);

                    //---- back_button ----
                    back_button.setIcon(new ImageIcon(getClass().getResource("/back_button_icon.png")));
                    back_button.setBorderPainted(false);
                    back_button.setFocusPainted(false);
                    back_button.setContentAreaFilled(false);
                    back_button.addActionListener(e -> {
			enter_button(e);
			back_button(e);
		});

                    GroupLayout convertPanelLayout = new GroupLayout(convertPanel);
                    convertPanel.setLayout(convertPanelLayout);
                    convertPanelLayout.setHorizontalGroup(
                        convertPanelLayout.createParallelGroup()
                            .addGroup(convertPanelLayout.createSequentialGroup()
                                .addGroup(convertPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(convertPanelLayout.createSequentialGroup()
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(back_button, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(userBox2, GroupLayout.PREFERRED_SIZE, 571, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(enter_button2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(GroupLayout.Alignment.LEADING, convertPanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 776, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    convertPanelLayout.setVerticalGroup(
                        convertPanelLayout.createParallelGroup()
                            .addGroup(convertPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(convertPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(enter_button2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(back_button, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userBox2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                }
                SwitchPanel.add(convertPanel, "card3");

                //======== chatPanel ========
                {
                    chatPanel.setBackground(new Color(0x666666));

                    //---- label5 ----
                    label5.setAutoscrolls(true);
                    label5.setFont(new Font("Inter", Font.PLAIN, 14));
                    label5.setBorder(new TitledBorder(new CompoundBorder(
                        new BevelBorder(BevelBorder.LOWERED, null, new Color(0x333333), null, null),
                        null), "SAM", TitledBorder.LEFT, TitledBorder.BELOW_TOP,
                        new Font("Inter", Font.BOLD, 13), Color.white));
                    label5.setBackground(new Color(0x333333));
                    label5.setText("When interacting with SAM, please ensure you use correct spelling and proper grammar.");
                    label5.setToolTipText("SAM Output");
                    label5.setVerticalAlignment(SwingConstants.TOP);
                    label5.setForeground(Color.white);

                    //======== scrollPane1 ========
                    {

                        //---- userBox ----
                        userBox.setWrapStyleWord(true);
                        userBox.setToolTipText("Input Text");
                        userBox.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));
                        userBox.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED), "User", TitledBorder.TRAILING, TitledBorder.ABOVE_BOTTOM, null, Color.white));
                        userBox.setBackground(new Color(0x333333));
                        userBox.setLineWrap(true);
                        userBox.setForeground(Color.white);
                        userBox.setCaretColor(new Color(0xcccccc));
                        scrollPane1.setViewportView(userBox);
                    }

                    //---- enter_button ----
                    enter_button.setIcon(new ImageIcon(getClass().getResource("/Enter_Button_Icon.png")));
                    enter_button.setBorderPainted(false);
                    enter_button.setFocusPainted(false);
                    enter_button.setContentAreaFilled(false);
                    enter_button.addActionListener(e -> enter_button(e));

                    GroupLayout chatPanelLayout = new GroupLayout(chatPanel);
                    chatPanel.setLayout(chatPanelLayout);
                    chatPanelLayout.setHorizontalGroup(
                        chatPanelLayout.createParallelGroup()
                            .addGroup(chatPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(chatPanelLayout.createParallelGroup()
                                    .addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(chatPanelLayout.createSequentialGroup()
                                        .addComponent(scrollPane1)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(enter_button, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                    );
                    chatPanelLayout.setVerticalGroup(
                        chatPanelLayout.createParallelGroup()
                            .addGroup(chatPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(chatPanelLayout.createParallelGroup()
                                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addGroup(chatPanelLayout.createSequentialGroup()
                                        .addComponent(enter_button, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 1, Short.MAX_VALUE)))
                                .addContainerGap())
                    );
                }
                SwitchPanel.add(chatPanel, "card2");
            }

            GroupLayout MainFrameContentPaneLayout = new GroupLayout(MainFrameContentPane);
            MainFrameContentPane.setLayout(MainFrameContentPaneLayout);
            MainFrameContentPaneLayout.setHorizontalGroup(
                MainFrameContentPaneLayout.createParallelGroup()
                    .addComponent(SwitchPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            MainFrameContentPaneLayout.setVerticalGroup(
                MainFrameContentPaneLayout.createParallelGroup()
                    .addComponent(SwitchPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            MainFrame.pack();
            MainFrame.setLocationRelativeTo(MainFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Braeden Connors (Braeden C Connors)
    private JFrame MainFrame;
    private JPanel SwitchPanel;
    private JPanel lockPanel;
    private JLayeredPane lockScreen;
    private JLabel passwordError;
    private JButton logInButton;
    private JLabel samLogo;
    private JPasswordField passwordField;
    private JLabel signInLogo;
    private JLabel backgroundImage;
    private JPanel convertPanel;
    private JTextArea userBox2;
    private JButton enter_button2;
    private JLabel label6;
    private JButton back_button;
    private JPanel chatPanel;
    private JLabel label5;
    private JScrollPane scrollPane1;
    private JTextArea userBox;
    private JButton enter_button;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

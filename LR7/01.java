import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Program {
public static void addTextFields(JFrame jfr) { GridLayout gridLayout = new GridLayout(2, 3); JPanel textFieldsPanel = new JPanel(); textFieldsPanel.setLayout(gridLayout);
// textFieldsPanel.setSize(20, 10);
JTextField textFieldArray[] = new JTextField[6]; for (int i = 0; i < 6; i++) {
textFieldArray[i] = new JTextField("Текстовое поле " + (i + 1), 0);
}
for (JTextField i : textFieldArray) { textFieldsPanel.add(i);
}
jfr.add(textFieldsPanel, BorderLayout.NORTH);
}
public static void addLeftPanel(JFrame jfr) {
// centerPanel.
JPanel centerPanel = new JPanel();
GridLayout gridLayout2 = new GridLayout(10, 1); centerPanel.setLayout(gridLayout2);
JPanel radioButtonPanel = new JPanel(); radioButtonPanel.setLayout(new BorderLayout());

GridLayout gridLayout = new GridLayout(9, 1); JPanel leftPanel = new JPanel(); leftPanel.setLayout(new BorderLayout(20, 0));

JPanel checkBoxPanel = new JPanel(); checkBoxPanel.setLayout(gridLayout);

JCheckBox checkBoxArray[] = new JCheckBox[9]; for (int i = 0; i < 9; i++) {
checkBoxArray[i] = new JCheckBox("Выбор " + (i + 1));
}
for (JCheckBox i : checkBoxArray) { checkBoxPanel.add(i);
}
JPanel multyPanel = new JPanel(); multyPanel.setLayout(new FlowLayout());

JComboBox comboBox = new JComboBox(); multyPanel.add(comboBox);
JSpinner spinner = new JSpinner(); multyPanel.add(spinner);

JRadioButton radioButton1 = new JRadioButton("Радиокнопка 1"); multyPanel.add(radioButton1);

JRadioButton radioButton2 = new JRadioButton("Радиокнопка 2"); radioButtonPanel.add(radioButton2, BorderLayout.CENTER);

centerPanel.add(multyPanel); centerPanel.add(radioButtonPanel);

leftPanel.add(checkBoxPanel, BorderLayout.WEST); leftPanel.add(centerPanel, BorderLayout.EAST);

jfr.add(leftPanel, BorderLayout.WEST);


}


public static void addRightTextPanel(JFrame jfr) { JPanel rightTextPanel = new JPanel(); rightTextPanel.setLayout(new BorderLayout()); JTextArea textArea = new JTextArea(20, 25); textArea.setText("Текстовая область"); textArea.setLineWrap(true); textArea.setWrapStyleWord(true); rightTextPanel.add(textArea, BorderLayout.EAST); jfr.add(rightTextPanel, BorderLayout.EAST);
}
public static void addSlider(JFrame jfr) { JPanel sliderPanel = new JPanel(); sliderPanel.setLayout(new BorderLayout()); JSlider slider = new JSlider();
slider.setOrientation(JSlider.HORIZONTAL); sliderPanel.add(slider, BorderLayout.SOUTH); jfr.add(sliderPanel, BorderLayout.SOUTH);
}


public static void main(String[] args) {


JFrame frame = new JFrame("MyWindow"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// fix size frame.setSize(630, 400); frame.setResizable(false);

addTextFields(frame); addRightTextPanel(frame); addLeftPanel(frame); addSlider(frame);

frame.setVisible(true);
}


}

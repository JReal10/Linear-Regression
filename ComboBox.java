import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBox extends JPanel implements ItemListener {

    String[] Modules1 = new String[] {"CSE101", "CSE102", "CSE103", "CSE104", "CSE105", "CSE106", "CSE107", "CSE108", "CSE109", "CSE110"};
    String[] Modules2 = new String[] {"CSE111", "CSE112", "CSE113", "CSE114", "CSE115", "CSE116", "CSE117", "CSE118", "CSE119", "CSE120"};

    JComboBox c1;
    JComboBox c2;

    public ComboBox()
    {
        JPanel p = new JPanel();
        c1 = new JComboBox(Modules1);
        c2 = new JComboBox(Modules2);

        p.add(c1);
        p.add(c2);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        if(e.getSource() == c1)
        {
        }
        if(e.getSource() == c2)
        {

        }

    }
}

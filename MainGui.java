import javax.swing.*;
import java.awt.*;

public class MainGui extends JFrame {

    private JPanel Panel1, Panel2;
    ReadFile r = new ReadFile();

    public MainGui()
    {
        JFrame Frame = new JFrame();
        Frame.setLayout(new FlowLayout());

        r.ReadCSVFile();
        Plot chart = new Plot(r.GetCSE103(),"CSE103");
        Plot chart2 = new Plot(r.GetCSE105(), "CSE105");

        Panel1 = new JPanel(); // sub-panel 1
        Panel1.setPreferredSize(new Dimension(450,450));
        Panel2 = new JPanel(); // sub-panel 2
        Panel2.setPreferredSize(new Dimension(450,450));
        Panel1.add(chart, SwingConstants.CENTER);
        Panel2.add(chart2, SwingConstants.CENTER);

        Frame.add(Panel2);
        Frame.add(Panel1);

        Frame.setSize(1000, 500);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setLocationRelativeTo(null);
        Frame.setVisible(true);
    }

    public static void main(String[] args) {
        MainGui m = new MainGui();
    }
}

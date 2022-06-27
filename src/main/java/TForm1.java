
import javax.swing.*;

public class TForm1 extends JFrame
{
    private static final long serialVersionUID = 1L;
    private JButton Button1 = null;
    public JButton getButton1()
    {
        return this.Button1;
    }
    public TForm1()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,593,305);
        setTitle("Form1");
        getContentPane().setLayout(null);
        initTForm1();
    }
    private void initTForm1()
    {
        this.Button1 = new JButton();
        //
        // Button1
        //
        this.Button1.setBounds(232,128,75,25);
        this.Button1.setText("Button1");
        getContentPane().add(this.Button1);
    }
}
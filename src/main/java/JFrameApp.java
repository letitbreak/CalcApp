import javax.swing.JFrame;

@SuppressWarnings("WeakerAccess")
public class JFrameApp extends JFrame
{
    public JFrameApp()
    {
        setBounds(100, 100, 265, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add( new JPanelApp());
        setVisible(true);
    }
}
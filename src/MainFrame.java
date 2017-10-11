import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
    private Button btnmove=new Button("<-");
    private Button btnfire=new Button("fire");
    private Button btnauto=new Button("Auto Move");
    private Button btnsun=new Button("sun");
    private Label lbhit=new Label("Hit:");
    private Label lb1=new Label("0");
    private Label bullet=new Label();
    private Label fort=new Label();
    private Label sun=new Label();

    public MainFrame(){
        init();
    }
    private void init() {
        this.setBounds(100,100,600,400);
        this.setLayout(null);
        btnmove.setBounds(300,250,80,30);
        btnmove.setFont(new Font("SansSerif",Font.BOLD ,18));
        btnfire.setBounds(450,250,80,30);
        btnfire.setFont(new Font("SansSerif",Font.BOLD ,18) ) ;
        btnauto.setBounds(50,350,80,30);
        btnauto.setFont(new Font("SansSerif",Font.BOLD ,10) ) ;
        lbhit.setBounds(100,250,80,30);
        lbhit.setFont(new Font("SansSerif",Font.BOLD,18) ) ;
        lb1.setBounds(180,250,80,30);
        lb1.setFont(new Font("SansSerif",Font.BOLD ,18) ) ;
        bullet.setBounds(410,200,10,10);
        bullet.setBackground(Color.RED);
        fort.setBounds(400,210,30,30);
        fort.setBackground(Color.GREEN);
        sun.setBounds(100,50,35,35);
        sun.setBackground(Color.YELLOW);
        this.add(btnmove);
        this.add(btnfire);
        this.add(btnauto);
        this.add(lbhit);
        this.add(lb1);
        this.add(bullet);
        this.add(fort);
        this.add(sun);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        btnmove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

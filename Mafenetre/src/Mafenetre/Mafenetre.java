
import javax.swing.JButton;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Naycene Boussoffara
 */
public class Mafenetre extends javax.swing.JFrame {

    /**
     * Creates new form Mafentre
     */
    public Mafenetre() {
        this.setTitle("Ma fenetre");
        this.setSize(400,400);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
        JButton Premier=new JButton();
        JButton Deuxième=new JButton();
        JPanel panneau=new JPanel();
        panneau.add(Premier);
        panneau.add(Deuxième);
        Premier.setText("Premier");
        Deuxième.setText("Deuxième");
        setContentPane(panneau); 
    }

    /**
     *
     * @param args
     */
   

}
import javax.swing.*;
import java.awt.*;

public class GUIcollectionField extends JTextArea
{

    GUIcollectionField(GridBagConstraints c)
    {
        super(20,25);
        setToolTipText("Click a card name to enter it above");
        c.gridheight = 9;
        c.gridwidth = 3;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 2;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(5, 5, 5,5);
        setEditable(false);
        append("collection here");
    }
}

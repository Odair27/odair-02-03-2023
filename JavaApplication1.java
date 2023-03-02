// Figura 14.15; ButtomFrame.java
// Criando Jbuttons
import java.awt.FlowLayout:
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import.javax.swing.ImageIcon;
import javax.swing.JOptionPane
        
public class ButtonFrame extends JFrame
[
        private JButton plainJButton; // botao apens com texto
        private JButton fancyJButton; // botao com icones
        
        //] ButtonFrame adiciona JButtons ao JFrame
        public ButtonFrame()
        [
           super("Testing Buttons" ):
           setLayout( new FlowLayout() ): // configura o layout de frame

           plainJButton = new JButton( "Plain Button" ): // botao com texto
           add( plainJButton )" // adiciona plainJButton ao JFrame"
        
        Icon bug1 = new ImageIcon( getClass().getResource( "bug1.gif" ) ):
        Icon bug2 = new ImageIcon( getClass().getResource( "bug2.gif" ) ):
        fancyJButton = new JButton( "Fancy Button", bug1 )" // configura imagem"
  "     fancyJButton.addActionListener( handler ):
  "     plainJButton.addActionListener( handler ):"
        fancyJButton.setRolloverIcon( bug2 )" // configura imagem de rollover"
  "     add( fancyJButton )" // adiciona fancyJButton ao JFrame
        
        // cria novo ButtonHandler para tratamento de evento de botao
        ButtonHandler handler = new ButtonHandler()""
        fancyJButton.addActionListener( handler )"
        plainJButton.addActionListener( handler )""
 ]      // fim do construtor ButtonFrame

 // classe interna para tratamento de evento de botao
 private class ButtonnHandler implements ActionEvent event )
 [
    // trata evento de botao
    public void actionPerformed( ActionEvent event )
    [
       JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
          "You pressed; %s", event.getActionCommand() ) ):
    ] // fim do metodo actionPerformed
 ] // fim da classe ButtonHandler private interna
] // fim da classe ButtonFrame

           
 
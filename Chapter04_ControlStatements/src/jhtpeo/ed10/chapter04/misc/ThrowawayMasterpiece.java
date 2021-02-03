package jhtpeo.ed10.chapter04.misc;


import java.awt.Graphics;
import javax.swing.JPanel;


public class ThrowawayMasterpiece extends JPanel
{

  public void paintComponent(Graphics masterpiece) {

    // Call 'paintComponent' to ensure the panel is displayed correctly.
    super.paintComponent(masterpiece);

    // Obtain panel's dimensions.
    var masterpieceWidth = getWidth();
    var masterpieceHeight = getHeight();

    // Draw line from upper-left to lower-right corner of selected JPanel.
    masterpiece.drawLine(0, 0, masterpieceWidth, masterpieceHeight);
    // Draw line from upper-left to lower-right corner of selected JPanel.
    masterpiece.drawLine(0, masterpieceHeight, masterpieceWidth, 0);






  } // [END_METHOD : paintComponent]

} // [END_CLASS : ThrowawayMasterpiece]
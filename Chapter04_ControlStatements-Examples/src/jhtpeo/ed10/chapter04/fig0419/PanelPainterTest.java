// Figure 4.19 : PanelPainterTest.java
//

package jhtpeo.ed10.chapter04.fig0419;

import javax.swing.JFrame;
import jhtpeo.ed10.chapter04.fig0418.PanelPainter;


public class PanelPainterTest
{

  public static void main(String[] args) {
    // Create panel to contain drawing.
    var masterpiece = new PanelPainter();
    // Create new frame to hold panel.
    var canvas = new JFrame();
    // Set frame to exit when it is closed.
    canvas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Add drawing to panel.
    canvas.add(masterpiece);
    canvas.setSize(1000, 250);
    canvas.setVisible(true);
  } // [END_METHOD : main]

} // [END_CLASS : PanelPainterTest]

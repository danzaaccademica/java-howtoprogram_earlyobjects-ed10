// Figure 4.18 : PanelPainter.java
// Using 'drawLine' to "connect" the corners of a JPanel.

package jhtpeo.ed10.chapter04.examples.fig0418;

import java.awt.Graphics;
import javax.swing.JPanel;


public class PanelPainter extends JPanel
{

  /*
   * Draws an "X" from corner-to-corner of the selected JPanel.
   */
  public void paintComponent(Graphics selectedPanel) {
    // Ensure  panel is displayed correctly.
    super.paintComponent(selectedPanel);
    // Obtain panel's dimensions.
    var panelWidth = getWidth();
    var panelHeight = getHeight();
    // Draw line from upper-left to lower-right corner of selected JPanel.
    selectedPanel.drawLine(0, 0, panelWidth, panelHeight);
    // Draw line from upper-left to lower-right corner of selected JPanel.
    selectedPanel.drawLine(0, panelHeight, panelWidth, 0);
  } // [END_METHOD : paintComponent]

} // [END_CLASS : PanelPainter]

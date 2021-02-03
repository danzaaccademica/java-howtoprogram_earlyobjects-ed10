package jhtpeo.ed10.chapter04.misc;


import javax.swing.JFrame;


public class MasterpiecePainter
{

  public static void main(String[] args) {

    // Create instance of painting.
    var painting = new ThrowawayMasterpiece();
    // Create frame for painting.
    var frame = new JFrame();

    // Configure frame to exit application when it --this frame-- is closed.
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Add painting to frame.
    frame.add(painting);

    frame.setSize(500,500);
    frame.setVisible(true);




  } // [END_METHOD : main]

} // [END_CLASS : MasterpiecePainter]

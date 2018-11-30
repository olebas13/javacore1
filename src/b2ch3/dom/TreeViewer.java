package b2ch3.dom;

import javax.swing.*;
import java.awt.*;

public class TreeViewer {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new DOMTreeFrame();
            frame.setTitle("TreeViewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

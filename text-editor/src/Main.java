import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();
        textEditor.setTitle("Text Editor");
        textEditor.setSize(1000, 1200);
        textEditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textEditor.setVisible(true);
    }
}



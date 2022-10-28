package practice_20_21;

import javax.swing.*;

public class Application extends JFrame {

    private ICreateDocument iCreateDocument;

    public static void main(String[] args) {
        new Application(new CreateTextDocument());
    }

    public Application(ICreateDocument iCreateDocument){
        super("Redactor");
        this.iCreateDocument = iCreateDocument;
        setVisible(true);
        setSize(500, 500);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        menu.add(newItem);
        menu.add(openItem);
        menuBar.add(menu);

        newItem.addActionListener(e -> iCreateDocument.CreateNew());
        openItem.addActionListener(e -> iCreateDocument.CreateOpen());
        setJMenuBar(menuBar);
    }
}

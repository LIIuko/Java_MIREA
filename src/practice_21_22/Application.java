package practice_21_22;

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
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(newItem);
        menu.add(openItem);
        menu.add(exitItem);
        menu.add(saveItem);
        menuBar.add(menu);

        newItem.addActionListener(e -> iCreateDocument.CreateNew());
        openItem.addActionListener(e -> iCreateDocument.CreateOpen());
        saveItem.addActionListener(e -> {
            System.out.println("Сохранено");
        });
        exitItem.addActionListener(e -> {
            System.out.println("Конец работы");
            System.exit(0);
        });
        setJMenuBar(menuBar);
    }
}

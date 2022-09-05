package practice_4;

import javax.swing.*;
import java.awt.*;

public class Match extends JFrame {

    private JLabel result = new JLabel("Result: 0 X 0");
    private JLabel lastScore = new JLabel("Last Scorer: N/A");
    private JLabel winner = new JLabel("Winner: DRAW");
    private Font defaultFont = new Font("Times new roman", Font.BOLD, 20);
    private Font winnerFont = new Font("Times new roman", Font.BOLD, 30);

    private  JButton jButtonMilan = new JButton("AC Milan");
    private  JButton jButtonMadrid = new JButton("Real Madrid");
    private int scoreMilan = 0;
    private int scoreMadrid = 0;
    public Match(){
        super("Match");
        setLayout(new BorderLayout());
        setSize(700, 400);
        add(result, BorderLayout.CENTER);
        result.setFont(defaultFont);
        result.setForeground(Color.RED);
        result.setHorizontalAlignment(SwingConstants.CENTER);
        add(lastScore, BorderLayout.SOUTH);
        lastScore.setFont(defaultFont);
        lastScore.setForeground(Color.BLUE);
        lastScore.setHorizontalAlignment(SwingConstants.CENTER);
        add(winner, BorderLayout.NORTH);
        winner.setFont(defaultFont);
        winner.setForeground(Color.BLACK);
        winner.setHorizontalAlignment(SwingConstants.CENTER);
        add(jButtonMilan, BorderLayout.WEST);
        add(jButtonMadrid, BorderLayout.EAST);
        jButtonMilan.addActionListener(e -> countMilan());
        jButtonMadrid.addActionListener(e -> countMadrid());
        setVisible(true);
    }

    private void countMilan(){
        scoreMilan++;
        result.setText("Result: " + scoreMilan + " X " + scoreMadrid);
        lastScore.setText("Last Scorer: AC Milan");
        if(scoreMilan > scoreMadrid) {
            winner.setText("Winner: AC Milan");
        }else if(scoreMadrid == scoreMilan){
            winner.setText("Winner: DRAW");
        }
    }

    private void countMadrid(){
        scoreMadrid++;
        result.setText("Result: " + scoreMilan + " X " + scoreMadrid);
        lastScore.setText("Last Scorer: Real Madrid");
        if(scoreMadrid > scoreMilan){
            winner.setText("Winner: Real Madrid");
        }else if(scoreMadrid == scoreMilan){
            winner.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new Match();
    }
}

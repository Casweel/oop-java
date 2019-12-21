import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FootballScore extends JFrame {
    private JButton milanButton;
    private JButton madridButton;
    private JLabel resultLabel;
    private JLabel lastScoreLabel;
    private JLabel winnerLabel;
    private int madridCounter;
    private int millanCounter;


    public FootballScore() {
        milanButton = new JButton("AC Milan");
        madridButton = new JButton("Real Madrid");
        resultLabel = new JLabel("Result: 0 X 0");
        lastScoreLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");
        setTitle("Football Score");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));
        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScoreLabel);
        add(winnerLabel);
        setVisible(true);

        madridCounter = 0;
        millanCounter = 0;



        milanButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                millanCounter++;
                addScore("AC Milan");
            }
        });
        madridButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                madridCounter++;
                addScore("Real Madrid");
            }
        });
    }
    void addScore(String lastScore) {
        resultLabel.setText(String.format("Result: %d X %d",millanCounter,madridCounter));
        lastScoreLabel.setText(String.format("Last Scorer: %s", lastScore));
        if (millanCounter > madridCounter)
            winnerLabel.setText("Winner: AC Milan");
        else if (millanCounter < madridCounter)
            winnerLabel.setText("Winner: Real Madrid");
        else winnerLabel.setText("Winner: DRAW");
    }
}

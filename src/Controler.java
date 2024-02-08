import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controler {
   
    public Label HomeScore;
    public Button H3;
    public Button H2;
    public Button H1;
    public Button A3;
    public Button A2;
    public Button A1;
    public Label AwayScore;

    private int homeScore=0;
    private int awayScore = 0;


    public void H3p(ActionEvent actionEvent) {
        for(int i=0; i<3 ; i++){
            homeScore++;
        }
        HomeScore.setText(String.valueOf(homeScore));
    }

    public void H2p(ActionEvent actionEvent) {
        for (int i = 0; i < 2; i++) {
            homeScore++;
        }
        HomeScore.setText(String.valueOf(homeScore));
    }

    public void H1p(ActionEvent actionEvent) {
        homeScore++;
        HomeScore.setText(String.valueOf(homeScore));
    }

    public void A3p(ActionEvent actionEvent) {
        for(int i=0; i<3 ; i++){
            awayScore++;
        }
        AwayScore.setText(String.valueOf(awayScore));
    }

    public void A2p(ActionEvent actionEvent) {
        for(int i=0; i<2 ; i++){
            awayScore++;
        }
        AwayScore.setText(String.valueOf(awayScore));
    }

    public void A1p(ActionEvent actionEvent) {
        awayScore++;
        AwayScore.setText(String.valueOf((awayScore)));
    }
}

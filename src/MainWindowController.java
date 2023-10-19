import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class MainWindowController {

    @FXML
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    @FXML
    private Label lblWinner;
    private int counter;

    public void getBtn1() {
        setButton(btn1);
    }
    public void getBtn2() {
        setButton(btn2);
    }
    public void getBtn3() {
        setButton(btn3);
    }
    public void getBtn4() {
        setButton(btn4);
    }
    public void getBtn5() {
        setButton(btn5);
    }
    public void getBtn6() {
        setButton(btn6);
    }
    public void getBtn7() {
        setButton(btn7);
    }
    public void getBtn8() {
        setButton(btn8);
    }
    public void getBtn9() {
        setButton(btn9);
    }


    public void reset() {
        btn1.setDisable(false);
        btn2.setDisable(false);
        btn3.setDisable(false);
        btn4.setDisable(false);
        btn5.setDisable(false);
        btn6.setDisable(false);
        btn7.setDisable(false);
        btn8.setDisable(false);
        btn9.setDisable(false);

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

        lblWinner.setText("");
    }
    public void setButton(Button button){
        counter++;
        button.setDisable(true);
        if (counter % 2 == 0) {
            button.setText("X");
            button.setTextFill(Color.RED);
        } else {
            button.setText("O");
            button.setTextFill(Color.GREEN);
        }
        if(btn1.getText().equals("O")&&btn2.getText().equals("O")&&btn3.getText().equals("O")||
                btn4.getText().equals("O")&&btn5.getText().equals("O")&&btn6.getText().equals("O")||
                btn7.getText().equals("O")&&btn8.getText().equals("O")&&btn9.getText().equals("O")||
                btn1.getText().equals("O")&&btn4.getText().equals("O")&&btn7.getText().equals("O")||
                btn3.getText().equals("O")&&btn6.getText().equals("O")&&btn9.getText().equals("O")||
                btn1.getText().equals("O")&&btn5.getText().equals("O")&&btn9.getText().equals("O")||
                btn2.getText().equals("O")&&btn5.getText().equals("O")&&btn8.getText().equals("O")||
                btn3.getText().equals("O")&&btn5.getText().equals("O")&&btn7.getText().equals("O")
        ){
                lblWinner.setText("O is the winner");
            disableAllButtons();
            }else if(btn1.getText().equals("X")&&btn2.getText().equals("X")&&btn3.getText().equals("X")||
                btn4.getText().equals("X")&&btn5.getText().equals("X")&&btn6.getText().equals("X")||
                btn7.getText().equals("X")&&btn8.getText().equals("X")&&btn9.getText().equals("X")||
                btn1.getText().equals("X")&&btn4.getText().equals("X")&&btn7.getText().equals("X")||
                btn3.getText().equals("X")&&btn6.getText().equals("X")&&btn9.getText().equals("X")||
                btn1.getText().equals("X")&&btn5.getText().equals("X")&&btn9.getText().equals("X")||
                btn2.getText().equals("X")&&btn5.getText().equals("X")&&btn8.getText().equals("X")||
                btn3.getText().equals("X")&&btn5.getText().equals("X")&&btn7.getText().equals("X")){
                lblWinner.setText("X is the winner");
            disableAllButtons();
            }else if(btn1.isDisabled()&&btn2.isDisabled()&&btn3.isDisabled()&&btn4.isDisabled()&&btn5.isDisabled()&&
                btn6.isDisabled()&&btn7.isDisabled()&&btn8.isDisabled()&&btn9.isDisabled()){
            lblWinner.setText("No winner!");
        }
    }
    private void disableAllButtons(){
        btn1.setDisable(true);
        btn2.setDisable(true);
        btn3.setDisable(true);
        btn4.setDisable(true);
        btn5.setDisable(true);
        btn6.setDisable(true);
        btn7.setDisable(true);
        btn8.setDisable(true);
        btn9.setDisable(true);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Ikhsan
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private RadioButton LAKI;
    @FXML
    private ToggleGroup kelamin;
    @FXML
    private RadioButton PEREMPUAN;
    @FXML
    private TextField NAMA;
    @FXML
    private TextField BERAT;
    @FXML
    private TextField TINGGI;
    @FXML
    private TextField IDEAL;
    @FXML
    private TextArea HASIL;
    @FXML
    private TextArea SARAN;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void PROSES(ActionEvent event) {
        String nama = NAMA.getText();
        int ideal = 0;
        int bb = Integer.parseInt(BERAT.getText());
        int tb = Integer.parseInt(TINGGI.getText());
        if(LAKI.isSelected()){
        ideal = tb - 100;
        IDEAL.setText(""+ideal);
        HASIL.setText("Nama : "+nama+" (Laki)"+"\nBerat Badan : "+bb+"\nTinggi Badan : "+tb);
        } else if (PEREMPUAN.isSelected()){
         ideal = tb - 110;
        IDEAL.setText(ideal+"");
        HASIL.setText("Nama : "+nama+" (Perempuan)"+"\nBerat Badan : "+bb+"\nTinggi Badan : "+tb);
        }
        if(ideal<bb){
        SARAN.setText("Saran : \nJangan Gendut - gendut sayang, diet dulu sana gih");
        } else if(bb<ideal){
        SARAN.setText("Saran : \nKamu Kok kurusan sayang?");
        } else if(bb == ideal){
        SARAN.setText("Saran : \nKamu Cantik! :*");
        }
        
    }

    @FXML
    private void RESET(ActionEvent event) {
        NAMA.setText("");
        BERAT.setText("");
        TINGGI.setText("");
        LAKI.setSelected(false);
        PEREMPUAN.setSelected(false);
        SARAN.setText("Saran :");
        HASIL.setText("Hasil :");
        IDEAL.setText("");
    }
    
}

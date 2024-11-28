package de.whs.mci.prakt3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.SpinnerValueFactory.DoubleSpinnerValueFactory;
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;

public class Controller {

    @FXML
    private ToggleGroup Farbe;
    @FXML
    private TextField Bestellnummer;
    @FXML
    private TextField Weinname;
    @FXML
    private TextField Erzeugername;
    @FXML
    private ChoiceBox<String> Herkunftsland;
    @FXML
    private ChoiceBox<String> Anbaugebiet;
    @FXML
    private CheckBox Sulfite;
    @FXML
    private CheckBox Vegan;
    @FXML
    private TextArea Beschreibung;
    @FXML
    private Spinner<Integer> Parkerpunkte;
    @FXML
    private ChoiceBox<Integer> Flaschengroesse;
    @FXML
    private TextField FlaschenpreisBrutto;
    @FXML
    private TextField LiterpreisBrutto;
    @FXML
    private TextField FlaschenpreisNetto;
    @FXML
    private TextField LiterpreisNetto;
    @FXML
    private Spinner<Double> Alkoholgehalt;
    @FXML
    private Spinner<Integer> Lagerdauer;
    @FXML
    private CheckBox Alkoholfrei;
    @FXML
    private ChoiceBox<String> Geschmack;
    @FXML
    private Spinner<Integer> Jahrgang;
    @FXML
    private Label FehlerFeld;
    @FXML
    private Label BestellNummer;
    @FXML
    private CheckBox PflichtfelderAuswahl;
    @FXML
    private Label WeinName;
    @FXML
    private Label WeinFarbe;
    @FXML
    private Label Herkunft;
    @FXML
    private Label AlkoholGehalt;
    @FXML
    private Label FlaschenGroesse;
    @FXML
    private Label LiterPreis;
    @FXML
    private Label FlaschenPreis;
    @FXML
    private Label ErzeugerName;
    @FXML
    private Label WeinGeschmack;
    @FXML
    private Label ParkerPunkte;
    @FXML
    private Label MaxLagerdauer;
    @FXML
    private Label WeinBeschreibung;
    
    
    
    
    private ObservableList<String> herkunft = FXCollections.observableArrayList(
            "Italien",
            "Deutschland",
            "Spanien",
            "Frankreich",
            "Land 5",
            "Land 6",
            "Land 7",
            "Land 8",
            "Land 9",
            "Land 10",
            "Land 11",
            "Land 12" );
    
    
    private ObservableList<String> gebiet = FXCollections.observableArrayList(
            "Anbaugebiet 1",
            "Anbaugebiet 2",
            "Anbaugebiet 3",
            "Anbaugebiet 4",
            "Anbaugebiet 5",
            "Anbaugebiet 6",
            "Anbaugebiet 7",
            "Anbaugebiet 8",
            "Anbaugebiet 9",
            "Anbaugebiet 10",
            "Anbaugebiet 11",
            "Anbaugebiet 12",
            "Anbaugebiet 13",
            "Anbaugebiet 14",
            "Anbaugebiet 15",
            "Anbaugebiet 16",
            "Anbaugebiet 17",
            "Anbaugebiet 18",
            "Anbaugebiet 19",
            "Anbaugebiet 20" );
    
    
    private ObservableList<Integer> FlaschenGroessen = FXCollections.observableArrayList(
            187,
            250,
            375,
            500,
            620,
            700,
            750,
            800,
            1000,
            1500  );
    
    
    private ObservableList<String> geschmackListe = FXCollections.observableArrayList(
            "trocken",
            "halbtrocken",
            "lieblich",
            "süß"   );
    
    
    private SpinnerValueFactory<Integer> ParkerP = new IntegerSpinnerValueFactory(50, 100 , 75);
    
    private SpinnerValueFactory<Integer> LagerD = new IntegerSpinnerValueFactory(1, 10 , 1);
    
    private SpinnerValueFactory<Integer> Jahr = new IntegerSpinnerValueFactory(1500, 2024 , 2020);
    
    private SpinnerValueFactory<Double> Alkohol = new DoubleSpinnerValueFactory(7.5 , 25.0 , 12.0 , 0.5);
    
    
    
    

    public void initialize() {
        Herkunftsland.setItems(herkunft);
        Anbaugebiet.setItems(gebiet);
        Geschmack.setItems(geschmackListe);
        Flaschengroesse.setItems(FlaschenGroessen);
        
        Parkerpunkte.setValueFactory(ParkerP);
        Lagerdauer.setValueFactory(LagerD);
        Jahrgang.setValueFactory(Jahr);
        Alkoholgehalt.setValueFactory(Alkohol);
        
        FehlerFeld.setText("");
        
        
        //nameLabel.setLabelFor(nameField);
        BestellNummer.setLabelFor(Bestellnummer);
        WeinName.setLabelFor(Weinname);
        ErzeugerName.setLabelFor(Erzeugername);
        AlkoholGehalt.setLabelFor(Alkoholgehalt);
        WeinFarbe.setLabelFor((RadioButton)(Farbe.getToggles().get(1)));
        Herkunft.setLabelFor(Herkunftsland);
        WeinGeschmack.setLabelFor(Geschmack);
        ParkerPunkte.setLabelFor(Parkerpunkte);
        MaxLagerdauer.setLabelFor(Lagerdauer);
        WeinBeschreibung.setLabelFor(Beschreibung);
        FlaschenGroesse.setLabelFor(Flaschengroesse);
        FlaschenPreis.setLabelFor(FlaschenpreisBrutto);
        
        
        
    }
    

    @FXML
    private void resetText(ActionEvent event) {
    }

    @FXML
    private void resetAll(ActionEvent event) {
    }

    @FXML
    private void save(ActionEvent event) {
        boolean PflichtfeldFehlt =
           Bestellnummer.getText().isBlank() | 
           Weinname.getText().isBlank() |
           LiterpreisNetto.getText().isBlank() |
           LiterpreisBrutto.getText().isBlank() |
           FlaschenpreisNetto.getText().isBlank() |
           FlaschenpreisBrutto.getText().isBlank() |
           Herkunftsland.getValue() == null |
           Flaschengroesse.getValue() == null;
        
        
        if(PflichtfeldFehlt){  
            
            FehlerFeld.setText("Bitte alle Pflichtfelder ausfüllen");
                
        }else{
            
            FehlerFeld.setText("");
            
        }
        
    }

    @FXML
    private void exit(ActionEvent event) {
    }

    @FXML
    private void PflichtfelderAnzeigen(ActionEvent event) {
        
        //if()kästchen Isselected == true
        if(PflichtfelderAuswahl.isSelected() == true){
            
            BestellNummer.setTextFill(Color.RED);
            WeinName.setTextFill(Color.RED);
            WeinFarbe.setTextFill(Color.RED);
            Herkunft.setTextFill(Color.RED);
            AlkoholGehalt.setTextFill(Color.RED);
            FlaschenGroesse.setTextFill(Color.RED);
            FlaschenPreis.setTextFill(Color.RED);
            LiterPreis.setTextFill(Color.RED);
        }else {
            
            BestellNummer.setTextFill(Color.BLACK);
            WeinName.setTextFill(Color.BLACK);
            WeinFarbe.setTextFill(Color.BLACK);
            Herkunft.setTextFill(Color.BLACK);
            AlkoholGehalt.setTextFill(Color.BLACK);
            FlaschenGroesse.setTextFill(Color.BLACK);
            FlaschenPreis.setTextFill(Color.BLACK);
            LiterPreis.setTextFill(Color.BLACK);
        }
        
        
    }

}

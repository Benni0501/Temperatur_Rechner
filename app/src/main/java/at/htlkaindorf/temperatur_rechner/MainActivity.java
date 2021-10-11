package at.htlkaindorf.temperatur_rechner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText celsius;
    private EditText kelvin;
    private EditText fahrenheit;
    private Button btconvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //test


    }

    public void onConvert(){
        if(celsius.getText().length() > 0 && kelvin.getText().length() == 0 && fahrenheit.getText().length() == 0){
            //float celsius = Float.parseFloat(celsius.getText().toString());
            // + 273,15
        } else if(celsius.getText().length() == 0 && kelvin.getText().length() > 0 && fahrenheit.getText().length() == 0){

        } else if(celsius.getText().length() == 0 && kelvin.getText().length() == 0 && fahrenheit.getText().length() > 0){

        }
    }
}
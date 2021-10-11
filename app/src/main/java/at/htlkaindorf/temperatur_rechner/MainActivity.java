package at.htlkaindorf.temperatur_rechner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText celsius;
    private EditText kelvin;
    private EditText fahrenheit;
    private Button btconvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        celsius = findViewById(R.id.celsiusInput);
        kelvin = findViewById(R.id.kelvinInput);
        fahrenheit = findViewById(R.id.fahrenheitInput);


    }

    public void onConvert(){
        if(celsius.getText().length() > 0 && kelvin.getText().length() == 0 && fahrenheit.getText().length() == 0){
            float kelvin_help = Float.parseFloat(celsius.getText().toString()) + 273.15f;
            float fahrenheit_help = Float.parseFloat(celsius.getText().toString()) + 32f;
            kelvin.setText(kelvin_help);
            fahrenheit.setText(fahrenheit_help);
        } else if(celsius.getText().length() == 0 && kelvin.getText().length() > 0 && fahrenheit.getText().length() == 0){
            float celsius_help = Float.parseFloat(kelvin.getText().toString()) - 237.15f;
            float fahrenheit_help = Float.parseFloat(kelvin.getText().toString()) - 459.67f;
            celsius.setText(celsius_help);
            fahrenheit.setText(fahrenheit_help);
        } else if(celsius.getText().length() == 0 && kelvin.getText().length() == 0 && fahrenheit.getText().length() > 0){
            float celsius_help = Float.parseFloat(fahrenheit.getText().toString()) - 17.7778f;
            float kelvin_help = Float.parseFloat(fahrenheit.getText().toString()) + 255.372f;
            celsius.setText(celsius_help);
            kelvin.setText(kelvin_help);
        } else {
            Toast.makeText(getApplicationContext(), "Mach das bitte net", Toast.LENGTH_LONG).show();
        }
    }
}
package sg.edu.rp.c346.id20017533.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btnDisplay;
    TextView tvMsg;
    EditText EtData;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDisplay = findViewById(R.id.buttonDisplay);
        tvMsg = findViewById(R.id.textView);
        EtData = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.rgGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                String text = EtData.getText().toString();
                tvMsg.setText(text);

                int id = rgGender.getCheckedRadioButtonId();
                if (id == R.id.radioButtonGenderFemale) {
                    text = "She said " + text;
                } else {
                    text = "He said " + text;
                }
                tvMsg.setText(text);
            }


        });


        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbtn.isChecked() == true) {
                    EtData.setEnabled(true);
                    EtData.setBackgroundColor(Color.TRANSPARENT);
                } else {
                    EtData.setEnabled(false);
                    EtData.setBackgroundColor(Color.RED);
                }
            }
        });
    }
}











package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox momCheckbox;
    private CheckBox dadCheckbox;
    private CheckBox wifeCheckbox;
    private CheckBox sisterCheckbox;
    private CheckBox brotherCheckbox;

    private Button showButton;
    private TextView showTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        momCheckbox =(CheckBox) findViewById(R.id.momId);
        dadCheckbox=(CheckBox) findViewById(R.id.dadId);
        wifeCheckbox=(CheckBox) findViewById(R.id.wifiId);
        sisterCheckbox=(CheckBox) findViewById(R.id.sisterId);
        brotherCheckbox=(CheckBox) findViewById(R.id.brotherId);

        showTextView=(TextView) findViewById(R.id.resultId);
        showButton=(Button) findViewById(R.id.ShowButtonId);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder =new StringBuilder();
                stringBuilder.append(momCheckbox.getText().toString()+ "Status is: " +
                        momCheckbox.isChecked()+ "\n");
                stringBuilder.append(dadCheckbox.getText().toString()+"Status is: "+
                        dadCheckbox.isChecked()+"\n");
                stringBuilder.append(wifeCheckbox.getText().toString()+ "status is: " +
                        wifeCheckbox.isChecked()+"\n");
                stringBuilder.append(sisterCheckbox.getText().toString()+"Status is:"+
                        sisterCheckbox.isChecked()+"\n");
                stringBuilder.append(brotherCheckbox.getText().toString()+"Status is: "+
                        brotherCheckbox.isChecked()+"\n");

                showTextView.setText(stringBuilder);
            }
        });
    }
}
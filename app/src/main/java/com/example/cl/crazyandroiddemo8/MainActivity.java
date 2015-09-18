package com.example.cl.crazyandroiddemo8;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {
  private Button button;
    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_gui);
        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button1);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                setContentView(R.layout.button_gui);
                break;
            case R.id.button1:
                setContentView(R.layout.radiobutton_chaeckbox_gui);
                break;
            default:
                break;
        }
    }
}

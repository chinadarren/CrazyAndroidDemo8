package com.example.cl.crazyandroiddemo8;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;



public class MainActivity extends Activity implements View.OnClickListener {
  private Button button;
    RadioGroup rg;
    TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_gui);
        //获取界面上rg、shouw两个组件
        rg = (RadioGroup) findViewById(R.id.rg);
        show = (TextView) findViewById(R.id.show);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(this);


        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //根据用户勾选的单选按钮来动态改变tip字符串的值
                String tip = checkedId == R.id.male ? "您的性别是男人":"您的性别是女人";
                //修改show组件的文本
                show.setText(tip);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                setContentView(R.layout.button_gui);
                break;
            default:
                break;
        }
    }

}

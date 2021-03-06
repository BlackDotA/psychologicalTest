package com.baoyun.psychologicalTest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
    }

    public void enterNext(View view){
        Intent intent =new Intent(this,CheckboxActivity.class);
        startActivity(intent);
    }



    public void onRadioButtonClicked(View view){
        boolean checked =((RadioButton)view).isChecked();

        switch (view.getId()){
            case R.id.radio_a:
                if (checked){
                    Toast.makeText(this,"选中了A",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.radio_b:
                if (checked){
                    Toast.makeText(this,"选中了B",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.radio_c:
                if (checked){
                    Toast.makeText(this,"选中了C",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.radio_d:
                if (checked){
                    Toast.makeText(this,"选中了D",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.radio_e:
                if (checked){
                    Toast.makeText(this,"选中了E",Toast.LENGTH_SHORT).show();
                }
                break;



        }


    }

}



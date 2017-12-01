package com.example.lucasan.firsttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewHolder mViewHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        this.mViewHolder = new ViewHolder();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.buttonCalculate = (Button) findViewById(R.id.button_calculate);
        this.mViewHolder.textEuro= (TextView) findViewById(R.id.text_euro);
        this.mViewHolder.textDolar = (TextView) findViewById(R.id.text_dolar);
        this.mViewHolder.editValue = (EditText) findViewById(R.id.edit_value);
//        Log.i("MainActivity", "Criando a main...");
        this.mViewHolder.buttonCalculate.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.button_calculate) {
            Double value = Double.valueOf(this.mViewHolder.editValue.getText().toString());
            this.mViewHolder.textDolar.setText(String.format("$%.2f", value*3.16));
            this.mViewHolder.textEuro.setText(String.format("€%.2f", value*4.16));
        }
    }

    private static class ViewHolder {
        EditText editValue;
        TextView textDolar;
        TextView textEuro;
        Button buttonCalculate;

    }
}

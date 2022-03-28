package com.example.letsrollsomedices;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addModification(View view) {
        EditText number=findViewById(R.id.modificationNumber);
        number.setText(String.valueOf(Integer.valueOf(String.valueOf(number.getText()))+1));
    }
    public void decreaseModification(View view){
        EditText number=findViewById(R.id.modificationNumber);
        number.setText(String.valueOf(Integer.valueOf(String.valueOf(number.getText()))-1));
    }

    public void addDices(View view) {
        switch (view.getId())
        {
            case R.id.increaseD2:
                EditText number2=findViewById(R.id.d2Amount);
                number2.setText(String.valueOf(Integer.valueOf(String.valueOf(number2.getText()))+1));
                break;
            case R.id.increaseD3:
                EditText number3=findViewById(R.id.d3Amount);
                number3.setText(String.valueOf(Integer.valueOf(String.valueOf(number3.getText()))+1));
                break;
            case R.id.increaseD4:
                EditText number4=findViewById(R.id.d4Amount);
                number4.setText(String.valueOf(Integer.valueOf(String.valueOf(number4.getText()))+1));
                break;
            case R.id.increaseD5:
                EditText number5=findViewById(R.id.d5Amount);
                number5.setText(String.valueOf(Integer.valueOf(String.valueOf(number5.getText()))+1));
                break;
            case R.id.increaseD6:
                EditText number6=findViewById(R.id.d6Amount);
                number6.setText(String.valueOf(Integer.valueOf(String.valueOf(number6.getText()))+1));
                break;
            case R.id.increaseD7:
                EditText number7=findViewById(R.id.d7Amount);
                number7.setText(String.valueOf(Integer.valueOf(String.valueOf(number7.getText()))+1));
                break;
            case R.id.increaseD8:
                EditText number8=findViewById(R.id.d8Amount);
                number8.setText(String.valueOf(Integer.valueOf(String.valueOf(number8.getText()))+1));
                break;
            case R.id.increaseD10:
                EditText number10=findViewById(R.id.d10Amount);
                number10.setText(String.valueOf(Integer.valueOf(String.valueOf(number10.getText()))+1));
                break;
            case R.id.increaseD12:
                EditText number12=findViewById(R.id.d12Amount);
                number12.setText(String.valueOf(Integer.valueOf(String.valueOf(number12.getText()))+1));
                break;
            case R.id.increaseD14:
                EditText number14=findViewById(R.id.d14Amount);
                number14.setText(String.valueOf(Integer.valueOf(String.valueOf(number14.getText()))+1));
                break;
            case R.id.increaseD16:
                EditText number16=findViewById(R.id.d16Amount);
                number16.setText(String.valueOf(Integer.valueOf(String.valueOf(number16.getText()))+1));
                break;
            case R.id.increaseD20:
                EditText number20=findViewById(R.id.d20Amount);
                number20.setText(String.valueOf(Integer.valueOf(String.valueOf(number20.getText()))+1));
                break;
            case R.id.increaseD24:
                EditText number24=findViewById(R.id.d24Amount);
                number24.setText(String.valueOf(Integer.valueOf(String.valueOf(number24.getText()))+1));
                break;
            case R.id.increaseD30:
                EditText number30=findViewById(R.id.d30Amount);
                number30.setText(String.valueOf(Integer.valueOf(String.valueOf(number30.getText()))+1));
                break;
            case R.id.increaseD100:
                EditText number100=findViewById(R.id.d100Amount);
                number100.setText(String.valueOf(Integer.valueOf(String.valueOf(number100.getText()))+1));
                break;
        }
    }

    public void decreaseDices(View view) {
        switch (view.getId())
        {
            case R.id.decreaseD2:
                EditText number2=findViewById(R.id.d2Amount);
                number2.setText(String.valueOf(Integer.valueOf(String.valueOf(number2.getText()))-1));
                break;
            case R.id.decreaseD3:
                EditText number3=findViewById(R.id.d3Amount);
                number3.setText(String.valueOf(Integer.valueOf(String.valueOf(number3.getText()))-1));
                break;
            case R.id.decreaseD4:
                EditText number4=findViewById(R.id.d4Amount);
                number4.setText(String.valueOf(Integer.valueOf(String.valueOf(number4.getText()))-1));
                break;
            case R.id.decreaseD5:
                EditText number5=findViewById(R.id.d5Amount);
                number5.setText(String.valueOf(Integer.valueOf(String.valueOf(number5.getText()))-1));
                break;
            case R.id.decreaseD6:
                EditText number6=findViewById(R.id.d6Amount);
                number6.setText(String.valueOf(Integer.valueOf(String.valueOf(number6.getText()))-1));
                break;
            case R.id.decreaseD7:
                EditText number7=findViewById(R.id.d7Amount);
                number7.setText(String.valueOf(Integer.valueOf(String.valueOf(number7.getText()))-1));
                break;
            case R.id.decreaseD8:
                EditText number8=findViewById(R.id.d8Amount);
                number8.setText(String.valueOf(Integer.valueOf(String.valueOf(number8.getText()))-1));
                break;
            case R.id.decreaseD10:
                EditText number10=findViewById(R.id.d10Amount);
                number10.setText(String.valueOf(Integer.valueOf(String.valueOf(number10.getText()))-1));
                break;
            case R.id.decreaseD12:
                EditText number12=findViewById(R.id.d12Amount);
                number12.setText(String.valueOf(Integer.valueOf(String.valueOf(number12.getText()))-1));
                break;
            case R.id.decreaseD14:
                EditText number14=findViewById(R.id.d14Amount);
                number14.setText(String.valueOf(Integer.valueOf(String.valueOf(number14.getText()))-1));
                break;
            case R.id.decreaseD16:
                EditText number16=findViewById(R.id.d16Amount);
                number16.setText(String.valueOf(Integer.valueOf(String.valueOf(number16.getText()))-1));
                break;
            case R.id.decreaseD20:
                EditText number20=findViewById(R.id.d20Amount);
                number20.setText(String.valueOf(Integer.valueOf(String.valueOf(number20.getText()))-1));
                break;
            case R.id.decreaseD24:
                EditText number24=findViewById(R.id.d24Amount);
                number24.setText(String.valueOf(Integer.valueOf(String.valueOf(number24.getText()))-1));
                break;
            case R.id.decreaseD30:
                EditText number30=findViewById(R.id.d30Amount);
                number30.setText(String.valueOf(Integer.valueOf(String.valueOf(number30.getText()))-1));
                break;
            case R.id.decreaseD100:
                EditText number100=findViewById(R.id.d100Amount);
                number100.setText(String.valueOf(Integer.valueOf(String.valueOf(number100.getText()))-1));
                break;
        }
    }

    public String insertDice(String insert){
        String correct=null;
        if((char)insert.charAt(0)=='-'){
            correct=insert;
        }
        else
            if((char)insert.charAt(0)=='0')
                correct=null;
            else
                correct='+'+insert;

        return correct;
    }
    public void makeRoll(View view) {
        TextView result=findViewById(R.id.resultView);
        Dice dice=new Dice();
        String request="";
        HashSet<EditText> dices=new HashSet<EditText>();
        dices.add(findViewById(R.id.d2Amount));
        dices.add(findViewById(R.id.d3Amount));
        dices.add(findViewById(R.id.d4Amount));
        dices.add(findViewById(R.id.d5Amount));
        dices.add(findViewById(R.id.d6Amount));
        dices.add(findViewById(R.id.d7Amount));
        dices.add(findViewById(R.id.d8Amount));
        dices.add(findViewById(R.id.d10Amount));
        dices.add(findViewById(R.id.d12Amount));
        dices.add(findViewById(R.id.d14Amount));
        dices.add(findViewById(R.id.d16Amount));
        dices.add(findViewById(R.id.d20Amount));
        dices.add(findViewById(R.id.d24Amount));
        dices.add(findViewById(R.id.d30Amount));
        dices.add(findViewById(R.id.d100Amount));
        String sides="";
        for(EditText i:dices){
            if(insertDice(String.valueOf(i.getText()))!=null) {
                sides = String.valueOf(i.getTransitionName());
                request += insertDice(String.valueOf(i.getText())) + 'd' + sides;
            }
        }

        EditText mod=findViewById(R.id.modificationNumber);
        if(insertDice(String.valueOf(mod.getText()))!=null)
            request+=insertDice(String.valueOf(mod.getText()));
        dice.doTheDiceRoll(request);
        result.setText(result.getText()+dice.showResult());
    }
}
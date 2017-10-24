package paraller_world.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void clickFunction(View view)
    {
        EditText editText = (EditText)findViewById(R.id.MyText) ;
Double dollarAmount = Double.parseDouble(  editText.getText().toString());
       Double poundAmount = dollarAmount * 0.65;
        Toast.makeText(getApplicationContext(), "Pound Amount" + poundAmount.toString(), Toast.LENGTH_SHORT).show();
        Log.i("Dollars",poundAmount.toString());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

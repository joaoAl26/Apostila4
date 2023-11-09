package br.ulbra.calculadora_compra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    CheckBox chkarroz, chkleite, chkcarne, chkfeijao;
    Button bttotal;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compras);
        chkarroz = (CheckBox) findViewById(R.id.chkarroz);
        chkleite = (CheckBox) findViewById(R.id.chkleite);
        chkcarne = (CheckBox) findViewById(R.id.chkcarne);
        chkfeijao = (CheckBox) findViewById(R.id.chkfeijao);
        Button bttotal = (Button) findViewById(R.id.bttotal);
        bttotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                double total = 0;
                if (chkarroz.isChecked()) { total += 2.69; }
                if (chkleite.isChecked()) { total += 5.00; }
                if (chkcarne.isChecked()) { total += 9.7; }
                if (chkfeijao.isChecked()) { total += 2.30; }
                AlertDialog.Builder dialogo = new AlertDialog.Builder(ComprasActivity.this);
                dialogo.setTitle(&quot;Aviso&quot;);
                dialogo.setMessage(&quot;Valor total da compra :&quot;+ String.valueOf(total));
                dialogo.setNeutralButton(&quot;OK&quot;, null);
                dialogo.show();
            } });}}
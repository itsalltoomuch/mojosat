package freelancer.giangnh.mojosat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imvLogo;
    private TextView tvLanguage;
    private Button btnRegisterOwner;
    private Button btnRegisterSheep;
    private Button btnWoolCollection;
    private Button btnTrackGoods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }


    private void findViews() {
        imvLogo = (ImageView) findViewById(R.id.imvLogo);
        tvLanguage = (TextView) findViewById(R.id.tvLanguage);
        btnRegisterOwner = (Button) findViewById(R.id.btnRegisterOwner);
        btnRegisterSheep = (Button) findViewById(R.id.btnRegisterSheep);
        btnWoolCollection = (Button) findViewById(R.id.btnWoolCollection);
        btnTrackGoods = (Button) findViewById(R.id.btnTrackGoods);

        btnRegisterOwner.setOnClickListener(this);
        btnRegisterSheep.setOnClickListener(this);
        btnWoolCollection.setOnClickListener(this);
        btnTrackGoods.setOnClickListener(this);
        tvLanguage.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v == btnRegisterOwner) {
            // Handle clicks for btnRegisterOwner
            Toast.makeText(this, R.string.comming_soon, Toast.LENGTH_SHORT).show();

        } else if (v == btnRegisterSheep) {
            // Handle clicks for btnRegisterSheep
            Intent intent = new Intent(this, RegisterSheepActivity.class);
            startActivity(intent);
        } else if (v == btnWoolCollection) {
            // Handle clicks for btnWoolCollection
        } else if (v == btnTrackGoods) {
            Toast.makeText(this, R.string.comming_soon, Toast.LENGTH_SHORT).show();

            // Handle clicks for btnTrackGoods
        } else if (v == tvLanguage){
            Toast.makeText(this, R.string.comming_soon, Toast.LENGTH_SHORT).show();
        }
    }

}

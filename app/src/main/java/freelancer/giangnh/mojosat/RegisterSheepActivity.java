package freelancer.giangnh.mojosat;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class RegisterSheepActivity extends AppCompatActivity implements BarScannerFragment.OnBarCodeListener, SheepDetailsFragment.OnSheepDetailsFragmentInteractionListener {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_sheep);

        fragmentManager = getSupportFragmentManager();

        // add
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.add(R.id.flContent, new BarScannerFragment());
// alternatively add it with a tag
// trx.add(R.id.your_placehodler, new YourFragment(), "detail");
        ft.commit();

//// replace
//        FragmentTransaction ft = fm.beginTransaction();
//        ft.replace(R.id.flContent, new BarScannerFragment());
//        ft.commit();
//
//// remove
//        Fragment fragment = fm.findFragmentById(R.id.your_placehodler);
//        FragmentTransaction ft = fm.beginTransaction();
//        ft.remove(fragment);
//        ft.commit();
    }

    @Override
    public void onBarCodeReceived(String result) {
        // If you would like to resume scanning, call this method below:
        //mScannerView.resumeCameraPreview(this);
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();

        showSheepDetailsFragment();

    }

    private void showSheepDetailsFragment(){
        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        ft.replace(R.id.flContent, new SheepDetailsFragment());
        ft.commit();
    }

    @Override
    public void onConfirmed(Uri uri) {
        Toast.makeText(this, R.string.comming_soon, Toast.LENGTH_SHORT).show();
    }
}

package se.springworks.ownerandroidexample.androidexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.aeonbits.owner.ConfigFactory;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		TextView username = (TextView)findViewById(R.id.username);
		username.setText("u");

		TextView password = (TextView)findViewById(R.id.password);
		password.setText("p");

		update(username, password);

	}

	private void update(TextView username, TextView password) {
		ServerConfig cfg = ConfigFactory.create(ServerConfig.class);
		username.setText(cfg.user_id());
		password.setText(cfg.user_pw());
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

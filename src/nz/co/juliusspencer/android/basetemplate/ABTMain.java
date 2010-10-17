package nz.co.juliusspencer.android.basetemplate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;



public class ABTMain extends Activity {

	
	private static final int MENU_SETTINGS_ID = Menu.FIRST;

	private static final int VIEW_PREFS = -1;
	

	//  -------------------------------------------
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	//  -------------------------------------------

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(Menu.NONE, MENU_SETTINGS_ID, Menu.NONE, R.string.settings).setIcon(android.R.drawable.ic_menu_preferences);
		return super.onCreateOptionsMenu(menu);
	}

	//  -------------------------------------------
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {

		Intent i = null;
		switch(item.getItemId()) {
		case MENU_SETTINGS_ID:
			i = new Intent(this, ABTPreferences.class);
			startActivityForResult(i, VIEW_PREFS);
			return true;
		}

		return super.onMenuItemSelected(featureId, item);
	}
	
	
	//  -------------------------------------------

}
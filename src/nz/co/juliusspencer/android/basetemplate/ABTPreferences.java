package nz.co.juliusspencer.android.basetemplate;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class ABTPreferences extends PreferenceActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		
		addPreferencesFromResource(R.xml.preferences);
	}
	
}

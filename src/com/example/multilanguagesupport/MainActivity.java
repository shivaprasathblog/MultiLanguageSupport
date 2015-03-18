package com.example.multilanguagesupport;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity 
{

//Change Language Preference in Phone (or) Emulator Setting to see the effect .

	/**Add folder under res folder with the name values-fr and in that add strings.xml , 
	add french resources (french support)if u want your app to support both English and French ,
	Likewise if you want to support any other language like  Portuguese add folder under res as 
	values- pt and in that add strings.xml , add Portuguese resources (Portuguese support)**/
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

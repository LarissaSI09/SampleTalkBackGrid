package projects.lsg.sampletalkbackgrid;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Switch;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));


        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

                switch(position){
                    case 0:
                        alertDialogBuilder.setTitle("American Horror Story");
                        alertDialogBuilder.setMessage(R.string.ahs);
                        v.setContentDescription("American Horror Story");
                        break;
                    case 1:
                        alertDialogBuilder.setTitle("Breakig Bad");
                        alertDialogBuilder.setMessage(R.string.bb);
                        //v.setContentDescription("The Walking Dead");
                        break;
                    case 2:
                        alertDialogBuilder.setTitle("Game of Thrones");
                        alertDialogBuilder.setMessage(R.string.gft);
                       // v.setContentDescription("The Walking Dead");
                        break;
                    case 3:
                        alertDialogBuilder.setTitle("Orange is the new Black");
                        alertDialogBuilder.setMessage(R.string.oitnb);
                       //v.setContentDescription("The Walking Dead");
                        break;
                    case 4:
                        alertDialogBuilder.setTitle("Orphan Black");
                        alertDialogBuilder.setMessage(R.string.ob);
                        //v.setContentDescription("The Walking Dead");
                        break;
                    case 5:
                        alertDialogBuilder.setTitle("Sense 8");
                        alertDialogBuilder.setMessage(R.string.s8);
                        //v.setContentDescription("The Walking Dead");
                        break;
                    case 6:
                        alertDialogBuilder.setTitle("The Walking Dead");
                        alertDialogBuilder.setMessage(R.string.twd);
                        //v.setContentDescription("The Walking Dead");
                        break;
                }

                alertDialogBuilder.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int arg1) {
                        dialogInterface.cancel();
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

package projects.lsg.sampletalkbackgrid;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by larissa on 16/11/2015.
 */
public class ImageAdapter extends BaseAdapter{

    private Context mContext;

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;


        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(250, 250));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);

            switch (position){
                case 0:
                    imageView.setContentDescription("American Horror Story");
                    break;
                case 1:
                    //imageView.setContentDescription("Breaking Bad");
                    break;
                case 2:
                    imageView.setContentDescription("Game of Thrones");
                    break;
                case 3:
                    //imageView.setContentDescription("Orange is the new Black");
                    break;
                case 4:
                    imageView.setContentDescription("Orphan Black");
                    break;
                case 5:
                    //imageView.setContentDescription("Sense 8");
                    break;
                case 6:
                    imageView.setContentDescription("The Walking Dead");
                    break;
            }

        }
        else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // Keep all Images in array
    public Integer[] mThumbIds = {
        R.drawable.american_horror_story3, R.drawable.breaking_bad3,
            R.drawable.game_of_thrones3, R.drawable.oitnb3,
            R.drawable.orphanblack3, R.drawable.sense83,
            R.drawable.the_walking_dead3
    };
}

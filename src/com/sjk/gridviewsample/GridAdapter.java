package com.sjk.gridviewsample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

	static final String[ ] GRID_DATA = new String[] {
        "One" ,
        "Two",
        "Three" ,
        "Four",
        "Five" ,
        "Six",
        "Seven",
        "Eight",       
        "Nine" ,
        "Ten"
     };
	
	Context context;

	public GridAdapter(Context context) {
		super();
		this.context = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return GRID_DATA.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View grid;
		LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		if(convertView==null){
			grid=new View(context);
			grid=inflater.inflate(R.layout.single_tile, null);
			ImageView imageview=(ImageView)grid.findViewById(R.id.iv_icon);
			TextView textview=(TextView)grid.findViewById(R.id.tv_label);
			imageview.setBackgroundResource(R.drawable.ic_launcher);
			textview.setText(GRID_DATA[position]);
		}
		else {
			grid = (View) convertView;
		}

		return grid;
	}

}

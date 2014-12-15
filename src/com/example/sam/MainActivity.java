package com.example.sam;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	// String[] Students =
	// {"Ram","Shaym","Gopal","Radhe","Suresh","Mahesh","Kumar","Salman","Kiran","Rupak","Ale","Mani","Sanju"};

	private List<Student> students = new ArrayList<Student>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// ListView l = (ListView)findViewById(R.id.listView1);
		// ArrayAdapter<String> adapter = new
		// ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
		// Students);
		// l.setAdapter(adapter);
		// l.setOnItemClickListener(this);

		populateStudentList();
		populateStudentListView();
		callbacks();
	}

	private void callbacks() {
		ListView list = (ListView) findViewById(R.id.listView1);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				Student studentclicked = students.get(position);
				String message = "Clicked on" + position + 1
						+ "Student's name is" + studentclicked.getName();
				Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT)
						.show();

			}
		});
	}

	private void populateStudentListView() {
		ArrayAdapter<Student> adapter = new MyArrayAdapter();
		ListView ls = (ListView) findViewById(R.id.listView1);
		ls.setAdapter(adapter);
	}

	private void populateStudentList() {
		students.add(new Student(R.drawable.officeworker, "Ajay", 20));
		students.add(new Student(R.drawable.officeworker, "vijay", 20));
		students.add(new Student(R.drawable.officeworker, "sanjay", 20));
		students.add(new Student(R.drawable.officeworker, "Ram", 20));
		students.add(new Student(R.drawable.officeworker, "shyam", 20));
		students.add(new Student(R.drawable.officeworker, "karan", 20));
		students.add(new Student(R.drawable.officeworker, "rjun", 20));
		students.add(new Student(R.drawable.officeworker, "nakul", 20));
		students.add(new Student(R.drawable.officeworker, "dev", 20));
		students.add(new Student(R.drawable.officeworker, "salman", 20));
		students.add(new Student(R.drawable.officeworker, "srk", 20));
		students.add(new Student(R.drawable.officeworker, "sallu", 20));
		students.add(new Student(R.drawable.officeworker, "kallu", 20));
		students.add(new Student(R.drawable.officeworker, "tallu", 20));
		students.add(new Student(R.drawable.officeworker, "tunna", 20));
		students.add(new Student(R.drawable.officeworker, "munna", 20));
		students.add(new Student(R.drawable.officeworker, "Ajay", 20));
		students.add(new Student(R.drawable.officeworker, "vijay", 20));
		students.add(new Student(R.drawable.officeworker, "sanjay", 20));
		students.add(new Student(R.drawable.officeworker, "Ram", 20));
		students.add(new Student(R.drawable.officeworker, "shyam", 20));
		students.add(new Student(R.drawable.officeworker, "karan", 20));
		students.add(new Student(R.drawable.officeworker, "rjun", 20));
		students.add(new Student(R.drawable.officeworker, "nakul", 20));
		students.add(new Student(R.drawable.officeworker, "dev", 20));
		students.add(new Student(R.drawable.officeworker, "salman", 20));
		students.add(new Student(R.drawable.officeworker, "srk", 20));
		students.add(new Student(R.drawable.officeworker, "sallu", 20));
		students.add(new Student(R.drawable.officeworker, "kallu", 20));
		students.add(new Student(R.drawable.officeworker, "tallu", 20));
		students.add(new Student(R.drawable.officeworker, "tunna", 20));
		students.add(new Student(R.drawable.officeworker, "munna", 20));
		students.add(new Student(R.drawable.officeworker, "Ajay", 20));
		students.add(new Student(R.drawable.officeworker, "vijay", 20));
		students.add(new Student(R.drawable.officeworker, "sanjay", 20));
		students.add(new Student(R.drawable.officeworker, "Ram", 20));
		students.add(new Student(R.drawable.officeworker, "shyam", 20));
		students.add(new Student(R.drawable.officeworker, "karan", 20));
		students.add(new Student(R.drawable.officeworker, "rjun", 20));
		students.add(new Student(R.drawable.officeworker, "nakul", 20));
		students.add(new Student(R.drawable.officeworker, "dev", 20));
		students.add(new Student(R.drawable.officeworker, "salman", 20));
		students.add(new Student(R.drawable.officeworker, "srk", 20));
		students.add(new Student(R.drawable.officeworker, "sallu", 20));
		students.add(new Student(R.drawable.officeworker, "kallu", 20));
		students.add(new Student(R.drawable.officeworker, "tallu", 20));
		students.add(new Student(R.drawable.officeworker, "tunna", 20));
		students.add(new Student(R.drawable.officeworker, "munna", 20));
		students.add(new Student(R.drawable.officeworker, "Ajay", 20));
		students.add(new Student(R.drawable.officeworker, "vijay", 20));
		students.add(new Student(R.drawable.officeworker, "sanjay", 20));
		students.add(new Student(R.drawable.officeworker, "Ram", 20));
		students.add(new Student(R.drawable.officeworker, "shyam", 20));
		students.add(new Student(R.drawable.officeworker, "karan", 20));
		students.add(new Student(R.drawable.officeworker, "rjun", 20));
		students.add(new Student(R.drawable.officeworker, "nakul", 20));
		students.add(new Student(R.drawable.officeworker, "dev", 20));
		students.add(new Student(R.drawable.officeworker, "salman", 20));
		students.add(new Student(R.drawable.officeworker, "srk", 20));
		students.add(new Student(R.drawable.officeworker, "sallu", 20));
		students.add(new Student(R.drawable.officeworker, "kallu", 20));
		students.add(new Student(R.drawable.officeworker, "tallu", 20));
		students.add(new Student(R.drawable.officeworker, "tunna", 20));
		students.add(new Student(R.drawable.officeworker, "munna", 20));
		students.add(new Student(R.drawable.officeworker, "Ajay", 20));
		students.add(new Student(R.drawable.officeworker, "vijay", 20));
		students.add(new Student(R.drawable.officeworker, "sanjay", 20));
		students.add(new Student(R.drawable.officeworker, "Ram", 20));
		students.add(new Student(R.drawable.officeworker, "shyam", 20));
		students.add(new Student(R.drawable.officeworker, "karan", 20));
		students.add(new Student(R.drawable.officeworker, "rjun", 20));
		students.add(new Student(R.drawable.officeworker, "nakul", 20));
		students.add(new Student(R.drawable.officeworker, "dev", 20));
		students.add(new Student(R.drawable.officeworker, "salman", 20));
		students.add(new Student(R.drawable.officeworker, "srk", 20));
		students.add(new Student(R.drawable.officeworker, "sallu", 20));
		students.add(new Student(R.drawable.officeworker, "kallu", 20));
		students.add(new Student(R.drawable.officeworker, "tallu", 20));
		students.add(new Student(R.drawable.officeworker, "tunna", 20));
		students.add(new Student(R.drawable.officeworker, "munna", 20));
		students.add(new Student(R.drawable.officeworker, "Ajay", 20));
		students.add(new Student(R.drawable.officeworker, "vijay", 20));
		students.add(new Student(R.drawable.officeworker, "sanjay", 20));
		students.add(new Student(R.drawable.officeworker, "Ram", 20));
		students.add(new Student(R.drawable.officeworker, "shyam", 20));
		students.add(new Student(R.drawable.officeworker, "karan", 20));
		students.add(new Student(R.drawable.officeworker, "rjun", 20));
		students.add(new Student(R.drawable.officeworker, "nakul", 20));
		students.add(new Student(R.drawable.officeworker, "dev", 20));
		students.add(new Student(R.drawable.officeworker, "salman", 20));
		students.add(new Student(R.drawable.officeworker, "srk", 20));
		students.add(new Student(R.drawable.officeworker, "sallu", 20));
		students.add(new Student(R.drawable.officeworker, "kallu", 20));
		students.add(new Student(R.drawable.officeworker, "tallu", 20));
		students.add(new Student(R.drawable.officeworker, "tunna", 20));
		students.add(new Student(R.drawable.officeworker, "munna", 20));


	}

	private class MyArrayAdapter extends ArrayAdapter<Student> {

		public MyArrayAdapter() {
			super(MainActivity.this, R.layout.rowlist, students);

		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			
			View itemView = convertView;
			if (itemView == null) {
				itemView = getLayoutInflater().inflate(R.layout.rowlist,
						parent, false);

			}
			Student currentStudent = students.get(position);
			TextView textview = (TextView)itemView.findViewById(R.id.textView1);
			textview.setText(currentStudent.getName());
			View imageview = itemView.findViewById(R.id.imageView1);
			itemView.setTag(R.id.imageView1, imageview);
			bindImageView(position, itemView);

			View button2 = itemView.findViewById(R.id.button2);
			itemView.setTag(R.id.button2, button2);
			bindButton2(position, itemView);

			View button1 = itemView.findViewById(R.id.button1);
			itemView.setTag(R.id.button1, button1);
			bindButton1(position,itemView);

			return itemView;

		}

		private void bindButton1(int position, View itemView) {
		
			final Button button1 = (Button) itemView.getTag(R.id.button1);
		//	final int currentPostion1 = position;
			button1.setOnClickListener(new OnClickListener() {
				int flag=1;
				@Override
				public void onClick(View v) {
				
					if(flag==1)
					{
						button1.setBackgroundColor(Color.BLUE);
						flag=0;
					}
					else
					{
						button1.setBackgroundColor(Color.CYAN);
						flag=1;
					}
				}
			});
			
		}
	

		private void bindButton2(int position, View itemView) {
			final int currentPostion = position;
			Button button2 = (Button) itemView.getTag(R.id.button2);
			button2.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {

					Toast.makeText(MainActivity.this,
							"Clicked Button at Postion:" + (currentPostion+1),
							Toast.LENGTH_SHORT).show();
				}
			});

		}

		private void bindImageView(int position, View itemView) {
			ImageView imageview = (ImageView) itemView.getTag(R.id.imageView1);
			Student currentStudent = students.get(position);
			imageview.setImageResource(currentStudent.getImg());

		}

		// public View getView(int position, View convertView, ViewGroup parent)
		// {
		// // return parent;
		//
		// View itemView = convertView;
		// if (itemView == null) {
		// itemView = getLayoutInflater().inflate(R.layout.rowlist,
		// parent, false);
		//
		// }
		// Student currentStudent = students.get(position);
		// ImageView imageview = (ImageView) itemView
		// .findViewById(R.id.imageView1);
		// imageview.setImageResource(currentStudent.getImg());
		// TextView textview = (TextView) itemView
		// .findViewById(R.id.textView1);
		// textview.setText(currentStudent.getName());
		// Button button2 = (Button) itemView.findViewById(R.id.button2);
		// button2.setTag(position);
		// button2.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View v) {
		// int curPostition = (Integer) v.getTag();
		// Toast.makeText(MainActivity.this,
		// "Clicked Button at Postion:" + curPostition,
		// Toast.LENGTH_SHORT).show();
		// }
		// });
		//
		// final Button button1 = (Button) imageview.findViewById(R.id.button1);
		// button1.setOnClickListener(new OnClickListener() {
		// int flag = 1;
		//
		// @Override
		// public void onClick(View v) {
		// if (flag == 1) {
		// button1.setBackgroundColor(Color.BLUE);
		// flag = 0;
		// } else {
		// button1.setBackgroundColor(Color.CYAN);
		// }
		//
		// }
		// });
		// return itemView;
		// }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	// @Override
	// public void onItemClick(AdapterView<?> parent, View view, int position,
	// long id) {
	// TextView temp = (TextView) view;
	// Toast.makeText(this,temp.getText()+"   "+position,
	// Toast.LENGTH_SHORT).show();
	// }

}
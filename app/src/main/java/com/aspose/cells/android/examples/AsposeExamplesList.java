package com.aspose.cells.android.examples;

import android.app.ExpandableListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AsposeExamplesList extends ExpandableListActivity {

    private ArrayList<String> parentItems = new ArrayList<String>();
    private ArrayList<Object> childItems = new ArrayList<Object>();

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        ExpandableListView expandableList = getExpandableListView(); // you can use (ExpandableListView) findViewById(R.id.list)

        expandableList.setDividerHeight(2);
        expandableList.setGroupIndicator(null);
        expandableList.setClickable(true);

        setGroupParents();
        setChildData();

        AsposeExpandableAdapter adapter = new AsposeExpandableAdapter(parentItems, childItems);

        adapter.setInflater((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE), this);
        expandableList.setAdapter(adapter);
        expandableList.setOnChildClickListener(this);
    }

    public void setGroupParents() {
        Collections.addAll(parentItems, getResources().getStringArray(R.array.group_list));
    }

    public void setChildData() {
        //Child Introduction
        ArrayList<String> introduction = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.child_introduction)));
        childItems.add(introduction);
        //Child working with files
        ArrayList<String> child_working_with_files = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.child_working_with_files)));
        childItems.add(child_working_with_files);

        //Child working with worksheet
        ArrayList<String> child_working_with_worksheets = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.child_working_with_worksheets)));
        childItems.add(child_working_with_worksheets);

        ArrayList<String> child_Working_with_rows_and_columns = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.child_Working_with_rows_and_columns)));
        childItems.add(child_Working_with_rows_and_columns);

        ArrayList<String> child_working_with_data = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.child_working_with_data)));
        childItems.add(child_working_with_data);

        ArrayList<String> child_working_with_data_formatting = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.child_working_with_data_formatting)));
        childItems.add(child_working_with_data_formatting);

        ArrayList<String> child_creating_charts = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.child_creating_charts)));
        childItems.add(child_creating_charts);

        ArrayList<String> child_working_with_drawing_objects = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.child_working_with_drawing_objects)));
        childItems.add(child_working_with_drawing_objects);

        ArrayList<String> child_advanced_topics = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.child_advanced_topics)));
        childItems.add(child_advanced_topics);

        ArrayList<String> child_working_with_tables = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.child_working_with_tables)));
        childItems.add(child_working_with_tables);

        ArrayList<String> child_working_with_formulas = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.child_working_with_formulas)));
        childItems.add(child_working_with_formulas);

        ArrayList<String> child_working_with_cellshelper_methods = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.child_working_with_cellshelper_methods)));
        childItems.add(child_working_with_cellshelper_methods);
    }

}
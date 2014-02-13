package com.matthewfarley.chartnsplash;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.echo.holographlibrary.Line;
import com.echo.holographlibrary.LineGraph;
import com.echo.holographlibrary.LinePoint;

public class GraphFragment extends Fragment {
	private LineGraph mLineGraph;
	private Line mGraphLine;
	private LinePoint mGraphLinePoint;
	private int[] mXPoints = {0, 4, 8, 12};
	private int[] mYPoints = {3, 8, 4, 12};
	
	@Override
	public View onCreateView(LayoutInflater inflater, 
			ViewGroup parent, Bundle savedInstanceState){
		View v = inflater.inflate(R.layout.fragment_graph, parent, false);
		mGraphLine = new Line();
		for(int i = 0; i <= (mXPoints.length -1); i++){
			mGraphLinePoint = new LinePoint();
			mGraphLinePoint.setX(mXPoints[i]);
			mGraphLinePoint.setY(mYPoints[i]);
			mGraphLine.addPoint(mGraphLinePoint);
		}
		mGraphLine.setColor(Color.parseColor("#FFBB33"));
		mLineGraph = (LineGraph)v.findViewById(R.id.graphFragment_lineGraph);
		mLineGraph.addLine(mGraphLine);
		mLineGraph.setRangeY(0,12);
		mLineGraph.setLineToFill(0);
		
		
		
		return v;
	}

}

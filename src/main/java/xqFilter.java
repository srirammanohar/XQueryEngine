import java.util.HashMap;

import org.w3c.dom.Node;

public class xqFilter {
	
	xqRelativePath left;
	xqRelativePath right;
	xqFilter      left_filter;
	xqFilter      right_filter;
	String expr;

	public xqFilter(xqRelativePath left_rp) {
		// TODO Auto-generated constructor stub
		left = left_rp;
		right = null;
		left_filter = null;
		right_filter = null;
		expr = null;
		
	}
	
	public xqFilter(xqRelativePath left_rp,xqRelativePath right_rp , String str) {
		// TODO Auto-generated constructor stub
		
		left = left_rp;
		right = right_rp;
		left_filter = null;
		right_filter = null;
		expr = str;
		
		
		
	}
	public xqFilter(xqFilter leftfilter,xqFilter rightfilter, String str ) {
		// TODO Auto-generated constructor stub
		
		left = null;
		right = null;
		left_filter = leftfilter;
		right_filter = rightfilter;
		expr = str;
		
		
		
	}
	public xqFilter(xqFilter leftfilter ) {
		// TODO Auto-generated constructor stub
		
		left = null;
		right = null;
		left_filter = leftfilter;
		right_filter = null;
		expr = null;
		
		
	}
	public xqFilter(xqFilter leftfilter, String expression ) {
		// TODO Auto-generated constructor stub
		
		left = null;
		right = null;
		left_filter = leftfilter;
		right_filter = null;
		expr = expression;
		
		
	}

	public void evalFilter(Node item, HashMap hmap) {
		// TODO Auto-generated method stub
		
		
		
		
		
	}
	

}

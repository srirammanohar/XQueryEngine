
public class xqRelativePath {

	public String tagname;
	public String slash;
	public xqRelativePath left;
	public xqRelativePath right;
	public xqFilter filter;

	public xqRelativePath(String t) {
		tagname = t;
		slash = null;
		left = right = null;
		filter = null;
		
	}
	
	public xqRelativePath( xqRelativePath l, xqRelativePath r){
		
		left =l;
		right = r;
		tagname = null;
		slash = null;
		filter = null;
		
	}
	public xqRelativePath( xqRelativePath r){
		
		left =r;
		right = null;
		
		tagname = null;
		slash = null;
		filter = null;
		
	}
	public xqRelativePath( xqRelativePath l, String sl , xqRelativePath r ){
		
		left =l;
		right = r;
		
		tagname = null;
		slash = sl;
		filter = null;
		
	}
	
	public xqRelativePath( xqRelativePath l, xqFilter f  ){
		
		left =l;
		right = null;
		
		tagname = null;
		slash = null;
		filter = f;
		
	}
	
	
	
}

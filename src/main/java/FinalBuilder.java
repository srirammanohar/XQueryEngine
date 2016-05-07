import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

public class FinalBuilder extends xmlBaseListener {
	ParseTreeProperty<Object> map = new ParseTreeProperty<Object>();

	public FinalBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	@Override public void enterQuery(xmlParser.QueryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitQuery(xmlParser.QueryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterApchild(xmlParser.ApchildContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitApchild(xmlParser.ApchildContext ctx) {
		
		 fileName file = (fileName)map.get(ctx.fileName());
		 xqRelativePath rp = (xqRelativePath) map.get(ctx.relative_path());
		 xqAbsolutePath xap = new xqAbsolutePath(file,rp);
         System.out.println("Sriram is testing");
		 map.put(ctx,xap);
		
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterApdesc(xmlParser.ApdescContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitApdesc(xmlParser.ApdescContext ctx) {
		
		fileName file = (fileName)map.get(ctx.fileName());
		 xqRelativePath rp = (xqRelativePath) map.get(ctx.relative_path());
		 xqAbsolutePathDouble xap = new xqAbsolutePathDouble(file,rp);
        System.out.println("Sriram is testing");
		 map.put(ctx,xap);
		
		
		
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDocument(xmlParser.DocumentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDocument(xmlParser.DocumentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFile_header(xmlParser.File_headerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFile_header(xmlParser.File_headerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFile_name(xmlParser.File_nameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFile_name(xmlParser.File_nameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRp_dotdot(xmlParser.Rp_dotdotContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRp_dotdot(xmlParser.Rp_dotdotContext ctx) {
		xqRelativePath rp=new xqRelativePath(ctx.getText());

		map.put(ctx,rp );
		
		
		
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRp_rp(xmlParser.Rp_rpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRp_rp(xmlParser.Rp_rpContext ctx) { 
		
		
		 xqRelativePath xql  = (xqRelativePath)map.get(ctx.relative_path().get(0));
		 xqRelativePath xqr = (xqRelativePath) map.get(ctx.relative_path().get(1));
		 String slash = "/";
		 xqRelativePath xqrp = new xqRelativePath(xql,slash,xql);
         System.out.println("Sriram is testing relative path");
         System.out.println(xqr.tagname + "single slash");
		 map.put(ctx,xqrp);
	
		
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRp_tag(xmlParser.Rp_tagContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRp_tag(xmlParser.Rp_tagContext ctx) { 
		
		String s = ctx.tagName().getText();
		xqRelativePath xrp = new xqRelativePath(s);
		map.put(ctx,xrp);
		
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRp_simple(xmlParser.Rp_simpleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRp_simple(xmlParser.Rp_simpleContext ctx) {
		 xqRelativePath xqr = (xqRelativePath) map.get(ctx.relative_path());
		
         System.out.println("Sriram is testing relative path bracket");
		 map.put(ctx,xqr);
		
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRp_descrp(xmlParser.Rp_descrpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRp_descrp(xmlParser.Rp_descrpContext ctx) { 
		
		
		 xqRelativePath xql  = (xqRelativePath)map.get(ctx.relative_path().get(0));
		 xqRelativePath xqr = (xqRelativePath) map.get(ctx.relative_path().get(1));
		 System.out.println(xqr.tagname);
		 String slash = "//";
		 xqRelativePath xqrp = new xqRelativePath(xql,slash,xqr);
         System.out.println("Sriram is testing relative path 222");
		 map.put(ctx,xqrp);		
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRp_dot(xmlParser.Rp_dotContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRp_dot(xmlParser.Rp_dotContext ctx) {
		
		xqRelativePath rp=new xqRelativePath(ctx.getText());
		System.out.println(ctx.getText()+"   dot");
		map.put(ctx,rp );
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRp_comma(xmlParser.Rp_commaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRp_comma(xmlParser.Rp_commaContext ctx) { 
		

		 xqRelativePath xql  = (xqRelativePath)map.get(ctx.relative_path().get(0));
		 xqRelativePath xqr = (xqRelativePath) map.get(ctx.relative_path().get(1));
		 System.out.println(xqr.tagname);
		 //String slash = "/";
		 xqRelativePath xqrp = new xqRelativePath(xql,xqr);
		 System.out.println("Sriram is testing relative path comma");
		 map.put(ctx,xqrp);
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRp_text(xmlParser.Rp_textContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRp_text(xmlParser.Rp_textContext ctx) {
		
		xqRelativePath rp=new xqRelativePath(ctx.getText());
		System.out.println("inside text");
		map.put(ctx, rp);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRp_attribute(xmlParser.Rp_attributeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRp_attribute(xmlParser.Rp_attributeContext ctx) { 
		
		xqRelativePath rp=new xqRelativePath(ctx.getText());
		System.out.println("inside attribute");
		map.put(ctx, rp);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRp_filter(xmlParser.Rp_filterContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRp_filter(xmlParser.Rp_filterContext ctx) { 
		
		 xqRelativePath xql  = (xqRelativePath)map.get(ctx.relative_path());
		 xqFilter xqf =  (xqFilter) map.get(ctx.filter());
		
		 xqRelativePath xqrp = new xqRelativePath(xql,xqf);
		 System.out.println("Sriram is testing relative path filter");
		 map.put(ctx,xqrp);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRp_anychild(xmlParser.Rp_anychildContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRp_anychild(xmlParser.Rp_anychildContext ctx) { 

		xqRelativePath rp=new xqRelativePath(ctx.getText());
		System.out.println(ctx.getText()+ "feh");
		map.put(ctx,rp );
	
		}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTag_name(xmlParser.Tag_nameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTag_name(xmlParser.Tag_nameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAtt_name(xmlParser.Att_nameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAtt_name(xmlParser.Att_nameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFilter_rp(xmlParser.Filter_rpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFilter_rp(xmlParser.Filter_rpContext ctx) { 
		
		xqRelativePath rp=(xqRelativePath) map.get(ctx.relative_path());
		xqFilter xqf= new xqFilter(rp);
		map.put(ctx,xqf);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFilter_eqeq(xmlParser.Filter_eqeqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFilter_eqeq(xmlParser.Filter_eqeqContext ctx) {
		xqRelativePath rpl = (xqRelativePath)map.get(ctx.relative_path().get(0));
		xqRelativePath rpr = (xqRelativePath)map.get(ctx.relative_path().get(1));
		String str = ctx.getChild(1).getText();
		 xqFilter xqFil =  new xqFilter(rpl,rpr,str);
		map.put(ctx, xqFil);

		
		
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFilter_and(xmlParser.Filter_andContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFilter_and(xmlParser.Filter_andContext ctx) {
		
		
		 xqFilter xql  = (xqFilter)map.get(ctx.filter().get(0));
		 xqFilter xqr  = (xqFilter)map.get(ctx.filter().get(1));

		System.out.println(xql + "left");
		System.out.println(xqr);
		String str = ctx.getChild(1).getText();
		System.out.println(str + "in filter and");
       xqFilter xqFil =  new xqFilter(xql,xqr,str);
       map.put(ctx, xqFil);	
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFilter_eq(xmlParser.Filter_eqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFilter_eq(xmlParser.Filter_eqContext ctx) { 
		
		xqRelativePath rpl = (xqRelativePath)map.get(ctx.relative_path().get(0));
		xqRelativePath rpr = (xqRelativePath)map.get(ctx.relative_path().get(1));
		String str = ctx.getChild(1).getText();
		
		 xqFilter xqFil =  new xqFilter(rpl,rpr,str);
		map.put(ctx, xqFil);
		System.out.println("This is eq filter test " + rpl.tagname);
		System.out.println("This is eq filter test " + rpr.tagname);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFilter_is(xmlParser.Filter_isContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFilter_is(xmlParser.Filter_isContext ctx) { 
		
		xqRelativePath rpl = (xqRelativePath)map.get(ctx.relative_path().get(0));
		xqRelativePath rpr = (xqRelativePath)map.get(ctx.relative_path().get(1));
		String str = ctx.getChild(1).getText();
		
		 xqFilter xqFil =  new xqFilter(rpl,rpr,str);
		map.put(ctx, xqFil);
		System.out.println("This is eq filter test " + rpl.tagname);
		System.out.println("This is eq filter test " + rpr.tagname);
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFilter_simple(xmlParser.Filter_simpleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFilter_simple(xmlParser.Filter_simpleContext ctx) { 
		
		 xqFilter xql  = (xqFilter)map.get(ctx.filter());
		System.out.println(xql +  "Node in simple");
		System.out.println(xql);
		String str = ctx.getChild(1).getText();
		System.out.println(str + "in filter simple");
       xqFilter xqFil =  new xqFilter(xql);
       map.put(ctx, xqFil);		
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFilter_equal(xmlParser.Filter_equalContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFilter_equal(xmlParser.Filter_equalContext ctx) {
		
		xqRelativePath rpl = (xqRelativePath)map.get(ctx.relative_path().get(0));
		xqRelativePath rpr = (xqRelativePath)map.get(ctx.relative_path().get(1));
		String str = ctx.getChild(1).getText();
		
		 xqFilter xqFil =  new xqFilter(rpl,rpr,str);
		map.put(ctx, xqFil);
		System.out.println("This is eq filter test " + rpl.tagname);
		System.out.println("This is eq filter test " + rpr.tagname);	
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFilter_or(xmlParser.Filter_orContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFilter_or(xmlParser.Filter_orContext ctx) {
		
		 xqFilter xql  = (xqFilter)map.get(ctx.filter().get(0));

		 xqFilter xqr  = (xqFilter)map.get(ctx.filter().get(1));

		System.out.println(xql);
		System.out.println(xqr);
		String str = ctx.getChild(1).getText();
		System.out.println(str + "in filter or");
        xqFilter xqFil =  new xqFilter(xql,xqr,str);
        map.put(ctx, xqFil);	
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFilter_not(xmlParser.Filter_notContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFilter_not(xmlParser.Filter_notContext ctx) {
		 xqFilter xql  = (xqFilter)map.get(ctx.filter());
		 String str = ctx.getChild(0).getText();
		 xqFilter xqFil =  new xqFilter(xql,str);
 
		 map.put(ctx, xqFil);		
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterHeaderString(xmlParser.HeaderStringContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitHeaderString(xmlParser.HeaderStringContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNameString(xmlParser.NameStringContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNameString(xmlParser.NameStringContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOpenBracket(xmlParser.OpenBracketContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOpenBracket(xmlParser.OpenBracketContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCloseBracket(xmlParser.CloseBracketContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCloseBracket(xmlParser.CloseBracketContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRewriteXq(xmlParser.RewriteXqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRewriteXq(xmlParser.RewriteXqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterXInd(xmlParser.XIndContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitXInd(xmlParser.XIndContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterX_ap(xmlParser.X_apContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitX_ap(xmlParser.X_apContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterX_join(xmlParser.X_joinContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitX_join(xmlParser.X_joinContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterXLet(xmlParser.XLetContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitXLet(xmlParser.XLetContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterX_var(xmlParser.X_varContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitX_var(xmlParser.X_varContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterX_desc(xmlParser.X_descContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitX_desc(xmlParser.X_descContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterX_state(xmlParser.X_stateContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitX_state(xmlParser.X_stateContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterX_slash(xmlParser.X_slashContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitX_slash(xmlParser.X_slashContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterX_node(xmlParser.X_nodeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitX_node(xmlParser.X_nodeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterX_simple(xmlParser.X_simpleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitX_simple(xmlParser.X_simpleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterX_str(xmlParser.X_strContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitX_str(xmlParser.X_strContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterList(xmlParser.ListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitList(xmlParser.ListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterId(xmlParser.IdContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitId(xmlParser.IdContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFor_j(xmlParser.For_jContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFor_j(xmlParser.For_jContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPathAp(xmlParser.PathApContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPathAp(xmlParser.PathApContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPathSlash(xmlParser.PathSlashContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPathSlash(xmlParser.PathSlashContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterJEq(xmlParser.JEqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitJEq(xmlParser.JEqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterJEqS(xmlParser.JEqSContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitJEqS(xmlParser.JEqSContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterJand(xmlParser.JandContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitJand(xmlParser.JandContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReturnJ(xmlParser.ReturnJContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReturnJ(xmlParser.ReturnJContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterForClause(xmlParser.ForClauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitForClause(xmlParser.ForClauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLetClause(xmlParser.LetClauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLetClause(xmlParser.LetClauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWhereClause(xmlParser.WhereClauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWhereClause(xmlParser.WhereClauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReturnClause(xmlParser.ReturnClauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReturnClause(xmlParser.ReturnClauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondEq(xmlParser.CondEqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondEq(xmlParser.CondEqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondIs(xmlParser.CondIsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondIs(xmlParser.CondIsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondSome(xmlParser.CondSomeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondSome(xmlParser.CondSomeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondEmp(xmlParser.CondEmpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondEmp(xmlParser.CondEmpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondAnd(xmlParser.CondAndContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondAnd(xmlParser.CondAndContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondOr(xmlParser.CondOrContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondOr(xmlParser.CondOrContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondPlain(xmlParser.CondPlainContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondPlain(xmlParser.CondPlainContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondNot(xmlParser.CondNotContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondNot(xmlParser.CondNotContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVar(xmlParser.VarContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVar(xmlParser.VarContext ctx) {
		
		 xqVariable var = new xqVariable(ctx.getText());
		 map.put(ctx,var);
		
		
		
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}
	
	
	
	



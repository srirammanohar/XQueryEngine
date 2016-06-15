// Generated from xml.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link xmlParser}.
 */
public interface xmlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link xmlParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(xmlParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(xmlParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apchild}
	 * labeled alternative in {@link xmlParser#absolute_path}.
	 * @param ctx the parse tree
	 */
	void enterApchild(xmlParser.ApchildContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apchild}
	 * labeled alternative in {@link xmlParser#absolute_path}.
	 * @param ctx the parse tree
	 */
	void exitApchild(xmlParser.ApchildContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apdesc}
	 * labeled alternative in {@link xmlParser#absolute_path}.
	 * @param ctx the parse tree
	 */
	void enterApdesc(xmlParser.ApdescContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apdesc}
	 * labeled alternative in {@link xmlParser#absolute_path}.
	 * @param ctx the parse tree
	 */
	void exitApdesc(xmlParser.ApdescContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(xmlParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(xmlParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code file_header}
	 * labeled alternative in {@link xmlParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFile_header(xmlParser.File_headerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code file_header}
	 * labeled alternative in {@link xmlParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFile_header(xmlParser.File_headerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code file_name}
	 * labeled alternative in {@link xmlParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFile_name(xmlParser.File_nameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code file_name}
	 * labeled alternative in {@link xmlParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFile_name(xmlParser.File_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_dotdot}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_dotdot(xmlParser.Rp_dotdotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_dotdot}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_dotdot(xmlParser.Rp_dotdotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_rp}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_rp(xmlParser.Rp_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_rp}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_rp(xmlParser.Rp_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_tag}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_tag(xmlParser.Rp_tagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_tag}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_tag(xmlParser.Rp_tagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_simple}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_simple(xmlParser.Rp_simpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_simple}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_simple(xmlParser.Rp_simpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_descrp}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_descrp(xmlParser.Rp_descrpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_descrp}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_descrp(xmlParser.Rp_descrpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_dot}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_dot(xmlParser.Rp_dotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_dot}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_dot(xmlParser.Rp_dotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_comma}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_comma(xmlParser.Rp_commaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_comma}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_comma(xmlParser.Rp_commaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_text}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_text(xmlParser.Rp_textContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_text}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_text(xmlParser.Rp_textContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_attribute}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_attribute(xmlParser.Rp_attributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_attribute}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_attribute(xmlParser.Rp_attributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_filter(xmlParser.Rp_filterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_filter(xmlParser.Rp_filterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_anychild}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_anychild(xmlParser.Rp_anychildContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_anychild}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_anychild(xmlParser.Rp_anychildContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tag_name}
	 * labeled alternative in {@link xmlParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTag_name(xmlParser.Tag_nameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tag_name}
	 * labeled alternative in {@link xmlParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTag_name(xmlParser.Tag_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code att_name}
	 * labeled alternative in {@link xmlParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAtt_name(xmlParser.Att_nameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code att_name}
	 * labeled alternative in {@link xmlParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAtt_name(xmlParser.Att_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_rp(xmlParser.Filter_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_rp(xmlParser.Filter_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_eqeq}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_eqeq(xmlParser.Filter_eqeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_eqeq}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_eqeq(xmlParser.Filter_eqeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_and(xmlParser.Filter_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_and(xmlParser.Filter_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_eq(xmlParser.Filter_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_eq(xmlParser.Filter_eqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_is(xmlParser.Filter_isContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_is(xmlParser.Filter_isContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_simple}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_simple(xmlParser.Filter_simpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_simple}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_simple(xmlParser.Filter_simpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_equal}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_equal(xmlParser.Filter_equalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_equal}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_equal(xmlParser.Filter_equalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_or(xmlParser.Filter_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_or(xmlParser.Filter_orContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_not(xmlParser.Filter_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_not(xmlParser.Filter_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#headerString}.
	 * @param ctx the parse tree
	 */
	void enterHeaderString(xmlParser.HeaderStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#headerString}.
	 * @param ctx the parse tree
	 */
	void exitHeaderString(xmlParser.HeaderStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#nameString}.
	 * @param ctx the parse tree
	 */
	void enterNameString(xmlParser.NameStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#nameString}.
	 * @param ctx the parse tree
	 */
	void exitNameString(xmlParser.NameStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#openBracket}.
	 * @param ctx the parse tree
	 */
	void enterOpenBracket(xmlParser.OpenBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#openBracket}.
	 * @param ctx the parse tree
	 */
	void exitOpenBracket(xmlParser.OpenBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#closeBracket}.
	 * @param ctx the parse tree
	 */
	void enterCloseBracket(xmlParser.CloseBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#closeBracket}.
	 * @param ctx the parse tree
	 */
	void exitCloseBracket(xmlParser.CloseBracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xInd}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterXInd(xmlParser.XIndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xInd}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitXInd(xmlParser.XIndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code x_ap}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterX_ap(xmlParser.X_apContext ctx);
	/**
	 * Exit a parse tree produced by the {@code x_ap}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitX_ap(xmlParser.X_apContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xLet}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterXLet(xmlParser.XLetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xLet}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitXLet(xmlParser.XLetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code x_var}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterX_var(xmlParser.X_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code x_var}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitX_var(xmlParser.X_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code x_desc}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterX_desc(xmlParser.X_descContext ctx);
	/**
	 * Exit a parse tree produced by the {@code x_desc}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitX_desc(xmlParser.X_descContext ctx);
	/**
	 * Enter a parse tree produced by the {@code x_state}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterX_state(xmlParser.X_stateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code x_state}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitX_state(xmlParser.X_stateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code x_slash}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterX_slash(xmlParser.X_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code x_slash}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitX_slash(xmlParser.X_slashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code x_node}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterX_node(xmlParser.X_nodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code x_node}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitX_node(xmlParser.X_nodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code x_simple}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterX_simple(xmlParser.X_simpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code x_simple}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitX_simple(xmlParser.X_simpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xJoin}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterXJoin(xmlParser.XJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xJoin}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitXJoin(xmlParser.XJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code x_str}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterX_str(xmlParser.X_strContext ctx);
	/**
	 * Exit a parse tree produced by the {@code x_str}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitX_str(xmlParser.X_strContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#joinattr}.
	 * @param ctx the parse tree
	 */
	void enterJoinattr(xmlParser.JoinattrContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#joinattr}.
	 * @param ctx the parse tree
	 */
	void exitJoinattr(xmlParser.JoinattrContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(xmlParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(xmlParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(xmlParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(xmlParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(xmlParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(xmlParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(xmlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(xmlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(xmlParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(xmlParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condEq}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondEq(xmlParser.CondEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condEq}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondEq(xmlParser.CondEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condIs}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondIs(xmlParser.CondIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condIs}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondIs(xmlParser.CondIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condSome}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondSome(xmlParser.CondSomeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condSome}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondSome(xmlParser.CondSomeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condEmp}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondEmp(xmlParser.CondEmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condEmp}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondEmp(xmlParser.CondEmpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condAnd}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondAnd(xmlParser.CondAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condAnd}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondAnd(xmlParser.CondAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condOr}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondOr(xmlParser.CondOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condOr}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondOr(xmlParser.CondOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condPlain}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondPlain(xmlParser.CondPlainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condPlain}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondPlain(xmlParser.CondPlainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condNot}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondNot(xmlParser.CondNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condNot}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondNot(xmlParser.CondNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(xmlParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(xmlParser.VarContext ctx);
}
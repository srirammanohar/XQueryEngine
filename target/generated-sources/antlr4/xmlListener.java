// Generated from xml.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link xmlParser}.
 */
public interface xmlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link xmlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(@NotNull xmlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(@NotNull xmlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#openBracket}.
	 * @param ctx the parse tree
	 */
	void enterOpenBracket(@NotNull xmlParser.OpenBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#openBracket}.
	 * @param ctx the parse tree
	 */
	void exitOpenBracket(@NotNull xmlParser.OpenBracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condPlain}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondPlain(@NotNull xmlParser.CondPlainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condPlain}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondPlain(@NotNull xmlParser.CondPlainContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#nameString}.
	 * @param ctx the parse tree
	 */
	void enterNameString(@NotNull xmlParser.NameStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#nameString}.
	 * @param ctx the parse tree
	 */
	void exitNameString(@NotNull xmlParser.NameStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_rp(@NotNull xmlParser.Filter_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_rp(@NotNull xmlParser.Filter_rpContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#closeBracket}.
	 * @param ctx the parse tree
	 */
	void enterCloseBracket(@NotNull xmlParser.CloseBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#closeBracket}.
	 * @param ctx the parse tree
	 */
	void exitCloseBracket(@NotNull xmlParser.CloseBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(@NotNull xmlParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(@NotNull xmlParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_dot}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_dot(@NotNull xmlParser.Rp_dotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_dot}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_dot(@NotNull xmlParser.Rp_dotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_text}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_text(@NotNull xmlParser.Rp_textContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_text}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_text(@NotNull xmlParser.Rp_textContext ctx);
	/**
	 * Enter a parse tree produced by the {@code x_state}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterX_state(@NotNull xmlParser.X_stateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code x_state}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitX_state(@NotNull xmlParser.X_stateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condOr}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondOr(@NotNull xmlParser.CondOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condOr}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondOr(@NotNull xmlParser.CondOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_simple}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_simple(@NotNull xmlParser.Filter_simpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_simple}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_simple(@NotNull xmlParser.Filter_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull xmlParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull xmlParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apdesc}
	 * labeled alternative in {@link xmlParser#absolute_path}.
	 * @param ctx the parse tree
	 */
	void enterApdesc(@NotNull xmlParser.ApdescContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apdesc}
	 * labeled alternative in {@link xmlParser#absolute_path}.
	 * @param ctx the parse tree
	 */
	void exitApdesc(@NotNull xmlParser.ApdescContext ctx);
	/**
	 * Enter a parse tree produced by the {@code x_join}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterX_join(@NotNull xmlParser.X_joinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code x_join}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitX_join(@NotNull xmlParser.X_joinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_eq(@NotNull xmlParser.Filter_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_eq(@NotNull xmlParser.Filter_eqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_rp}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_rp(@NotNull xmlParser.Rp_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_rp}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_rp(@NotNull xmlParser.Rp_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_is(@NotNull xmlParser.Filter_isContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_is(@NotNull xmlParser.Filter_isContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull xmlParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull xmlParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(@NotNull xmlParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(@NotNull xmlParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code x_var}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterX_var(@NotNull xmlParser.X_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code x_var}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitX_var(@NotNull xmlParser.X_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code file_header}
	 * labeled alternative in {@link xmlParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFile_header(@NotNull xmlParser.File_headerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code file_header}
	 * labeled alternative in {@link xmlParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFile_header(@NotNull xmlParser.File_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull xmlParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull xmlParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_anychild}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_anychild(@NotNull xmlParser.Rp_anychildContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_anychild}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_anychild(@NotNull xmlParser.Rp_anychildContext ctx);
	/**
	 * Enter a parse tree produced by the {@code x_str}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterX_str(@NotNull xmlParser.X_strContext ctx);
	/**
	 * Exit a parse tree produced by the {@code x_str}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitX_str(@NotNull xmlParser.X_strContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apchild}
	 * labeled alternative in {@link xmlParser#absolute_path}.
	 * @param ctx the parse tree
	 */
	void enterApchild(@NotNull xmlParser.ApchildContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apchild}
	 * labeled alternative in {@link xmlParser#absolute_path}.
	 * @param ctx the parse tree
	 */
	void exitApchild(@NotNull xmlParser.ApchildContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(@NotNull xmlParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(@NotNull xmlParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xLet}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterXLet(@NotNull xmlParser.XLetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xLet}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitXLet(@NotNull xmlParser.XLetContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#string_constant}.
	 * @param ctx the parse tree
	 */
	void enterString_constant(@NotNull xmlParser.String_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#string_constant}.
	 * @param ctx the parse tree
	 */
	void exitString_constant(@NotNull xmlParser.String_constantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_tag}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_tag(@NotNull xmlParser.Rp_tagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_tag}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_tag(@NotNull xmlParser.Rp_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(@NotNull xmlParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(@NotNull xmlParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condEq}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondEq(@NotNull xmlParser.CondEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condEq}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondEq(@NotNull xmlParser.CondEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_eqeq}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_eqeq(@NotNull xmlParser.Filter_eqeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_eqeq}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_eqeq(@NotNull xmlParser.Filter_eqeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condIs}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondIs(@NotNull xmlParser.CondIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condIs}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondIs(@NotNull xmlParser.CondIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_comma}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_comma(@NotNull xmlParser.Rp_commaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_comma}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_comma(@NotNull xmlParser.Rp_commaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code x_desc}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterX_desc(@NotNull xmlParser.X_descContext ctx);
	/**
	 * Exit a parse tree produced by the {@code x_desc}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitX_desc(@NotNull xmlParser.X_descContext ctx);
	/**
	 * Enter a parse tree produced by the {@code x_node}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterX_node(@NotNull xmlParser.X_nodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code x_node}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitX_node(@NotNull xmlParser.X_nodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code x_ap}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterX_ap(@NotNull xmlParser.X_apContext ctx);
	/**
	 * Exit a parse tree produced by the {@code x_ap}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitX_ap(@NotNull xmlParser.X_apContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_and(@NotNull xmlParser.Filter_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_and(@NotNull xmlParser.Filter_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_dotdot}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_dotdot(@NotNull xmlParser.Rp_dotdotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_dotdot}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_dotdot(@NotNull xmlParser.Rp_dotdotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code file_name}
	 * labeled alternative in {@link xmlParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFile_name(@NotNull xmlParser.File_nameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code file_name}
	 * labeled alternative in {@link xmlParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFile_name(@NotNull xmlParser.File_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_descrp}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_descrp(@NotNull xmlParser.Rp_descrpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_descrp}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_descrp(@NotNull xmlParser.Rp_descrpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tag_name}
	 * labeled alternative in {@link xmlParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTag_name(@NotNull xmlParser.Tag_nameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tag_name}
	 * labeled alternative in {@link xmlParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTag_name(@NotNull xmlParser.Tag_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_attribute}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_attribute(@NotNull xmlParser.Rp_attributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_attribute}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_attribute(@NotNull xmlParser.Rp_attributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condEmp}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondEmp(@NotNull xmlParser.CondEmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condEmp}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondEmp(@NotNull xmlParser.CondEmpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_filter(@NotNull xmlParser.Rp_filterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_filter(@NotNull xmlParser.Rp_filterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code att_name}
	 * labeled alternative in {@link xmlParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAtt_name(@NotNull xmlParser.Att_nameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code att_name}
	 * labeled alternative in {@link xmlParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAtt_name(@NotNull xmlParser.Att_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code x_simple}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterX_simple(@NotNull xmlParser.X_simpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code x_simple}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitX_simple(@NotNull xmlParser.X_simpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xInd}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterXInd(@NotNull xmlParser.XIndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xInd}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitXInd(@NotNull xmlParser.XIndContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#headerString}.
	 * @param ctx the parse tree
	 */
	void enterHeaderString(@NotNull xmlParser.HeaderStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#headerString}.
	 * @param ctx the parse tree
	 */
	void exitHeaderString(@NotNull xmlParser.HeaderStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condSome}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondSome(@NotNull xmlParser.CondSomeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condSome}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondSome(@NotNull xmlParser.CondSomeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_simple}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void enterRp_simple(@NotNull xmlParser.Rp_simpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_simple}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 */
	void exitRp_simple(@NotNull xmlParser.Rp_simpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code x_slash}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void enterX_slash(@NotNull xmlParser.X_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code x_slash}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 */
	void exitX_slash(@NotNull xmlParser.X_slashContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmlParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(@NotNull xmlParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmlParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(@NotNull xmlParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condAnd}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondAnd(@NotNull xmlParser.CondAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condAnd}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondAnd(@NotNull xmlParser.CondAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_equal}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_equal(@NotNull xmlParser.Filter_equalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_equal}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_equal(@NotNull xmlParser.Filter_equalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_or(@NotNull xmlParser.Filter_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_or(@NotNull xmlParser.Filter_orContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condNot}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondNot(@NotNull xmlParser.CondNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condNot}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondNot(@NotNull xmlParser.CondNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_not(@NotNull xmlParser.Filter_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_not(@NotNull xmlParser.Filter_notContext ctx);
}
// Generated from xml.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link xmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface xmlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link xmlParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(xmlParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code apchild}
	 * labeled alternative in {@link xmlParser#absolute_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApchild(xmlParser.ApchildContext ctx);
	/**
	 * Visit a parse tree produced by the {@code apdesc}
	 * labeled alternative in {@link xmlParser#absolute_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApdesc(xmlParser.ApdescContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(xmlParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code file_header}
	 * labeled alternative in {@link xmlParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_header(xmlParser.File_headerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code file_name}
	 * labeled alternative in {@link xmlParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(xmlParser.File_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_dotdot}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_dotdot(xmlParser.Rp_dotdotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_rp}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_rp(xmlParser.Rp_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_tag}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_tag(xmlParser.Rp_tagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_simple}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_simple(xmlParser.Rp_simpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_descrp}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_descrp(xmlParser.Rp_descrpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_dot}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_dot(xmlParser.Rp_dotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_comma}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_comma(xmlParser.Rp_commaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_text}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_text(xmlParser.Rp_textContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_attribute}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_attribute(xmlParser.Rp_attributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_filter(xmlParser.Rp_filterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_anychild}
	 * labeled alternative in {@link xmlParser#relative_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_anychild(xmlParser.Rp_anychildContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tag_name}
	 * labeled alternative in {@link xmlParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_name(xmlParser.Tag_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code att_name}
	 * labeled alternative in {@link xmlParser#attName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtt_name(xmlParser.Att_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_rp(xmlParser.Filter_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_eqeq}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_eqeq(xmlParser.Filter_eqeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_and(xmlParser.Filter_andContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_eq(xmlParser.Filter_eqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_is(xmlParser.Filter_isContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_simple}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_simple(xmlParser.Filter_simpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_equal}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_equal(xmlParser.Filter_equalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_or(xmlParser.Filter_orContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link xmlParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_not(xmlParser.Filter_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#headerString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderString(xmlParser.HeaderStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#nameString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameString(xmlParser.NameStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#openBracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenBracket(xmlParser.OpenBracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#closeBracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseBracket(xmlParser.CloseBracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xInd}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXInd(xmlParser.XIndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code x_ap}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_ap(xmlParser.X_apContext ctx);
	/**
	 * Visit a parse tree produced by the {@code x_join}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_join(xmlParser.X_joinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xLet}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXLet(xmlParser.XLetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code x_var}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_var(xmlParser.X_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code x_desc}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_desc(xmlParser.X_descContext ctx);
	/**
	 * Visit a parse tree produced by the {@code x_state}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_state(xmlParser.X_stateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code x_slash}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_slash(xmlParser.X_slashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code x_node}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_node(xmlParser.X_nodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code x_simple}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_simple(xmlParser.X_simpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code x_str}
	 * labeled alternative in {@link xmlParser#xquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX_str(xmlParser.X_strContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(xmlParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(xmlParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(xmlParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(xmlParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(xmlParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(xmlParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condEq}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondEq(xmlParser.CondEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condIs}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondIs(xmlParser.CondIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condSome}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondSome(xmlParser.CondSomeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condEmp}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondEmp(xmlParser.CondEmpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condAnd}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondAnd(xmlParser.CondAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condOr}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOr(xmlParser.CondOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condPlain}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondPlain(xmlParser.CondPlainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condNot}
	 * labeled alternative in {@link xmlParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondNot(xmlParser.CondNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(xmlParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmlParser#string_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_constant(xmlParser.String_constantContext ctx);
}
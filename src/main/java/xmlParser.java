// Generated from xml.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, AlphaNumeric=40, Id=41, String_constant=42, Ws=43, WHITESPACE=44;
	public static final int
		RULE_query = 0, RULE_absolute_path = 1, RULE_document = 2, RULE_fileName = 3, 
		RULE_relative_path = 4, RULE_tagName = 5, RULE_attName = 6, RULE_filter = 7, 
		RULE_headerString = 8, RULE_nameString = 9, RULE_openBracket = 10, RULE_closeBracket = 11, 
		RULE_oxquery = 12, RULE_xquery = 13, RULE_list = 14, RULE_id = 15, RULE_forJ = 16, 
		RULE_path = 17, RULE_condJ = 18, RULE_returnJ = 19, RULE_forClause = 20, 
		RULE_letClause = 21, RULE_whereClause = 22, RULE_returnClause = 23, RULE_cond = 24, 
		RULE_var = 25;
	public static final String[] ruleNames = {
		"query", "absolute_path", "document", "fileName", "relative_path", "tagName", 
		"attName", "filter", "headerString", "nameString", "openBracket", "closeBracket", 
		"oxquery", "xquery", "list", "id", "forJ", "path", "condJ", "returnJ", 
		"forClause", "letClause", "whereClause", "returnClause", "cond", "var"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'/'", "'//'", "'doc'", "'document'", "'DOC'", "'DOCUMENT'", "'*'", 
		"'.'", "'..'", "'text()'", "'@'", "'('", "')'", "'['", "']'", "','", "'='", 
		"'eq'", "'=='", "'is'", "'and'", "'or'", "'not'", "'for'", "'where'", 
		"'return'", "'<'", "'>'", "'{'", "'}'", "'</'", "'join'", "'in'", "'let'", 
		"':='", "'empty'", "'some'", "'satisfies'", "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "AlphaNumeric", "Id", "String_constant", "Ws", 
		"WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "xml.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public xmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public XqueryContext xquery() {
			return getRuleContext(XqueryContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			xquery(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Absolute_pathContext extends ParserRuleContext {
		public Absolute_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absolute_path; }
	 
		public Absolute_pathContext() { }
		public void copyFrom(Absolute_pathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ApchildContext extends Absolute_pathContext {
		public DocumentContext document() {
			return getRuleContext(DocumentContext.class,0);
		}
		public OpenBracketContext openBracket() {
			return getRuleContext(OpenBracketContext.class,0);
		}
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public CloseBracketContext closeBracket() {
			return getRuleContext(CloseBracketContext.class,0);
		}
		public Relative_pathContext relative_path() {
			return getRuleContext(Relative_pathContext.class,0);
		}
		public ApchildContext(Absolute_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterApchild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitApchild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitApchild(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApdescContext extends Absolute_pathContext {
		public DocumentContext document() {
			return getRuleContext(DocumentContext.class,0);
		}
		public OpenBracketContext openBracket() {
			return getRuleContext(OpenBracketContext.class,0);
		}
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public CloseBracketContext closeBracket() {
			return getRuleContext(CloseBracketContext.class,0);
		}
		public Relative_pathContext relative_path() {
			return getRuleContext(Relative_pathContext.class,0);
		}
		public ApdescContext(Absolute_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterApdesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitApdesc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitApdesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Absolute_pathContext absolute_path() throws RecognitionException {
		Absolute_pathContext _localctx = new Absolute_pathContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_absolute_path);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new ApchildContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				document();
				setState(55);
				openBracket();
				setState(56);
				fileName();
				setState(57);
				closeBracket();
				setState(58);
				match(T__0);
				setState(59);
				relative_path(0);
				}
				break;
			case 2:
				_localctx = new ApdescContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				document();
				setState(62);
				openBracket();
				setState(63);
				fileName();
				setState(64);
				closeBracket();
				setState(65);
				match(T__1);
				setState(66);
				relative_path(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DocumentContext extends ParserRuleContext {
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileNameContext extends ParserRuleContext {
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
	 
		public FileNameContext() { }
		public void copyFrom(FileNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class File_nameContext extends FileNameContext {
		public NameStringContext nameString() {
			return getRuleContext(NameStringContext.class,0);
		}
		public File_nameContext(FileNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterFile_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitFile_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitFile_name(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class File_headerContext extends FileNameContext {
		public HeaderStringContext headerString() {
			return getRuleContext(HeaderStringContext.class,0);
		}
		public File_headerContext(FileNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterFile_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitFile_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitFile_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fileName);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new File_headerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(72);
				headerString();
				}
				}
				break;
			case 2:
				_localctx = new File_nameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(73);
				nameString();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relative_pathContext extends ParserRuleContext {
		public Relative_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relative_path; }
	 
		public Relative_pathContext() { }
		public void copyFrom(Relative_pathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Rp_dotdotContext extends Relative_pathContext {
		public Rp_dotdotContext(Relative_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterRp_dotdot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitRp_dotdot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitRp_dotdot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_rpContext extends Relative_pathContext {
		public List<Relative_pathContext> relative_path() {
			return getRuleContexts(Relative_pathContext.class);
		}
		public Relative_pathContext relative_path(int i) {
			return getRuleContext(Relative_pathContext.class,i);
		}
		public Rp_rpContext(Relative_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterRp_rp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitRp_rp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitRp_rp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_tagContext extends Relative_pathContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public Rp_tagContext(Relative_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterRp_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitRp_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitRp_tag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_simpleContext extends Relative_pathContext {
		public Relative_pathContext relative_path() {
			return getRuleContext(Relative_pathContext.class,0);
		}
		public Rp_simpleContext(Relative_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterRp_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitRp_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitRp_simple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_descrpContext extends Relative_pathContext {
		public List<Relative_pathContext> relative_path() {
			return getRuleContexts(Relative_pathContext.class);
		}
		public Relative_pathContext relative_path(int i) {
			return getRuleContext(Relative_pathContext.class,i);
		}
		public Rp_descrpContext(Relative_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterRp_descrp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitRp_descrp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitRp_descrp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_dotContext extends Relative_pathContext {
		public Rp_dotContext(Relative_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterRp_dot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitRp_dot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitRp_dot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_commaContext extends Relative_pathContext {
		public List<Relative_pathContext> relative_path() {
			return getRuleContexts(Relative_pathContext.class);
		}
		public Relative_pathContext relative_path(int i) {
			return getRuleContext(Relative_pathContext.class,i);
		}
		public Rp_commaContext(Relative_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterRp_comma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitRp_comma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitRp_comma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_textContext extends Relative_pathContext {
		public Rp_textContext(Relative_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterRp_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitRp_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitRp_text(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_attributeContext extends Relative_pathContext {
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public Rp_attributeContext(Relative_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterRp_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitRp_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitRp_attribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_filterContext extends Relative_pathContext {
		public Relative_pathContext relative_path() {
			return getRuleContext(Relative_pathContext.class,0);
		}
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public Rp_filterContext(Relative_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterRp_filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitRp_filter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitRp_filter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_anychildContext extends Relative_pathContext {
		public Rp_anychildContext(Relative_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterRp_anychild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitRp_anychild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitRp_anychild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relative_pathContext relative_path() throws RecognitionException {
		return relative_path(0);
	}

	private Relative_pathContext relative_path(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Relative_pathContext _localctx = new Relative_pathContext(_ctx, _parentState);
		Relative_pathContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_relative_path, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			switch (_input.LA(1)) {
			case AlphaNumeric:
				{
				_localctx = new Rp_tagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(77);
				tagName();
				}
				break;
			case T__6:
				{
				_localctx = new Rp_anychildContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(T__6);
				}
				break;
			case T__7:
				{
				_localctx = new Rp_dotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(T__7);
				}
				break;
			case T__8:
				{
				_localctx = new Rp_dotdotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				match(T__8);
				}
				break;
			case T__9:
				{
				_localctx = new Rp_textContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(T__9);
				}
				break;
			case T__10:
				{
				_localctx = new Rp_attributeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(T__10);
				setState(83);
				attName();
				}
				break;
			case T__11:
				{
				_localctx = new Rp_simpleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(T__11);
				setState(85);
				relative_path(0);
				setState(86);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(104);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Rp_rpContext(new Relative_pathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relative_path);
						setState(90);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(91);
						match(T__0);
						setState(92);
						relative_path(5);
						}
						break;
					case 2:
						{
						_localctx = new Rp_descrpContext(new Relative_pathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relative_path);
						setState(93);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(94);
						match(T__1);
						setState(95);
						relative_path(4);
						}
						break;
					case 3:
						{
						_localctx = new Rp_commaContext(new Relative_pathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relative_path);
						setState(96);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(97);
						match(T__15);
						setState(98);
						relative_path(2);
						}
						break;
					case 4:
						{
						_localctx = new Rp_filterContext(new Relative_pathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relative_path);
						setState(99);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(100);
						match(T__13);
						setState(101);
						filter(0);
						setState(102);
						match(T__14);
						}
						break;
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TagNameContext extends ParserRuleContext {
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
	 
		public TagNameContext() { }
		public void copyFrom(TagNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Tag_nameContext extends TagNameContext {
		public NameStringContext nameString() {
			return getRuleContext(NameStringContext.class,0);
		}
		public Tag_nameContext(TagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterTag_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitTag_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitTag_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tagName);
		try {
			_localctx = new Tag_nameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			nameString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttNameContext extends ParserRuleContext {
		public AttNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attName; }
	 
		public AttNameContext() { }
		public void copyFrom(AttNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Att_nameContext extends AttNameContext {
		public NameStringContext nameString() {
			return getRuleContext(NameStringContext.class,0);
		}
		public Att_nameContext(AttNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterAtt_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitAtt_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitAtt_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttNameContext attName() throws RecognitionException {
		AttNameContext _localctx = new AttNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attName);
		try {
			_localctx = new Att_nameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			nameString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
	 
		public FilterContext() { }
		public void copyFrom(FilterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Filter_rpContext extends FilterContext {
		public Relative_pathContext relative_path() {
			return getRuleContext(Relative_pathContext.class,0);
		}
		public Filter_rpContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterFilter_rp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitFilter_rp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitFilter_rp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_eqeqContext extends FilterContext {
		public List<Relative_pathContext> relative_path() {
			return getRuleContexts(Relative_pathContext.class);
		}
		public Relative_pathContext relative_path(int i) {
			return getRuleContext(Relative_pathContext.class,i);
		}
		public Filter_eqeqContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterFilter_eqeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitFilter_eqeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitFilter_eqeq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_andContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public Filter_andContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterFilter_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitFilter_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitFilter_and(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_eqContext extends FilterContext {
		public List<Relative_pathContext> relative_path() {
			return getRuleContexts(Relative_pathContext.class);
		}
		public Relative_pathContext relative_path(int i) {
			return getRuleContext(Relative_pathContext.class,i);
		}
		public Filter_eqContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterFilter_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitFilter_eq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitFilter_eq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_isContext extends FilterContext {
		public List<Relative_pathContext> relative_path() {
			return getRuleContexts(Relative_pathContext.class);
		}
		public Relative_pathContext relative_path(int i) {
			return getRuleContext(Relative_pathContext.class,i);
		}
		public Filter_isContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterFilter_is(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitFilter_is(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitFilter_is(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_simpleContext extends FilterContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public Filter_simpleContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterFilter_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitFilter_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitFilter_simple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_equalContext extends FilterContext {
		public List<Relative_pathContext> relative_path() {
			return getRuleContexts(Relative_pathContext.class);
		}
		public Relative_pathContext relative_path(int i) {
			return getRuleContext(Relative_pathContext.class,i);
		}
		public Filter_equalContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterFilter_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitFilter_equal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitFilter_equal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_orContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public Filter_orContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterFilter_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitFilter_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitFilter_or(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_notContext extends FilterContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public Filter_notContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterFilter_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitFilter_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitFilter_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		return filter(0);
	}

	private FilterContext filter(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FilterContext _localctx = new FilterContext(_ctx, _parentState);
		FilterContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_filter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new Filter_rpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(114);
				relative_path(0);
				}
				break;
			case 2:
				{
				_localctx = new Filter_equalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				relative_path(0);
				setState(116);
				match(T__16);
				setState(117);
				relative_path(0);
				}
				break;
			case 3:
				{
				_localctx = new Filter_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				relative_path(0);
				setState(120);
				match(T__17);
				setState(121);
				relative_path(0);
				}
				break;
			case 4:
				{
				_localctx = new Filter_eqeqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				relative_path(0);
				setState(124);
				match(T__18);
				setState(125);
				relative_path(0);
				}
				break;
			case 5:
				{
				_localctx = new Filter_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				relative_path(0);
				setState(128);
				match(T__19);
				setState(129);
				relative_path(0);
				}
				break;
			case 6:
				{
				_localctx = new Filter_simpleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(T__11);
				setState(132);
				filter(0);
				setState(133);
				match(T__12);
				}
				break;
			case 7:
				{
				_localctx = new Filter_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(T__22);
				setState(136);
				filter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Filter_andContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(139);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(140);
						match(T__20);
						setState(141);
						filter(4);
						}
						break;
					case 2:
						{
						_localctx = new Filter_orContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(142);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(143);
						match(T__21);
						setState(144);
						filter(3);
						}
						break;
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class HeaderStringContext extends ParserRuleContext {
		public TerminalNode AlphaNumeric() { return getToken(xmlParser.AlphaNumeric, 0); }
		public HeaderStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterHeaderString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitHeaderString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitHeaderString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderStringContext headerString() throws RecognitionException {
		HeaderStringContext _localctx = new HeaderStringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_headerString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(AlphaNumeric);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameStringContext extends ParserRuleContext {
		public TerminalNode AlphaNumeric() { return getToken(xmlParser.AlphaNumeric, 0); }
		public NameStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterNameString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitNameString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitNameString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameStringContext nameString() throws RecognitionException {
		NameStringContext _localctx = new NameStringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nameString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(AlphaNumeric);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenBracketContext extends ParserRuleContext {
		public OpenBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterOpenBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitOpenBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitOpenBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenBracketContext openBracket() throws RecognitionException {
		OpenBracketContext _localctx = new OpenBracketContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_openBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CloseBracketContext extends ParserRuleContext {
		public CloseBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterCloseBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitCloseBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitCloseBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseBracketContext closeBracket() throws RecognitionException {
		CloseBracketContext _localctx = new CloseBracketContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_closeBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OxqueryContext extends ParserRuleContext {
		public OxqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oxquery; }
	 
		public OxqueryContext() { }
		public void copyFrom(OxqueryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RewriteXqContext extends OxqueryContext {
		public ForJContext forJ() {
			return getRuleContext(ForJContext.class,0);
		}
		public CondJContext condJ() {
			return getRuleContext(CondJContext.class,0);
		}
		public ReturnJContext returnJ() {
			return getRuleContext(ReturnJContext.class,0);
		}
		public RewriteXqContext(OxqueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterRewriteXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitRewriteXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitRewriteXq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OxqueryContext oxquery() throws RecognitionException {
		OxqueryContext _localctx = new OxqueryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_oxquery);
		try {
			_localctx = new RewriteXqContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__23);
			setState(159);
			forJ();
			setState(160);
			match(T__24);
			setState(161);
			condJ(0);
			setState(162);
			match(T__25);
			setState(163);
			returnJ(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XqueryContext extends ParserRuleContext {
		public XqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xquery; }
	 
		public XqueryContext() { }
		public void copyFrom(XqueryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XIndContext extends XqueryContext {
		public List<XqueryContext> xquery() {
			return getRuleContexts(XqueryContext.class);
		}
		public XqueryContext xquery(int i) {
			return getRuleContext(XqueryContext.class,i);
		}
		public XIndContext(XqueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterXInd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitXInd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitXInd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class X_apContext extends XqueryContext {
		public Absolute_pathContext absolute_path() {
			return getRuleContext(Absolute_pathContext.class,0);
		}
		public X_apContext(XqueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterX_ap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitX_ap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitX_ap(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class X_joinContext extends XqueryContext {
		public XqueryContext left;
		public XqueryContext right;
		public ListContext leftlist;
		public ListContext rightlist;
		public List<XqueryContext> xquery() {
			return getRuleContexts(XqueryContext.class);
		}
		public XqueryContext xquery(int i) {
			return getRuleContext(XqueryContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public X_joinContext(XqueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterX_join(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitX_join(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitX_join(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XLetContext extends XqueryContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqueryContext xquery() {
			return getRuleContext(XqueryContext.class,0);
		}
		public XLetContext(XqueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterXLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitXLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitXLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class X_varContext extends XqueryContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public X_varContext(XqueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterX_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitX_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitX_var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class X_descContext extends XqueryContext {
		public XqueryContext xquery() {
			return getRuleContext(XqueryContext.class,0);
		}
		public Relative_pathContext relative_path() {
			return getRuleContext(Relative_pathContext.class,0);
		}
		public X_descContext(XqueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterX_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitX_desc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitX_desc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class X_stateContext extends XqueryContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public X_stateContext(XqueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterX_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitX_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitX_state(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class X_slashContext extends XqueryContext {
		public XqueryContext xquery() {
			return getRuleContext(XqueryContext.class,0);
		}
		public Relative_pathContext relative_path() {
			return getRuleContext(Relative_pathContext.class,0);
		}
		public X_slashContext(XqueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterX_slash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitX_slash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitX_slash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class X_nodeContext extends XqueryContext {
		public Token lt;
		public Token rt;
		public XqueryContext xquery() {
			return getRuleContext(XqueryContext.class,0);
		}
		public List<TerminalNode> Id() { return getTokens(xmlParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(xmlParser.Id, i);
		}
		public X_nodeContext(XqueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterX_node(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitX_node(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitX_node(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class X_simpleContext extends XqueryContext {
		public XqueryContext xquery() {
			return getRuleContext(XqueryContext.class,0);
		}
		public X_simpleContext(XqueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterX_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitX_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitX_simple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class X_strContext extends XqueryContext {
		public TerminalNode String_constant() { return getToken(xmlParser.String_constant, 0); }
		public X_strContext(XqueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterX_str(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitX_str(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitX_str(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqueryContext xquery() throws RecognitionException {
		return xquery(0);
	}

	private XqueryContext xquery(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqueryContext _localctx = new XqueryContext(_ctx, _parentState);
		XqueryContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_xquery, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			switch (_input.LA(1)) {
			case T__38:
				{
				_localctx = new X_varContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(166);
				var();
				}
				break;
			case String_constant:
				{
				_localctx = new X_strContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(String_constant);
				}
				break;
			case T__2:
			case T__3:
			case T__4:
			case T__5:
				{
				_localctx = new X_apContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				absolute_path();
				}
				break;
			case T__11:
				{
				_localctx = new X_simpleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(T__11);
				setState(170);
				xquery(0);
				setState(171);
				match(T__12);
				}
				break;
			case T__26:
				{
				_localctx = new X_nodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(T__26);
				setState(174);
				((X_nodeContext)_localctx).lt = match(Id);
				setState(175);
				match(T__27);
				setState(176);
				match(T__28);
				setState(177);
				xquery(0);
				setState(178);
				match(T__29);
				setState(179);
				match(T__30);
				setState(180);
				((X_nodeContext)_localctx).rt = match(Id);
				setState(181);
				match(T__27);
				}
				break;
			case T__23:
				{
				_localctx = new X_stateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				forClause();
				setState(185);
				_la = _input.LA(1);
				if (_la==T__33) {
					{
					setState(184);
					letClause();
					}
				}

				setState(188);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(187);
					whereClause();
					}
				}

				setState(190);
				returnClause();
				}
				break;
			case T__33:
				{
				_localctx = new XLetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				letClause();
				setState(193);
				xquery(2);
				}
				break;
			case T__31:
				{
				_localctx = new X_joinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(T__31);
				setState(196);
				match(T__11);
				setState(197);
				((X_joinContext)_localctx).left = xquery(0);
				setState(198);
				match(T__15);
				setState(199);
				((X_joinContext)_localctx).right = xquery(0);
				setState(200);
				match(T__15);
				setState(201);
				((X_joinContext)_localctx).leftlist = list();
				setState(202);
				match(T__15);
				setState(203);
				((X_joinContext)_localctx).rightlist = list();
				setState(204);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(217);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new XIndContext(new XqueryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xquery);
						setState(208);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(209);
						match(T__15);
						setState(210);
						xquery(8);
						}
						break;
					case 2:
						{
						_localctx = new X_slashContext(new XqueryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xquery);
						setState(211);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(212);
						match(T__0);
						setState(213);
						relative_path(0);
						}
						break;
					case 3:
						{
						_localctx = new X_descContext(new XqueryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xquery);
						setState(214);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(215);
						match(T__1);
						setState(216);
						relative_path(0);
						}
						break;
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__13);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AlphaNumeric) {
				{
				{
				setState(223);
				id();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(224);
					match(T__15);
					setState(225);
					id();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode AlphaNumeric() { return getToken(xmlParser.AlphaNumeric, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(AlphaNumeric);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForJContext extends ParserRuleContext {
		public ForJContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forJ; }
	 
		public ForJContext() { }
		public void copyFrom(ForJContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class For_jContext extends ForJContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<PathContext> path() {
			return getRuleContexts(PathContext.class);
		}
		public PathContext path(int i) {
			return getRuleContext(PathContext.class,i);
		}
		public For_jContext(ForJContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterFor_j(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitFor_j(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitFor_j(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForJContext forJ() throws RecognitionException {
		ForJContext _localctx = new ForJContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forJ);
		int _la;
		try {
			_localctx = new For_jContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			var();
			setState(241);
			match(T__32);
			setState(242);
			path();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(243);
				match(T__15);
				setState(244);
				var();
				setState(245);
				match(T__32);
				setState(246);
				path();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
	 
		public PathContext() { }
		public void copyFrom(PathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PathSlashContext extends PathContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Relative_pathContext relative_path() {
			return getRuleContext(Relative_pathContext.class,0);
		}
		public PathSlashContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterPathSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitPathSlash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitPathSlash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PathApContext extends PathContext {
		public Absolute_pathContext absolute_path() {
			return getRuleContext(Absolute_pathContext.class,0);
		}
		public PathApContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterPathAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitPathAp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitPathAp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_path);
		int _la;
		try {
			setState(258);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case T__5:
				_localctx = new PathApContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				absolute_path();
				}
				break;
			case T__38:
				_localctx = new PathSlashContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				var();
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(256);
				relative_path(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondJContext extends ParserRuleContext {
		public CondJContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condJ; }
	 
		public CondJContext() { }
		public void copyFrom(CondJContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JEqContext extends CondJContext {
		public VarContext left;
		public VarContext right;
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public JEqContext(CondJContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterJEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitJEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitJEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JEqSContext extends CondJContext {
		public VarContext lt;
		public Token rt;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode String_constant() { return getToken(xmlParser.String_constant, 0); }
		public JEqSContext(CondJContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterJEqS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitJEqS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitJEqS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JandContext extends CondJContext {
		public CondJContext left;
		public CondJContext right;
		public List<CondJContext> condJ() {
			return getRuleContexts(CondJContext.class);
		}
		public CondJContext condJ(int i) {
			return getRuleContext(CondJContext.class,i);
		}
		public JandContext(CondJContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterJand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitJand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitJand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondJContext condJ() throws RecognitionException {
		return condJ(0);
	}

	private CondJContext condJ(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondJContext _localctx = new CondJContext(_ctx, _parentState);
		CondJContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_condJ, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new JEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(261);
				((JEqContext)_localctx).left = var();
				setState(262);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(263);
				((JEqContext)_localctx).right = var();
				}
				break;
			case 2:
				{
				_localctx = new JEqSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265);
				((JEqSContext)_localctx).lt = var();
				setState(266);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(267);
				((JEqSContext)_localctx).rt = match(String_constant);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JandContext(new CondJContext(_parentctx, _parentState));
					((JandContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_condJ);
					setState(271);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(272);
					match(T__20);
					setState(273);
					((JandContext)_localctx).right = condJ(2);
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ReturnJContext extends ParserRuleContext {
		public Token lt;
		public Token rt;
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<ReturnJContext> returnJ() {
			return getRuleContexts(ReturnJContext.class);
		}
		public ReturnJContext returnJ(int i) {
			return getRuleContext(ReturnJContext.class,i);
		}
		public List<TerminalNode> Id() { return getTokens(xmlParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(xmlParser.Id, i);
		}
		public ReturnJContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnJ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterReturnJ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitReturnJ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitReturnJ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnJContext returnJ() throws RecognitionException {
		return returnJ(0);
	}

	private ReturnJContext returnJ(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ReturnJContext _localctx = new ReturnJContext(_ctx, _parentState);
		ReturnJContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_returnJ, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(280);
				path();
				}
				break;
			case 2:
				{
				setState(281);
				var();
				}
				break;
			case 3:
				{
				setState(282);
				match(T__11);
				setState(283);
				returnJ(0);
				setState(284);
				match(T__12);
				setState(285);
				match(T__15);
				setState(286);
				match(T__11);
				setState(287);
				returnJ(0);
				setState(288);
				match(T__12);
				}
				break;
			case 4:
				{
				setState(290);
				match(T__26);
				setState(291);
				((ReturnJContext)_localctx).lt = match(Id);
				setState(292);
				match(T__27);
				setState(293);
				match(T__28);
				setState(294);
				returnJ(0);
				setState(295);
				match(T__29);
				setState(296);
				match(T__30);
				setState(297);
				((ReturnJContext)_localctx).rt = match(Id);
				setState(298);
				match(T__27);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ReturnJContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_returnJ);
					setState(302);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(303);
					match(T__15);
					setState(304);
					returnJ(3);
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ForClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqueryContext> xquery() {
			return getRuleContexts(XqueryContext.class);
		}
		public XqueryContext xquery(int i) {
			return getRuleContext(XqueryContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__23);
			setState(311);
			var();
			setState(312);
			match(T__32);
			setState(313);
			xquery(0);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(314);
				match(T__15);
				setState(315);
				var();
				setState(316);
				match(T__32);
				setState(317);
				xquery(0);
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqueryContext> xquery() {
			return getRuleContexts(XqueryContext.class);
		}
		public XqueryContext xquery(int i) {
			return getRuleContext(XqueryContext.class,i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__33);
			setState(325);
			var();
			setState(326);
			match(T__34);
			setState(327);
			xquery(0);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(328);
				match(T__15);
				setState(329);
				var();
				setState(330);
				match(T__34);
				setState(331);
				xquery(0);
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(T__24);
			setState(339);
			cond(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnClauseContext extends ParserRuleContext {
		public XqueryContext xquery() {
			return getRuleContext(XqueryContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__25);
			setState(342);
			xquery(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondEqContext extends CondContext {
		public XqueryContext left;
		public XqueryContext right;
		public List<XqueryContext> xquery() {
			return getRuleContexts(XqueryContext.class);
		}
		public XqueryContext xquery(int i) {
			return getRuleContext(XqueryContext.class,i);
		}
		public CondEqContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterCondEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitCondEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitCondEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondIsContext extends CondContext {
		public XqueryContext left;
		public XqueryContext right;
		public List<XqueryContext> xquery() {
			return getRuleContexts(XqueryContext.class);
		}
		public XqueryContext xquery(int i) {
			return getRuleContext(XqueryContext.class,i);
		}
		public CondIsContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterCondIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitCondIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitCondIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondSomeContext extends CondContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqueryContext> xquery() {
			return getRuleContexts(XqueryContext.class);
		}
		public XqueryContext xquery(int i) {
			return getRuleContext(XqueryContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondSomeContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterCondSome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitCondSome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitCondSome(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondEmpContext extends CondContext {
		public XqueryContext xquery() {
			return getRuleContext(XqueryContext.class,0);
		}
		public CondEmpContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterCondEmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitCondEmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitCondEmp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondAndContext extends CondContext {
		public CondContext left;
		public CondContext right;
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondAndContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterCondAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitCondAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitCondAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondOrContext extends CondContext {
		public CondContext left;
		public CondContext right;
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondOrContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterCondOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitCondOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitCondOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondPlainContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondPlainContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterCondPlain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitCondPlain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitCondPlain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondNotContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondNotContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterCondNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitCondNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitCondNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new CondEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(345);
				((CondEqContext)_localctx).left = xquery(0);
				setState(346);
				match(T__16);
				setState(347);
				((CondEqContext)_localctx).right = xquery(0);
				}
				break;
			case 2:
				{
				_localctx = new CondEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(349);
				((CondEqContext)_localctx).left = xquery(0);
				setState(350);
				match(T__17);
				setState(351);
				((CondEqContext)_localctx).right = xquery(0);
				}
				break;
			case 3:
				{
				_localctx = new CondIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(353);
				((CondIsContext)_localctx).left = xquery(0);
				setState(354);
				match(T__18);
				setState(355);
				((CondIsContext)_localctx).right = xquery(0);
				}
				break;
			case 4:
				{
				_localctx = new CondIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(357);
				((CondIsContext)_localctx).left = xquery(0);
				setState(358);
				match(T__19);
				setState(359);
				((CondIsContext)_localctx).right = xquery(0);
				}
				break;
			case 5:
				{
				_localctx = new CondEmpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(361);
				match(T__35);
				setState(362);
				match(T__11);
				setState(363);
				xquery(0);
				setState(364);
				match(T__12);
				}
				break;
			case 6:
				{
				_localctx = new CondSomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366);
				match(T__36);
				setState(367);
				var();
				setState(368);
				match(T__32);
				setState(369);
				xquery(0);
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(370);
					match(T__15);
					setState(371);
					var();
					setState(372);
					match(T__32);
					setState(373);
					xquery(0);
					}
					}
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(380);
				match(T__37);
				setState(381);
				cond(5);
				}
				break;
			case 7:
				{
				_localctx = new CondPlainContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(383);
				match(T__11);
				setState(384);
				cond(0);
				setState(385);
				match(T__12);
				}
				break;
			case 8:
				{
				_localctx = new CondNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(387);
				match(T__22);
				setState(388);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(397);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndContext(new CondContext(_parentctx, _parentState));
						((CondAndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(391);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(392);
						match(T__20);
						setState(393);
						((CondAndContext)_localctx).right = cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOrContext(new CondContext(_parentctx, _parentState));
						((CondOrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(394);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(395);
						match(T__21);
						setState(396);
						((CondOrContext)_localctx).right = cond(3);
						}
						break;
					}
					} 
				}
				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode AlphaNumeric() { return getToken(xmlParser.AlphaNumeric, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(T__38);
			setState(403);
			match(AlphaNumeric);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return relative_path_sempred((Relative_pathContext)_localctx, predIndex);
		case 7:
			return filter_sempred((FilterContext)_localctx, predIndex);
		case 13:
			return xquery_sempred((XqueryContext)_localctx, predIndex);
		case 18:
			return condJ_sempred((CondJContext)_localctx, predIndex);
		case 19:
			return returnJ_sempred((ReturnJContext)_localctx, predIndex);
		case 24:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean relative_path_sempred(Relative_pathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean filter_sempred(FilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean xquery_sempred(XqueryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean condJ_sempred(CondJContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean returnJ_sempred(ReturnJContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0198\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3G\n\3\3\4\3\4\3\5\3\5\5\5M\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u008c\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0094\n\t"+
		"\f\t\16\t\u0097\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bc\n\17\3\17"+
		"\5\17\u00bf\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00d1\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u00dc\n\17\f\17\16\17\u00df\13\17\3\20\3\20\3\20"+
		"\3\20\7\20\u00e5\n\20\f\20\16\20\u00e8\13\20\7\20\u00ea\n\20\f\20\16\20"+
		"\u00ed\13\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\7\22\u00fb\n\22\f\22\16\22\u00fe\13\22\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u0105\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0110"+
		"\n\24\3\24\3\24\3\24\7\24\u0115\n\24\f\24\16\24\u0118\13\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u012f\n\25\3\25\3\25\3\25\7\25\u0134\n"+
		"\25\f\25\16\25\u0137\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u0142\n\26\f\26\16\26\u0145\13\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\7\27\u0150\n\27\f\27\16\27\u0153\13\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u017a\n\32\f\32\16\32\u017d\13\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0188\n\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\7\32\u0190\n\32\f\32\16\32\u0193\13\32\3\33\3\33"+
		"\3\33\3\33\2\b\n\20\34&(\62\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\2\5\3\2\5\b\3\2\3\4\3\2\23\24\u01b3\2\66\3\2\2\2\4"+
		"F\3\2\2\2\6H\3\2\2\2\bL\3\2\2\2\nZ\3\2\2\2\fo\3\2\2\2\16q\3\2\2\2\20\u008b"+
		"\3\2\2\2\22\u0098\3\2\2\2\24\u009a\3\2\2\2\26\u009c\3\2\2\2\30\u009e\3"+
		"\2\2\2\32\u00a0\3\2\2\2\34\u00d0\3\2\2\2\36\u00e0\3\2\2\2 \u00f0\3\2\2"+
		"\2\"\u00f2\3\2\2\2$\u0104\3\2\2\2&\u010f\3\2\2\2(\u012e\3\2\2\2*\u0138"+
		"\3\2\2\2,\u0146\3\2\2\2.\u0154\3\2\2\2\60\u0157\3\2\2\2\62\u0187\3\2\2"+
		"\2\64\u0194\3\2\2\2\66\67\5\34\17\2\67\3\3\2\2\289\5\6\4\29:\5\26\f\2"+
		":;\5\b\5\2;<\5\30\r\2<=\7\3\2\2=>\5\n\6\2>G\3\2\2\2?@\5\6\4\2@A\5\26\f"+
		"\2AB\5\b\5\2BC\5\30\r\2CD\7\4\2\2DE\5\n\6\2EG\3\2\2\2F8\3\2\2\2F?\3\2"+
		"\2\2G\5\3\2\2\2HI\t\2\2\2I\7\3\2\2\2JM\5\22\n\2KM\5\24\13\2LJ\3\2\2\2"+
		"LK\3\2\2\2M\t\3\2\2\2NO\b\6\1\2O[\5\f\7\2P[\7\t\2\2Q[\7\n\2\2R[\7\13\2"+
		"\2S[\7\f\2\2TU\7\r\2\2U[\5\16\b\2VW\7\16\2\2WX\5\n\6\2XY\7\17\2\2Y[\3"+
		"\2\2\2ZN\3\2\2\2ZP\3\2\2\2ZQ\3\2\2\2ZR\3\2\2\2ZS\3\2\2\2ZT\3\2\2\2ZV\3"+
		"\2\2\2[l\3\2\2\2\\]\f\6\2\2]^\7\3\2\2^k\5\n\6\7_`\f\5\2\2`a\7\4\2\2ak"+
		"\5\n\6\6bc\f\3\2\2cd\7\22\2\2dk\5\n\6\4ef\f\4\2\2fg\7\20\2\2gh\5\20\t"+
		"\2hi\7\21\2\2ik\3\2\2\2j\\\3\2\2\2j_\3\2\2\2jb\3\2\2\2je\3\2\2\2kn\3\2"+
		"\2\2lj\3\2\2\2lm\3\2\2\2m\13\3\2\2\2nl\3\2\2\2op\5\24\13\2p\r\3\2\2\2"+
		"qr\5\24\13\2r\17\3\2\2\2st\b\t\1\2t\u008c\5\n\6\2uv\5\n\6\2vw\7\23\2\2"+
		"wx\5\n\6\2x\u008c\3\2\2\2yz\5\n\6\2z{\7\24\2\2{|\5\n\6\2|\u008c\3\2\2"+
		"\2}~\5\n\6\2~\177\7\25\2\2\177\u0080\5\n\6\2\u0080\u008c\3\2\2\2\u0081"+
		"\u0082\5\n\6\2\u0082\u0083\7\26\2\2\u0083\u0084\5\n\6\2\u0084\u008c\3"+
		"\2\2\2\u0085\u0086\7\16\2\2\u0086\u0087\5\20\t\2\u0087\u0088\7\17\2\2"+
		"\u0088\u008c\3\2\2\2\u0089\u008a\7\31\2\2\u008a\u008c\5\20\t\3\u008bs"+
		"\3\2\2\2\u008bu\3\2\2\2\u008by\3\2\2\2\u008b}\3\2\2\2\u008b\u0081\3\2"+
		"\2\2\u008b\u0085\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0095\3\2\2\2\u008d"+
		"\u008e\f\5\2\2\u008e\u008f\7\27\2\2\u008f\u0094\5\20\t\6\u0090\u0091\f"+
		"\4\2\2\u0091\u0092\7\30\2\2\u0092\u0094\5\20\t\5\u0093\u008d\3\2\2\2\u0093"+
		"\u0090\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\21\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7*\2\2\u0099\23"+
		"\3\2\2\2\u009a\u009b\7*\2\2\u009b\25\3\2\2\2\u009c\u009d\7\16\2\2\u009d"+
		"\27\3\2\2\2\u009e\u009f\7\17\2\2\u009f\31\3\2\2\2\u00a0\u00a1\7\32\2\2"+
		"\u00a1\u00a2\5\"\22\2\u00a2\u00a3\7\33\2\2\u00a3\u00a4\5&\24\2\u00a4\u00a5"+
		"\7\34\2\2\u00a5\u00a6\5(\25\2\u00a6\33\3\2\2\2\u00a7\u00a8\b\17\1\2\u00a8"+
		"\u00d1\5\64\33\2\u00a9\u00d1\7,\2\2\u00aa\u00d1\5\4\3\2\u00ab\u00ac\7"+
		"\16\2\2\u00ac\u00ad\5\34\17\2\u00ad\u00ae\7\17\2\2\u00ae\u00d1\3\2\2\2"+
		"\u00af\u00b0\7\35\2\2\u00b0\u00b1\7+\2\2\u00b1\u00b2\7\36\2\2\u00b2\u00b3"+
		"\7\37\2\2\u00b3\u00b4\5\34\17\2\u00b4\u00b5\7 \2\2\u00b5\u00b6\7!\2\2"+
		"\u00b6\u00b7\7+\2\2\u00b7\u00b8\7\36\2\2\u00b8\u00d1\3\2\2\2\u00b9\u00bb"+
		"\5*\26\2\u00ba\u00bc\5,\27\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00bf\5.\30\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\5\60\31\2\u00c1\u00d1\3\2\2\2\u00c2"+
		"\u00c3\5,\27\2\u00c3\u00c4\5\34\17\4\u00c4\u00d1\3\2\2\2\u00c5\u00c6\7"+
		"\"\2\2\u00c6\u00c7\7\16\2\2\u00c7\u00c8\5\34\17\2\u00c8\u00c9\7\22\2\2"+
		"\u00c9\u00ca\5\34\17\2\u00ca\u00cb\7\22\2\2\u00cb\u00cc\5\36\20\2\u00cc"+
		"\u00cd\7\22\2\2\u00cd\u00ce\5\36\20\2\u00ce\u00cf\7\17\2\2\u00cf\u00d1"+
		"\3\2\2\2\u00d0\u00a7\3\2\2\2\u00d0\u00a9\3\2\2\2\u00d0\u00aa\3\2\2\2\u00d0"+
		"\u00ab\3\2\2\2\u00d0\u00af\3\2\2\2\u00d0\u00b9\3\2\2\2\u00d0\u00c2\3\2"+
		"\2\2\u00d0\u00c5\3\2\2\2\u00d1\u00dd\3\2\2\2\u00d2\u00d3\f\t\2\2\u00d3"+
		"\u00d4\7\22\2\2\u00d4\u00dc\5\34\17\n\u00d5\u00d6\f\b\2\2\u00d6\u00d7"+
		"\7\3\2\2\u00d7\u00dc\5\n\6\2\u00d8\u00d9\f\7\2\2\u00d9\u00da\7\4\2\2\u00da"+
		"\u00dc\5\n\6\2\u00db\u00d2\3\2\2\2\u00db\u00d5\3\2\2\2\u00db\u00d8\3\2"+
		"\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\35\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00eb\7\20\2\2\u00e1\u00e6\5 \21"+
		"\2\u00e2\u00e3\7\22\2\2\u00e3\u00e5\5 \21\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00e1\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ee\u00ef\7\21\2\2\u00ef\37\3\2\2\2\u00f0\u00f1\7*\2\2\u00f1!\3"+
		"\2\2\2\u00f2\u00f3\5\64\33\2\u00f3\u00f4\7#\2\2\u00f4\u00fc\5$\23\2\u00f5"+
		"\u00f6\7\22\2\2\u00f6\u00f7\5\64\33\2\u00f7\u00f8\7#\2\2\u00f8\u00f9\5"+
		"$\23\2\u00f9\u00fb\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd#\3\2\2\2\u00fe\u00fc\3\2\2\2"+
		"\u00ff\u0105\5\4\3\2\u0100\u0101\5\64\33\2\u0101\u0102\t\3\2\2\u0102\u0103"+
		"\5\n\6\2\u0103\u0105\3\2\2\2\u0104\u00ff\3\2\2\2\u0104\u0100\3\2\2\2\u0105"+
		"%\3\2\2\2\u0106\u0107\b\24\1\2\u0107\u0108\5\64\33\2\u0108\u0109\t\4\2"+
		"\2\u0109\u010a\5\64\33\2\u010a\u0110\3\2\2\2\u010b\u010c\5\64\33\2\u010c"+
		"\u010d\t\4\2\2\u010d\u010e\7,\2\2\u010e\u0110\3\2\2\2\u010f\u0106\3\2"+
		"\2\2\u010f\u010b\3\2\2\2\u0110\u0116\3\2\2\2\u0111\u0112\f\3\2\2\u0112"+
		"\u0113\7\27\2\2\u0113\u0115\5&\24\4\u0114\u0111\3\2\2\2\u0115\u0118\3"+
		"\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\'\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0119\u011a\b\25\1\2\u011a\u012f\5$\23\2\u011b\u012f\5\64\33"+
		"\2\u011c\u011d\7\16\2\2\u011d\u011e\5(\25\2\u011e\u011f\7\17\2\2\u011f"+
		"\u0120\7\22\2\2\u0120\u0121\7\16\2\2\u0121\u0122\5(\25\2\u0122\u0123\7"+
		"\17\2\2\u0123\u012f\3\2\2\2\u0124\u0125\7\35\2\2\u0125\u0126\7+\2\2\u0126"+
		"\u0127\7\36\2\2\u0127\u0128\7\37\2\2\u0128\u0129\5(\25\2\u0129\u012a\7"+
		" \2\2\u012a\u012b\7!\2\2\u012b\u012c\7+\2\2\u012c\u012d\7\36\2\2\u012d"+
		"\u012f\3\2\2\2\u012e\u0119\3\2\2\2\u012e\u011b\3\2\2\2\u012e\u011c\3\2"+
		"\2\2\u012e\u0124\3\2\2\2\u012f\u0135\3\2\2\2\u0130\u0131\f\4\2\2\u0131"+
		"\u0132\7\22\2\2\u0132\u0134\5(\25\5\u0133\u0130\3\2\2\2\u0134\u0137\3"+
		"\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136)\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0138\u0139\7\32\2\2\u0139\u013a\5\64\33\2\u013a\u013b\7#\2\2"+
		"\u013b\u0143\5\34\17\2\u013c\u013d\7\22\2\2\u013d\u013e\5\64\33\2\u013e"+
		"\u013f\7#\2\2\u013f\u0140\5\34\17\2\u0140\u0142\3\2\2\2\u0141\u013c\3"+
		"\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"+\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7$\2\2\u0147\u0148\5\64\33\2"+
		"\u0148\u0149\7%\2\2\u0149\u0151\5\34\17\2\u014a\u014b\7\22\2\2\u014b\u014c"+
		"\5\64\33\2\u014c\u014d\7%\2\2\u014d\u014e\5\34\17\2\u014e\u0150\3\2\2"+
		"\2\u014f\u014a\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152-\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7\33\2\2\u0155"+
		"\u0156\5\62\32\2\u0156/\3\2\2\2\u0157\u0158\7\34\2\2\u0158\u0159\5\34"+
		"\17\2\u0159\61\3\2\2\2\u015a\u015b\b\32\1\2\u015b\u015c\5\34\17\2\u015c"+
		"\u015d\7\23\2\2\u015d\u015e\5\34\17\2\u015e\u0188\3\2\2\2\u015f\u0160"+
		"\5\34\17\2\u0160\u0161\7\24\2\2\u0161\u0162\5\34\17\2\u0162\u0188\3\2"+
		"\2\2\u0163\u0164\5\34\17\2\u0164\u0165\7\25\2\2\u0165\u0166\5\34\17\2"+
		"\u0166\u0188\3\2\2\2\u0167\u0168\5\34\17\2\u0168\u0169\7\26\2\2\u0169"+
		"\u016a\5\34\17\2\u016a\u0188\3\2\2\2\u016b\u016c\7&\2\2\u016c\u016d\7"+
		"\16\2\2\u016d\u016e\5\34\17\2\u016e\u016f\7\17\2\2\u016f\u0188\3\2\2\2"+
		"\u0170\u0171\7\'\2\2\u0171\u0172\5\64\33\2\u0172\u0173\7#\2\2\u0173\u017b"+
		"\5\34\17\2\u0174\u0175\7\22\2\2\u0175\u0176\5\64\33\2\u0176\u0177\7#\2"+
		"\2\u0177\u0178\5\34\17\2\u0178\u017a\3\2\2\2\u0179\u0174\3\2\2\2\u017a"+
		"\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2"+
		"\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7(\2\2\u017f\u0180\5\62\32\7\u0180"+
		"\u0188\3\2\2\2\u0181\u0182\7\16\2\2\u0182\u0183\5\62\32\2\u0183\u0184"+
		"\7\17\2\2\u0184\u0188\3\2\2\2\u0185\u0186\7\31\2\2\u0186\u0188\5\62\32"+
		"\3\u0187\u015a\3\2\2\2\u0187\u015f\3\2\2\2\u0187\u0163\3\2\2\2\u0187\u0167"+
		"\3\2\2\2\u0187\u016b\3\2\2\2\u0187\u0170\3\2\2\2\u0187\u0181\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0188\u0191\3\2\2\2\u0189\u018a\f\5\2\2\u018a\u018b\7\27"+
		"\2\2\u018b\u0190\5\62\32\6\u018c\u018d\f\4\2\2\u018d\u018e\7\30\2\2\u018e"+
		"\u0190\5\62\32\5\u018f\u0189\3\2\2\2\u018f\u018c\3\2\2\2\u0190\u0193\3"+
		"\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\63\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0194\u0195\7)\2\2\u0195\u0196\7*\2\2\u0196\65\3\2\2\2"+
		"\35FLZjl\u008b\u0093\u0095\u00bb\u00be\u00d0\u00db\u00dd\u00e6\u00eb\u00fc"+
		"\u0104\u010f\u0116\u012e\u0135\u0143\u0151\u017b\u0187\u018f\u0191";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
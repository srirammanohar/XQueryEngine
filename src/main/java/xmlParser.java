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
		T__38=39, AlphaNumeric=40, String_literal=41, WHITESPACE=42;
	public static final int
		RULE_query = 0, RULE_absolute_path = 1, RULE_document = 2, RULE_fileName = 3, 
		RULE_relative_path = 4, RULE_tagName = 5, RULE_attName = 6, RULE_filter = 7, 
		RULE_headerString = 8, RULE_nameString = 9, RULE_openBracket = 10, RULE_closeBracket = 11, 
		RULE_xquery = 12, RULE_joinattr = 13, RULE_id = 14, RULE_forClause = 15, 
		RULE_letClause = 16, RULE_whereClause = 17, RULE_returnClause = 18, RULE_cond = 19, 
		RULE_var = 20;
	public static final String[] ruleNames = {
		"query", "absolute_path", "document", "fileName", "relative_path", "tagName", 
		"attName", "filter", "headerString", "nameString", "openBracket", "closeBracket", 
		"xquery", "joinattr", "id", "forClause", "letClause", "whereClause", "returnClause", 
		"cond", "var"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'/'", "'//'", "'doc'", "'document'", "'DOC'", "'DOCUMENT'", "'*'", 
		"'.'", "'..'", "'text()'", "'@'", "'('", "')'", "'['", "']'", "','", "'='", 
		"'eq'", "'=='", "'is'", "'and'", "'or'", "'not'", "'<'", "'>'", "'{'", 
		"'}'", "'</'", "'join'", "'for'", "'in'", "'let'", "':='", "'where'", 
		"'return'", "'empty'", "'some'", "'satisfies'", "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "AlphaNumeric", "String_literal", "WHITESPACE"
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
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
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
	}

	public final Absolute_pathContext absolute_path() throws RecognitionException {
		Absolute_pathContext _localctx = new Absolute_pathContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_absolute_path);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new ApchildContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				document();
				setState(45);
				openBracket();
				setState(46);
				fileName();
				setState(47);
				closeBracket();
				setState(48);
				match(T__0);
				setState(49);
				relative_path(0);
				}
				break;
			case 2:
				_localctx = new ApdescContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				document();
				setState(52);
				openBracket();
				setState(53);
				fileName();
				setState(54);
				closeBracket();
				setState(55);
				match(T__1);
				setState(56);
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
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
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
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fileName);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new File_headerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(62);
				headerString();
				}
				}
				break;
			case 2:
				_localctx = new File_nameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(63);
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
			setState(78);
			switch (_input.LA(1)) {
			case AlphaNumeric:
				{
				_localctx = new Rp_tagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(67);
				tagName();
				}
				break;
			case T__6:
				{
				_localctx = new Rp_anychildContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(T__6);
				}
				break;
			case T__7:
				{
				_localctx = new Rp_dotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(T__7);
				}
				break;
			case T__8:
				{
				_localctx = new Rp_dotdotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(T__8);
				}
				break;
			case T__9:
				{
				_localctx = new Rp_textContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(T__9);
				}
				break;
			case T__10:
				{
				_localctx = new Rp_attributeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(T__10);
				setState(73);
				attName();
				}
				break;
			case T__11:
				{
				_localctx = new Rp_simpleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(T__11);
				setState(75);
				relative_path(0);
				setState(76);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(94);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Rp_rpContext(new Relative_pathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relative_path);
						setState(80);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(81);
						match(T__0);
						setState(82);
						relative_path(5);
						}
						break;
					case 2:
						{
						_localctx = new Rp_descrpContext(new Relative_pathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relative_path);
						setState(83);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(84);
						match(T__1);
						setState(85);
						relative_path(4);
						}
						break;
					case 3:
						{
						_localctx = new Rp_commaContext(new Relative_pathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relative_path);
						setState(86);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(87);
						match(T__15);
						setState(88);
						relative_path(2);
						}
						break;
					case 4:
						{
						_localctx = new Rp_filterContext(new Relative_pathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relative_path);
						setState(89);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(90);
						match(T__13);
						setState(91);
						filter(0);
						setState(92);
						match(T__14);
						}
						break;
					}
					} 
				}
				setState(98);
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
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tagName);
		try {
			_localctx = new Tag_nameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
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
	}

	public final AttNameContext attName() throws RecognitionException {
		AttNameContext _localctx = new AttNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attName);
		try {
			_localctx = new Att_nameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
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
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new Filter_rpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(104);
				relative_path(0);
				}
				break;
			case 2:
				{
				_localctx = new Filter_equalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				relative_path(0);
				setState(106);
				match(T__16);
				setState(107);
				relative_path(0);
				}
				break;
			case 3:
				{
				_localctx = new Filter_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				relative_path(0);
				setState(110);
				match(T__17);
				setState(111);
				relative_path(0);
				}
				break;
			case 4:
				{
				_localctx = new Filter_eqeqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				relative_path(0);
				setState(114);
				match(T__18);
				setState(115);
				relative_path(0);
				}
				break;
			case 5:
				{
				_localctx = new Filter_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				relative_path(0);
				setState(118);
				match(T__19);
				setState(119);
				relative_path(0);
				}
				break;
			case 6:
				{
				_localctx = new Filter_simpleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(T__11);
				setState(122);
				filter(0);
				setState(123);
				match(T__12);
				}
				break;
			case 7:
				{
				_localctx = new Filter_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(T__22);
				setState(126);
				filter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Filter_andContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(129);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(130);
						match(T__20);
						setState(131);
						filter(4);
						}
						break;
					case 2:
						{
						_localctx = new Filter_orContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(132);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(133);
						match(T__21);
						setState(134);
						filter(3);
						}
						break;
					}
					} 
				}
				setState(139);
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
		public List<TerminalNode> AlphaNumeric() { return getTokens(xmlParser.AlphaNumeric); }
		public TerminalNode AlphaNumeric(int i) {
			return getToken(xmlParser.AlphaNumeric, i);
		}
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
	}

	public final HeaderStringContext headerString() throws RecognitionException {
		HeaderStringContext _localctx = new HeaderStringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_headerString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(AlphaNumeric);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(141);
				match(T__7);
				setState(142);
				match(AlphaNumeric);
				}
				}
				setState(147);
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
	}

	public final NameStringContext nameString() throws RecognitionException {
		NameStringContext _localctx = new NameStringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nameString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
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
	}

	public final OpenBracketContext openBracket() throws RecognitionException {
		OpenBracketContext _localctx = new OpenBracketContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_openBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
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
	}

	public final CloseBracketContext closeBracket() throws RecognitionException {
		CloseBracketContext _localctx = new CloseBracketContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_closeBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
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
	}
	public static class X_nodeContext extends XqueryContext {
		public NameStringContext lt;
		public NameStringContext rt;
		public XqueryContext xquery() {
			return getRuleContext(XqueryContext.class,0);
		}
		public List<NameStringContext> nameString() {
			return getRuleContexts(NameStringContext.class);
		}
		public NameStringContext nameString(int i) {
			return getRuleContext(NameStringContext.class,i);
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
	}
	public static class XJoinContext extends XqueryContext {
		public XqueryContext left;
		public XqueryContext right;
		public JoinattrContext leftlist;
		public JoinattrContext rightlist;
		public List<XqueryContext> xquery() {
			return getRuleContexts(XqueryContext.class);
		}
		public XqueryContext xquery(int i) {
			return getRuleContext(XqueryContext.class,i);
		}
		public List<JoinattrContext> joinattr() {
			return getRuleContexts(JoinattrContext.class);
		}
		public JoinattrContext joinattr(int i) {
			return getRuleContext(JoinattrContext.class,i);
		}
		public XJoinContext(XqueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterXJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitXJoin(this);
		}
	}
	public static class X_strContext extends XqueryContext {
		public TerminalNode String_literal() { return getToken(xmlParser.String_literal, 0); }
		public X_strContext(XqueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterX_str(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitX_str(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_xquery, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			switch (_input.LA(1)) {
			case T__38:
				{
				_localctx = new X_varContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(155);
				var();
				}
				break;
			case String_literal:
				{
				_localctx = new X_strContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(String_literal);
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
				setState(157);
				absolute_path();
				}
				break;
			case T__11:
				{
				_localctx = new X_simpleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(T__11);
				setState(159);
				xquery(0);
				setState(160);
				match(T__12);
				}
				break;
			case T__23:
				{
				_localctx = new X_nodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(T__23);
				setState(163);
				((X_nodeContext)_localctx).lt = nameString();
				setState(164);
				match(T__24);
				setState(165);
				match(T__25);
				setState(166);
				xquery(0);
				setState(167);
				match(T__26);
				setState(168);
				match(T__27);
				setState(169);
				((X_nodeContext)_localctx).rt = nameString();
				setState(170);
				match(T__24);
				}
				break;
			case T__29:
				{
				_localctx = new X_stateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				forClause();
				setState(174);
				_la = _input.LA(1);
				if (_la==T__31) {
					{
					setState(173);
					letClause();
					}
				}

				setState(177);
				_la = _input.LA(1);
				if (_la==T__33) {
					{
					setState(176);
					whereClause();
					}
				}

				setState(179);
				returnClause();
				}
				break;
			case T__31:
				{
				_localctx = new XLetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				letClause();
				setState(182);
				xquery(2);
				}
				break;
			case T__28:
				{
				_localctx = new XJoinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(T__28);
				setState(185);
				match(T__11);
				setState(186);
				((XJoinContext)_localctx).left = xquery(0);
				setState(187);
				match(T__15);
				setState(188);
				((XJoinContext)_localctx).right = xquery(0);
				setState(189);
				match(T__15);
				setState(190);
				((XJoinContext)_localctx).leftlist = joinattr();
				setState(191);
				match(T__15);
				setState(192);
				((XJoinContext)_localctx).rightlist = joinattr();
				setState(193);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(206);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new XIndContext(new XqueryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xquery);
						setState(197);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(198);
						match(T__15);
						setState(199);
						xquery(8);
						}
						break;
					case 2:
						{
						_localctx = new X_slashContext(new XqueryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xquery);
						setState(200);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(201);
						match(T__0);
						setState(202);
						relative_path(0);
						}
						break;
					case 3:
						{
						_localctx = new X_descContext(new XqueryContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xquery);
						setState(203);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(204);
						match(T__1);
						setState(205);
						relative_path(0);
						}
						break;
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class JoinattrContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public JoinattrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinattr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterJoinattr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitJoinattr(this);
		}
	}

	public final JoinattrContext joinattr() throws RecognitionException {
		JoinattrContext _localctx = new JoinattrContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_joinattr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__13);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AlphaNumeric) {
				{
				{
				setState(212);
				id();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(213);
					match(T__15);
					setState(214);
					id();
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
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
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
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
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__29);
			setState(230);
			var();
			setState(231);
			match(T__30);
			setState(232);
			xquery(0);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(233);
				match(T__15);
				setState(234);
				var();
				setState(235);
				match(T__30);
				setState(236);
				xquery(0);
				}
				}
				setState(242);
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
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__31);
			setState(244);
			var();
			setState(245);
			match(T__32);
			setState(246);
			xquery(0);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(247);
				match(T__15);
				setState(248);
				var();
				setState(249);
				match(T__32);
				setState(250);
				xquery(0);
				}
				}
				setState(256);
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
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__33);
			setState(258);
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
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__34);
			setState(261);
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
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new CondEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(264);
				((CondEqContext)_localctx).left = xquery(0);
				setState(265);
				match(T__16);
				setState(266);
				((CondEqContext)_localctx).right = xquery(0);
				}
				break;
			case 2:
				{
				_localctx = new CondEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				((CondEqContext)_localctx).left = xquery(0);
				setState(269);
				match(T__17);
				setState(270);
				((CondEqContext)_localctx).right = xquery(0);
				}
				break;
			case 3:
				{
				_localctx = new CondIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272);
				((CondIsContext)_localctx).left = xquery(0);
				setState(273);
				match(T__18);
				setState(274);
				((CondIsContext)_localctx).right = xquery(0);
				}
				break;
			case 4:
				{
				_localctx = new CondIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276);
				((CondIsContext)_localctx).left = xquery(0);
				setState(277);
				match(T__19);
				setState(278);
				((CondIsContext)_localctx).right = xquery(0);
				}
				break;
			case 5:
				{
				_localctx = new CondEmpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(280);
				match(T__35);
				setState(281);
				match(T__11);
				setState(282);
				xquery(0);
				setState(283);
				match(T__12);
				}
				break;
			case 6:
				{
				_localctx = new CondSomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285);
				match(T__36);
				setState(286);
				var();
				setState(287);
				match(T__30);
				setState(288);
				xquery(0);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(289);
					match(T__15);
					setState(290);
					var();
					setState(291);
					match(T__30);
					setState(292);
					xquery(0);
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(299);
				match(T__37);
				setState(300);
				cond(5);
				}
				break;
			case 7:
				{
				_localctx = new CondPlainContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302);
				match(T__11);
				setState(303);
				cond(0);
				setState(304);
				match(T__12);
				}
				break;
			case 8:
				{
				_localctx = new CondNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				match(T__22);
				setState(307);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(316);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndContext(new CondContext(_parentctx, _parentState));
						((CondAndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(310);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(311);
						match(T__20);
						setState(312);
						((CondAndContext)_localctx).right = cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOrContext(new CondContext(_parentctx, _parentState));
						((CondOrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(313);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(314);
						match(T__21);
						setState(315);
						((CondOrContext)_localctx).right = cond(3);
						}
						break;
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__38);
			setState(322);
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
		case 12:
			return xquery_sempred((XqueryContext)_localctx, predIndex);
		case 19:
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
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u0147\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\5\3\5\5\5C\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6Q\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6a\n\6\f\6\16\6d\13\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0082\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\t\u008a\n\t\f\t\16\t\u008d\13\t\3\n\3\n\3\n\7\n\u0092\n\n\f\n"+
		"\16\n\u0095\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u00b1\n\16\3\16\5\16\u00b4\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c6\n\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00d1\n\16\f\16\16\16\u00d4"+
		"\13\16\3\17\3\17\3\17\3\17\7\17\u00da\n\17\f\17\16\17\u00dd\13\17\7\17"+
		"\u00df\n\17\f\17\16\17\u00e2\13\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00f1\n\21\f\21\16\21\u00f4\13\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00ff\n\22\f\22\16"+
		"\22\u0102\13\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0129"+
		"\n\25\f\25\16\25\u012c\13\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\5\25\u0137\n\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u013f\n\25\f\25"+
		"\16\25\u0142\13\25\3\26\3\26\3\26\3\26\2\6\n\20\32(\27\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*\2\3\3\2\5\b\u0160\2,\3\2\2\2\4<\3\2\2"+
		"\2\6>\3\2\2\2\bB\3\2\2\2\nP\3\2\2\2\fe\3\2\2\2\16g\3\2\2\2\20\u0081\3"+
		"\2\2\2\22\u008e\3\2\2\2\24\u0096\3\2\2\2\26\u0098\3\2\2\2\30\u009a\3\2"+
		"\2\2\32\u00c5\3\2\2\2\34\u00d5\3\2\2\2\36\u00e5\3\2\2\2 \u00e7\3\2\2\2"+
		"\"\u00f5\3\2\2\2$\u0103\3\2\2\2&\u0106\3\2\2\2(\u0136\3\2\2\2*\u0143\3"+
		"\2\2\2,-\5\32\16\2-\3\3\2\2\2./\5\6\4\2/\60\5\26\f\2\60\61\5\b\5\2\61"+
		"\62\5\30\r\2\62\63\7\3\2\2\63\64\5\n\6\2\64=\3\2\2\2\65\66\5\6\4\2\66"+
		"\67\5\26\f\2\678\5\b\5\289\5\30\r\29:\7\4\2\2:;\5\n\6\2;=\3\2\2\2<.\3"+
		"\2\2\2<\65\3\2\2\2=\5\3\2\2\2>?\t\2\2\2?\7\3\2\2\2@C\5\22\n\2AC\5\24\13"+
		"\2B@\3\2\2\2BA\3\2\2\2C\t\3\2\2\2DE\b\6\1\2EQ\5\f\7\2FQ\7\t\2\2GQ\7\n"+
		"\2\2HQ\7\13\2\2IQ\7\f\2\2JK\7\r\2\2KQ\5\16\b\2LM\7\16\2\2MN\5\n\6\2NO"+
		"\7\17\2\2OQ\3\2\2\2PD\3\2\2\2PF\3\2\2\2PG\3\2\2\2PH\3\2\2\2PI\3\2\2\2"+
		"PJ\3\2\2\2PL\3\2\2\2Qb\3\2\2\2RS\f\6\2\2ST\7\3\2\2Ta\5\n\6\7UV\f\5\2\2"+
		"VW\7\4\2\2Wa\5\n\6\6XY\f\3\2\2YZ\7\22\2\2Za\5\n\6\4[\\\f\4\2\2\\]\7\20"+
		"\2\2]^\5\20\t\2^_\7\21\2\2_a\3\2\2\2`R\3\2\2\2`U\3\2\2\2`X\3\2\2\2`[\3"+
		"\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\13\3\2\2\2db\3\2\2\2ef\5\24\13\2"+
		"f\r\3\2\2\2gh\5\24\13\2h\17\3\2\2\2ij\b\t\1\2j\u0082\5\n\6\2kl\5\n\6\2"+
		"lm\7\23\2\2mn\5\n\6\2n\u0082\3\2\2\2op\5\n\6\2pq\7\24\2\2qr\5\n\6\2r\u0082"+
		"\3\2\2\2st\5\n\6\2tu\7\25\2\2uv\5\n\6\2v\u0082\3\2\2\2wx\5\n\6\2xy\7\26"+
		"\2\2yz\5\n\6\2z\u0082\3\2\2\2{|\7\16\2\2|}\5\20\t\2}~\7\17\2\2~\u0082"+
		"\3\2\2\2\177\u0080\7\31\2\2\u0080\u0082\5\20\t\3\u0081i\3\2\2\2\u0081"+
		"k\3\2\2\2\u0081o\3\2\2\2\u0081s\3\2\2\2\u0081w\3\2\2\2\u0081{\3\2\2\2"+
		"\u0081\177\3\2\2\2\u0082\u008b\3\2\2\2\u0083\u0084\f\5\2\2\u0084\u0085"+
		"\7\27\2\2\u0085\u008a\5\20\t\6\u0086\u0087\f\4\2\2\u0087\u0088\7\30\2"+
		"\2\u0088\u008a\5\20\t\5\u0089\u0083\3\2\2\2\u0089\u0086\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\21\3\2\2"+
		"\2\u008d\u008b\3\2\2\2\u008e\u0093\7*\2\2\u008f\u0090\7\n\2\2\u0090\u0092"+
		"\7*\2\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\23\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7*\2\2"+
		"\u0097\25\3\2\2\2\u0098\u0099\7\16\2\2\u0099\27\3\2\2\2\u009a\u009b\7"+
		"\17\2\2\u009b\31\3\2\2\2\u009c\u009d\b\16\1\2\u009d\u00c6\5*\26\2\u009e"+
		"\u00c6\7+\2\2\u009f\u00c6\5\4\3\2\u00a0\u00a1\7\16\2\2\u00a1\u00a2\5\32"+
		"\16\2\u00a2\u00a3\7\17\2\2\u00a3\u00c6\3\2\2\2\u00a4\u00a5\7\32\2\2\u00a5"+
		"\u00a6\5\24\13\2\u00a6\u00a7\7\33\2\2\u00a7\u00a8\7\34\2\2\u00a8\u00a9"+
		"\5\32\16\2\u00a9\u00aa\7\35\2\2\u00aa\u00ab\7\36\2\2\u00ab\u00ac\5\24"+
		"\13\2\u00ac\u00ad\7\33\2\2\u00ad\u00c6\3\2\2\2\u00ae\u00b0\5 \21\2\u00af"+
		"\u00b1\5\"\22\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3"+
		"\2\2\2\u00b2\u00b4\5$\23\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\5&\24\2\u00b6\u00c6\3\2\2\2\u00b7\u00b8\5\""+
		"\22\2\u00b8\u00b9\5\32\16\4\u00b9\u00c6\3\2\2\2\u00ba\u00bb\7\37\2\2\u00bb"+
		"\u00bc\7\16\2\2\u00bc\u00bd\5\32\16\2\u00bd\u00be\7\22\2\2\u00be\u00bf"+
		"\5\32\16\2\u00bf\u00c0\7\22\2\2\u00c0\u00c1\5\34\17\2\u00c1\u00c2\7\22"+
		"\2\2\u00c2\u00c3\5\34\17\2\u00c3\u00c4\7\17\2\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u009c\3\2\2\2\u00c5\u009e\3\2\2\2\u00c5\u009f\3\2\2\2\u00c5\u00a0\3\2"+
		"\2\2\u00c5\u00a4\3\2\2\2\u00c5\u00ae\3\2\2\2\u00c5\u00b7\3\2\2\2\u00c5"+
		"\u00ba\3\2\2\2\u00c6\u00d2\3\2\2\2\u00c7\u00c8\f\t\2\2\u00c8\u00c9\7\22"+
		"\2\2\u00c9\u00d1\5\32\16\n\u00ca\u00cb\f\b\2\2\u00cb\u00cc\7\3\2\2\u00cc"+
		"\u00d1\5\n\6\2\u00cd\u00ce\f\7\2\2\u00ce\u00cf\7\4\2\2\u00cf\u00d1\5\n"+
		"\6\2\u00d0\u00c7\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\33\3\2\2"+
		"\2\u00d4\u00d2\3\2\2\2\u00d5\u00e0\7\20\2\2\u00d6\u00db\5\36\20\2\u00d7"+
		"\u00d8\7\22\2\2\u00d8\u00da\5\36\20\2\u00d9\u00d7\3\2\2\2\u00da\u00dd"+
		"\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00de\u00d6\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e4\7\21\2\2\u00e4\35\3\2\2\2\u00e5\u00e6\7*\2\2\u00e6\37\3\2\2\2\u00e7"+
		"\u00e8\7 \2\2\u00e8\u00e9\5*\26\2\u00e9\u00ea\7!\2\2\u00ea\u00f2\5\32"+
		"\16\2\u00eb\u00ec\7\22\2\2\u00ec\u00ed\5*\26\2\u00ed\u00ee\7!\2\2\u00ee"+
		"\u00ef\5\32\16\2\u00ef\u00f1\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f1\u00f4\3"+
		"\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3!\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f5\u00f6\7\"\2\2\u00f6\u00f7\5*\26\2\u00f7\u00f8\7#\2\2\u00f8"+
		"\u0100\5\32\16\2\u00f9\u00fa\7\22\2\2\u00fa\u00fb\5*\26\2\u00fb\u00fc"+
		"\7#\2\2\u00fc\u00fd\5\32\16\2\u00fd\u00ff\3\2\2\2\u00fe\u00f9\3\2\2\2"+
		"\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101#\3"+
		"\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7$\2\2\u0104\u0105\5(\25\2\u0105"+
		"%\3\2\2\2\u0106\u0107\7%\2\2\u0107\u0108\5\32\16\2\u0108\'\3\2\2\2\u0109"+
		"\u010a\b\25\1\2\u010a\u010b\5\32\16\2\u010b\u010c\7\23\2\2\u010c\u010d"+
		"\5\32\16\2\u010d\u0137\3\2\2\2\u010e\u010f\5\32\16\2\u010f\u0110\7\24"+
		"\2\2\u0110\u0111\5\32\16\2\u0111\u0137\3\2\2\2\u0112\u0113\5\32\16\2\u0113"+
		"\u0114\7\25\2\2\u0114\u0115\5\32\16\2\u0115\u0137\3\2\2\2\u0116\u0117"+
		"\5\32\16\2\u0117\u0118\7\26\2\2\u0118\u0119\5\32\16\2\u0119\u0137\3\2"+
		"\2\2\u011a\u011b\7&\2\2\u011b\u011c\7\16\2\2\u011c\u011d\5\32\16\2\u011d"+
		"\u011e\7\17\2\2\u011e\u0137\3\2\2\2\u011f\u0120\7\'\2\2\u0120\u0121\5"+
		"*\26\2\u0121\u0122\7!\2\2\u0122\u012a\5\32\16\2\u0123\u0124\7\22\2\2\u0124"+
		"\u0125\5*\26\2\u0125\u0126\7!\2\2\u0126\u0127\5\32\16\2\u0127\u0129\3"+
		"\2\2\2\u0128\u0123\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7("+
		"\2\2\u012e\u012f\5(\25\7\u012f\u0137\3\2\2\2\u0130\u0131\7\16\2\2\u0131"+
		"\u0132\5(\25\2\u0132\u0133\7\17\2\2\u0133\u0137\3\2\2\2\u0134\u0135\7"+
		"\31\2\2\u0135\u0137\5(\25\3\u0136\u0109\3\2\2\2\u0136\u010e\3\2\2\2\u0136"+
		"\u0112\3\2\2\2\u0136\u0116\3\2\2\2\u0136\u011a\3\2\2\2\u0136\u011f\3\2"+
		"\2\2\u0136\u0130\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0140\3\2\2\2\u0138"+
		"\u0139\f\5\2\2\u0139\u013a\7\27\2\2\u013a\u013f\5(\25\6\u013b\u013c\f"+
		"\4\2\2\u013c\u013d\7\30\2\2\u013d\u013f\5(\25\5\u013e\u0138\3\2\2\2\u013e"+
		"\u013b\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141)\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7)\2\2\u0144\u0145"+
		"\7*\2\2\u0145+\3\2\2\2\30<BP`b\u0081\u0089\u008b\u0093\u00b0\u00b3\u00c5"+
		"\u00d0\u00d2\u00db\u00e0\u00f2\u0100\u012a\u0136\u013e\u0140";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from /Users/gussegovia/IdeaProjects/antlrtest/src/Proj2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Proj2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		PROGRAM=25, BEGIN=26, END=27, STATEMENT=28, FUNCTION=29, PROCEDURE=30, 
		INT=31, DOUBLE=32, COMMENT_1=33, COMMENT_2=34, IDENT=35, VAR=36, INTEGER=37, 
		REAL=38, INTEGER_CONST=39, REAL_CONST=40, INTEGER_DIV=41, FLOAT_DIV=42, 
		TRUE=43, FALSE=44, PLUS=45, MINUS=46, MUL=47, DIV=48, ASSIGN=49, COMMA=50, 
		SEMI=51, COLON=52, EQUAL=53, NOT_EQUAL=54, LT=55, LE=56, GE=57, GT=58, 
		LPAREN=59, RPAREN=60, LBRACK=61, LBRACK2=62, RBRACK=63, RBRACK2=64, POINTER=65, 
		AT=66, DOT=67, DOTDOT=68, LCURLY=69, RCURLY=70, UNIT=71, BOOL=72, ID=73, 
		BLOCK=74, IF=75, THEN=76, ELSE=77, WS=78;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "PROGRAM", 
			"BEGIN", "END", "STATEMENT", "FUNCTION", "PROCEDURE", "INT", "DOUBLE", 
			"COMMENT_1", "COMMENT_2", "A", "B", "C", "D", "E", "F", "G", "H", "I", 
			"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", 
			"X", "Y", "Z", "IDENT", "VAR", "INTEGER", "REAL", "INTEGER_CONST", "REAL_CONST", 
			"INTEGER_DIV", "FLOAT_DIV", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", 
			"DIV", "ASSIGN", "COMMA", "SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT", 
			"LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", "LBRACK2", "RBRACK", 
			"RBRACK2", "POINTER", "AT", "DOT", "DOTDOT", "LCURLY", "RCURLY", "UNIT", 
			"BOOL", "ID", "BLOCK", "IF", "THEN", "ELSE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'end'", "'break;'", "'continue'", "'real'", "'boolean'", 
			"'var'", "'true'", "'false'", "'readln'", "'writeln'", "'''", "'sqrt'", 
			"'sin'", "'cos'", "'ln'", "'exp'", "'if'", "'then'", "'else'", "'while'", 
			"'do'", "'for'", "'to'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "':='", "','", "';'", "':'", "'='", "'<>'", 
			"'<'", "'<='", "'>='", "'>'", "'('", "')'", "'['", "'(.'", "']'", "'.)'", 
			"'^'", "'@'", "'.'", "'..'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "PROGRAM", "BEGIN", "END", "STATEMENT", "FUNCTION", "PROCEDURE", 
			"INT", "DOUBLE", "COMMENT_1", "COMMENT_2", "IDENT", "VAR", "INTEGER", 
			"REAL", "INTEGER_CONST", "REAL_CONST", "INTEGER_DIV", "FLOAT_DIV", "TRUE", 
			"FALSE", "PLUS", "MINUS", "MUL", "DIV", "ASSIGN", "COMMA", "SEMI", "COLON", 
			"EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", 
			"LBRACK2", "RBRACK", "RBRACK2", "POINTER", "AT", "DOT", "DOTDOT", "LCURLY", 
			"RCURLY", "UNIT", "BOOL", "ID", "BLOCK", "IF", "THEN", "ELSE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public Proj2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Proj2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2P\u0297\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \6 \u017c"+
		"\n \r \16 \u017d\3!\6!\u0181\n!\r!\16!\u0182\3!\3!\6!\u0187\n!\r!\16!"+
		"\u0188\3!\3!\6!\u018d\n!\r!\16!\u018e\3!\6!\u0192\n!\r!\16!\u0193\5!\u0196"+
		"\n!\3\"\3\"\3\"\3\"\7\"\u019c\n\"\f\"\16\"\u019f\13\"\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\7#\u01a8\n#\f#\16#\u01ab\13#\3#\3#\3#\3#\3$\3$\3%\3%\3&\3&"+
		"\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\3"+
		"8\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\7>\u01e7\n>\f>\16>\u01ea\13>\3?"+
		"\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G"+
		"\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3Q"+
		"\3R\3R\3S\3S\3S\3T\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Y\3Z\3Z\3[\3["+
		"\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3_\3`\3`\3a\3a\3b\3b\3b\3b\3b\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3d\3d\3d\3e\3e\3e\3e\3e\3e\3f\3f\3f\3g\3g\3g\3g\3g\3h\3"+
		"h\3h\3h\3h\3i\6i\u0292\ni\ri\16i\u0293\3i\3i\4\u019d\u01a9\2j\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2"+
		"s\2u\2w\2y\2{%}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089,\u008b-\u008d"+
		".\u008f/\u0091\60\u0093\61\u0095\62\u0097\63\u0099\64\u009b\65\u009d\66"+
		"\u009f\67\u00a18\u00a39\u00a5:\u00a7;\u00a9<\u00ab=\u00ad>\u00af?\u00b1"+
		"@\u00b3A\u00b5B\u00b7C\u00b9D\u00bbE\u00bdF\u00bfG\u00c1H\u00c3I\u00c5"+
		"J\u00c7K\u00c9L\u00cbM\u00cdN\u00cfO\u00d1P\3\2 \3\2\62;\4\2CCcc\4\2D"+
		"Ddd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4"+
		"\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUu"+
		"u\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2C\\c|\6"+
		"\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0287\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2"+
		"\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"+
		"\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad"+
		"\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2"+
		"\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf"+
		"\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2"+
		"\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1"+
		"\3\2\2\2\3\u00d3\3\2\2\2\5\u00d9\3\2\2\2\7\u00dd\3\2\2\2\t\u00e4\3\2\2"+
		"\2\13\u00ed\3\2\2\2\r\u00f2\3\2\2\2\17\u00fa\3\2\2\2\21\u00fe\3\2\2\2"+
		"\23\u0103\3\2\2\2\25\u0109\3\2\2\2\27\u0110\3\2\2\2\31\u0118\3\2\2\2\33"+
		"\u011a\3\2\2\2\35\u011f\3\2\2\2\37\u0123\3\2\2\2!\u0127\3\2\2\2#\u012a"+
		"\3\2\2\2%\u012e\3\2\2\2\'\u0131\3\2\2\2)\u0136\3\2\2\2+\u013b\3\2\2\2"+
		"-\u0141\3\2\2\2/\u0144\3\2\2\2\61\u0148\3\2\2\2\63\u014b\3\2\2\2\65\u0153"+
		"\3\2\2\2\67\u0159\3\2\2\29\u015d\3\2\2\2;\u0167\3\2\2\2=\u0170\3\2\2\2"+
		"?\u017b\3\2\2\2A\u0195\3\2\2\2C\u0197\3\2\2\2E\u01a5\3\2\2\2G\u01b0\3"+
		"\2\2\2I\u01b2\3\2\2\2K\u01b4\3\2\2\2M\u01b6\3\2\2\2O\u01b8\3\2\2\2Q\u01ba"+
		"\3\2\2\2S\u01bc\3\2\2\2U\u01be\3\2\2\2W\u01c0\3\2\2\2Y\u01c2\3\2\2\2["+
		"\u01c4\3\2\2\2]\u01c6\3\2\2\2_\u01c8\3\2\2\2a\u01ca\3\2\2\2c\u01cc\3\2"+
		"\2\2e\u01ce\3\2\2\2g\u01d0\3\2\2\2i\u01d2\3\2\2\2k\u01d4\3\2\2\2m\u01d6"+
		"\3\2\2\2o\u01d8\3\2\2\2q\u01da\3\2\2\2s\u01dc\3\2\2\2u\u01de\3\2\2\2w"+
		"\u01e0\3\2\2\2y\u01e2\3\2\2\2{\u01e4\3\2\2\2}\u01eb\3\2\2\2\177\u01ef"+
		"\3\2\2\2\u0081\u01f7\3\2\2\2\u0083\u01fc\3\2\2\2\u0085\u0209\3\2\2\2\u0087"+
		"\u0213\3\2\2\2\u0089\u021e\3\2\2\2\u008b\u0227\3\2\2\2\u008d\u022c\3\2"+
		"\2\2\u008f\u0232\3\2\2\2\u0091\u0234\3\2\2\2\u0093\u0236\3\2\2\2\u0095"+
		"\u0238\3\2\2\2\u0097\u023a\3\2\2\2\u0099\u023d\3\2\2\2\u009b\u023f\3\2"+
		"\2\2\u009d\u0241\3\2\2\2\u009f\u0243\3\2\2\2\u00a1\u0245\3\2\2\2\u00a3"+
		"\u0248\3\2\2\2\u00a5\u024a\3\2\2\2\u00a7\u024d\3\2\2\2\u00a9\u0250\3\2"+
		"\2\2\u00ab\u0252\3\2\2\2\u00ad\u0254\3\2\2\2\u00af\u0256\3\2\2\2\u00b1"+
		"\u0258\3\2\2\2\u00b3\u025b\3\2\2\2\u00b5\u025d\3\2\2\2\u00b7\u0260\3\2"+
		"\2\2\u00b9\u0262\3\2\2\2\u00bb\u0264\3\2\2\2\u00bd\u0266\3\2\2\2\u00bf"+
		"\u0269\3\2\2\2\u00c1\u026b\3\2\2\2\u00c3\u026d\3\2\2\2\u00c5\u0272\3\2"+
		"\2\2\u00c7\u027a\3\2\2\2\u00c9\u027d\3\2\2\2\u00cb\u0283\3\2\2\2\u00cd"+
		"\u0286\3\2\2\2\u00cf\u028b\3\2\2\2\u00d1\u0291\3\2\2\2\u00d3\u00d4\7d"+
		"\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7i\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8"+
		"\7p\2\2\u00d8\4\3\2\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7p\2\2\u00db\u00dc"+
		"\7f\2\2\u00dc\6\3\2\2\2\u00dd\u00de\7d\2\2\u00de\u00df\7t\2\2\u00df\u00e0"+
		"\7g\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7m\2\2\u00e2\u00e3\7=\2\2\u00e3"+
		"\b\3\2\2\2\u00e4\u00e5\7e\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7p\2\2\u00e7"+
		"\u00e8\7v\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7w\2\2"+
		"\u00eb\u00ec\7g\2\2\u00ec\n\3\2\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7g"+
		"\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7n\2\2\u00f1\f\3\2\2\2\u00f2\u00f3"+
		"\7d\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7n\2\2\u00f6"+
		"\u00f7\7g\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7p\2\2\u00f9\16\3\2\2\2\u00fa"+
		"\u00fb\7x\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7t\2\2\u00fd\20\3\2\2\2\u00fe"+
		"\u00ff\7v\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7w\2\2\u0101\u0102\7g\2\2"+
		"\u0102\22\3\2\2\2\u0103\u0104\7h\2\2\u0104\u0105\7c\2\2\u0105\u0106\7"+
		"n\2\2\u0106\u0107\7u\2\2\u0107\u0108\7g\2\2\u0108\24\3\2\2\2\u0109\u010a"+
		"\7t\2\2\u010a\u010b\7g\2\2\u010b\u010c\7c\2\2\u010c\u010d\7f\2\2\u010d"+
		"\u010e\7n\2\2\u010e\u010f\7p\2\2\u010f\26\3\2\2\2\u0110\u0111\7y\2\2\u0111"+
		"\u0112\7t\2\2\u0112\u0113\7k\2\2\u0113\u0114\7v\2\2\u0114\u0115\7g\2\2"+
		"\u0115\u0116\7n\2\2\u0116\u0117\7p\2\2\u0117\30\3\2\2\2\u0118\u0119\7"+
		")\2\2\u0119\32\3\2\2\2\u011a\u011b\7u\2\2\u011b\u011c\7s\2\2\u011c\u011d"+
		"\7t\2\2\u011d\u011e\7v\2\2\u011e\34\3\2\2\2\u011f\u0120\7u\2\2\u0120\u0121"+
		"\7k\2\2\u0121\u0122\7p\2\2\u0122\36\3\2\2\2\u0123\u0124\7e\2\2\u0124\u0125"+
		"\7q\2\2\u0125\u0126\7u\2\2\u0126 \3\2\2\2\u0127\u0128\7n\2\2\u0128\u0129"+
		"\7p\2\2\u0129\"\3\2\2\2\u012a\u012b\7g\2\2\u012b\u012c\7z\2\2\u012c\u012d"+
		"\7r\2\2\u012d$\3\2\2\2\u012e\u012f\7k\2\2\u012f\u0130\7h\2\2\u0130&\3"+
		"\2\2\2\u0131\u0132\7v\2\2\u0132\u0133\7j\2\2\u0133\u0134\7g\2\2\u0134"+
		"\u0135\7p\2\2\u0135(\3\2\2\2\u0136\u0137\7g\2\2\u0137\u0138\7n\2\2\u0138"+
		"\u0139\7u\2\2\u0139\u013a\7g\2\2\u013a*\3\2\2\2\u013b\u013c\7y\2\2\u013c"+
		"\u013d\7j\2\2\u013d\u013e\7k\2\2\u013e\u013f\7n\2\2\u013f\u0140\7g\2\2"+
		"\u0140,\3\2\2\2\u0141\u0142\7f\2\2\u0142\u0143\7q\2\2\u0143.\3\2\2\2\u0144"+
		"\u0145\7h\2\2\u0145\u0146\7q\2\2\u0146\u0147\7t\2\2\u0147\60\3\2\2\2\u0148"+
		"\u0149\7v\2\2\u0149\u014a\7q\2\2\u014a\62\3\2\2\2\u014b\u014c\5e\63\2"+
		"\u014c\u014d\5i\65\2\u014d\u014e\5c\62\2\u014e\u014f\5S*\2\u014f\u0150"+
		"\5i\65\2\u0150\u0151\5G$\2\u0151\u0152\5_\60\2\u0152\64\3\2\2\2\u0153"+
		"\u0154\5I%\2\u0154\u0155\5O(\2\u0155\u0156\5S*\2\u0156\u0157\5W,\2\u0157"+
		"\u0158\5a\61\2\u0158\66\3\2\2\2\u0159\u015a\5O(\2\u015a\u015b\5a\61\2"+
		"\u015b\u015c\5M\'\2\u015c8\3\2\2\2\u015d\u015e\5k\66\2\u015e\u015f\5m"+
		"\67\2\u015f\u0160\5G$\2\u0160\u0161\5m\67\2\u0161\u0162\5O(\2\u0162\u0163"+
		"\5_\60\2\u0163\u0164\5O(\2\u0164\u0165\5a\61\2\u0165\u0166\5m\67\2\u0166"+
		":\3\2\2\2\u0167\u0168\5Q)\2\u0168\u0169\5o8\2\u0169\u016a\5a\61\2\u016a"+
		"\u016b\5K&\2\u016b\u016c\5m\67\2\u016c\u016d\5W,\2\u016d\u016e\5c\62\2"+
		"\u016e\u016f\5a\61\2\u016f<\3\2\2\2\u0170\u0171\5e\63\2\u0171\u0172\5"+
		"i\65\2\u0172\u0173\5c\62\2\u0173\u0174\5K&\2\u0174\u0175\5O(\2\u0175\u0176"+
		"\5M\'\2\u0176\u0177\5o8\2\u0177\u0178\5i\65\2\u0178\u0179\5O(\2\u0179"+
		">\3\2\2\2\u017a\u017c\t\2\2\2\u017b\u017a\3\2\2\2\u017c\u017d\3\2\2\2"+
		"\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e@\3\2\2\2\u017f\u0181\5"+
		"? \2\u0180\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\5\u00bb^\2\u0185\u0187"+
		"\5? \2\u0186\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u0196\3\2\2\2\u018a\u018c\5\u00bb^\2\u018b\u018d"+
		"\5? \2\u018c\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018c\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0196\3\2\2\2\u0190\u0192\5? \2\u0191\u0190\3\2\2"+
		"\2\u0192\u0193\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196"+
		"\3\2\2\2\u0195\u0180\3\2\2\2\u0195\u018a\3\2\2\2\u0195\u0191\3\2\2\2\u0196"+
		"B\3\2\2\2\u0197\u0198\7*\2\2\u0198\u0199\7,\2\2\u0199\u019d\3\2\2\2\u019a"+
		"\u019c\13\2\2\2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019e\3"+
		"\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0"+
		"\u01a1\7,\2\2\u01a1\u01a2\7+\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\b\"\2"+
		"\2\u01a4D\3\2\2\2\u01a5\u01a9\7}\2\2\u01a6\u01a8\13\2\2\2\u01a7\u01a6"+
		"\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01aa\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa"+
		"\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\7\177\2\2\u01ad\u01ae\3"+
		"\2\2\2\u01ae\u01af\b#\2\2\u01afF\3\2\2\2\u01b0\u01b1\t\3\2\2\u01b1H\3"+
		"\2\2\2\u01b2\u01b3\t\4\2\2\u01b3J\3\2\2\2\u01b4\u01b5\t\5\2\2\u01b5L\3"+
		"\2\2\2\u01b6\u01b7\t\6\2\2\u01b7N\3\2\2\2\u01b8\u01b9\t\7\2\2\u01b9P\3"+
		"\2\2\2\u01ba\u01bb\t\b\2\2\u01bbR\3\2\2\2\u01bc\u01bd\t\t\2\2\u01bdT\3"+
		"\2\2\2\u01be\u01bf\t\n\2\2\u01bfV\3\2\2\2\u01c0\u01c1\t\13\2\2\u01c1X"+
		"\3\2\2\2\u01c2\u01c3\t\f\2\2\u01c3Z\3\2\2\2\u01c4\u01c5\t\r\2\2\u01c5"+
		"\\\3\2\2\2\u01c6\u01c7\t\16\2\2\u01c7^\3\2\2\2\u01c8\u01c9\t\17\2\2\u01c9"+
		"`\3\2\2\2\u01ca\u01cb\t\20\2\2\u01cbb\3\2\2\2\u01cc\u01cd\t\21\2\2\u01cd"+
		"d\3\2\2\2\u01ce\u01cf\t\22\2\2\u01cff\3\2\2\2\u01d0\u01d1\t\23\2\2\u01d1"+
		"h\3\2\2\2\u01d2\u01d3\t\24\2\2\u01d3j\3\2\2\2\u01d4\u01d5\t\25\2\2\u01d5"+
		"l\3\2\2\2\u01d6\u01d7\t\26\2\2\u01d7n\3\2\2\2\u01d8\u01d9\t\27\2\2\u01d9"+
		"p\3\2\2\2\u01da\u01db\t\30\2\2\u01dbr\3\2\2\2\u01dc\u01dd\t\31\2\2\u01dd"+
		"t\3\2\2\2\u01de\u01df\t\32\2\2\u01dfv\3\2\2\2\u01e0\u01e1\t\33\2\2\u01e1"+
		"x\3\2\2\2\u01e2\u01e3\t\34\2\2\u01e3z\3\2\2\2\u01e4\u01e8\t\35\2\2\u01e5"+
		"\u01e7\t\36\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3"+
		"\2\2\2\u01e8\u01e9\3\2\2\2\u01e9|\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ec"+
		"\5q9\2\u01ec\u01ed\5G$\2\u01ed\u01ee\5i\65\2\u01ee~\3\2\2\2\u01ef\u01f0"+
		"\5W,\2\u01f0\u01f1\5a\61\2\u01f1\u01f2\5m\67\2\u01f2\u01f3\5O(\2\u01f3"+
		"\u01f4\5S*\2\u01f4\u01f5\5O(\2\u01f5\u01f6\5i\65\2\u01f6\u0080\3\2\2\2"+
		"\u01f7\u01f8\5i\65\2\u01f8\u01f9\5O(\2\u01f9\u01fa\5G$\2\u01fa\u01fb\5"+
		"]/\2\u01fb\u0082\3\2\2\2\u01fc\u01fd\5W,\2\u01fd\u01fe\5a\61\2\u01fe\u01ff"+
		"\5m\67\2\u01ff\u0200\5O(\2\u0200\u0201\5S*\2\u0201\u0202\5O(\2\u0202\u0203"+
		"\5i\65\2\u0203\u0204\5K&\2\u0204\u0205\5c\62\2\u0205\u0206\5a\61\2\u0206"+
		"\u0207\5k\66\2\u0207\u0208\5m\67\2\u0208\u0084\3\2\2\2\u0209\u020a\5i"+
		"\65\2\u020a\u020b\5O(\2\u020b\u020c\5G$\2\u020c\u020d\5]/\2\u020d\u020e"+
		"\5K&\2\u020e\u020f\5c\62\2\u020f\u0210\5a\61\2\u0210\u0211\5k\66\2\u0211"+
		"\u0212\5m\67\2\u0212\u0086\3\2\2\2\u0213\u0214\5W,\2\u0214\u0215\5a\61"+
		"\2\u0215\u0216\5m\67\2\u0216\u0217\5O(\2\u0217\u0218\5S*\2\u0218\u0219"+
		"\5O(\2\u0219\u021a\5i\65\2\u021a\u021b\5M\'\2\u021b\u021c\5W,\2\u021c"+
		"\u021d\5q9\2\u021d\u0088\3\2\2\2\u021e\u021f\5Q)\2\u021f\u0220\5]/\2\u0220"+
		"\u0221\5c\62\2\u0221\u0222\5G$\2\u0222\u0223\5m\67\2\u0223\u0224\5M\'"+
		"\2\u0224\u0225\5W,\2\u0225\u0226\5q9\2\u0226\u008a\3\2\2\2\u0227\u0228"+
		"\5m\67\2\u0228\u0229\5i\65\2\u0229\u022a\5o8\2\u022a\u022b\5O(\2\u022b"+
		"\u008c\3\2\2\2\u022c\u022d\5Q)\2\u022d\u022e\5G$\2\u022e\u022f\5]/\2\u022f"+
		"\u0230\5k\66\2\u0230\u0231\5O(\2\u0231\u008e\3\2\2\2\u0232\u0233\7-\2"+
		"\2\u0233\u0090\3\2\2\2\u0234\u0235\7/\2\2\u0235\u0092\3\2\2\2\u0236\u0237"+
		"\7,\2\2\u0237\u0094\3\2\2\2\u0238\u0239\7\61\2\2\u0239\u0096\3\2\2\2\u023a"+
		"\u023b\7<\2\2\u023b\u023c\7?\2\2\u023c\u0098\3\2\2\2\u023d\u023e\7.\2"+
		"\2\u023e\u009a\3\2\2\2\u023f\u0240\7=\2\2\u0240\u009c\3\2\2\2\u0241\u0242"+
		"\7<\2\2\u0242\u009e\3\2\2\2\u0243\u0244\7?\2\2\u0244\u00a0\3\2\2\2\u0245"+
		"\u0246\7>\2\2\u0246\u0247\7@\2\2\u0247\u00a2\3\2\2\2\u0248\u0249\7>\2"+
		"\2\u0249\u00a4\3\2\2\2\u024a\u024b\7>\2\2\u024b\u024c\7?\2\2\u024c\u00a6"+
		"\3\2\2\2\u024d\u024e\7@\2\2\u024e\u024f\7?\2\2\u024f\u00a8\3\2\2\2\u0250"+
		"\u0251\7@\2\2\u0251\u00aa\3\2\2\2\u0252\u0253\7*\2\2\u0253\u00ac\3\2\2"+
		"\2\u0254\u0255\7+\2\2\u0255\u00ae\3\2\2\2\u0256\u0257\7]\2\2\u0257\u00b0"+
		"\3\2\2\2\u0258\u0259\7*\2\2\u0259\u025a\7\60\2\2\u025a\u00b2\3\2\2\2\u025b"+
		"\u025c\7_\2\2\u025c\u00b4\3\2\2\2\u025d\u025e\7\60\2\2\u025e\u025f\7+"+
		"\2\2\u025f\u00b6\3\2\2\2\u0260\u0261\7`\2\2\u0261\u00b8\3\2\2\2\u0262"+
		"\u0263\7B\2\2\u0263\u00ba\3\2\2\2\u0264\u0265\7\60\2\2\u0265\u00bc\3\2"+
		"\2\2\u0266\u0267\7\60\2\2\u0267\u0268\7\60\2\2\u0268\u00be\3\2\2\2\u0269"+
		"\u026a\7}\2\2\u026a\u00c0\3\2\2\2\u026b\u026c\7\177\2\2\u026c\u00c2\3"+
		"\2\2\2\u026d\u026e\5o8\2\u026e\u026f\5a\61\2\u026f\u0270\5W,\2\u0270\u0271"+
		"\5m\67\2\u0271\u00c4\3\2\2\2\u0272\u0273\5I%\2\u0273\u0274\5c\62\2\u0274"+
		"\u0275\5c\62\2\u0275\u0276\5]/\2\u0276\u0277\5O(\2\u0277\u0278\5G$\2\u0278"+
		"\u0279\5a\61\2\u0279\u00c6\3\2\2\2\u027a\u027b\5W,\2\u027b\u027c\5M\'"+
		"\2\u027c\u00c8\3\2\2\2\u027d\u027e\5I%\2\u027e\u027f\5]/\2\u027f\u0280"+
		"\5c\62\2\u0280\u0281\5K&\2\u0281\u0282\5[.\2\u0282\u00ca\3\2\2\2\u0283"+
		"\u0284\5W,\2\u0284\u0285\5Q)\2\u0285\u00cc\3\2\2\2\u0286\u0287\5m\67\2"+
		"\u0287\u0288\5U+\2\u0288\u0289\5O(\2\u0289\u028a\5a\61\2\u028a\u00ce\3"+
		"\2\2\2\u028b\u028c\5O(\2\u028c\u028d\5]/\2\u028d\u028e\5k\66\2\u028e\u028f"+
		"\5O(\2\u028f\u00d0\3\2\2\2\u0290\u0292\t\37\2\2\u0291\u0290\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295\u0296\bi\3\2\u0296\u00d2\3\2\2\2\r\2\u017d\u0182\u0188\u018e"+
		"\u0193\u0195\u019d\u01a9\u01e8\u0293\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
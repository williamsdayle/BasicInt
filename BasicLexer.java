// Generated from C:\Users\a120093\Desktop\BasicIntAST\grammar\basicintast\parser\Basic.g4 by ANTLR 4.6

package basicintast.parser;
import basicintast.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BasicLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, GT=3, LT=4, EQ=5, GE=6, LE=7, NE=8, PLUS=9, MINUS=10, MULT=11, 
		DIV=12, OPEN=13, CLOSE=14, OPEN_BL=15, CLOSE_BL=16, IS=17, EOL=18, PRINT=19, 
		READ=20, NUM=21, VAR=22, STR=23, WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IF", "ELSE", "GT", "LT", "EQ", "GE", "LE", "NE", "PLUS", "MINUS", "MULT", 
		"DIV", "OPEN", "CLOSE", "OPEN_BL", "CLOSE_BL", "IS", "EOL", "PRINT", "READ", 
		"NUM", "VAR", "STR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'>'", "'<'", "'=='", "'>='", "'<='", "'!='", 
		"'+'", "'-'", "'*'", "'/'", "'('", "')'", "'{'", "'}'", "'='", "';'", 
		"'print'", "'read'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "ELSE", "GT", "LT", "EQ", "GE", "LE", "NE", "PLUS", "MINUS", 
		"MULT", "DIV", "OPEN", "CLOSE", "OPEN_BL", "CLOSE_BL", "IS", "EOL", "PRINT", 
		"READ", "NUM", "VAR", "STR", "WS"
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


	public BasicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Basic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\6\26l\n\26\r\26\16\26m\3"+
		"\27\3\27\7\27r\n\27\f\27\16\27u\13\27\3\30\3\30\3\30\3\30\7\30{\n\30\f"+
		"\30\16\30~\13\30\3\30\3\30\3\31\6\31\u0083\n\31\r\31\16\31\u0084\3\31"+
		"\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\b\3\2\62"+
		";\4\2C\\c|\6\2\62;C\\aac|\4\2$$^^\6\2\f\f\17\17$$^^\5\2\13\f\17\17\"\""+
		"\u008c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\66\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2"+
		"\13?\3\2\2\2\rB\3\2\2\2\17E\3\2\2\2\21H\3\2\2\2\23K\3\2\2\2\25M\3\2\2"+
		"\2\27O\3\2\2\2\31Q\3\2\2\2\33S\3\2\2\2\35U\3\2\2\2\37W\3\2\2\2!Y\3\2\2"+
		"\2#[\3\2\2\2%]\3\2\2\2\'_\3\2\2\2)e\3\2\2\2+k\3\2\2\2-o\3\2\2\2/v\3\2"+
		"\2\2\61\u0082\3\2\2\2\63\64\7k\2\2\64\65\7h\2\2\65\4\3\2\2\2\66\67\7g"+
		"\2\2\678\7n\2\289\7u\2\29:\7g\2\2:\6\3\2\2\2;<\7@\2\2<\b\3\2\2\2=>\7>"+
		"\2\2>\n\3\2\2\2?@\7?\2\2@A\7?\2\2A\f\3\2\2\2BC\7@\2\2CD\7?\2\2D\16\3\2"+
		"\2\2EF\7>\2\2FG\7?\2\2G\20\3\2\2\2HI\7#\2\2IJ\7?\2\2J\22\3\2\2\2KL\7-"+
		"\2\2L\24\3\2\2\2MN\7/\2\2N\26\3\2\2\2OP\7,\2\2P\30\3\2\2\2QR\7\61\2\2"+
		"R\32\3\2\2\2ST\7*\2\2T\34\3\2\2\2UV\7+\2\2V\36\3\2\2\2WX\7}\2\2X \3\2"+
		"\2\2YZ\7\177\2\2Z\"\3\2\2\2[\\\7?\2\2\\$\3\2\2\2]^\7=\2\2^&\3\2\2\2_`"+
		"\7r\2\2`a\7t\2\2ab\7k\2\2bc\7p\2\2cd\7v\2\2d(\3\2\2\2ef\7t\2\2fg\7g\2"+
		"\2gh\7c\2\2hi\7f\2\2i*\3\2\2\2jl\t\2\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2"+
		"mn\3\2\2\2n,\3\2\2\2os\t\3\2\2pr\t\4\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2"+
		"st\3\2\2\2t.\3\2\2\2us\3\2\2\2v|\7$\2\2wx\7^\2\2x{\t\5\2\2y{\n\6\2\2z"+
		"w\3\2\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2"+
		"\2\177\u0080\7$\2\2\u0080\60\3\2\2\2\u0081\u0083\t\7\2\2\u0082\u0081\3"+
		"\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\b\31\2\2\u0087\62\3\2\2\2\b\2msz|\u0084\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from c:/Users/Fede/Desktop/practicoTc/primerpractico/src/main/java/primerpractico/compiladores.g4 by ANTLR 4.13.1
 

package primerpractico; 


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class compiladoresLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LLA=1, LLC=2, PYC=3, INT=4, IGUAL=5, NUMERO=6, OTRO=7, ID=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "LLA", "LLC", "PYC", "INT", "IGUAL", "NUMERO", "OTRO", 
			"ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'int'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LLA", "LLC", "PYC", "INT", "IGUAL", "NUMERO", "OTRO", "ID"
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


	public compiladoresLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compiladores.g4"; }

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
		"\u0004\u0000\b8\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0004\u0007\'\b\u0007\u000b\u0007\f\u0007"+
		"(\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t/\b\t\u0001\t\u0001\t\u0001\t"+
		"\u0005\t4\b\t\n\t\f\t7\t\t\u0000\u0000\n\u0001\u0000\u0003\u0000\u0005"+
		"\u0001\u0007\u0002\t\u0003\u000b\u0004\r\u0005\u000f\u0006\u0011\u0007"+
		"\u0013\b\u0001\u0000\u0002\u0002\u0000AZaz\u0001\u000009:\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0001\u0015\u0001\u0000"+
		"\u0000\u0000\u0003\u0017\u0001\u0000\u0000\u0000\u0005\u0019\u0001\u0000"+
		"\u0000\u0000\u0007\u001b\u0001\u0000\u0000\u0000\t\u001d\u0001\u0000\u0000"+
		"\u0000\u000b\u001f\u0001\u0000\u0000\u0000\r#\u0001\u0000\u0000\u0000"+
		"\u000f&\u0001\u0000\u0000\u0000\u0011*\u0001\u0000\u0000\u0000\u0013."+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0007\u0000\u0000\u0000\u0016\u0002"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0007\u0001\u0000\u0000\u0018\u0004"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0005{\u0000\u0000\u001a\u0006\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0005}\u0000\u0000\u001c\b\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0005;\u0000\u0000\u001e\n\u0001\u0000\u0000"+
		"\u0000\u001f \u0005i\u0000\u0000 !\u0005n\u0000\u0000!\"\u0005t\u0000"+
		"\u0000\"\f\u0001\u0000\u0000\u0000#$\u0005=\u0000\u0000$\u000e\u0001\u0000"+
		"\u0000\u0000%\'\u0003\u0003\u0001\u0000&%\u0001\u0000\u0000\u0000\'(\u0001"+
		"\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000"+
		")\u0010\u0001\u0000\u0000\u0000*+\t\u0000\u0000\u0000+\u0012\u0001\u0000"+
		"\u0000\u0000,/\u0003\u0001\u0000\u0000-/\u0005_\u0000\u0000.,\u0001\u0000"+
		"\u0000\u0000.-\u0001\u0000\u0000\u0000/5\u0001\u0000\u0000\u000004\u0003"+
		"\u0001\u0000\u000014\u0003\u0003\u0001\u000024\u0005_\u0000\u000030\u0001"+
		"\u0000\u0000\u000031\u0001\u0000\u0000\u000032\u0001\u0000\u0000\u0000"+
		"47\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u00006\u0014\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000\u0005"+
		"\u0000(.35\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
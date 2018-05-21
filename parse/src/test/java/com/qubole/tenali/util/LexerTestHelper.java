package com.qubole.tenali.util;

import antlr4.TenaliCommandLexer;
import antlr4.TenaliCommandParser;
import com.qubole.tenali.parse.TenaliCommandParserImpl;
import com.qubole.tenali.parse.exception.CommandErrorListener;
import com.qubole.tenali.parse.exception.CommandParseError;
import com.qubole.tenali.parse.exception.SQLSyntaxError;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * Created by devjyotip on 5/10/18.
 */
public class LexerTestHelper {

  public static void parse(String command) throws IOException {
    InputStream antlrInputStream =
        new ByteArrayInputStream(command.getBytes(StandardCharsets.UTF_8));
    TenaliCommandLexer lexer =
        new TenaliCommandLexer(CharStreams.fromStream(antlrInputStream, StandardCharsets.UTF_8));

    TenaliCommandParser parser = new TenaliCommandParser(new CommonTokenStream(lexer));
    parser.setBuildParseTree(true);
    parser.removeErrorListeners();
    parser.addErrorListener(new CommandErrorListener());

    ParseTree tree;
    try {
      tree = parser.parse();
    } catch (CommandParseError e) {
      throw new SQLSyntaxError(e);
    }

    TenaliCommandParserImpl commandVisitor = new TenaliCommandParserImpl();
    commandVisitor.visit(tree);
  }
}

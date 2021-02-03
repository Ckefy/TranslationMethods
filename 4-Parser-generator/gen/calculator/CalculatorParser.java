package calculator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;

public class CalculatorParser {
	public Node tree;
	public static class Node {
		private String name;
		private List<Node> children = new ArrayList<>();

		Node(String s) {
			name = s;
		}

		public void addChild(Node node) {
			children.add(node);
		}

		public String getName() {
			return name;
		}

		void print(int testNumber) {
			final String outDir = System.getProperty("user.dir") + File.separator + "Parsed";
			Path outputFile = Paths.get(outDir + File.separator + "TreeParsed" + testNumber + ".gv");
			if (outputFile.getParent() != null) {
				try {
					Files.createDirectories(outputFile.getParent());
				} catch (IOException e) {
					System.out.println("Couldn't create output file path");
					return;
				}
			}
			try (BufferedWriter writer = Files.newBufferedWriter(outputFile, StandardCharsets.UTF_8)) {
				final String fileStart = "digraph HelloWorld {";
				final String fileEnd = "}";

				writer.write(fileStart);
				printNode(writer, 1, -1);
				writer.write(fileEnd);
			} catch (IOException e) {
				System.out.println("Unable to write to file: " + e.getMessage());
			}
		}

		private int printNode(BufferedWriter writer, int curID, int parentID) throws IOException, IOException {
			final String startNode = Integer.toString(curID) + "[label=\"" + name + "\"];";

			writer.write(startNode);
			if (parentID != -1){
				writer.write(Integer.toString(parentID) + " -> " + Integer.toString(curID) + ";");
			}
			int freeID = curID + 1;
			if (!children.isEmpty()) {
				for (Node child : children) {
					freeID = child.printNode(writer, freeID, curID);
				}
			}
			return freeID;
		}
	}

	public class Node_MinusOp extends Node {
		Node_MinusOp() {
			super("MinusOp");
		}
		public int value;
	}

	public class Node_R extends Node {
		Node_R() {
			super("R");
		}
		public int value;
	}

	public class Node_PowOp extends Node {
		Node_PowOp() {
			super("PowOp");
		}
		public int value;
	}

	public class Node_T extends Node {
		Node_T() {
			super("T");
		}
		public int value;
	}

	public class Node_D extends Node {
		Node_D() {
			super("D");
		}
		public int value;
	}

	public class Node_E extends Node {
		Node_E() {
			super("E");
		}
		public int value;
	}

	public class Node_F extends Node {
		Node_F() {
			super("F");
		}
		public int value;
	}

	public class Node_MulOp extends Node {
		Node_MulOp() {
			super("MulOp");
		}
		public int value;
	}

	public class Node_G extends Node {
		Node_G() {
			super("G");
		}
		public int value;
	}

	public class Node_PlusOp extends Node {
		Node_PlusOp() {
			super("PlusOp");
		}
		public int value;
	}

	public class Node_H extends Node {
		Node_H() {
			super("H");
		}
		public int value;
	}

	public class Node_DivOp extends Node {
		Node_DivOp() {
			super("DivOp");
		}
		public int value;
	}

	private CalculatorLex lex;

	public CalculatorParser(CalculatorLex lex) throws Exception {
		this.lex = lex;
		buildTree();
	}

	private void buildTree() throws Exception {
		tree = _E();
		if (lex.getCurrentToken() != CalculatorToken._END) {
			throw new Exception("Cur token is " + lex.getCurrentToken().toString() + " but expected END.");
		}
	}

	public void showTree(int ind) {
		tree.print(ind);
	}

	public int getvalue() {
		return ((Node_E)tree).value;
	}

	private void consume(CalculatorToken token) throws Exception{
		if (lex.getCurrentToken() != token) {
			throw new Exception("Expected another token.");
		}
	}

	private Node_MinusOp _MinusOp(int a, int b) throws Exception {
		Node_MinusOp res = new Node_MinusOp();
		switch (lex.getCurrentToken()) {
			case _END :
			case RBRACKET :
			case PLUS :
			case MINUS :
			{
				res.value = a - b;
				return res;
			}
			default : 
				throw new Exception("Unexpected token.");
		}
	}

	private Node_R _R(int a) throws Exception {
		Node_R res = new Node_R();
		switch (lex.getCurrentToken()) {
			case _END :
			case DIV :
			case MUL :
			case RBRACKET :
			case PLUS :
			case MINUS :
			{
				res.value = a;
				return res;
			}
			case POW :
			{
				consume(CalculatorToken.POW);
				res.addChild(new Node("POW"));
				
				lex.getNextToken();
				Node_F n0 = _F();
				res.addChild(n0);
				int u = n0.value;
				Node_R n1 = _R(u);
				res.addChild(n1);
				int acc = n1.value;
				Node_PowOp n2 = _PowOp(a, acc);
				res.addChild(n2);
				res.value = n2.value;
				return res;
			}
			default : 
				throw new Exception("Unexpected token.");
		}
	}

	private Node_PowOp _PowOp(int a, int b) throws Exception {
		Node_PowOp res = new Node_PowOp();
		switch (lex.getCurrentToken()) {
			case _END :
			case DIV :
			case MUL :
			case RBRACKET :
			case PLUS :
			case MINUS :
			{
				res.value = (int) Math.pow(a, b);
				return res;
			}
			default : 
				throw new Exception("Unexpected token.");
		}
	}

	private Node_T _T() throws Exception {
		Node_T res = new Node_T();
		switch (lex.getCurrentToken()) {
			case NUMBER :
			case LBRACKET :
			case MINUS :
			{
				Node_F n0 = _F();
				res.addChild(n0);
				int u = n0.value;
				Node_H n1 = _H(u);
				res.addChild(n1);
				res.value = n1.value;
				return res;
			}
			default : 
				throw new Exception("Unexpected token.");
		}
	}

	private Node_D _D() throws Exception {
		Node_D res = new Node_D();
		switch (lex.getCurrentToken()) {
			case NUMBER :
			case LBRACKET :
			case MINUS :
			{
				Node_F n0 = _F();
				res.addChild(n0);
				int u = n0.value;
				Node_R n1 = _R(u);
				res.addChild(n1);
				res.value = n1.value;
				return res;
			}
			default : 
				throw new Exception("Unexpected token.");
		}
	}

	private Node_E _E() throws Exception {
		Node_E res = new Node_E();
		switch (lex.getCurrentToken()) {
			case NUMBER :
			case LBRACKET :
			case MINUS :
			{
				Node_D n0 = _D();
				res.addChild(n0);
				int m = n0.value;
				Node_H n1 = _H(m);
				res.addChild(n1);
				int u = n1.value;
				Node_G n2 = _G(u);
				res.addChild(n2);
				res.value = n2.value;
				return res;
			}
			default : 
				throw new Exception("Unexpected token.");
		}
	}

	private Node_F _F() throws Exception {
		Node_F res = new Node_F();
		switch (lex.getCurrentToken()) {
			case NUMBER :
			{
				consume(CalculatorToken.NUMBER);
				res.addChild(new Node("NUMBER"));
				res.value = Integer.parseInt(lex.getCurrentTokenString());
				lex.getNextToken();
				return res;
			}
			case MINUS :
			{
				consume(CalculatorToken.MINUS);
				res.addChild(new Node("MINUS"));
				
				lex.getNextToken();
				Node_F n0 = _F();
				res.addChild(n0);
				res.value = -(n0.value);
				return res;
			}
			case LBRACKET :
			{
				consume(CalculatorToken.LBRACKET);
				res.addChild(new Node("LBRACKET"));
				
				lex.getNextToken();
				Node_E n0 = _E();
				res.addChild(n0);
				res.value = n0.value;
				consume(CalculatorToken.RBRACKET);
				res.addChild(new Node("RBRACKET"));
				
				lex.getNextToken();
				return res;
			}
			default : 
				throw new Exception("Unexpected token.");
		}
	}

	private Node_MulOp _MulOp(int a, int b) throws Exception {
		Node_MulOp res = new Node_MulOp();
		switch (lex.getCurrentToken()) {
			case _END :
			case DIV :
			case MUL :
			case RBRACKET :
			case PLUS :
			case MINUS :
			{
				res.value = a * b;
				return res;
			}
			default : 
				throw new Exception("Unexpected token.");
		}
	}

	private Node_G _G(int a) throws Exception {
		Node_G res = new Node_G();
		switch (lex.getCurrentToken()) {
			case _END :
			case RBRACKET :
			{
				res.value = a;
				return res;
			}
			case PLUS :
			{
				consume(CalculatorToken.PLUS);
				res.addChild(new Node("PLUS"));
				
				lex.getNextToken();
				Node_T n0 = _T();
				res.addChild(n0);
				int u = n0.value;
				Node_PlusOp n1 = _PlusOp(a, u);
				res.addChild(n1);
				int acc = n1.value;
				Node_G n2 = _G(acc);
				res.addChild(n2);
				res.value = n2.value;
				return res;
			}
			case MINUS :
			{
				consume(CalculatorToken.MINUS);
				res.addChild(new Node("MINUS"));
				
				lex.getNextToken();
				Node_T n0 = _T();
				res.addChild(n0);
				int u = n0.value;
				Node_MinusOp n1 = _MinusOp(a, u);
				res.addChild(n1);
				int acc = n1.value;
				Node_G n2 = _G(acc);
				res.addChild(n2);
				res.value = n2.value;
				return res;
			}
			default : 
				throw new Exception("Unexpected token.");
		}
	}

	private Node_PlusOp _PlusOp(int a, int b) throws Exception {
		Node_PlusOp res = new Node_PlusOp();
		switch (lex.getCurrentToken()) {
			case _END :
			case RBRACKET :
			case PLUS :
			case MINUS :
			{
				res.value = a + b;
				return res;
			}
			default : 
				throw new Exception("Unexpected token.");
		}
	}

	private Node_H _H(int a) throws Exception {
		Node_H res = new Node_H();
		switch (lex.getCurrentToken()) {
			case _END :
			case RBRACKET :
			case PLUS :
			case MINUS :
			{
				res.value = a;
				return res;
			}
			case MUL :
			{
				consume(CalculatorToken.MUL);
				res.addChild(new Node("MUL"));
				
				lex.getNextToken();
				Node_D n0 = _D();
				res.addChild(n0);
				int u = n0.value;
				Node_MulOp n1 = _MulOp(a, u);
				res.addChild(n1);
				int acc = n1.value;
				Node_H n2 = _H(acc);
				res.addChild(n2);
				res.value = n2.value;
				return res;
			}
			case DIV :
			{
				consume(CalculatorToken.DIV);
				res.addChild(new Node("DIV"));
				
				lex.getNextToken();
				Node_D n0 = _D();
				res.addChild(n0);
				int u = n0.value;
				Node_DivOp n1 = _DivOp(a, u);
				res.addChild(n1);
				int acc = n1.value;
				Node_H n2 = _H(acc);
				res.addChild(n2);
				res.value = n2.value;
				return res;
			}
			default : 
				throw new Exception("Unexpected token.");
		}
	}

	private Node_DivOp _DivOp(int a, int b) throws Exception {
		Node_DivOp res = new Node_DivOp();
		switch (lex.getCurrentToken()) {
			case _END :
			case DIV :
			case MUL :
			case RBRACKET :
			case PLUS :
			case MINUS :
			{
				res.value = a / b;
				return res;
			}
			default : 
				throw new Exception("Unexpected token.");
		}
	}

}

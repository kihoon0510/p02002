package parser;

public class ParserTest {
	public static void main(String[] args) {
		Iparseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}
}

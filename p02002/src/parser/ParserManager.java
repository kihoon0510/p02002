package parser;

class ParserManager{
	/**
	 *  This method is select that you want type of file 
	 * @param type - choose XML or HTML
	 * @return Iparseable(interpace), you should implement this
	 */
	public static Iparseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		}else {
			return new HTMLparser();
		}
	}
}
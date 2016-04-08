package ;

/**
 * ...
 * @author Jonas Nyström
 */
class Main 
{
	public static function main() 
	{	
		var filename = 'tiger.svg';		
		//var filename = 'g-clef.svg';		
	
		trace('Loading the SVG file...');
		var svgString = sys.io.File.getContent('../svg/$filename');
		
		trace('Add appropriate namespace to the xml...');
		svgString = addNamespace(svgString);
		
		trace('Translate the svg into g2d code...');
		var classString = generateClassCode(svgString);
		
		//trace(classString);
		trace('Saving the generated g2d java...');
		sys.io.File.saveContent('generated-g2d.$filename.java', classString);
		
		trace('Done!');
		Sys.exit(0);
	}
	
	static public function addNamespace(svgString:String):String {
		try 
		{
			var xml = Xml.parse(svgString);
			if (!xml.firstElement().exists('xmlns')) 
				xml.firstElement().set('xmlns', 'http://www.w3.org/2000/svg');
			return xml.toString();
		} 
		catch (e:Dynamic)
		{
			return svgString;
		}
	}	
	
	static public function generateClassCode(svgString:String, className:String = 'ResultingClassName'):String {
		var writer = null;
		var inputStream = new java.io.StringBufferInputStream(svgString);
		try
		{
			writer = new java.io.StringWriter();
		}
		catch  (e:Dynamic  )
		{
			trace(e);
		}
		var transcoder = new com.btr.svg2java.java2d.SvgToJava2DTranscoder();
		transcoder.transcode(inputStream, writer, className);
		var text = writer.toString();
		return text;
	}
	
}


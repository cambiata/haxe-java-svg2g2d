package ;

/*
import letters.Path;
import letters.targetJava.BasicJava;
*/

import java.Lib;
import java.awt.Paint;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.Color;
import java.javax.swing.JFrame;
import java.javax.swing.JPanel;
/*
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.batik.dom.svg.SAXSVGDocumentFactory;
*/
//import org.apache.batik.dom.GenericDOMImplementation;

//import org.w3c.dom.Document;
//import org.w3c.dom.DOMImplementation;

/*
 -java-lib batik-util.jar
-java-lib batik-svggen.jar
-java-lib batik-ext.jar
-java-lib batik-awt-util.jar
-java-lib batik-svg-dom.jar
-java-lib batik-dom.jar
*/
import java.io.File;
import java.io.Writer;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.StringWriter;
import java.io.StringBufferInputStream;
import java.io.FileWriter;
import java.io.BufferedWriter;
import com.btr.svg2java.java2d.SvgToJava2DTranscoder;
/**
 * ...
 * @author Jonas Nyström
 */
class Main 
{
	public static function main() 
	{		
		trace('Getting the xml string from resource...');
		var svgString = haxe.Resource.getString("svgString");
		
		trace('Add appropriate namespace to the xml...');
		svgString = addNamespace(svgString);
		
		trace('Translate the svg into g2d code');
		var classString = generateClassCode(svgString);
		
		//trace(classString);
		trace('Saving the java code as "output.svg2g2d.java"...');
		saveContent('output.svg2g2d.java', classString);
		
		trace('Done!');
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
		var writer:java.io.StringWriter = null;
		var inputStream:InputStream = new StringBufferInputStream(svgString);
		try
		{
			writer = new java.io.StringWriter();
		}
		catch  (e:Dynamic  )
		{
			trace(e);
		}
		var transcoder:SvgToJava2DTranscoder = new SvgToJava2DTranscoder();
		transcoder.transcode(inputStream, writer, className);
		var text = writer.toString();
		return text;
	}
	
	static public function saveContent(filename:String, content:String) {
		try 
		{
			var file = new File(filename);
			var output = new BufferedWriter(new FileWriter(file));
			output.write(content);
			output.close();
		} catch ( e:Dynamic ) {
		   //e.printStackTrace();
		   trace(e);
		}
	}	
	
}
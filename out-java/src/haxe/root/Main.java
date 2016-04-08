package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Main extends haxe.lang.HxObject
{
	public static void main(String[] args)
	{
		main();
	}
	
	public Main(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Main()
	{
		//line 7 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		haxe.root.Main.__hx_ctor__Main(this);
	}
	
	
	public static void __hx_ctor__Main(haxe.root.Main __temp_me4)
	{
	}
	
	
	public static void main()
	{
		//line 11 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		java.lang.String filename = "tiger.svg";
		//line 14 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, "Loading the SVG file...", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Main", "Main.hx", "main"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (14) )) )}));
		//line 15 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		java.lang.String svgString = sys.io.File.getContent(( "../svg/" + filename ));
		//line 17 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, "Add appropriate namespace to the xml...", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Main", "Main.hx", "main"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (17) )) )}));
		//line 18 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		svgString = haxe.root.Main.addNamespace(svgString);
		//line 20 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, "Translate the svg into g2d code...", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Main", "Main.hx", "main"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (20) )) )}));
		//line 21 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		java.lang.String classString = haxe.root.Main.generateClassCode(svgString, null);
		//line 24 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, "Saving the generated g2d java...", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Main", "Main.hx", "main"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (24) )) )}));
		//line 25 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		sys.io.File.saveContent(( ( "generated-g2d." + filename ) + ".java" ), classString);
		//line 27 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, "Done!", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Main", "Main.hx", "main"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (27) )) )}));
		//line 28 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		haxe.root.Sys.exit(0);
	}
	
	
	public static java.lang.String addNamespace(java.lang.String svgString)
	{
		//line 33 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		try 
		{
			//line 34 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			haxe.root.Xml xml = haxe.root.Xml.parse(svgString);
			//line 35 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			if ( ! (xml.firstElement().exists("xmlns")) ) 
			{
				//line 36 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
				xml.firstElement().set("xmlns", "http://www.w3.org/2000/svg");
			}
			
			//line 37 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			return haxe.xml.Printer.print(xml, null);
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 33 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 41 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 41 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 41 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 41 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			{
				//line 41 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
				java.lang.Object e = __temp_catchall2;
				//line 41 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
				return svgString;
			}
			
		}
		
		
	}
	
	
	public static java.lang.String generateClassCode(java.lang.String svgString, java.lang.String className)
	{
		//line 45 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		if (( className == null )) 
		{
			//line 45 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			className = "ResultingClassName";
		}
		
		//line 46 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		java.io.StringWriter writer = null;
		//line 47 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		java.io.StringBufferInputStream inputStream = new java.io.StringBufferInputStream(svgString);
		//line 50 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		try 
		{
			//line 50 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			writer = new java.io.StringWriter();
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 50 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 54 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 54 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 54 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 54 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			{
				//line 54 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
				java.lang.Object e = __temp_catchall2;
				//line 54 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, e, 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Main", "Main.hx", "generateClassCode"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (54) )) )}));
			}
			
		}
		
		
		//line 56 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		com.btr.svg2java.java2d.SvgToJava2DTranscoder transcoder = new com.btr.svg2java.java2d.SvgToJava2DTranscoder();
		//line 57 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		transcoder.transcode(((java.io.InputStream) (inputStream) ), ((java.io.Writer) (writer) ), haxe.lang.Runtime.toString(className));
		//line 58 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		java.lang.String text = writer.toString();
		//line 59 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		return text;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 7 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		return new haxe.root.Main(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 7 "I:\\Dropbox\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		return new haxe.root.Main();
	}
	
	
}



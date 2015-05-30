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
		//line 46 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		haxe.root.Main.__hx_ctor__Main(this);
	}
	
	
	public static void __hx_ctor__Main(haxe.root.Main __temp_me5)
	{
	}
	
	
	public static void main()
	{
		//line 50 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, "Getting the xml string from resource...", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Main", "Main.hx", "main"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (50) )) )}));
		//line 51 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		java.lang.String svgString = haxe.Resource.getString("svgString");
		//line 53 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, "Add appropriate namespace to the xml...", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Main", "Main.hx", "main"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (53) )) )}));
		//line 54 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		svgString = haxe.root.Main.addNamespace(svgString);
		//line 56 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, "Translate the svg into g2d code", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Main", "Main.hx", "main"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (56) )) )}));
		//line 57 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		java.lang.String classString = haxe.root.Main.generateClassCode(svgString, null);
		//line 60 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, "Saving the java code as \"output.svg2g2d.java\"...", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Main", "Main.hx", "main"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (60) )) )}));
		//line 61 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		haxe.root.Main.saveContent("output.svg2g2d.java", classString);
		//line 63 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, "Done!", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Main", "Main.hx", "main"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (63) )) )}));
	}
	
	
	public static java.lang.String addNamespace(java.lang.String svgString)
	{
		//line 68 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		try 
		{
			//line 69 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			haxe.root.Xml xml = haxe.root.Xml.parse(svgString);
			//line 70 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			if ( ! (xml.firstElement().exists("xmlns")) ) 
			{
				//line 71 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
				xml.firstElement().set("xmlns", "http://www.w3.org/2000/svg");
			}
			
			//line 72 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			return haxe.xml.Printer.print(xml, null);
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 68 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 76 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 76 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 76 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 76 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			{
				//line 76 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
				java.lang.Object e = __temp_catchall2;
				//line 76 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
				return svgString;
			}
			
		}
		
		
	}
	
	
	public static java.lang.String generateClassCode(java.lang.String svgString, java.lang.String className)
	{
		//line 80 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		if (( className == null )) 
		{
			//line 80 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			className = "ResultingClassName";
		}
		
		//line 81 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		java.io.StringWriter writer = null;
		//line 82 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		java.io.InputStream inputStream = new java.io.StringBufferInputStream(svgString);
		//line 85 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		try 
		{
			//line 85 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			writer = new java.io.StringWriter();
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 85 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 89 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 89 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 89 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 89 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			{
				//line 89 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
				java.lang.Object e = __temp_catchall2;
				//line 89 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, e, 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Main", "Main.hx", "generateClassCode"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (89) )) )}));
			}
			
		}
		
		
		//line 91 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		com.btr.svg2java.java2d.SvgToJava2DTranscoder transcoder = new com.btr.svg2java.java2d.SvgToJava2DTranscoder();
		//line 92 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		transcoder.transcode(((java.io.InputStream) (inputStream) ), ((java.io.Writer) (writer) ), haxe.lang.Runtime.toString(className));
		//line 93 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		java.lang.String text = writer.toString();
		//line 94 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		return text;
	}
	
	
	public static void saveContent(java.lang.String filename, java.lang.String content)
	{
		//line 99 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		try 
		{
			//line 100 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			java.io.File file = new java.io.File(haxe.lang.Runtime.toString(filename));
			//line 101 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			java.io.BufferedWriter output = new java.io.BufferedWriter(new java.io.FileWriter(((java.io.File) (file) )));
			//line 102 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			output.write(haxe.lang.Runtime.toString(content));
			//line 103 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			output.close();
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 99 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 106 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 106 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 106 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 106 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
			{
				//line 106 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
				java.lang.Object e = __temp_catchall2;
				//line 106 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, e, 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Main", "Main.hx", "saveContent"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (106) )) )}));
			}
			
		}
		
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 46 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		return new haxe.root.Main(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 46 "F:\\_dev\\haxe-java-svg2g2d\\src\\Main.hx"
		return new haxe.root.Main();
	}
	
	
}



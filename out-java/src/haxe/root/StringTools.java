package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringTools extends haxe.lang.HxObject
{
	public StringTools(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StringTools()
	{
		//line 35 "F:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		haxe.root.StringTools.__hx_ctor__StringTools(this);
	}
	
	
	public static void __hx_ctor__StringTools(haxe.root.StringTools __temp_me8)
	{
	}
	
	
	public static java.lang.String htmlEscape(java.lang.String s, java.lang.Object quotes)
	{
		//line 101 "F:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		s = haxe.lang.StringExt.split(haxe.lang.StringExt.split(haxe.lang.StringExt.split(s, "&").join("&amp;"), "<").join("&lt;"), ">").join("&gt;");
		//line 102 "F:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		if (haxe.lang.Runtime.toBool((quotes))) 
		{
			//line 102 "F:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return haxe.lang.StringExt.split(haxe.lang.StringExt.split(s, "\"").join("&quot;"), "\'").join("&#039;");
		}
		else
		{
			//line 102 "F:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return s;
		}
		
	}
	
	
	public static boolean isSpace(java.lang.String s, int pos)
	{
		//line 190 "F:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		java.lang.Object c = haxe.lang.StringExt.charCodeAt(s, pos);
		//line 191 "F:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		return ( ( ( haxe.lang.Runtime.compare(c, 8) > 0 ) && ( haxe.lang.Runtime.compare(c, 14) < 0 ) ) || haxe.lang.Runtime.eq(c, 32) );
	}
	
	
	public static java.lang.String ltrim(java.lang.String s)
	{
		//line 207 "F:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		int l = s.length();
		//line 208 "F:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		int r = 0;
		//line 209 "F:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		while (( ( r < l ) && haxe.root.StringTools.isSpace(s, r) ))
		{
			//line 210 "F:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			r++;
		}
		
		//line 212 "F:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		if (( r > 0 )) 
		{
			//line 213 "F:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return haxe.lang.StringExt.substr(s, r, ( l - r ));
		}
		else
		{
			//line 215 "F:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return s;
		}
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 35 "F:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		return new haxe.root.StringTools(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 35 "F:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		return new haxe.root.StringTools();
	}
	
	
}



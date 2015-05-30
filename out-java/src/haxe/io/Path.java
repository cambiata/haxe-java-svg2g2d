package haxe.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Path extends haxe.lang.HxObject
{
	public Path(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Path()
	{
		//line 31 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Path.hx"
		haxe.io.Path.__hx_ctor_haxe_io_Path(this);
	}
	
	
	public static void __hx_ctor_haxe_io_Path(haxe.io.Path __temp_me19)
	{
	}
	
	
	public static java.lang.String escape(java.lang.String path, java.lang.Object allowSlashes)
	{
		//line 315 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Path.hx"
		boolean __temp_allowSlashes18 = ( (haxe.lang.Runtime.eq(allowSlashes, null)) ? (false) : (haxe.lang.Runtime.toBool(allowSlashes)) );
		//line 316 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Path.hx"
		haxe.root.EReg regex = null;
		//line 316 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Path.hx"
		if (__temp_allowSlashes18) 
		{
			//line 316 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Path.hx"
			regex = new haxe.root.EReg("[^A-Za-z0-9_/\\\\\\.]", "g");
		}
		else
		{
			//line 316 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Path.hx"
			regex = new haxe.root.EReg("[^A-Za-z0-9_\\.]", "g");
		}
		
		//line 317 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Path.hx"
		return regex.map(path, ( (( haxe.io.Path_escape_317__Fun.__hx_current != null )) ? (haxe.io.Path_escape_317__Fun.__hx_current) : (haxe.io.Path_escape_317__Fun.__hx_current = ((haxe.io.Path_escape_317__Fun) (new haxe.io.Path_escape_317__Fun()) )) ));
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 31 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Path.hx"
		return new haxe.io.Path(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 31 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Path.hx"
		return new haxe.io.Path();
	}
	
	
}



package haxe.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Path_escape_317__Fun extends haxe.lang.Function
{
	public Path_escape_317__Fun()
	{
		//line 317 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Path.hx"
		super(1, 0);
	}
	
	
	public static haxe.io.Path_escape_317__Fun __hx_current;
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 317 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Path.hx"
		haxe.root.EReg v = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.root.EReg) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.root.EReg) (__fn_dyn1) )) );
		//line 317 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Path.hx"
		return ( haxe.lang.Runtime.toString("-x") + haxe.lang.Runtime.toString(haxe.lang.StringExt.charCodeAt(v.matched(0), 0)) );
	}
	
	
}


package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Resource extends haxe.lang.HxObject
{
	static
	{
		//line 26 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Resource.hx"
		haxe.Resource.content = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"svgString"});
	}
	
	public Resource(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Resource()
	{
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Resource.hx"
		haxe.Resource.__hx_ctor_haxe_Resource(this);
	}
	
	
	public static void __hx_ctor_haxe_Resource(haxe.Resource __temp_me12)
	{
	}
	
	
	public static haxe.root.Array<java.lang.String> content;
	
	public static java.lang.String getString(java.lang.String name)
	{
		//line 34 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Resource.hx"
		name = haxe.io.Path.escape(name, true);
		//line 35 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Resource.hx"
		java.io.InputStream stream = (((java.lang.Class) (haxe.Resource.class) )).getResourceAsStream(haxe.lang.Runtime.toString(( "/" + name )));
		//line 36 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Resource.hx"
		if (( stream == null )) 
		{
			//line 37 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Resource.hx"
			return null;
		}
		
		//line 38 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Resource.hx"
		haxe.java.io.NativeInput stream1 = new haxe.java.io.NativeInput(((java.io.InputStream) (stream) ));
		//line 39 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Resource.hx"
		return stream1.readAll(null).toString();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Resource.hx"
		return new haxe.Resource(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Resource.hx"
		return new haxe.Resource();
	}
	
	
}



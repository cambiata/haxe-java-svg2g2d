package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Enum
{
	public Enum(int index)
	{
		//line 76 "F:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		this.index = index;
	}
	
	
	public final int index;
	
	public java.lang.String getTag()
	{
		//line 81 "F:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		throw haxe.lang.HaxeException.wrap("Not Implemented");
	}
	
	
	public haxe.root.Array<java.lang.Object> getParams()
	{
		//line 86 "F:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		return new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{});
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 91 "F:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		return this.getTag();
	}
	
	
}



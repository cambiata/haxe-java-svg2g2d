package haxe.ds;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringMap_keys_363__Fun<T> extends haxe.lang.Function
{
	public StringMap_keys_363__Fun(haxe.ds.StringMap<T> _g1, int[] i, int len)
	{
		//line 363 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
		super(0, 0);
		//line 363 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
		this._g1 = _g1;
		//line 363 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
		this.i = i;
		//line 363 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
		this.len = len;
	}
	
	
	@Override public java.lang.Object __hx_invoke0_o()
	{
		//line 364 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
		{
			//line 364 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
			int _g = this.i[0];
			//line 364 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
			while (( _g < this.len ))
			{
				//line 364 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
				int j = _g++;
				//line 366 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
				if ( ! ((( (( this._g1.hashes[j] & -2 )) == 0 ))) ) 
				{
					//line 368 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
					this.i[0] = j;
					//line 369 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
					return true;
				}
				
			}
			
		}
		
		//line 372 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
		return false;
	}
	
	
	public haxe.ds.StringMap<T> _g1;
	
	public int[] i;
	
	public int len;
	
}



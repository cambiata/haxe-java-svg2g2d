package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class EReg extends haxe.lang.HxObject
{
	public EReg(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public EReg(java.lang.String r, java.lang.String opt)
	{
		//line 31 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		haxe.root.EReg.__hx_ctor__EReg(this, r, opt);
	}
	
	
	public static void __hx_ctor__EReg(haxe.root.EReg __temp_me3, java.lang.String r, java.lang.String opt)
	{
		//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		int flags = 0;
		//line 33 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		{
			//line 33 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			int _g1 = 0;
			//line 33 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			int _g = opt.length();
			//line 33 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			while (( _g1 < _g ))
			{
				//line 33 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
				int i = _g1++;
				//line 35 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
				{
					//line 35 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					int _g2 = 0;
					//line 35 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					if (( i < opt.length() )) 
					{
						//line 35 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						_g2 = ((int) (opt.charAt(i)) );
					}
					else
					{
						//line 35 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						_g2 = -1;
					}
					
					//line 35 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					switch (_g2)
					{
						case 105:
						{
							//line 38 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
							flags |= java.util.regex.Pattern.CASE_INSENSITIVE;
							//line 38 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
							break;
						}
						
						
						case 109:
						{
							//line 40 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
							flags |= java.util.regex.Pattern.MULTILINE;
							//line 40 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
							break;
						}
						
						
						case 115:
						{
							//line 42 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
							flags |= java.util.regex.Pattern.DOTALL;
							//line 42 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
							break;
						}
						
						
						case 103:
						{
							//line 44 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
							__temp_me3.isGlobal = true;
							//line 44 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
							break;
						}
						
						
					}
					
				}
				
			}
			
		}
		
		//line 48 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		__temp_me3.matcher = java.util.regex.Pattern.compile(haxe.lang.Runtime.toString(haxe.root.EReg.convert(r)), ((int) (flags) )).matcher(((java.lang.CharSequence) ("") ));
		//line 49 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		__temp_me3.pattern = r;
	}
	
	
	public static java.lang.String convert(java.lang.String r)
	{
		//line 77 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		return r;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		return new haxe.root.EReg(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		return new haxe.root.EReg(haxe.lang.Runtime.toString(arr.__get(0)), haxe.lang.Runtime.toString(arr.__get(1)));
	}
	
	
	public java.lang.String pattern;
	
	public java.util.regex.Matcher matcher;
	
	public boolean isGlobal;
	
	public java.lang.String replace(java.lang.String s, java.lang.String by)
	{
		//line 151 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		this.matcher.reset(((java.lang.CharSequence) (s) ));
		//line 152 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		by = haxe.lang.StringExt.split(by, "$$").join("\\$");
		//line 153 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		if (this.isGlobal) 
		{
			//line 153 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			return this.matcher.replaceAll(haxe.lang.Runtime.toString(by));
		}
		else
		{
			//line 153 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			return this.matcher.replaceFirst(haxe.lang.Runtime.toString(by));
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		{
			//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			switch (field.hashCode())
			{
				case -568986259:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					if (field.equals("isGlobal")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						this.isGlobal = haxe.lang.Runtime.toBool(value);
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						return value;
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					break;
				}
				
				
				case -791090288:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					if (field.equals("pattern")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						this.pattern = haxe.lang.Runtime.toString(value);
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						return value;
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					break;
				}
				
				
				case 840862002:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					if (field.equals("matcher")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						this.matcher = ((java.util.regex.Matcher) (value) );
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						return value;
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					break;
				}
				
				
			}
			
			//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		{
			//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			switch (field.hashCode())
			{
				case 1094496948:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					if (field.equals("replace")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "replace")) );
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					break;
				}
				
				
				case -791090288:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					if (field.equals("pattern")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						return this.pattern;
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					break;
				}
				
				
				case -568986259:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					if (field.equals("isGlobal")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						return this.isGlobal;
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					break;
				}
				
				
				case 840862002:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					if (field.equals("matcher")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						return this.matcher;
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					break;
				}
				
				
			}
			
			//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		{
			//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			switch (field.hashCode())
			{
				case 1094496948:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					if (field.equals("replace")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						return this.replace(haxe.lang.Runtime.toString(dynargs.__get(0)), haxe.lang.Runtime.toString(dynargs.__get(1)));
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					break;
				}
				
				
			}
			
			//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		baseArr.push("isGlobal");
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		baseArr.push("matcher");
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		baseArr.push("pattern");
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		{
			//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}



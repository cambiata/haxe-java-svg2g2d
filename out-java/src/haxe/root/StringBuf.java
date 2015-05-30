package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringBuf extends haxe.lang.HxObject
{
	public StringBuf(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StringBuf()
	{
		//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
		haxe.root.StringBuf.__hx_ctor__StringBuf(this);
	}
	
	
	public static void __hx_ctor__StringBuf(haxe.root.StringBuf __temp_me7)
	{
		//line 31 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
		__temp_me7.b = new java.lang.StringBuilder();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
		return new haxe.root.StringBuf(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
		return new haxe.root.StringBuf();
	}
	
	
	public java.lang.StringBuilder b;
	
	
	
	public <T> void add(T x)
	{
		//line 39 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
		if (haxe.lang.Runtime.isInt(x)) 
		{
			//line 41 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
			int x1 = ((int) (haxe.lang.Runtime.toInt(((java.lang.Object) (x) ))) );
			//line 42 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
			java.lang.Object xd = x1;
			//line 43 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
			this.b.append(((java.lang.Object) (xd) ));
		}
		else
		{
			//line 45 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
			this.b.append(((java.lang.Object) (x) ));
		}
		
	}
	
	
	public void addSub(java.lang.String s, int pos, java.lang.Object len)
	{
		//line 50 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
		int l = 0;
		//line 50 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
		if (haxe.lang.Runtime.eq(len, null)) 
		{
			//line 50 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
			l = ( s.length() - pos );
		}
		else
		{
			//line 50 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
			l = ((int) (haxe.lang.Runtime.toInt(len)) );
		}
		
		//line 51 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
		this.b.append(((java.lang.CharSequence) (s) ), ((int) (pos) ), ((int) (( pos + l )) ));
	}
	
	
	public void addChar(int c)
	{
		//line 55 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
		this.b.append(((char) (c) ));
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 59 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
		return this.b.toString();
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
		{
			//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
			switch (field.hashCode())
			{
				case 98:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
					if (field.equals("b")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						this.b = ((java.lang.StringBuilder) (value) );
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						return value;
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
					break;
				}
				
				
			}
			
			//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
		{
			//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
					if (field.equals("toString")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
					break;
				}
				
				
				case 98:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
					if (field.equals("b")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						return this.b;
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
					break;
				}
				
				
				case -1149089897:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
					if (field.equals("addChar")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addChar")) );
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
					break;
				}
				
				
				case 96417:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
					if (field.equals("add")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "add")) );
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
					break;
				}
				
				
				case -1422524961:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
					if (field.equals("addSub")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addSub")) );
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
					break;
				}
				
				
			}
			
			//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
		{
			//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
					if (field.equals("toString")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						return this.toString();
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
					break;
				}
				
				
				case 96417:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
					if (field.equals("add")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						this.add(dynargs.__get(0));
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						return ((java.lang.Object) (null) );
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
					break;
				}
				
				
				case -1149089897:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
					if (field.equals("addChar")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						this.addChar(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
					break;
				}
				
				
				case -1422524961:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
					if (field.equals("addSub")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
						this.addSub(haxe.lang.Runtime.toString(dynargs.__get(0)), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), dynargs.__get(2));
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
					break;
				}
				
				
			}
			
			//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
		baseArr.push("length");
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
		baseArr.push("b");
		//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
		{
			//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\StringBuf.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}



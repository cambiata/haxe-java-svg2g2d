package haxe.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Bytes extends haxe.lang.HxObject
{
	public Bytes(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Bytes(int length, byte[] b)
	{
		//line 33 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
		haxe.io.Bytes.__hx_ctor_haxe_io_Bytes(this, length, b);
	}
	
	
	public static void __hx_ctor_haxe_io_Bytes(haxe.io.Bytes __temp_me13, int length, byte[] b)
	{
		//line 34 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
		__temp_me13.length = length;
		//line 35 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
		__temp_me13.b = b;
	}
	
	
	public static haxe.io.Bytes alloc(int length)
	{
		//line 471 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
		return new haxe.io.Bytes(length, new byte[length]);
	}
	
	
	public static haxe.io.Bytes ofString(java.lang.String s)
	{
		//line 501 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
		try 
		{
			//line 502 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			byte[] b = s.getBytes(haxe.lang.Runtime.toString("UTF-8"));
			//line 503 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			return new haxe.io.Bytes(b.length, b);
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 501 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 505 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 505 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 505 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 505 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			{
				//line 505 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
				java.lang.Object e = __temp_catchall2;
				//line 505 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
		return new haxe.io.Bytes(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
		return new haxe.io.Bytes(((int) (haxe.lang.Runtime.toInt(arr.__get(0))) ), ((byte[]) (arr.__get(1)) ));
	}
	
	
	public int length;
	
	public byte[] b;
	
	@Override public java.lang.String toString()
	{
		//line 429 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
		try 
		{
			//line 429 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			return new java.lang.String(this.b, 0, this.length, "UTF-8");
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 429 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 431 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 431 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 431 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 431 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			{
				//line 431 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
				java.lang.Object e = __temp_catchall2;
				//line 431 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
		{
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
					if (field.equals("length")) 
					{
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
						__temp_executeDef1 = false;
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
						this.length = ((int) (value) );
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
						return value;
					}
					
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
					break;
				}
				
				
			}
			
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
		{
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			switch (field.hashCode())
			{
				case 98:
				{
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
					if (field.equals("b")) 
					{
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
						__temp_executeDef1 = false;
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
						this.b = ((byte[]) (value) );
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
						return value;
					}
					
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
					if (field.equals("length")) 
					{
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
						__temp_executeDef1 = false;
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
						this.length = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
						return value;
					}
					
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
					break;
				}
				
				
			}
			
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
		{
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
					if (field.equals("toString")) 
					{
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
						__temp_executeDef1 = false;
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
					if (field.equals("length")) 
					{
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
						__temp_executeDef1 = false;
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
						return this.length;
					}
					
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
					break;
				}
				
				
				case 98:
				{
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
					if (field.equals("b")) 
					{
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
						__temp_executeDef1 = false;
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
						return this.b;
					}
					
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
					break;
				}
				
				
			}
			
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
		{
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
					if (field.equals("length")) 
					{
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
						__temp_executeDef1 = false;
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
						return ((double) (this.length) );
					}
					
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
					break;
				}
				
				
			}
			
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
		{
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
					if (field.equals("toString")) 
					{
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
						__temp_executeDef1 = false;
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
						return this.toString();
					}
					
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
					break;
				}
				
				
			}
			
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
		baseArr.push("b");
		//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
		baseArr.push("length");
		//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
		{
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Bytes.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}



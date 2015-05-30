package haxe.java.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class NativeInput extends haxe.io.Input
{
	public NativeInput(haxe.lang.EmptyObject empty)
	{
		//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public NativeInput(java.io.InputStream stream)
	{
		//line 33 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		haxe.java.io.NativeInput.__hx_ctor_haxe_java_io_NativeInput(this, stream);
	}
	
	
	public static void __hx_ctor_haxe_java_io_NativeInput(haxe.java.io.NativeInput __temp_me31, java.io.InputStream stream)
	{
		//line 35 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		__temp_me31.stream = stream;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		return new haxe.java.io.NativeInput(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		return new haxe.java.io.NativeInput(((java.io.InputStream) (arr.__get(0)) ));
	}
	
	
	public java.io.InputStream stream;
	
	@Override public int readByte()
	{
		//line 40 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		int ret = 0;
		//line 43 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		try 
		{
			//line 43 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			ret = this.stream.read();
		}
		catch (java.io.IOException e)
		{
			//line 46 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			haxe.lang.Exceptions.setException(e);
			//line 46 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Custom(e));
		}
		
		
		//line 48 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		if (( ret == -1 )) 
		{
			//line 49 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		//line 50 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		return ret;
	}
	
	
	@Override public int readBytes(haxe.io.Bytes s, int pos, int len)
	{
		//line 55 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		int ret = 0;
		//line 58 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		try 
		{
			//line 58 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			ret = this.stream.read(((byte[]) (s.b) ), ((int) (pos) ), ((int) (len) ));
		}
		catch (java.io.EOFException e)
		{
			//line 62 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			haxe.lang.Exceptions.setException(e);
			//line 62 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		catch (java.io.IOException e1)
		{
			//line 66 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			haxe.lang.Exceptions.setException(e1);
			//line 66 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Custom(e1));
		}
		
		
		//line 69 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		if (( ret == -1 )) 
		{
			//line 70 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		//line 71 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		return ret;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		{
			//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			switch (field.hashCode())
			{
				case -891990144:
				{
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
					if (field.equals("stream")) 
					{
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
						__temp_executeDef1 = false;
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
						this.stream = ((java.io.InputStream) (value) );
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
						return value;
					}
					
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
					break;
				}
				
				
			}
			
			//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		{
			//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			switch (field.hashCode())
			{
				case -1140063115:
				{
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
					if (field.equals("readBytes")) 
					{
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
						__temp_executeDef1 = false;
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readBytes")) );
					}
					
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
					break;
				}
				
				
				case -891990144:
				{
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
					if (field.equals("stream")) 
					{
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
						__temp_executeDef1 = false;
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
						return this.stream;
					}
					
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
					break;
				}
				
				
				case -868060226:
				{
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
					if (field.equals("readByte")) 
					{
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
						__temp_executeDef1 = false;
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readByte")) );
					}
					
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
					break;
				}
				
				
			}
			
			//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		baseArr.push("stream");
		//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		{
			//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


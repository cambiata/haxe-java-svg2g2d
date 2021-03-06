package sys.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class FileOutput extends haxe.io.Output
{
	public FileOutput(haxe.lang.EmptyObject empty)
	{
		//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public FileOutput(java.io.RandomAccessFile f)
	{
		//line 31 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		sys.io.FileOutput.__hx_ctor_sys_io_FileOutput(this, f);
	}
	
	
	public static void __hx_ctor_sys_io_FileOutput(sys.io.FileOutput __temp_me33, java.io.RandomAccessFile f)
	{
		//line 33 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		__temp_me33.f = f;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		return new sys.io.FileOutput(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		return new sys.io.FileOutput(((java.io.RandomAccessFile) (arr.__get(0)) ));
	}
	
	
	public java.io.RandomAccessFile f;
	
	public void close()
	{
		//line 38 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		try 
		{
			//line 38 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			this.f.close();
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 38 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 38 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 38 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 38 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 38 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			{
				//line 38 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
				java.lang.Object e = __temp_catchall2;
				//line 38 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	@Override public void writeByte(int c)
	{
		//line 45 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		try 
		{
			//line 45 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			this.f.write(((int) (c) ));
		}
		catch (java.io.IOException e)
		{
			//line 49 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			haxe.lang.Exceptions.setException(e);
			//line 49 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Custom(e));
		}
		
		
	}
	
	
	@Override public int writeBytes(haxe.io.Bytes s, int pos, int len)
	{
		//line 68 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		try 
		{
			//line 69 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			this.f.write(((byte[]) (s.b) ), ((int) (pos) ), ((int) (len) ));
			//line 70 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			return len;
		}
		catch (java.io.IOException e)
		{
			//line 74 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			haxe.lang.Exceptions.setException(e);
			//line 74 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Custom(e));
		}
		
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		{
			//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			boolean __temp_executeDef1 = true;
			//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			switch (field.hashCode())
			{
				case 102:
				{
					//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
					if (field.equals("f")) 
					{
						//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						__temp_executeDef1 = false;
						//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						this.f = ((java.io.RandomAccessFile) (value) );
						//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						return value;
					}
					
					//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
					break;
				}
				
				
			}
			
			//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			if (__temp_executeDef1) 
			{
				//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		{
			//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			boolean __temp_executeDef1 = true;
			//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			switch (field.hashCode())
			{
				case -662729780:
				{
					//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
					if (field.equals("writeBytes")) 
					{
						//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						__temp_executeDef1 = false;
						//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeBytes")) );
					}
					
					//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
					break;
				}
				
				
				case 102:
				{
					//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
					if (field.equals("f")) 
					{
						//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						__temp_executeDef1 = false;
						//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						return this.f;
					}
					
					//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
					break;
				}
				
				
				case -1406851705:
				{
					//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
					if (field.equals("writeByte")) 
					{
						//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						__temp_executeDef1 = false;
						//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeByte")) );
					}
					
					//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
					break;
				}
				
				
				case 94756344:
				{
					//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
					if (field.equals("close")) 
					{
						//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						__temp_executeDef1 = false;
						//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "close")) );
					}
					
					//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
					break;
				}
				
				
			}
			
			//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			if (__temp_executeDef1) 
			{
				//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		{
			//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			int __temp_hash2 = field.hashCode();
			//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			boolean __temp_executeDef1 = true;
			//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			switch (__temp_hash2)
			{
				case -662729780:
				case -1406851705:
				{
					//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
					if (( (( ( __temp_hash2 == -662729780 ) && field.equals("writeBytes") )) || field.equals("writeByte") )) 
					{
						//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						__temp_executeDef1 = false;
						//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						return haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
					break;
				}
				
				
				case 94756344:
				{
					//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
					if (field.equals("close")) 
					{
						//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						__temp_executeDef1 = false;
						//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
						this.close();
					}
					
					//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
					break;
				}
				
				
			}
			
			//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			if (__temp_executeDef1) 
			{
				//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		baseArr.push("f");
		//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
		{
			//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\FileOutput.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}



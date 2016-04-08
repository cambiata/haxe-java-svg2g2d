package haxe.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Input extends haxe.lang.HxObject
{
	public Input(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Input()
	{
		//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
		haxe.io.Input.__hx_ctor_haxe_io_Input(this);
	}
	
	
	public static void __hx_ctor_haxe_io_Input(haxe.io.Input __temp_me15)
	{
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
		return new haxe.io.Input(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
		return new haxe.io.Input();
	}
	
	
	public int readByte()
	{
		//line 50 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
		throw haxe.lang.HaxeException.wrap("Not implemented");
	}
	
	
	public int readBytes(haxe.io.Bytes s, int pos, int len)
	{
		//line 62 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
		int k = len;
		//line 63 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
		byte[] b = s.b;
		//line 64 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
		if (( ( ( pos < 0 ) || ( len < 0 ) ) || ( ( pos + len ) > s.length ) )) 
		{
			//line 65 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
		}
		
		//line 66 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
		while (( k > 0 ))
		{
			//line 74 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
			b[pos] = ((byte) (this.readByte()) );
			//line 76 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
			pos++;
			//line 77 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
			k--;
		}
		
		//line 79 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
		return len;
	}
	
	
	public haxe.io.Bytes readAll(java.lang.Object bufsize)
	{
		//line 104 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
		if (haxe.lang.Runtime.eq(bufsize, null)) 
		{
			//line 108 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
			bufsize = 16384;
		}
		
		//line 111 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
		haxe.io.Bytes buf = haxe.io.Bytes.alloc(((int) (haxe.lang.Runtime.toInt(bufsize)) ));
		//line 112 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
		haxe.io.BytesBuffer total = new haxe.io.BytesBuffer();
		//line 114 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
		try 
		{
			//line 114 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
			while (true)
			{
				//line 115 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
				int len = this.readBytes(buf, 0, ((int) (haxe.lang.Runtime.toInt(bufsize)) ));
				//line 116 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
				if (( len == 0 )) 
				{
					//line 117 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
					throw haxe.lang.HaxeException.wrap(haxe.io.Error.Blocked);
				}
				
				//line 118 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
				{
					//line 118 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
					if (( ( len < 0 ) || ( len > buf.length ) )) 
					{
						//line 118 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
						throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
					}
					
					//line 118 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
					total.b.write(((byte[]) (buf.b) ), ((int) (0) ), ((int) (len) ));
				}
				
			}
			
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 114 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 120 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 120 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 120 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 120 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
			if (( __temp_catchall2 instanceof haxe.io.Eof )) 
			{
				//line 120 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
				haxe.io.Eof e = ((haxe.io.Eof) (__temp_catchall2) );
				//line 120 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
				{
				}
				
			}
			else
			{
				//line 120 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
				throw haxe.lang.HaxeException.wrap(__temp_catchallException1);
			}
			
		}
		
		
		//line 122 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
		return total.getBytes();
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
		{
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
			switch (field.hashCode())
			{
				case 1080375339:
				{
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
					if (field.equals("readAll")) 
					{
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
						__temp_executeDef1 = false;
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readAll")) );
					}
					
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
					break;
				}
				
				
				case -868060226:
				{
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
					if (field.equals("readByte")) 
					{
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
						__temp_executeDef1 = false;
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readByte")) );
					}
					
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
					break;
				}
				
				
				case -1140063115:
				{
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
					if (field.equals("readBytes")) 
					{
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
						__temp_executeDef1 = false;
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readBytes")) );
					}
					
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
					break;
				}
				
				
			}
			
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
		{
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
			switch (field.hashCode())
			{
				case 1080375339:
				{
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
					if (field.equals("readAll")) 
					{
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
						__temp_executeDef1 = false;
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
						return this.readAll(dynargs.__get(0));
					}
					
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
					break;
				}
				
				
				case -868060226:
				{
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
					if (field.equals("readByte")) 
					{
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
						__temp_executeDef1 = false;
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
						return this.readByte();
					}
					
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
					break;
				}
				
				
				case -1140063115:
				{
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
					if (field.equals("readBytes")) 
					{
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
						__temp_executeDef1 = false;
						//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
						return this.readBytes(((haxe.io.Bytes) (dynargs.__get(0)) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(2))) ));
					}
					
					//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
					break;
				}
				
				
			}
			
			//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 28 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Input.hx"
				throw null;
			}
			
		}
		
	}
	
	
}



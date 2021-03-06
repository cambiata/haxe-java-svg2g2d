package haxe.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Output extends haxe.lang.HxObject
{
	public Output(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Output()
	{
		//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		haxe.io.Output.__hx_ctor_haxe_io_Output(this);
	}
	
	
	public static void __hx_ctor_haxe_io_Output(haxe.io.Output __temp_me17)
	{
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		return new haxe.io.Output(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		return new haxe.io.Output();
	}
	
	
	public void writeByte(int c)
	{
		//line 47 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		throw haxe.lang.HaxeException.wrap("Not implemented");
	}
	
	
	public int writeBytes(haxe.io.Bytes s, int pos, int len)
	{
		//line 58 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		int k = len;
		//line 59 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		byte[] b = s.b;
		//line 61 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		if (( ( ( pos < 0 ) || ( len < 0 ) ) || ( ( pos + len ) > s.length ) )) 
		{
			//line 62 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
		}
		
		//line 64 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		while (( k > 0 ))
		{
			//line 72 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			this.writeByte(((int) (b[pos]) ));
			//line 74 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			pos++;
			//line 75 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			k--;
		}
		
		//line 77 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		return len;
	}
	
	
	public void writeFullBytes(haxe.io.Bytes s, int pos, int len)
	{
		//line 121 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		while (( len > 0 ))
		{
			//line 122 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			int k = this.writeBytes(s, pos, len);
			//line 123 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			pos += k;
			//line 124 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			len -= k;
		}
		
	}
	
	
	public void writeString(java.lang.String s)
	{
		//line 280 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		haxe.io.Bytes b = haxe.io.Bytes.ofString(s);
		//line 282 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		this.writeFullBytes(b, 0, b.length);
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		{
			//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			switch (field.hashCode())
			{
				case 1412235472:
				{
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					if (field.equals("writeString")) 
					{
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						__temp_executeDef1 = false;
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeString")) );
					}
					
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					break;
				}
				
				
				case -1406851705:
				{
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					if (field.equals("writeByte")) 
					{
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						__temp_executeDef1 = false;
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeByte")) );
					}
					
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					break;
				}
				
				
				case 1188045309:
				{
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					if (field.equals("writeFullBytes")) 
					{
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						__temp_executeDef1 = false;
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeFullBytes")) );
					}
					
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					break;
				}
				
				
				case -662729780:
				{
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					if (field.equals("writeBytes")) 
					{
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						__temp_executeDef1 = false;
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeBytes")) );
					}
					
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					break;
				}
				
				
			}
			
			//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		{
			//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			switch (field.hashCode())
			{
				case 1412235472:
				{
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					if (field.equals("writeString")) 
					{
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						__temp_executeDef1 = false;
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						this.writeString(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					break;
				}
				
				
				case -1406851705:
				{
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					if (field.equals("writeByte")) 
					{
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						__temp_executeDef1 = false;
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						this.writeByte(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					break;
				}
				
				
				case 1188045309:
				{
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					if (field.equals("writeFullBytes")) 
					{
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						__temp_executeDef1 = false;
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						this.writeFullBytes(((haxe.io.Bytes) (dynargs.__get(0)) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(2))) ));
					}
					
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					break;
				}
				
				
				case -662729780:
				{
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					if (field.equals("writeBytes")) 
					{
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						__temp_executeDef1 = false;
						//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						return this.writeBytes(((haxe.io.Bytes) (dynargs.__get(0)) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(2))) ));
					}
					
					//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					break;
				}
				
				
			}
			
			//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 30 "F:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		return null;
	}
	
	
}



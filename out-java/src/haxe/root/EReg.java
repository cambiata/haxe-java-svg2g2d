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
	
	
	public static void __hx_ctor__EReg(haxe.root.EReg __temp_me4, java.lang.String r, java.lang.String opt)
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
							__temp_me4.isGlobal = true;
							//line 44 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
							break;
						}
						
						
					}
					
				}
				
			}
			
		}
		
		//line 48 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		__temp_me4.matcher = java.util.regex.Pattern.compile(haxe.lang.Runtime.toString(haxe.root.EReg.convert(r)), ((int) (flags) )).matcher(((java.lang.CharSequence) ("") ));
		//line 49 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		__temp_me4.pattern = r;
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
	
	public java.lang.String cur;
	
	public boolean isGlobal;
	
	public java.lang.String matched(int n)
	{
		//line 88 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		if (( n == 0 )) 
		{
			//line 89 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			return this.matcher.group();
		}
		else
		{
			//line 91 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			return this.matcher.group(((int) (n) ));
		}
		
	}
	
	
	public java.lang.Object matchedPos()
	{
		//line 105 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		int start = this.matcher.start();
		//line 106 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		{
			//line 106 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			int __temp_odecl1 = ( this.matcher.end() - start );
			//line 106 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			return new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{"len", "pos"}, new double[]{((double) (((double) (__temp_odecl1) )) ), ((double) (((double) (start) )) )});
		}
		
	}
	
	
	public boolean matchSub(java.lang.String s, int pos, java.lang.Object len)
	{
		//line 109 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		int __temp_len3 = ( (haxe.lang.Runtime.eq(len, null)) ? (-1) : (((int) (haxe.lang.Runtime.toInt(len)) )) );
		//line 110 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		this.matcher = this.matcher.reset(((java.lang.CharSequence) (( (( __temp_len3 < 0 )) ? (s) : (haxe.lang.StringExt.substr(s, 0, ( pos + __temp_len3 ))) )) ));
		//line 111 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		this.cur = s;
		//line 112 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		return this.matcher.find(((int) (pos) ));
	}
	
	
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
	
	
	public java.lang.String map(java.lang.String s, haxe.lang.Function f)
	{
		//line 157 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		int offset = 0;
		//line 158 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		haxe.root.StringBuf buf = new haxe.root.StringBuf();
		//line 159 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		do 
		{
			//line 160 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			if (( offset >= s.length() )) 
			{
				//line 161 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
				break;
			}
			else
			{
				//line 162 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
				if ( ! (this.matchSub(s, offset, null)) ) 
				{
					//line 163 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					buf.add(haxe.lang.StringExt.substr(s, offset, null));
					//line 164 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					break;
				}
				
			}
			
			//line 166 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			java.lang.Object p = this.matchedPos();
			//line 167 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			buf.add(haxe.lang.StringExt.substr(s, offset, ( ((int) (haxe.lang.Runtime.getField_f(p, "pos", true)) ) - ((int) (offset) ) )));
			//line 168 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			buf.add(haxe.lang.Runtime.toString(f.__hx_invoke1_o(0.0, this)));
			//line 169 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			if (( ((int) (haxe.lang.Runtime.getField_f(p, "len", true)) ) == 0 )) 
			{
				//line 170 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
				buf.add(haxe.lang.StringExt.substr(s, ((int) (haxe.lang.Runtime.getField_f(p, "pos", true)) ), 1));
				//line 171 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
				offset = ( ((int) (haxe.lang.Runtime.getField_f(p, "pos", true)) ) + 1 );
			}
			else
			{
				//line 174 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
				offset = ( ((int) (haxe.lang.Runtime.getField_f(p, "pos", true)) ) + ((int) (haxe.lang.Runtime.getField_f(p, "len", true)) ) );
			}
			
		}
		while (this.isGlobal);
		//line 176 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		if (( (  ! (this.isGlobal)  && ( offset > 0 ) ) && ( offset < s.length() ) )) 
		{
			//line 177 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
			buf.add(haxe.lang.StringExt.substr(s, offset, null));
		}
		
		//line 178 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
		return buf.toString();
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
				
				
				case 98880:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					if (field.equals("cur")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						this.cur = haxe.lang.Runtime.toString(value);
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
				case 107868:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					if (field.equals("map")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "map")) );
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
				
				
				case 296901179:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					if (field.equals("matchSub")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "matchSub")) );
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					break;
				}
				
				
				case 98880:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					if (field.equals("cur")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						return this.cur;
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					break;
				}
				
				
				case 1870294672:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					if (field.equals("matchedPos")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "matchedPos")) );
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
				
				
				case 840861988:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					if (field.equals("matched")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "matched")) );
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
				case 107868:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					if (field.equals("map")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						return this.map(haxe.lang.Runtime.toString(dynargs.__get(0)), ((haxe.lang.Function) (dynargs.__get(1)) ));
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					break;
				}
				
				
				case 840861988:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					if (field.equals("matched")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						return this.matched(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					break;
				}
				
				
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
				
				
				case 1870294672:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					if (field.equals("matchedPos")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						return this.matchedPos();
					}
					
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					break;
				}
				
				
				case 296901179:
				{
					//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
					if (field.equals("matchSub")) 
					{
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						__temp_executeDef1 = false;
						//line 24 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\EReg.hx"
						return this.matchSub(haxe.lang.Runtime.toString(dynargs.__get(0)), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), dynargs.__get(2));
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
		baseArr.push("cur");
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



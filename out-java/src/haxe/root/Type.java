package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Type extends haxe.lang.HxObject
{
	public Type(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Type()
	{
		//line 39 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		haxe.root.Type.__hx_ctor__Type(this);
	}
	
	
	public static void __hx_ctor__Type(haxe.root.Type __temp_me9)
	{
	}
	
	
	public static <T> java.lang.Class getClass(T o)
	{
		//line 43 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		if (( ( ( o == null ) || ( o instanceof haxe.lang.DynamicObject ) ) || ( o instanceof java.lang.Class ) )) 
		{
			//line 44 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			return null;
		}
		
		//line 46 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		return ((java.lang.Class) (((java.lang.Class) (((java.lang.Class) (o.getClass()) )) )) );
	}
	
	
	public static java.lang.Class getEnum(java.lang.Object o)
	{
		//line 51 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		if (( ( o instanceof java.lang.Enum ) || ( o instanceof haxe.lang.Enum ) )) 
		{
			//line 52 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			return o.getClass();
		}
		
		//line 54 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		return null;
	}
	
	
	public static java.lang.Class getSuperClass(java.lang.Class c)
	{
		//line 59 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		java.lang.Class c1 = ((java.lang.Class) (c) );
		//line 60 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		java.lang.Class cl = null;
		//line 60 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		if (( ((java.lang.Object) (c1) ) == ((java.lang.Object) (null) ) )) 
		{
			//line 60 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			cl = null;
		}
		else
		{
			//line 60 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			cl = c1.getSuperclass();
		}
		
		//line 61 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		if (( ( ( ((java.lang.Object) (cl) ) != ((java.lang.Object) (null) ) ) &&  ! (haxe.lang.Runtime.valEq(cl.getName(), "haxe.lang.HxObject"))  ) &&  ! (haxe.lang.Runtime.valEq(cl.getName(), "java.lang.Object"))  )) 
		{
			//line 62 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			return ((java.lang.Class) (cl) );
		}
		
		//line 64 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		return null;
	}
	
	
	public static java.lang.String getClassName(java.lang.Class c)
	{
		//line 68 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		java.lang.Class c1 = ((java.lang.Class) (c) );
		//line 69 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		java.lang.String name = c1.getName();
		//line 70 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		if (name.startsWith("haxe.root.")) 
		{
			//line 71 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			return haxe.lang.StringExt.substr(name, 10, null);
		}
		
		//line 72 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		if (name.startsWith("java.lang")) 
		{
			//line 73 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			name = haxe.lang.StringExt.substr(name, 10, null);
		}
		
		//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		{
			//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			java.lang.String __temp_svar1 = (name);
			//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			int __temp_hash3 = __temp_svar1.hashCode();
			//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			boolean __temp_executeDef2 = true;
			//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			switch (__temp_hash3)
			{
				case -672261858:
				case 104431:
				{
					//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
					if (( (( ( __temp_hash3 == -672261858 ) && __temp_svar1.equals("Integer") )) || __temp_svar1.equals("int") )) 
					{
						//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
						__temp_executeDef2 = false;
						//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
						return "Int";
					}
					
					//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
					break;
				}
				
				
				case -1939501217:
				{
					//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
					if (__temp_svar1.equals("Object")) 
					{
						//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
						__temp_executeDef2 = false;
						//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
						return "Dynamic";
					}
					
					//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
					break;
				}
				
				
				case 2052876273:
				case -1325958191:
				{
					//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
					if (( (( ( __temp_hash3 == 2052876273 ) && __temp_svar1.equals("Double") )) || __temp_svar1.equals("double") )) 
					{
						//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
						__temp_executeDef2 = false;
						//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
						return "Float";
					}
					
					//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
					break;
				}
				
				
			}
			
			//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			if (__temp_executeDef2) 
			{
				//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
				return name;
			}
			else
			{
				//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public static java.lang.String getEnumName(java.lang.Class e)
	{
		//line 85 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		java.lang.Class c = ((java.lang.Class) (e) );
		//line 86 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		java.lang.String ret = c.getName();
		//line 87 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		if (ret.startsWith("haxe.root.")) 
		{
			//line 88 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			return haxe.lang.StringExt.substr(ret, 10, null);
		}
		else
		{
			//line 89 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			if (( haxe.lang.Runtime.valEq(ret, "boolean") || haxe.lang.Runtime.valEq(ret, "java.lang.Boolean") )) 
			{
				//line 90 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
				return "Bool";
			}
			
		}
		
		//line 92 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		return ret;
	}
	
	
	public static java.lang.Class resolveClass(java.lang.String name)
	{
		//line 97 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		try 
		{
			//line 98 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			if (( haxe.lang.StringExt.indexOf(name, ".", null) == -1 )) 
			{
				//line 99 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
				name = ( "haxe.root." + name );
			}
			
			//line 101 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			return ((java.lang.Class) (java.lang.Class.forName(haxe.lang.Runtime.toString(name))) );
		}
		catch (java.lang.ClassNotFoundException e)
		{
			//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			haxe.lang.Exceptions.setException(e);
			//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			{
				//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
				java.lang.String __temp_svar1 = (name);
				//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
				boolean __temp_executeDef2 = true;
				//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
				switch (__temp_svar1.hashCode())
				{
					case -1778387957:
					{
						//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
						if (__temp_svar1.equals("haxe.root.Int")) 
						{
							//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
							__temp_executeDef2 = false;
							//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
							return int.class;
						}
						
						//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
						break;
					}
					
					
					case -140489125:
					{
						//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
						if (__temp_svar1.equals("haxe.root.Dynamic")) 
						{
							//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
							__temp_executeDef2 = false;
							//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
							return java.lang.Object.class;
						}
						
						//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
						break;
					}
					
					
					case 363325304:
					{
						//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
						if (__temp_svar1.equals("haxe.root.Float")) 
						{
							//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
							__temp_executeDef2 = false;
							//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
							return double.class;
						}
						
						//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
						break;
					}
					
					
					case 360541844:
					{
						//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
						if (__temp_svar1.equals("haxe.root.Class")) 
						{
							//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
							__temp_executeDef2 = false;
							//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
							return java.lang.Class.class;
						}
						
						//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
						break;
					}
					
					
					case -1242153355:
					{
						//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
						if (__temp_svar1.equals("haxe.root.String")) 
						{
							//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
							__temp_executeDef2 = false;
							//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
							return java.lang.String.class;
						}
						
						//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
						break;
					}
					
					
					case 704654956:
					{
						//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
						if (__temp_svar1.equals("haxe.root.Math")) 
						{
							//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
							__temp_executeDef2 = false;
							//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
							return java.lang.Math.class;
						}
						
						//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
						break;
					}
					
					
				}
				
				//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
				if (__temp_executeDef2) 
				{
					//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
					return null;
				}
				else
				{
					//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
					throw null;
				}
				
			}
			
		}
		
		
	}
	
	
	public static java.lang.Class resolveEnum(java.lang.String name)
	{
		
		if ("Bool".equals(name)) return boolean.class;
		Class r = resolveClass(name);
		if (r != null && (r.getSuperclass() == java.lang.Enum.class || haxe.lang.Enum.class.isAssignableFrom(r)))
			return r;
		return null;
	
	}
	
	
	public static <T> T createInstance(java.lang.Class cl, haxe.root.Array args)
	{
		
			int len = args.length;
			java.lang.Class[] cls = new java.lang.Class[len];
			java.lang.Object[] objs = new java.lang.Object[len];

			java.lang.reflect.Constructor[] ms = cl.getConstructors();
			int msl = ms.length;
			int realMsl = 0;
			for(int i =0; i < msl; i++)
			{
				if (!ms[i].isVarArgs() && ms[i].getParameterTypes().length != len)
				{
					ms[i] = null;
				} else {
					ms[realMsl] = ms[i];
					if (realMsl != i)
						ms[i] = null;
					realMsl++;
				}
			}

			boolean hasNumber = false;

			for (int i = 0; i < len; i++)
			{
				Object o = args.__get(i);
				objs[i]= o;
				cls[i] = o.getClass();
				boolean isNum = false;

				if (o instanceof java.lang.Number)
				{
					cls[i] = java.lang.Number.class;
					isNum = hasNumber = true;
				}

				msl = realMsl;
				realMsl = 0;

				for (int j = 0; j < msl; j++)
				{
					java.lang.Class[] allcls = ms[j].getParameterTypes();
					if (i < allcls.length)
					{
						if (! ((isNum && allcls[i].isPrimitive()) || allcls[i].isAssignableFrom(cls[i])) )
						{
							ms[j] = null;
						} else {
							ms[realMsl] = ms[j];
							if (realMsl != j)
								ms[j] = null;
							realMsl++;
						}
					}
				}

			}

			java.lang.reflect.Constructor found = ms[0];

			if (hasNumber)
			{
				java.lang.Class[] allcls = found.getParameterTypes();

				for (int i = 0; i < len; i++)
				{
					java.lang.Object o = objs[i];
					if (o instanceof java.lang.Number)
					{
						java.lang.Class curCls = null;
						if (i < allcls.length)
						{
							curCls = allcls[i];
							if (!curCls.isAssignableFrom(o.getClass()))
							{
								String name = curCls.getName();
								if (name.equals("double") || name.equals("java.lang.Double"))
								{
									objs[i] = ((java.lang.Number)o).doubleValue();
								} else if (name.equals("int") || name.equals("java.lang.Integer"))
								{
									objs[i] = ((java.lang.Number)o).intValue();
								} else if (name.equals("float") || name.equals("java.lang.Float"))
								{
									objs[i] = ((java.lang.Number)o).floatValue();
								} else if (name.equals("byte") || name.equals("java.lang.Byte"))
								{
									objs[i] = ((java.lang.Number)o).byteValue();
								} else if (name.equals("short") || name.equals("java.lang.Short"))
								{
									objs[i] = ((java.lang.Number)o).shortValue();
								}
							}
						} //else varargs not handled TODO
					}
				}
			}

		try {
			found.setAccessible(true);
			return (T) found.newInstance(objs);
		}
		catch (java.lang.reflect.InvocationTargetException e)
		{
			throw haxe.lang.HaxeException.wrap(e.getCause());
		}

		catch (Throwable t)
		{
			throw haxe.lang.HaxeException.wrap(t);
		}
	
	}
	
	
	public static <T> T createEmptyInstance(java.lang.Class cl)
	{
		//line 248 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		if (haxe.root.Reflect.hasField(cl, "__hx_createEmpty")) 
		{
			//line 249 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			return ((T) (haxe.lang.Runtime.callField(cl, "__hx_createEmpty", null)) );
		}
		
		//line 250 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		return ((T) (haxe.root.Type.createInstance(cl, new haxe.root.Array(new java.lang.Object[]{}))) );
	}
	
	
	public static <T> T createEnum(java.lang.Class e, java.lang.String constr, haxe.root.Array params)
	{
		
		if (params == null || params.length == 0)
		{
			java.lang.Object ret = haxe.lang.Runtime.slowGetField(e, constr, true);
			if (ret instanceof haxe.lang.Function)
				throw haxe.lang.HaxeException.wrap("Constructor " + constr + " needs parameters");
			return (T) ret;
		} else {
			return (T) haxe.lang.Runtime.slowCallField(e, constr, params);
		}
	
	}
	
	
	public static <T> T createEnumIndex(java.lang.Class e, int index, haxe.root.Array params)
	{
		//line 270 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		haxe.root.Array<java.lang.String> constr = haxe.root.Type.getEnumConstructs(e);
		//line 271 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		return ((T) (haxe.root.Type.createEnum(e, constr.__get(index), params)) );
	}
	
	
	public static haxe.root.Array<java.lang.String> getInstanceFields(java.lang.Class c)
	{
		
		if (c == java.lang.String.class)
		{
			return haxe.lang.StringRefl.fields;
		}

		Array<String> ret = new Array<String>();
		for (java.lang.reflect.Field f : c.getFields())
		{
			java.lang.String fname = f.getName();
			if (!java.lang.reflect.Modifier.isStatic(f.getModifiers()) && !fname.startsWith("__hx_"))
				ret.push(fname);
		}

		for (java.lang.reflect.Method m : c.getMethods())
		{
			if (m.getDeclaringClass() == java.lang.Object.class)
				continue;
			java.lang.String mname = m.getName();
			if (!java.lang.reflect.Modifier.isStatic(m.getModifiers()) && !mname.startsWith("__hx_"))
				ret.push(mname);
		}

		return ret;
	
	}
	
	
	public static haxe.root.Array<java.lang.String> getClassFields(java.lang.Class c)
	{
		
		Array<String> ret = new Array<String>();
		if (c == java.lang.String.class)
		{
			ret.push("fromCharCode");
			return ret;
		}

		for (java.lang.reflect.Field f : c.getDeclaredFields())
		{
			java.lang.String fname = f.getName();
			if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) && !fname.startsWith("__hx_"))
			ret.push(fname);
		}

		for (java.lang.reflect.Method m : c.getDeclaredMethods())
		{
			if (m.getDeclaringClass() == java.lang.Object.class)
				continue;
			java.lang.String mname = m.getName();
			if (java.lang.reflect.Modifier.isStatic(m.getModifiers()) && !mname.startsWith("__hx_"))
				ret.push(mname);
		}

		return ret;
	
	}
	
	
	public static haxe.root.Array<java.lang.String> getEnumConstructs(java.lang.Class e)
	{
		//line 334 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		if (haxe.root.Reflect.hasField(e, "__hx_constructs")) 
		{
			//line 336 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			haxe.root.Array<java.lang.String> ret = haxe.java.Lib.array_String(((java.lang.String[]) (haxe.lang.Runtime.getField(e, "__hx_constructs", true)) ));
			//line 337 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			return ret.copy();
		}
		
		//line 339 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		java.lang.Enum[] vals = ((java.lang.Enum[]) (haxe.lang.Runtime.callField(e, "values", null)) );
		//line 339 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		haxe.root.Array<java.lang.String> ret1 = new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
		//line 340 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		{
			//line 340 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			int _g1 = 0;
			//line 340 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			int _g = vals.length;
			//line 340 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			while (( _g1 < _g ))
			{
				//line 340 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
				int i = _g1++;
				//line 341 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
				ret1.__set(i, vals[i].name());
			}
			
		}
		
		//line 342 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		return ret1;
	}
	
	
	public static haxe.root.ValueType typeof(java.lang.Object v)
	{
		
		if (v == null) return ValueType.TNull;

		if (v instanceof haxe.lang.IHxObject) {
			haxe.lang.IHxObject vobj = (haxe.lang.IHxObject) v;
			java.lang.Class cl = vobj.getClass();
			if (v instanceof haxe.lang.DynamicObject)
				return ValueType.TObject;
			else
				return ValueType.TClass(cl);
		} else if (v instanceof java.lang.Number) {
			java.lang.Number n = (java.lang.Number) v;
			if (n.intValue() == n.doubleValue())
				return ValueType.TInt;
			else
				return ValueType.TFloat;
		} else if (v instanceof haxe.lang.Function) {
			return ValueType.TFunction;
		} else if (v instanceof java.lang.Enum || v instanceof haxe.lang.Enum) {
			return ValueType.TEnum(v.getClass());
		} else if (v instanceof java.lang.Boolean) {
			return ValueType.TBool;
		} else if (v instanceof java.lang.Class) {
			return ValueType.TObject;
		} else {
			return ValueType.TClass(v.getClass());
		}
	
	}
	
	
	public static <T> boolean enumEq(T a, T b)
	{
		
			if (a instanceof haxe.lang.Enum)
				return a.equals(b);
			else
				return haxe.lang.Runtime.eq(a, b);
	
	}
	
	
	public static java.lang.String enumConstructor(java.lang.Object e)
	{
		
		if (e instanceof java.lang.Enum)
			return ((java.lang.Enum) e).name();
		else
			return ((haxe.lang.Enum) e).getTag();
	
	}
	
	
	public static haxe.root.Array enumParameters(java.lang.Object e)
	{
		
		return ( e instanceof java.lang.Enum ) ? new haxe.root.Array() : ((haxe.lang.Enum) e).getParams();
	
	}
	
	
	public static int enumIndex(java.lang.Object e)
	{
		
		if (e instanceof java.lang.Enum)
			return ((java.lang.Enum) e).ordinal();
		else
			return ((haxe.lang.Enum) e).index;
	
	}
	
	
	public static <T> haxe.root.Array<T> allEnums(java.lang.Class e)
	{
		//line 421 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		haxe.root.Array<java.lang.String> ctors = haxe.root.Type.getEnumConstructs(e);
		//line 422 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		haxe.root.Array<T> ret = new haxe.root.Array<T>(( (T[]) (new java.lang.Object[] {}) ));
		//line 423 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		{
			//line 423 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			int _g = 0;
			//line 423 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
			while (( _g < ctors.length ))
			{
				//line 423 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
				java.lang.String ctor = ctors.__get(_g);
				//line 423 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
				 ++ _g;
				//line 425 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
				T v = ((T) (haxe.root.Reflect.field(e, ctor)) );
				//line 426 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
				if (haxe.root.Std.is(v, e)) 
				{
					//line 427 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
					ret.push(v);
				}
				
			}
			
		}
		
		//line 430 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		return ret;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 39 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		return new haxe.root.Type(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 39 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Type.hx"
		return new haxe.root.Type();
	}
	
	
}



package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Reflect extends haxe.lang.HxObject
{
	public Reflect(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Reflect()
	{
		//line 28 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		haxe.root.Reflect.__hx_ctor__Reflect(this);
	}
	
	
	public static void __hx_ctor__Reflect(haxe.root.Reflect __temp_me6)
	{
	}
	
	
	public static boolean hasField(java.lang.Object o, java.lang.String field)
	{
		//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			//line 33 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			return ( ! (haxe.lang.Runtime.eq(((haxe.lang.IHxObject) (o) ).__hx_getField(field, false, true, false), haxe.lang.Runtime.undefined)) );
		}
		
		//line 35 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return haxe.lang.Runtime.slowHasField(o, field);
	}
	
	
	public static java.lang.Object field(java.lang.Object o, java.lang.String field)
	{
		//line 40 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			//line 41 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			return ((haxe.lang.IHxObject) (o) ).__hx_getField(field, false, false, false);
		}
		
		//line 43 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return haxe.lang.Runtime.slowGetField(o, field, false);
	}
	
	
	public static void setField(java.lang.Object o, java.lang.String field, java.lang.Object value)
	{
		//line 48 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			//line 49 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			((haxe.lang.IHxObject) (o) ).__hx_setField(field, value, false);
		}
		else
		{
			//line 51 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			haxe.lang.Runtime.slowSetField(o, field, value);
		}
		
	}
	
	
	public static java.lang.Object getProperty(java.lang.Object o, java.lang.String field)
	{
		//line 57 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			//line 58 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			return ((haxe.lang.IHxObject) (o) ).__hx_getField(field, false, false, true);
		}
		
		//line 60 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (haxe.lang.Runtime.slowHasField(o, ( "get_" + field ))) 
		{
			//line 61 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			return haxe.lang.Runtime.slowCallField(o, ( "get_" + field ), null);
		}
		
		//line 63 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return haxe.lang.Runtime.slowGetField(o, field, false);
	}
	
	
	public static void setProperty(java.lang.Object o, java.lang.String field, java.lang.Object value)
	{
		//line 68 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			//line 69 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			((haxe.lang.IHxObject) (o) ).__hx_setField(field, value, true);
		}
		else
		{
			//line 70 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			if (haxe.lang.Runtime.slowHasField(o, ( "set_" + field ))) 
			{
				//line 71 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
				haxe.lang.Runtime.slowCallField(o, ( "set_" + field ), new haxe.root.Array(new java.lang.Object[]{value}));
			}
			else
			{
				//line 73 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
				haxe.lang.Runtime.slowSetField(o, field, value);
			}
			
		}
		
	}
	
	
	public static java.lang.Object callMethod(java.lang.Object o, java.lang.Object func, haxe.root.Array args)
	{
		//line 79 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return ((haxe.lang.Function) (func) ).__hx_invokeDynamic(args);
	}
	
	
	public static haxe.root.Array<java.lang.String> fields(java.lang.Object o)
	{
		//line 84 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			//line 85 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			haxe.root.Array<java.lang.String> ret = new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
			//line 86 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			((haxe.lang.IHxObject) (o) ).__hx_getFields(ret);
			//line 87 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			return ret;
		}
		else
		{
			//line 88 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			if (( o instanceof java.lang.Class )) 
			{
				//line 89 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
				return haxe.root.Type.getClassFields(((java.lang.Class) (o) ));
			}
			else
			{
				//line 91 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
				return new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
			}
			
		}
		
	}
	
	
	public static boolean isFunction(java.lang.Object f)
	{
		//line 97 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return ( f instanceof haxe.lang.Function );
	}
	
	
	public static <T> int compare(T a, T b)
	{
		//line 102 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return haxe.lang.Runtime.compare(a, b);
	}
	
	
	public static boolean compareMethods(java.lang.Object f1, java.lang.Object f2)
	{
		//line 108 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (haxe.lang.Runtime.eq(f1, f2)) 
		{
			//line 109 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			return true;
		}
		
		//line 111 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (( ( f1 instanceof haxe.lang.Closure ) && ( f2 instanceof haxe.lang.Closure ) )) 
		{
			//line 112 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			haxe.lang.Closure f1c = ((haxe.lang.Closure) (f1) );
			//line 113 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			haxe.lang.Closure f2c = ((haxe.lang.Closure) (f2) );
			//line 114 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			return ( haxe.lang.Runtime.refEq(f1c.obj, f2c.obj) && haxe.lang.Runtime.valEq(f1c.field, f2c.field) );
		}
		
		//line 116 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return false;
	}
	
	
	public static boolean isObject(java.lang.Object v)
	{
		//line 121 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return ( ( ! (( v == null )) ) &&  ! ((( ( ( ( ( v instanceof haxe.lang.Enum ) || ( v instanceof haxe.lang.Function ) ) || ( v instanceof java.lang.Enum ) ) || ( v instanceof java.lang.Number ) ) || ( v instanceof java.lang.Boolean ) )))  );
	}
	
	
	public static boolean isEnumValue(java.lang.Object v)
	{
		//line 125 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return ( ( ! (( v == null )) ) && (( ( v instanceof haxe.lang.Enum ) || ( v instanceof java.lang.Enum ) )) );
	}
	
	
	public static boolean deleteField(java.lang.Object o, java.lang.String field)
	{
		//line 130 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return ( haxe.lang.Runtime.toBool(( o instanceof haxe.lang.DynamicObject )) && haxe.lang.Runtime.toBool(((haxe.lang.DynamicObject) (o) ).__hx_deleteField(field)) );
	}
	
	
	public static <T> T copy(T o)
	{
		//line 135 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		java.lang.Object o2 = new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{});
		//line 136 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		{
			//line 136 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			int _g = 0;
			//line 136 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			haxe.root.Array<java.lang.String> _g1 = haxe.root.Reflect.fields(o);
			//line 136 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			while (( _g < _g1.length ))
			{
				//line 136 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
				java.lang.String f = _g1.__get(_g);
				//line 136 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
				 ++ _g;
				//line 137 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
				haxe.root.Reflect.setField(o2, f, haxe.root.Reflect.field(o, f));
			}
			
		}
		
		//line 138 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return ((T) (o2) );
	}
	
	
	public static java.lang.Object makeVarArgs(haxe.lang.Function f)
	{
		//line 144 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return new haxe.lang.VarArgsFunction(f);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 28 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return new haxe.root.Reflect(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 28 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return new haxe.root.Reflect();
	}
	
	
}



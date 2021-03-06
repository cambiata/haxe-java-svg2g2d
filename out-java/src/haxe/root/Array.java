package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Array<T> extends haxe.lang.HxObject
{
	
	public Array(T[] _native)
	{
		this.__a = _native;
		this.length = _native.length;
	}
	public Array(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Array()
	{
		//line 54 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		haxe.root.Array.__hx_ctor__Array(this);
	}
	
	
	public static <T_c> void __hx_ctor__Array(haxe.root.Array<T_c> __temp_me1)
	{
		//line 56 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		__temp_me1.length = 0;
		//line 57 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		__temp_me1.__a = ((T_c[]) (((java.lang.Object) (new java.lang.Object[0]) )) );
	}
	
	
	public static <X> haxe.root.Array<X> ofNative(X[] _native)
	{
		
			return new Array<X>(_native);
	
	}
	
	
	public static <Y> haxe.root.Array<Y> alloc(int size)
	{
		
			return new Array<Y>((Y[]) ((java.lang.Object)new java.lang.Object[size]));
	
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return new haxe.root.Array<java.lang.Object>(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return new haxe.root.Array<java.lang.Object>();
	}
	
	
	public int length;
	
	public T[] __a;
	
	public final haxe.root.Array<T> concat(haxe.root.Array<T> a)
	{
		//line 62 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int length = this.length;
		//line 63 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int len = ( length + a.length );
		//line 64 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T[] retarr = ((T[]) (((java.lang.Object) (new java.lang.Object[len]) )) );
		//line 65 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		java.lang.System.arraycopy(((java.lang.Object) (this.__a) ), ((int) (0) ), ((java.lang.Object) (retarr) ), ((int) (0) ), ((int) (length) ));
		//line 66 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		java.lang.System.arraycopy(((java.lang.Object) (a.__a) ), ((int) (0) ), ((java.lang.Object) (retarr) ), ((int) (length) ), ((int) (a.length) ));
		//line 68 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return ((haxe.root.Array<T>) (haxe.root.Array.ofNative(retarr)) );
	}
	
	
	public final void concatNative(T[] a)
	{
		//line 73 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T[] __a = this.__a;
		//line 74 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int length = this.length;
		//line 75 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int len = ( length + a.length );
		//line 76 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( __a.length >= len )) 
		{
			//line 78 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (0) ), ((java.lang.Object) (__a) ), ((int) (length) ), ((int) (length) ));
		}
		else
		{
			//line 80 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[len]) )) );
			//line 81 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (length) ));
			//line 82 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (length) ), ((int) (a.length) ));
			//line 84 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			this.__a = newarr;
		}
		
		//line 87 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		this.length = len;
	}
	
	
	public final java.lang.String join(java.lang.String sep)
	{
		//line 92 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		haxe.root.StringBuf buf = new haxe.root.StringBuf();
		//line 93 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int i = -1;
		//line 95 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		boolean first = true;
		//line 96 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int length = this.length;
		//line 97 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		while ((  ++ i < length ))
		{
			//line 99 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (first) 
			{
				//line 100 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				first = false;
			}
			else
			{
				//line 102 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				buf.add(sep);
			}
			
			//line 103 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			buf.add(this.__a[i]);
		}
		
		//line 106 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return buf.toString();
	}
	
	
	public final java.lang.Object pop()
	{
		//line 111 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T[] __a = this.__a;
		//line 112 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int length = this.length;
		//line 113 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( length > 0 )) 
		{
			//line 115 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			T val = __a[ -- length];
			//line 116 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			__a[length] = null;
			//line 117 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			this.length = length;
			//line 119 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			return val;
		}
		else
		{
			//line 121 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			return null;
		}
		
	}
	
	
	public final int push(T x)
	{
		//line 127 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int length = this.length;
		//line 128 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( length >= this.__a.length )) 
		{
			//line 130 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			int newLen = ( (( length << 1 )) + 1 );
			//line 131 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[newLen]) )) );
			//line 132 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			java.lang.System.arraycopy(((java.lang.Object) (this.__a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (this.__a.length) ));
			//line 134 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			this.__a = newarr;
		}
		
		//line 137 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		this.__a[length] = x;
		//line 138 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return  ++ this.length;
	}
	
	
	public final void reverse()
	{
		//line 143 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int i = 0;
		//line 144 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int l = this.length;
		//line 145 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T[] a = this.__a;
		//line 146 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int half = ( l >> 1 );
		//line 147 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		l -= 1;
		//line 148 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		while (( i < half ))
		{
			//line 150 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			T tmp = a[i];
			//line 151 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			a[i] = a[( l - i )];
			//line 152 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			a[( l - i )] = tmp;
			//line 153 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			i += 1;
		}
		
	}
	
	
	public final java.lang.Object shift()
	{
		//line 159 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int l = this.length;
		//line 160 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( l == 0 )) 
		{
			//line 161 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			return null;
		}
		
		//line 163 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T[] a = this.__a;
		//line 164 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T x = a[0];
		//line 165 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		l -= 1;
		//line 166 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (1) ), ((java.lang.Object) (a) ), ((int) (0) ), ((int) (( this.length - 1 )) ));
		//line 167 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		a[l] = null;
		//line 168 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		this.length = l;
		//line 170 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return x;
	}
	
	
	public final haxe.root.Array<T> slice(int pos, java.lang.Object end)
	{
		//line 175 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( pos < 0 )) 
		{
			//line 176 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			pos = ( this.length + pos );
			//line 177 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (( pos < 0 )) 
			{
				//line 178 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				pos = 0;
			}
			
		}
		
		//line 180 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (haxe.lang.Runtime.eq(end, null)) 
		{
			//line 181 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			end = this.length;
		}
		else
		{
			//line 182 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (( haxe.lang.Runtime.compare(end, 0) < 0 )) 
			{
				//line 183 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				end = ((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.plus(this.length, end))) );
			}
			
		}
		
		//line 184 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( haxe.lang.Runtime.compare(end, this.length) > 0 )) 
		{
			//line 185 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			end = this.length;
		}
		
		//line 186 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int len = ( ((int) (haxe.lang.Runtime.toInt(end)) ) - ((int) (pos) ) );
		//line 187 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( len < 0 )) 
		{
			//line 187 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			return new haxe.root.Array<T>();
		}
		
		//line 189 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[len]) )) );
		//line 190 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		java.lang.System.arraycopy(((java.lang.Object) (this.__a) ), ((int) (pos) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (len) ));
		//line 192 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return ((haxe.root.Array<T>) (haxe.root.Array.ofNative(newarr)) );
	}
	
	
	public final void sort(haxe.lang.Function f)
	{
		//line 197 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( this.length == 0 )) 
		{
			//line 198 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			return ;
		}
		
		//line 199 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		this.quicksort(0, ( this.length - 1 ), f);
	}
	
	
	public final void quicksort(int lo, int hi, haxe.lang.Function f)
	{
		//line 204 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T[] buf = this.__a;
		//line 205 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int i = lo;
		//line 205 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int j = hi;
		//line 206 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T p = buf[( ( i + j ) >> 1 )];
		//line 207 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		while (( i <= j ))
		{
			//line 209 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			while (( ( i < hi ) && ( ((int) (f.__hx_invoke2_f(0.0, buf[i], 0.0, p)) ) < 0 ) ))
			{
				//line 209 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				i++;
			}
			
			//line 210 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			while (( ( j > lo ) && ( ((int) (f.__hx_invoke2_f(0.0, buf[j], 0.0, p)) ) > 0 ) ))
			{
				//line 210 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				j--;
			}
			
			//line 211 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (( i <= j )) 
			{
				//line 213 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				T t = buf[i];
				//line 214 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				buf[i++] = buf[j];
				//line 215 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				buf[j--] = t;
			}
			
		}
		
		//line 219 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( lo < j )) 
		{
			//line 219 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			this.quicksort(lo, j, f);
		}
		
		//line 220 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( i < hi )) 
		{
			//line 220 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			this.quicksort(i, hi, f);
		}
		
	}
	
	
	public final haxe.root.Array<T> splice(int pos, int len)
	{
		//line 225 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( len < 0 )) 
		{
			//line 225 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			return new haxe.root.Array<T>();
		}
		
		//line 226 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( pos < 0 )) 
		{
			//line 227 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			pos = ( this.length + pos );
			//line 228 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (( pos < 0 )) 
			{
				//line 228 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				pos = 0;
			}
			
		}
		
		//line 230 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( pos > this.length )) 
		{
			//line 231 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			pos = 0;
			//line 232 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			len = 0;
		}
		else
		{
			//line 233 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (( ( pos + len ) > this.length )) 
			{
				//line 234 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				len = ( this.length - pos );
				//line 235 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				if (( len < 0 )) 
				{
					//line 235 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					len = 0;
				}
				
			}
			
		}
		
		//line 237 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T[] a = this.__a;
		//line 239 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T[] ret = ((T[]) (((java.lang.Object) (new java.lang.Object[len]) )) );
		//line 240 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (pos) ), ((java.lang.Object) (ret) ), ((int) (0) ), ((int) (len) ));
		//line 241 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		haxe.root.Array<T> ret1 = ((haxe.root.Array<T>) (haxe.root.Array.ofNative(ret)) );
		//line 243 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int end = ( pos + len );
		//line 244 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (end) ), ((java.lang.Object) (a) ), ((int) (pos) ), ((int) (( this.length - end )) ));
		//line 245 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		this.length -= len;
		//line 246 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		while ((  -- len >= 0 ))
		{
			//line 247 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			a[( this.length + len )] = null;
		}
		
		//line 248 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return ret1;
	}
	
	
	public final void spliceVoid(int pos, int len)
	{
		//line 253 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( len < 0 )) 
		{
			//line 253 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			return ;
		}
		
		//line 254 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( pos < 0 )) 
		{
			//line 255 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			pos = ( this.length + pos );
			//line 256 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (( pos < 0 )) 
			{
				//line 256 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				pos = 0;
			}
			
		}
		
		//line 258 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( pos > this.length )) 
		{
			//line 259 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			pos = 0;
			//line 260 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			len = 0;
		}
		else
		{
			//line 261 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (( ( pos + len ) > this.length )) 
			{
				//line 262 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				len = ( this.length - pos );
				//line 263 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				if (( len < 0 )) 
				{
					//line 263 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					len = 0;
				}
				
			}
			
		}
		
		//line 265 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T[] a = this.__a;
		//line 267 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int end = ( pos + len );
		//line 268 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (end) ), ((java.lang.Object) (a) ), ((int) (pos) ), ((int) (( this.length - end )) ));
		//line 269 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		this.length -= len;
		//line 270 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		while ((  -- len >= 0 ))
		{
			//line 271 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			a[( this.length + len )] = null;
		}
		
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 276 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		haxe.root.StringBuf ret = new haxe.root.StringBuf();
		//line 277 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T[] a = this.__a;
		//line 278 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		ret.add("[");
		//line 279 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		boolean first = true;
		//line 280 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		{
			//line 280 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			int _g1 = 0;
			//line 280 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			int _g = this.length;
			//line 280 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			while (( _g1 < _g ))
			{
				//line 280 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				int i = _g1++;
				//line 282 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				if (first) 
				{
					//line 283 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					first = false;
				}
				else
				{
					//line 285 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					ret.add(",");
				}
				
				//line 286 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				ret.add(a[i]);
			}
			
		}
		
		//line 289 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		ret.add("]");
		//line 290 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return ret.toString();
	}
	
	
	public final void unshift(T x)
	{
		//line 295 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T[] __a = this.__a;
		//line 296 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int length = this.length;
		//line 297 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( length >= __a.length )) 
		{
			//line 299 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			int newLen = ( (( length << 1 )) + 1 );
			//line 300 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[newLen]) )) );
			//line 301 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (1) ), ((int) (length) ));
			//line 303 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			this.__a = newarr;
		}
		else
		{
			//line 305 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (__a) ), ((int) (1) ), ((int) (length) ));
		}
		
		//line 308 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		this.__a[0] = x;
		//line 309 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		 ++ this.length;
	}
	
	
	public final void insert(int pos, T x)
	{
		//line 314 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int l = this.length;
		//line 315 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( pos < 0 )) 
		{
			//line 316 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			pos = ( l + pos );
			//line 317 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (( pos < 0 )) 
			{
				//line 317 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				pos = 0;
			}
			
		}
		
		//line 319 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( pos >= l )) 
		{
			//line 320 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			this.push(x);
			//line 321 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			return ;
		}
		else
		{
			//line 322 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (( pos == 0 )) 
			{
				//line 323 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				this.unshift(x);
				//line 324 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				return ;
			}
			
		}
		
		//line 327 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( l >= this.__a.length )) 
		{
			//line 329 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			int newLen = ( (( this.length << 1 )) + 1 );
			//line 330 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[newLen]) )) );
			//line 331 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			java.lang.System.arraycopy(((java.lang.Object) (this.__a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (pos) ));
			//line 332 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			newarr[pos] = x;
			//line 333 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			java.lang.System.arraycopy(((java.lang.Object) (this.__a) ), ((int) (pos) ), ((java.lang.Object) (newarr) ), ((int) (( pos + 1 )) ), ((int) (( l - pos )) ));
			//line 335 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			this.__a = newarr;
			//line 336 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			 ++ this.length;
		}
		else
		{
			//line 338 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			T[] __a = this.__a;
			//line 339 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (pos) ), ((java.lang.Object) (__a) ), ((int) (( pos + 1 )) ), ((int) (( l - pos )) ));
			//line 340 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (__a) ), ((int) (0) ), ((int) (pos) ));
			//line 341 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			__a[pos] = x;
			//line 342 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			 ++ this.length;
		}
		
	}
	
	
	public final boolean remove(T x)
	{
		//line 348 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T[] __a = this.__a;
		//line 349 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int i = -1;
		//line 350 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int length = this.length;
		//line 351 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		while ((  ++ i < length ))
		{
			//line 353 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (haxe.lang.Runtime.eq(__a[i], x)) 
			{
				//line 355 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (( i + 1 )) ), ((java.lang.Object) (__a) ), ((int) (i) ), ((int) (( ( length - i ) - 1 )) ));
				//line 356 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				__a[ -- this.length] = null;
				//line 358 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				return true;
			}
			
		}
		
		//line 362 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return false;
	}
	
	
	public final int indexOf(T x, java.lang.Object fromIndex)
	{
		//line 366 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int len = this.length;
		//line 366 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T[] a = this.__a;
		//line 366 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int i = 0;
		//line 366 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (haxe.lang.Runtime.eq(fromIndex, null)) 
		{
			//line 366 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			i = 0;
		}
		else
		{
			//line 366 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			i = ((int) (haxe.lang.Runtime.toInt(fromIndex)) );
		}
		
		//line 367 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( i < 0 )) 
		{
			//line 369 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			i += len;
			//line 370 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (( i < 0 )) 
			{
				//line 370 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				i = 0;
			}
			
		}
		
		//line 372 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		while (( i < len ))
		{
			//line 374 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (haxe.lang.Runtime.eq(a[i], x)) 
			{
				//line 375 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				return i;
			}
			
			//line 376 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			i++;
		}
		
		//line 378 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return -1;
	}
	
	
	public final int lastIndexOf(T x, java.lang.Object fromIndex)
	{
		//line 382 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int len = this.length;
		//line 382 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T[] a = this.__a;
		//line 382 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int i = 0;
		//line 382 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (haxe.lang.Runtime.eq(fromIndex, null)) 
		{
			//line 382 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			i = ( len - 1 );
		}
		else
		{
			//line 382 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			i = ((int) (haxe.lang.Runtime.toInt(fromIndex)) );
		}
		
		//line 383 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( i >= len )) 
		{
			//line 384 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			i = ( len - 1 );
		}
		else
		{
			//line 385 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (( i < 0 )) 
			{
				//line 386 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				i += len;
			}
			
		}
		
		//line 387 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		while (( i >= 0 ))
		{
			//line 389 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (haxe.lang.Runtime.eq(a[i], x)) 
			{
				//line 390 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				return i;
			}
			
			//line 391 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			i--;
		}
		
		//line 393 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return -1;
	}
	
	
	public final haxe.root.Array<T> copy()
	{
		//line 398 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		int len = this.length;
		//line 399 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T[] __a = this.__a;
		//line 400 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[len]) )) );
		//line 401 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (len) ));
		//line 402 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return ((haxe.root.Array<T>) (haxe.root.Array.ofNative(newarr)) );
	}
	
	
	public final java.lang.Object iterator()
	{
		//line 407 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return new _Array.ArrayIterator<T>(((haxe.root.Array<T>) (this) ));
	}
	
	
	public final <S> haxe.root.Array<S> map(haxe.lang.Function f)
	{
		//line 411 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		haxe.root.Array<S> ret = new haxe.root.Array<S>(( (S[]) (new java.lang.Object[] {}) ));
		//line 412 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		{
			//line 412 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			int _g = 0;
			//line 412 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			haxe.root.Array<T> _g1 = this;
			//line 412 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			while (( _g < _g1.length ))
			{
				//line 412 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				T elt = _g1.__get(_g);
				//line 412 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				 ++ _g;
				//line 413 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				ret.push(((S) (f.__hx_invoke1_o(0.0, elt)) ));
			}
			
		}
		
		//line 414 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return ret;
	}
	
	
	public final haxe.root.Array<T> filter(haxe.lang.Function f)
	{
		//line 418 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		haxe.root.Array<T> ret = new haxe.root.Array<T>(( (T[]) (new java.lang.Object[] {}) ));
		//line 419 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		{
			//line 419 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			int _g = 0;
			//line 419 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			haxe.root.Array<T> _g1 = this;
			//line 419 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			while (( _g < _g1.length ))
			{
				//line 419 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				T elt = _g1.__get(_g);
				//line 419 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				 ++ _g;
				//line 420 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				if (haxe.lang.Runtime.toBool(f.__hx_invoke1_o(0.0, elt))) 
				{
					//line 421 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					ret.push(elt);
				}
				
			}
			
		}
		
		//line 422 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return ret;
	}
	
	
	public final T __get(int idx)
	{
		//line 427 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T[] __a = this.__a;
		//line 428 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( ( idx >= __a.length ) || ( idx < 0 ) )) 
		{
			//line 429 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			return null;
		}
		
		//line 431 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return __a[idx];
	}
	
	
	public final T __set(int idx, T v)
	{
		//line 436 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		T[] __a = this.__a;
		//line 437 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( idx >= __a.length )) 
		{
			//line 439 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			int newl = ( idx + 1 );
			//line 440 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (( idx == __a.length )) 
			{
				//line 441 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				newl = ( (( idx << 1 )) + 1 );
			}
			
			//line 442 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			T[] newArr = ((T[]) (((java.lang.Object) (new java.lang.Object[newl]) )) );
			//line 443 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (( this.length > 0 )) 
			{
				//line 444 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (newArr) ), ((int) (0) ), ((int) (this.length) ));
			}
			
			//line 445 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			this.__a = __a = newArr;
		}
		
		//line 448 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		if (( idx >= this.length )) 
		{
			//line 449 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			this.length = ( idx + 1 );
		}
		
		//line 451 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return __a[idx] = v;
	}
	
	
	public final T __unsafe_get(int idx)
	{
		//line 456 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return this.__a[idx];
	}
	
	
	public final T __unsafe_set(int idx, T val)
	{
		//line 461 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return this.__a[idx] = val;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		{
			//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			boolean __temp_executeDef1 = true;
			//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("length")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						this.length = ((int) (value) );
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return value;
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
			}
			
			//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (__temp_executeDef1) 
			{
				//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		{
			//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			boolean __temp_executeDef1 = true;
			//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			switch (field.hashCode())
			{
				case 94337:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("__a")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						this.__a = ((T[]) (value) );
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return value;
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("length")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						this.length = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return value;
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
			}
			
			//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (__temp_executeDef1) 
			{
				//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		{
			//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			boolean __temp_executeDef1 = true;
			//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			switch (field.hashCode())
			{
				case -537840087:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("__unsafe_set")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "__unsafe_set")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("length")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.length;
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -537851619:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("__unsafe_get")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "__unsafe_get")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 94337:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("__a")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.__a;
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 90678402:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("__set")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "__set")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -1354795244:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("concat")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "concat")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 90666870:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("__get")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "__get")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -1238494133:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("concatNative")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "concatNative")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -1274492040:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("filter")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "filter")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 3267882:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("join")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "join")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 107868:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("map")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "map")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 111185:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("pop")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "pop")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 1182533742:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("iterator")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "iterator")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 3452698:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("push")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "push")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 3059573:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("copy")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "copy")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 1099846370:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("reverse")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "reverse")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -467511597:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("lastIndexOf")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "lastIndexOf")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 109407362:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("shift")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "shift")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 1943291465:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("indexOf")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "indexOf")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 109526418:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("slice")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "slice")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -934610812:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("remove")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "remove")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 3536286:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("sort")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "sort")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -1183792455:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("insert")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "insert")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 1301699851:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("quicksort")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "quicksort")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -277637751:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("unshift")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "unshift")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -895859076:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("splice")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "splice")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -1776922004:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("toString")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -821858768:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("spliceVoid")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "spliceVoid")) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
			}
			
			//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (__temp_executeDef1) 
			{
				//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		{
			//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			boolean __temp_executeDef1 = true;
			//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("length")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((double) (this.length) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
			}
			
			//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (__temp_executeDef1) 
			{
				//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		{
			//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			boolean __temp_executeDef1 = true;
			//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			switch (field.hashCode())
			{
				case -537840087:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("__unsafe_set")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.__unsafe_set(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((T) (dynargs.__get(1)) ));
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -1354795244:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("concat")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.concat(((haxe.root.Array<T>) (dynargs.__get(0)) ));
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -537851619:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("__unsafe_get")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.__unsafe_get(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -1238494133:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("concatNative")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						this.concatNative(((T[]) (dynargs.__get(0)) ));
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 90678402:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("__set")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.__set(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((T) (dynargs.__get(1)) ));
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 3267882:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("join")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.join(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 90666870:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("__get")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.__get(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 111185:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("pop")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.pop();
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -1274492040:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("filter")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.filter(((haxe.lang.Function) (dynargs.__get(0)) ));
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 3452698:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("push")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.push(((T) (dynargs.__get(0)) ));
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 107868:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("map")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return ((haxe.root.Array<java.lang.Object>) (this.map(((haxe.lang.Function) (dynargs.__get(0)) ))) );
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 1099846370:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("reverse")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						this.reverse();
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 1182533742:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("iterator")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.iterator();
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 109407362:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("shift")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.shift();
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 3059573:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("copy")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.copy();
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 109526418:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("slice")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.slice(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), dynargs.__get(1));
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -467511597:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("lastIndexOf")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.lastIndexOf(((T) (dynargs.__get(0)) ), dynargs.__get(1));
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 3536286:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("sort")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						this.sort(((haxe.lang.Function) (dynargs.__get(0)) ));
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 1943291465:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("indexOf")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.indexOf(((T) (dynargs.__get(0)) ), dynargs.__get(1));
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case 1301699851:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("quicksort")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						this.quicksort(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), ((haxe.lang.Function) (dynargs.__get(2)) ));
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -934610812:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("remove")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.remove(((T) (dynargs.__get(0)) ));
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -895859076:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("splice")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.splice(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ));
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -1183792455:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("insert")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						this.insert(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((T) (dynargs.__get(1)) ));
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -821858768:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("spliceVoid")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						this.spliceVoid(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ));
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -277637751:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("unshift")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						this.unshift(((T) (dynargs.__get(0)) ));
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
				case -1776922004:
				{
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					if (field.equals("toString")) 
					{
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						__temp_executeDef1 = false;
						//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
						return this.toString();
					}
					
					//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
					break;
				}
				
				
			}
			
			//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			if (__temp_executeDef1) 
			{
				//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		baseArr.push("__a");
		//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		baseArr.push("length");
		//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
		{
			//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\Array.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}



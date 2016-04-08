package sys.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class File extends haxe.lang.HxObject
{
	public File(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public File()
	{
		//line 25 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		sys.io.File.__hx_ctor_sys_io_File(this);
	}
	
	
	public static void __hx_ctor_sys_io_File(sys.io.File __temp_me31)
	{
	}
	
	
	public static java.lang.String getContent(java.lang.String path)
	{
		//line 29 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		sys.io.FileInput f = sys.io.File.read(path, false);
		//line 30 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		java.lang.String ret = f.readAll(null).toString();
		//line 31 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		f.close();
		//line 32 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		return ret;
	}
	
	
	public static void saveContent(java.lang.String path, java.lang.String content)
	{
		//line 37 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		sys.io.FileOutput f = sys.io.File.write(path, false);
		//line 38 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		f.writeString(content);
		//line 39 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		f.close();
	}
	
	
	public static sys.io.FileInput read(java.lang.String path, java.lang.Object binary)
	{
		//line 59 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		boolean __temp_binary29 = ( (haxe.lang.Runtime.eq(binary, null)) ? (true) : (haxe.lang.Runtime.toBool(binary)) );
		//line 61 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		try 
		{
			//line 61 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
			return new sys.io.FileInput(((java.io.RandomAccessFile) (new java.io.RandomAccessFile(((java.io.File) (new java.io.File(haxe.lang.Runtime.toString(path))) ), haxe.lang.Runtime.toString("r"))) ));
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 61 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 65 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 65 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 65 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 65 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
			{
				//line 65 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
				java.lang.Object e = __temp_catchall2;
				//line 65 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	public static sys.io.FileOutput write(java.lang.String path, java.lang.Object binary)
	{
		//line 70 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		boolean __temp_binary30 = ( (haxe.lang.Runtime.eq(binary, null)) ? (true) : (haxe.lang.Runtime.toBool(binary)) );
		//line 71 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		java.io.File f = new java.io.File(haxe.lang.Runtime.toString(path));
		//line 72 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		if (f.exists()) 
		{
			//line 74 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
			f.delete();
		}
		
		//line 79 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		try 
		{
			//line 79 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
			return new sys.io.FileOutput(((java.io.RandomAccessFile) (new java.io.RandomAccessFile(((java.io.File) (f) ), haxe.lang.Runtime.toString("rw"))) ));
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 79 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 83 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 83 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 83 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 83 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
			{
				//line 83 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
				java.lang.Object e = __temp_catchall2;
				//line 83 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 25 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		return new sys.io.File(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 25 "F:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		return new sys.io.File();
	}
	
	
}



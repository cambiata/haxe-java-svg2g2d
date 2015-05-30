package haxe.xml;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Parser extends haxe.lang.HxObject
{
	static
	{
		//line 51 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		{
			//line 52 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
			haxe.ds.StringMap<java.lang.String> h = new haxe.ds.StringMap<java.lang.String>();
			//line 53 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
			h.set("lt", "<");
			//line 54 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
			h.set("gt", ">");
			//line 55 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
			h.set("amp", "&");
			//line 56 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
			h.set("quot", "\"");
			//line 57 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
			h.set("apos", "\'");
			//line 58 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
			haxe.xml.Parser.escapes = h;
		}
		
	}
	
	public Parser(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Parser()
	{
		//line 49 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		haxe.xml.Parser.__hx_ctor_haxe_xml_Parser(this);
	}
	
	
	public static void __hx_ctor_haxe_xml_Parser(haxe.xml.Parser __temp_me22)
	{
	}
	
	
	public static haxe.ds.StringMap<java.lang.String> escapes;
	
	public static haxe.root.Xml parse(java.lang.String str, java.lang.Object strict)
	{
		//line 65 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		boolean __temp_strict20 = ( (haxe.lang.Runtime.eq(strict, null)) ? (false) : (haxe.lang.Runtime.toBool(strict)) );
		//line 66 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		haxe.root.Xml doc = haxe.root.Xml.createDocument();
		//line 67 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		haxe.xml.Parser.doParse(str, __temp_strict20, 0, doc);
		//line 68 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		return doc;
	}
	
	
	public static int doParse(java.lang.String str, boolean strict, java.lang.Object p, haxe.root.Xml parent)
	{
		//line 72 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		int __temp_p21 = ( (haxe.lang.Runtime.eq(p, null)) ? (0) : (((int) (haxe.lang.Runtime.toInt(p)) )) );
		//line 73 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		haxe.root.Xml xml = null;
		//line 74 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		int state = 1;
		//line 75 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		int next = 1;
		//line 76 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		java.lang.String aname = null;
		//line 77 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		int start = 0;
		//line 78 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		int nsubs = 0;
		//line 79 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		int nbrackets = 0;
		//line 80 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		int c = 0;
		//line 80 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		if (( __temp_p21 < str.length() )) 
		{
			//line 80 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
			c = ((int) (str.charAt(__temp_p21)) );
		}
		else
		{
			//line 80 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
			c = -1;
		}
		
		//line 81 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		haxe.root.StringBuf buf = new haxe.root.StringBuf();
		//line 83 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		int escapeNext = 1;
		//line 84 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		int attrValQuote = -1;
		//line 85 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		while ( ! ((( c == -1 ))) )
		{
			//line 87 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
			switch (state)
			{
				case 0:
				{
					//line 90 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					switch (c)
					{
						case 10:
						case 13:
						case 9:
						case 32:
						{
							//line 93 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							break;
						}
						
						
						default:
						{
							//line 98 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							state = next;
							//line 99 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							continue;
						}
						
					}
					
					//line 90 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					break;
				}
				
				
				case 1:
				{
					//line 102 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					switch (c)
					{
						case 60:
						{
							//line 105 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							state = 0;
							//line 106 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							next = 2;
							//line 104 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							break;
						}
						
						
						default:
						{
							//line 108 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							start = __temp_p21;
							//line 109 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							state = 13;
							//line 110 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							continue;
						}
						
					}
					
					//line 102 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					break;
				}
				
				
				case 13:
				{
					//line 113 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					if (( c == 60 )) 
					{
						//line 115 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						buf.addSub(str, start, ( __temp_p21 - start ));
						//line 116 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						haxe.root.Xml child = haxe.root.Xml.createPCData(buf.toString());
						//line 117 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						buf = new haxe.root.StringBuf();
						//line 118 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						parent.addChild(child);
						//line 119 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						nsubs++;
						//line 120 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						state = 0;
						//line 121 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						next = 2;
					}
					else
					{
						//line 122 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						if (( c == 38 )) 
						{
							//line 123 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							buf.addSub(str, start, ( __temp_p21 - start ));
							//line 124 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							state = 18;
							//line 125 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							escapeNext = 13;
							//line 126 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							start = ( __temp_p21 + 1 );
						}
						
					}
					
					//line 113 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					break;
				}
				
				
				case 17:
				{
					//line 129 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					boolean __temp_boolv4 = ( c == 93 );
					//line 129 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					boolean __temp_boolv3 = false;
					//line 129 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					boolean __temp_boolv2 = false;
					//line 129 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					if (__temp_boolv4) 
					{
						//line 129 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						int __temp_stmt5 = 0;
						//line 129 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						{
							//line 129 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							int index = ( __temp_p21 + 1 );
							//line 129 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							__temp_stmt5 = ( (( index < str.length() )) ? (((int) (str.charAt(index)) )) : (-1) );
						}
						
						//line 129 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						__temp_boolv3 = ( __temp_stmt5 == 93 );
						//line 129 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						if (__temp_boolv3) 
						{
							//line 129 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							int __temp_stmt6 = 0;
							//line 129 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							{
								//line 129 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								int index1 = ( __temp_p21 + 2 );
								//line 129 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								__temp_stmt6 = ( (( index1 < str.length() )) ? (((int) (str.charAt(index1)) )) : (-1) );
							}
							
							//line 129 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							__temp_boolv2 = ( __temp_stmt6 == 62 );
						}
						
					}
					
					//line 129 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					boolean __temp_stmt1 = ( ( __temp_boolv4 && __temp_boolv3 ) && __temp_boolv2 );
					//line 129 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					if (__temp_stmt1) 
					{
						//line 131 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						haxe.root.Xml child1 = haxe.root.Xml.createCData(haxe.lang.StringExt.substr(str, start, ( __temp_p21 - start )));
						//line 132 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						parent.addChild(child1);
						//line 133 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						nsubs++;
						//line 134 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						__temp_p21 += 2;
						//line 135 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						state = 1;
					}
					
					//line 129 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					break;
				}
				
				
				case 2:
				{
					//line 138 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					switch (c)
					{
						case 33:
						{
							//line 141 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							int __temp_stmt7 = 0;
							//line 141 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							{
								//line 141 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								int index2 = ( __temp_p21 + 1 );
								//line 141 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								__temp_stmt7 = ( (( index2 < str.length() )) ? (((int) (str.charAt(index2)) )) : (-1) );
							}
							
							//line 141 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							if (( __temp_stmt7 == 91 )) 
							{
								//line 143 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								__temp_p21 += 2;
								//line 144 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								if ( ! (haxe.lang.Runtime.valEq(haxe.lang.StringExt.substr(str, __temp_p21, 6).toUpperCase(), "CDATA[")) ) 
								{
									//line 145 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									throw haxe.lang.HaxeException.wrap("Expected <![CDATA[");
								}
								
								//line 146 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								__temp_p21 += 5;
								//line 147 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								state = 17;
								//line 148 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								start = ( __temp_p21 + 1 );
							}
							else
							{
								//line 150 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								int __temp_stmt10 = 0;
								//line 150 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								{
									//line 150 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									int index3 = ( __temp_p21 + 1 );
									//line 150 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									__temp_stmt10 = ( (( index3 < str.length() )) ? (((int) (str.charAt(index3)) )) : (-1) );
								}
								
								//line 150 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								boolean __temp_stmt9 = ( __temp_stmt10 == 68 );
								//line 150 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								boolean __temp_boolv11 = false;
								//line 150 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								if ( ! (__temp_stmt9) ) 
								{
									//line 150 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									int __temp_stmt12 = 0;
									//line 150 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									{
										//line 150 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
										int index4 = ( __temp_p21 + 1 );
										//line 150 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
										__temp_stmt12 = ( (( index4 < str.length() )) ? (((int) (str.charAt(index4)) )) : (-1) );
									}
									
									//line 150 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									__temp_boolv11 = ( __temp_stmt12 == 100 );
								}
								
								//line 150 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								boolean __temp_stmt8 = ( __temp_stmt9 || __temp_boolv11 );
								//line 150 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								if (__temp_stmt8) 
								{
									//line 152 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									if ( ! (haxe.lang.Runtime.valEq(haxe.lang.StringExt.substr(str, ( __temp_p21 + 2 ), 6).toUpperCase(), "OCTYPE")) ) 
									{
										//line 153 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
										throw haxe.lang.HaxeException.wrap("Expected <!DOCTYPE");
									}
									
									//line 154 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									__temp_p21 += 8;
									//line 155 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									state = 16;
									//line 156 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									start = ( __temp_p21 + 1 );
								}
								else
								{
									//line 158 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									int __temp_stmt15 = 0;
									//line 158 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									{
										//line 158 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
										int index5 = ( __temp_p21 + 1 );
										//line 158 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
										__temp_stmt15 = ( (( index5 < str.length() )) ? (((int) (str.charAt(index5)) )) : (-1) );
									}
									
									//line 158 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									boolean __temp_stmt14 = ( __temp_stmt15 != 45 );
									//line 158 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									boolean __temp_boolv16 = false;
									//line 158 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									if ( ! (__temp_stmt14) ) 
									{
										//line 158 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
										int __temp_stmt17 = 0;
										//line 158 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
										{
											//line 158 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
											int index6 = ( __temp_p21 + 2 );
											//line 158 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
											__temp_stmt17 = ( (( index6 < str.length() )) ? (((int) (str.charAt(index6)) )) : (-1) );
										}
										
										//line 158 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
										__temp_boolv16 = ( __temp_stmt17 != 45 );
									}
									
									//line 158 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									boolean __temp_stmt13 = ( __temp_stmt14 || __temp_boolv16 );
									//line 158 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									if (__temp_stmt13) 
									{
										//line 159 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
										throw haxe.lang.HaxeException.wrap("Expected <!--");
									}
									else
									{
										//line 162 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
										__temp_p21 += 2;
										//line 163 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
										state = 15;
										//line 164 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
										start = ( __temp_p21 + 1 );
									}
									
								}
								
							}
							
							//line 141 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							break;
						}
						
						
						case 63:
						{
							//line 167 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							state = 14;
							//line 168 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							start = __temp_p21;
							//line 166 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							break;
						}
						
						
						case 47:
						{
							//line 170 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							if (( parent == null )) 
							{
								//line 171 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								throw haxe.lang.HaxeException.wrap("Expected node name");
							}
							
							//line 172 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							start = ( __temp_p21 + 1 );
							//line 173 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							state = 0;
							//line 174 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							next = 10;
							//line 169 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							break;
						}
						
						
						default:
						{
							//line 176 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							state = 3;
							//line 177 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							start = __temp_p21;
							//line 178 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							continue;
						}
						
					}
					
					//line 138 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					break;
				}
				
				
				case 3:
				{
					//line 181 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					if ( ! ((( ( ( ( ( ( ( ( c >= 97 ) && ( c <= 122 ) ) || ( ( c >= 65 ) && ( c <= 90 ) ) ) || ( ( c >= 48 ) && ( c <= 57 ) ) ) || ( c == 58 ) ) || ( c == 46 ) ) || ( c == 95 ) ) || ( c == 45 ) ))) ) 
					{
						//line 183 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						if (( __temp_p21 == start )) 
						{
							//line 184 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							throw haxe.lang.HaxeException.wrap("Expected node name");
						}
						
						//line 185 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						xml = haxe.root.Xml.createElement(haxe.lang.StringExt.substr(str, start, ( __temp_p21 - start )));
						//line 186 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						parent.addChild(xml);
						//line 187 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						state = 0;
						//line 188 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						next = 4;
						//line 189 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						continue;
					}
					
					//line 181 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					break;
				}
				
				
				case 4:
				{
					//line 192 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					switch (c)
					{
						case 47:
						{
							//line 195 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							state = 11;
							//line 196 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							nsubs++;
							//line 194 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							break;
						}
						
						
						case 62:
						{
							//line 198 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							state = 9;
							//line 199 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							nsubs++;
							//line 197 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							break;
						}
						
						
						default:
						{
							//line 201 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							state = 5;
							//line 202 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							start = __temp_p21;
							//line 203 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							continue;
						}
						
					}
					
					//line 192 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					break;
				}
				
				
				case 5:
				{
					//line 206 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					if ( ! ((( ( ( ( ( ( ( ( c >= 97 ) && ( c <= 122 ) ) || ( ( c >= 65 ) && ( c <= 90 ) ) ) || ( ( c >= 48 ) && ( c <= 57 ) ) ) || ( c == 58 ) ) || ( c == 46 ) ) || ( c == 95 ) ) || ( c == 45 ) ))) ) 
					{
						//line 208 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						java.lang.String tmp = null;
						//line 209 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						if (( start == __temp_p21 )) 
						{
							//line 210 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							throw haxe.lang.HaxeException.wrap("Expected attribute name");
						}
						
						//line 211 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						tmp = haxe.lang.StringExt.substr(str, start, ( __temp_p21 - start ));
						//line 212 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						aname = tmp;
						//line 213 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						if (xml.exists(aname)) 
						{
							//line 214 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							throw haxe.lang.HaxeException.wrap("Duplicate attribute");
						}
						
						//line 215 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						state = 0;
						//line 216 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						next = 6;
						//line 217 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						continue;
					}
					
					//line 206 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					break;
				}
				
				
				case 6:
				{
					//line 220 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					switch (c)
					{
						case 61:
						{
							//line 223 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							state = 0;
							//line 224 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							next = 7;
							//line 222 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							break;
						}
						
						
						default:
						{
							//line 226 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							throw haxe.lang.HaxeException.wrap("Expected =");
						}
						
					}
					
					//line 220 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					break;
				}
				
				
				case 7:
				{
					//line 229 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					switch (c)
					{
						case 34:
						case 39:
						{
							//line 232 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							buf = new haxe.root.StringBuf();
							//line 233 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							state = 8;
							//line 234 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							start = ( __temp_p21 + 1 );
							//line 235 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							attrValQuote = c;
							//line 231 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							break;
						}
						
						
						default:
						{
							//line 237 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							throw haxe.lang.HaxeException.wrap("Expected \"");
						}
						
					}
					
					//line 229 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					break;
				}
				
				
				case 8:
				{
					//line 240 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					switch (c)
					{
						case 38:
						{
							//line 242 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							buf.addSub(str, start, ( __temp_p21 - start ));
							//line 243 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							state = 18;
							//line 244 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							escapeNext = 8;
							//line 245 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							start = ( __temp_p21 + 1 );
							//line 241 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							break;
						}
						
						
						case 62:
						{
							//line 246 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							if (strict) 
							{
								//line 248 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								throw haxe.lang.HaxeException.wrap(( ( "Invalid unescaped " + Character.toString((char) c) ) + " in attribute value" ));
							}
							else
							{
								//line 249 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								if (( c == attrValQuote )) 
								{
									//line 250 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									buf.addSub(str, start, ( __temp_p21 - start ));
									//line 251 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									java.lang.String val = buf.toString();
									//line 252 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									buf = new haxe.root.StringBuf();
									//line 253 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									xml.set(aname, val);
									//line 254 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									state = 0;
									//line 255 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									next = 4;
								}
								
							}
							
							//line 246 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							break;
						}
						
						
						case 60:
						{
							//line 246 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							if (strict) 
							{
								//line 248 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								throw haxe.lang.HaxeException.wrap(( ( "Invalid unescaped " + Character.toString((char) c) ) + " in attribute value" ));
							}
							else
							{
								//line 249 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								if (( c == attrValQuote )) 
								{
									//line 250 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									buf.addSub(str, start, ( __temp_p21 - start ));
									//line 251 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									java.lang.String val1 = buf.toString();
									//line 252 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									buf = new haxe.root.StringBuf();
									//line 253 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									xml.set(aname, val1);
									//line 254 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									state = 0;
									//line 255 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									next = 4;
								}
								
							}
							
							//line 246 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							break;
						}
						
						
						default:
						{
							//line 249 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							if (( c == attrValQuote )) 
							{
								//line 250 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								buf.addSub(str, start, ( __temp_p21 - start ));
								//line 251 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								java.lang.String val2 = buf.toString();
								//line 252 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								buf = new haxe.root.StringBuf();
								//line 253 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								xml.set(aname, val2);
								//line 254 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								state = 0;
								//line 255 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								next = 4;
							}
							
							//line 249 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							break;
						}
						
					}
					
					//line 240 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					break;
				}
				
				
				case 9:
				{
					//line 258 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					__temp_p21 = haxe.xml.Parser.doParse(str, strict, __temp_p21, xml);
					//line 259 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					start = __temp_p21;
					//line 260 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					state = 1;
					//line 257 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					break;
				}
				
				
				case 11:
				{
					//line 262 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					switch (c)
					{
						case 62:
						{
							//line 265 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							state = 1;
							//line 265 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							break;
						}
						
						
						default:
						{
							//line 267 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							throw haxe.lang.HaxeException.wrap("Expected >");
						}
						
					}
					
					//line 262 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					break;
				}
				
				
				case 12:
				{
					//line 270 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					switch (c)
					{
						case 62:
						{
							//line 273 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							if (( nsubs == 0 )) 
							{
								//line 274 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								parent.addChild(haxe.root.Xml.createPCData(""));
							}
							
							//line 275 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							return __temp_p21;
						}
						
						
						default:
						{
							//line 277 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							throw haxe.lang.HaxeException.wrap("Expected >");
						}
						
					}
					
				}
				
				
				case 10:
				{
					//line 280 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					if ( ! ((( ( ( ( ( ( ( ( c >= 97 ) && ( c <= 122 ) ) || ( ( c >= 65 ) && ( c <= 90 ) ) ) || ( ( c >= 48 ) && ( c <= 57 ) ) ) || ( c == 58 ) ) || ( c == 46 ) ) || ( c == 95 ) ) || ( c == 45 ) ))) ) 
					{
						//line 282 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						if (( start == __temp_p21 )) 
						{
							//line 283 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							throw haxe.lang.HaxeException.wrap("Expected node name");
						}
						
						//line 285 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						java.lang.String v = haxe.lang.StringExt.substr(str, start, ( __temp_p21 - start ));
						//line 286 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						java.lang.String __temp_stmt18 = null;
						//line 286 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						{
							//line 286 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							if (( parent.nodeType != haxe.root.Xml.Element )) 
							{
								//line 286 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								throw haxe.lang.HaxeException.wrap(( "Bad node type, expected Element but found " + parent.nodeType ));
							}
							
							//line 286 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							__temp_stmt18 = parent.nodeName;
						}
						
						//line 286 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						if ( ! (haxe.lang.Runtime.valEq(v, __temp_stmt18)) ) 
						{
							//line 287 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							java.lang.String __temp_stmt19 = null;
							//line 287 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							{
								//line 287 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								if (( parent.nodeType != haxe.root.Xml.Element )) 
								{
									//line 287 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									throw haxe.lang.HaxeException.wrap(( "Bad node type, expected Element but found " + parent.nodeType ));
								}
								
								//line 287 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								__temp_stmt19 = parent.nodeName;
							}
							
							//line 287 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							throw haxe.lang.HaxeException.wrap(( ( "Expected </" + __temp_stmt19 ) + ">" ));
						}
						
						//line 289 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						state = 0;
						//line 290 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						next = 12;
						//line 291 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						continue;
					}
					
					//line 280 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					break;
				}
				
				
				case 15:
				{
					//line 294 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					boolean __temp_boolv23 = ( c == 45 );
					//line 294 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					boolean __temp_boolv22 = false;
					//line 294 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					boolean __temp_boolv21 = false;
					//line 294 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					if (__temp_boolv23) 
					{
						//line 294 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						int __temp_stmt24 = 0;
						//line 294 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						{
							//line 294 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							int index7 = ( __temp_p21 + 1 );
							//line 294 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							__temp_stmt24 = ( (( index7 < str.length() )) ? (((int) (str.charAt(index7)) )) : (-1) );
						}
						
						//line 294 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						__temp_boolv22 = ( __temp_stmt24 == 45 );
						//line 294 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						if (__temp_boolv22) 
						{
							//line 294 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							int __temp_stmt25 = 0;
							//line 294 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							{
								//line 294 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								int index8 = ( __temp_p21 + 2 );
								//line 294 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								__temp_stmt25 = ( (( index8 < str.length() )) ? (((int) (str.charAt(index8)) )) : (-1) );
							}
							
							//line 294 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							__temp_boolv21 = ( __temp_stmt25 == 62 );
						}
						
					}
					
					//line 294 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					boolean __temp_stmt20 = ( ( __temp_boolv23 && __temp_boolv22 ) && __temp_boolv21 );
					//line 294 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					if (__temp_stmt20) 
					{
						//line 296 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						parent.addChild(haxe.root.Xml.createComment(haxe.lang.StringExt.substr(str, start, ( __temp_p21 - start ))));
						//line 297 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						__temp_p21 += 2;
						//line 298 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						state = 1;
					}
					
					//line 294 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					break;
				}
				
				
				case 16:
				{
					//line 301 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					if (( c == 91 )) 
					{
						//line 302 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						nbrackets++;
					}
					else
					{
						//line 303 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						if (( c == 93 )) 
						{
							//line 304 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							nbrackets--;
						}
						else
						{
							//line 305 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							if (( ( c == 62 ) && ( nbrackets == 0 ) )) 
							{
								//line 307 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								parent.addChild(haxe.root.Xml.createDocType(haxe.lang.StringExt.substr(str, start, ( __temp_p21 - start ))));
								//line 308 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								state = 1;
							}
							
						}
						
					}
					
					//line 301 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					break;
				}
				
				
				case 14:
				{
					//line 311 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					boolean __temp_boolv28 = ( c == 63 );
					//line 311 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					boolean __temp_boolv27 = false;
					//line 311 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					if (__temp_boolv28) 
					{
						//line 311 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						int __temp_stmt29 = 0;
						//line 311 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						{
							//line 311 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							int index9 = ( __temp_p21 + 1 );
							//line 311 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							__temp_stmt29 = ( (( index9 < str.length() )) ? (((int) (str.charAt(index9)) )) : (-1) );
						}
						
						//line 311 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						__temp_boolv27 = ( __temp_stmt29 == 62 );
					}
					
					//line 311 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					boolean __temp_stmt26 = ( __temp_boolv28 && __temp_boolv27 );
					//line 311 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					if (__temp_stmt26) 
					{
						//line 313 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						__temp_p21++;
						//line 314 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						java.lang.String str1 = haxe.lang.StringExt.substr(str, ( start + 1 ), ( ( __temp_p21 - start ) - 2 ));
						//line 315 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						parent.addChild(haxe.root.Xml.createProcessingInstruction(str1));
						//line 316 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						state = 1;
					}
					
					//line 311 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					break;
				}
				
				
				case 18:
				{
					//line 319 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					if (( c == 59 )) 
					{
						//line 321 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						java.lang.String s = haxe.lang.StringExt.substr(str, start, ( __temp_p21 - start ));
						//line 322 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						if (( (( (( 0 < s.length() )) ? (((int) (s.charAt(0)) )) : (-1) )) == 35 )) 
						{
							//line 323 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							java.lang.Object c1 = null;
							//line 323 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							if (( (( (( 1 < s.length() )) ? (((int) (s.charAt(1)) )) : (-1) )) == 120 )) 
							{
								//line 324 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								c1 = haxe.root.Std.parseInt(( "0" + haxe.lang.StringExt.substr(s, 1, ( s.length() - 1 )) ));
							}
							else
							{
								//line 325 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								c1 = haxe.root.Std.parseInt(haxe.lang.StringExt.substr(s, 1, ( s.length() - 1 )));
							}
							
							//line 345 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							buf.addChar(((int) (haxe.lang.Runtime.toInt(c1)) ));
						}
						else
						{
							//line 346 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							if ( ! (haxe.xml.Parser.escapes.exists(s)) ) 
							{
								//line 347 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								if (strict) 
								{
									//line 348 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
									throw haxe.lang.HaxeException.wrap(( "Undefined entity: " + s ));
								}
								
								//line 349 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								buf.add(( ( "&" + s ) + ";" ));
							}
							else
							{
								//line 351 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								buf.add(haxe.lang.Runtime.toString(haxe.xml.Parser.escapes.get(s)));
							}
							
						}
						
						//line 353 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						start = ( __temp_p21 + 1 );
						//line 354 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						state = escapeNext;
					}
					else
					{
						//line 355 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
						if ((  ! ((( ( ( ( ( ( ( ( c >= 97 ) && ( c <= 122 ) ) || ( ( c >= 65 ) && ( c <= 90 ) ) ) || ( ( c >= 48 ) && ( c <= 57 ) ) ) || ( c == 58 ) ) || ( c == 46 ) ) || ( c == 95 ) ) || ( c == 45 ) )))  && ( c != 35 ) )) 
						{
							//line 356 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							if (strict) 
							{
								//line 357 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
								throw haxe.lang.HaxeException.wrap(( "Invalid character in entity: " + Character.toString((char) c) ));
							}
							
							//line 358 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							buf.addChar(38);
							//line 359 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							buf.addSub(str, start, ( __temp_p21 - start ));
							//line 360 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							__temp_p21--;
							//line 361 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							start = __temp_p21;
							//line 362 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
							state = escapeNext;
						}
						
					}
					
					//line 319 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					break;
				}
				
				
			}
			
			//line 365 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
			{
				//line 365 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
				int index10 =  ++ __temp_p21;
				//line 365 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
				if (( index10 < str.length() )) 
				{
					//line 365 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					c = ((int) (str.charAt(index10)) );
				}
				else
				{
					//line 365 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
					c = -1;
				}
				
			}
			
		}
		
		//line 368 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		if (( state == 1 )) 
		{
			//line 370 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
			start = __temp_p21;
			//line 371 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
			state = 13;
		}
		
		//line 374 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		if (( state == 13 )) 
		{
			//line 376 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
			if (( ( __temp_p21 != start ) || ( nsubs == 0 ) )) 
			{
				//line 377 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
				buf.addSub(str, start, ( __temp_p21 - start ));
				//line 378 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
				parent.addChild(haxe.root.Xml.createPCData(buf.toString()));
			}
			
			//line 380 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
			return __temp_p21;
		}
		
		//line 383 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		if (( (  ! (strict)  && ( state == 18 ) ) && ( escapeNext == 13 ) )) 
		{
			//line 384 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
			buf.addChar(38);
			//line 385 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
			buf.addSub(str, start, ( __temp_p21 - start ));
			//line 386 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
			parent.addChild(haxe.root.Xml.createPCData(buf.toString()));
			//line 387 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
			return __temp_p21;
		}
		
		//line 390 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		throw haxe.lang.HaxeException.wrap("Unexpected end");
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 49 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		return new haxe.xml.Parser(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 49 "F:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Parser.hx"
		return new haxe.xml.Parser();
	}
	
	
}



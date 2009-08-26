// $ANTLR 2.7.5 (20050128): "mapping.g" -> "MappingParser.java"$

/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2009 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 *(at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.olap.mapping;

import java.util.List;
import java.util.ArrayList;

import net.sf.jasperreports.olap.mapping.*;

public interface MappingParserTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int LITERAL_Axis = 4;
	int LPAREN = 5;
	int RPAREN = 6;
	int LITERAL_Columns = 7;
	int LITERAL_Rows = 8;
	int LITERAL_Pages = 9;
	int LITERAL_Chapters = 10;
	int LITERAL_Sections = 11;
	int LITERAL_Data = 12;
	int LITERAL_FormattedData = 13;
	int COMMA = 14;
	int QMARK = 15;
	int POINT = 16;
	int INT = 17;
	int MONDRNAME = 18;
	int MONDRIDX = 19;
	int NAME = 20;
	int PLUS = 21;
	int MINUS = 22;
	int STAR = 23;
	int WS = 24;
	int MONDRCH = 25;
	int DIGIT = 26;
	int LETTER = 27;
}

/*		 
 * fastutil 2.52: Fast & compact specialized utility classes for Java
 *
 * Copyright (C) 2002, 2003 Sebastiano Vigna 
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */

package it.unimi.dsi.fastutil;

/** An iterator that provides a method to skip quickly over elements.
 *
 * @see Iterator
 */

public interface SkippableIterator extends Iterator {

	/** Skips the given number of elements.
	 *
	 * <P>The effect of this call is exactly the same as that of
	 * calling {@link java.util.Iterator#next()} for <code>n</code> times (possibly stopping
	 * if {@link java.util.Iterator#hasNext()} becomes false).
	 *
	 * @param n the number of elements to skip.
	 * @see Iterator#next()
	 */

	void skip( int n );
}

// Local Variables:
// mode: jde
// tab-width: 4
// End:
//
// SQLInspector
//
// Copyright (C) jextra.net.
//
//  This file is part of the Fauxjo Library.
//
//  The Fauxjo Library is free software; you can redistribute it and/or
//  modify it under the terms of the GNU Lesser General Public
//  License as published by the Free Software Foundation; either
//  version 2.1 of the License, or (at your option) any later version.
//
//  The Fauxjo Library is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//  Lesser General Public License for more details.
//
//  You should have received a copy of the GNU Lesser General Public
//  License along with the Fauxjo Library; if not, write to the Free
//  Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA
//  02111-1307 USA.
//

package net.jextra.connectionsupplier;

import java.util.regex.*;

final class SQLInspector {
    // ============================================================
    // Fields
    // ============================================================

    private static final Pattern INSERT_PATTERN = Pattern.compile("insert\\sinto", Pattern.CASE_INSENSITIVE);

    // ============================================================
    // Methods
    // ============================================================

    // ----------
    // public
    // ----------

    public static boolean isInsertStatement(String sql) {
        return INSERT_PATTERN.matcher(sql).find();
    }
}

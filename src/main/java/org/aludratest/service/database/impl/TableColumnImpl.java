/*
 * Copyright (C) 2015 Hamburg Sud and the contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.aludratest.service.database.impl;

import java.sql.SQLException;

import javax.sql.RowSet;

import org.aludratest.service.database.tablecolumn.TableColumn;

public abstract class TableColumnImpl<T> implements TableColumn<T> {

    private String columnName;

    public TableColumnImpl(String columnName) {
        this.columnName = columnName;
    }

    public abstract T getValueFromRowSet(RowSet rs) throws SQLException;

    @Override
    public final String getColumnName() {
        return columnName;
    }

	@Override
	public String toString() {
		return "Column " + columnName;
	}

}

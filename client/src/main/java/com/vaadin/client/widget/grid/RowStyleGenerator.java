/*
 * Copyright 2000-2021 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.client.widget.grid;

import java.io.Serializable;

/**
 * Callback interface for generating custom style names for data rows.
 *
 * @author Vaadin Ltd
 * @param <T>
 *            the row type of the target grid
 * @see com.vaadin.client.widgets.Grid#setRowStyleGenerator(RowStyleGenerator)
 *      Grid#setRowStyleGenerator(RowStyleGenerator)
 * @since 7.4
 */
public interface RowStyleGenerator<T> extends Serializable {

    /**
     * Called by Grid to generate a style name for a row.
     *
     * @param rowReference
     *            The row to generate a style for
     * @return the style name to add to this row, or {@code null} to not set any
     *         style
     */
    public abstract String getStyle(RowReference<T> rowReference);
}

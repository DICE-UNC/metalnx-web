/*
 * Copyright (c) 2015-2017, Dell EMC
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.emc.metalnx.modelattribute.breadcrumb;

/**
 * Represents a path item on the breadcrumb
 */
public class DataGridBreadcrumbItem {

	private String name;
	private String path;

	public DataGridBreadcrumbItem(final String path) {
		this.path = path;

		// Getting last item of the path based on the last occurent of PATH_SEPARATOR
		name = path.substring(path.lastIndexOf(DataGridBreadcrumb.PATH_SEPARATOR) + 1, path.length());
	}

	public String getPath() {
		return path;
	}

	public String getName() {
		return name;
	}

}

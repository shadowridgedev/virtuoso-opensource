/*
 *  $Id$
 *
 *  This file is part of the OpenLink Software Virtuoso Open-Source (VOS)
 *  project.
 *
 *  Copyright (C) 1998-2007 OpenLink Software
 *
 *  This project is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the
 *  Free Software Foundation; only version 2 of the License, dated June 1991.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *  General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA
 *
 */

package virtuoso.sesame2.driver;

import org.openrdf.model.Value;
import org.openrdf.query.BindingSet;
import org.openrdf.query.BooleanQuery;
import org.openrdf.query.Dataset;
import org.openrdf.query.QueryEvaluationException;
import org.openrdf.query.algebra.evaluation.QueryBindingSet;

public class VirtuosoBooleanQuery implements BooleanQuery {

	public boolean evaluate() throws QueryEvaluationException {
		return false;
	}

	QueryBindingSet bindingSet = new QueryBindingSet();
	boolean includeInferred = false;

	public BindingSet getBindings() {
		return this.bindingSet;
	}

	public Dataset getDataset() {
		return null;
	}

	public boolean getIncludeInferred() {
		return this.includeInferred;
	}

	public void removeBinding(String name) {
		this.bindingSet.removeBinding(name);
	}

	public void setBinding(String name, Value value) {
		this.bindingSet.setBinding(name, value);
	}

	public void setDataset(Dataset arg0) {
	}

	public void setIncludeInferred(boolean includeInferred) {
		this.includeInferred = includeInferred;
	}
}

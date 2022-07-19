/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package test.es.data.model.impl;

import test.es.data.model.ElectroType;
import test.es.data.service.ElectroTypeLocalServiceUtil;

/**
 * The extended model base implementation for the ElectroType service. Represents a row in the &quot;ES_ElectroType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ElectroTypeImpl}.
 * </p>
 *
 * @author Andrey Pletenev
 * @see ElectroTypeImpl
 * @see ElectroType
 * @generated
 */
public abstract class ElectroTypeBaseImpl
	extends ElectroTypeModelImpl implements ElectroType {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a electro type model instance should use the <code>ElectroType</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			ElectroTypeLocalServiceUtil.addElectroType(this);
		}
		else {
			ElectroTypeLocalServiceUtil.updateElectroType(this);
		}
	}

}
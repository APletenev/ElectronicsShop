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

package test.es.data.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the PositionType service. Represents a row in the &quot;ES_PositionType&quot; database table, with each column mapped to a property of this class.
 *
 * @author Andrey Pletenev
 * @see PositionTypeModel
 * @generated
 */
@ImplementationClassName("test.es.data.model.impl.PositionTypeImpl")
@ProviderType
public interface PositionType extends PersistedModel, PositionTypeModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>test.es.data.model.impl.PositionTypeImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<PositionType, Long> POSITION_ID_ACCESSOR =
		new Accessor<PositionType, Long>() {

			@Override
			public Long get(PositionType positionType) {
				return positionType.getPositionId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<PositionType> getTypeClass() {
				return PositionType.class;
			}

		};

}
/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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

package org.portlets.tessa.asset;

import org.portlets.tessa.model.Tessa;
import org.portlets.tessa.service.TessaLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.asset.model.AssetRenderer;
import com.liferay.portlet.asset.model.BaseAssetRendererFactory;

/**
 * @author Rich Sezov
 */
public class TessaAssetRendererFactory
    extends BaseAssetRendererFactory {

    public static final String CLASS_NAME = Tessa.class.getName();

    public static final String TYPE = "tessa";

    public AssetRenderer getAssetRenderer(long classPK, int type)
        throws PortalException, SystemException {

        Tessa tessa = TessaLocalServiceUtil.getTessa(classPK);

        return new TessaAssetRenderer(tessa);
    }

    public String getClassName() {
        return CLASS_NAME;
    }

    public String getType() {
        return TYPE;
    }

}

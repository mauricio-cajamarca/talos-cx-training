/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.talos.taloswishlist.setup;

import static com.talos.taloswishlist.constants.TaloswishlistConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.talos.taloswishlist.constants.TaloswishlistConstants;
import com.talos.taloswishlist.service.TaloswishlistService;


@SystemSetup(extension = TaloswishlistConstants.EXTENSIONNAME)
public class TaloswishlistSystemSetup
{
	private final TaloswishlistService taloswishlistService;

	public TaloswishlistSystemSetup(final TaloswishlistService taloswishlistService)
	{
		this.taloswishlistService = taloswishlistService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		taloswishlistService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return TaloswishlistSystemSetup.class.getResourceAsStream("/taloswishlist/sap-hybris-platform.png");
	}
}

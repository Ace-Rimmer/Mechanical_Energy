package com.Snappy.ME.core.handler;

import com.Snappy.ME.helpers.LocalizationHelper;
import com.Snappy.ME.helpers.Localizations;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHandler {
	
	public static void init() {
		
		for(String LocalizationFile : Localizations.localefiles) {
			
			LanguageRegistry.instance().loadLocalization(LocalizationFile, LocalizationHelper.getLocaleFromFileName(LocalizationFile), LocalizationHelper.isXMLFile(LocalizationFile));
		}
	}
}

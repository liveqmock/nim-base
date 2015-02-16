package com.poweruniverse.nim.base.utils;

import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;

public class FreemarkerUtils {
	private static Configuration cfg = null;
	public static String processTemplate(String templateString,Map<String, Object> root ) throws Exception{
		if(cfg == null){
			cfg = new Configuration(new Version(2, 3, 21));
			cfg.setEncoding(Locale.CHINA, "UTF-8");
			
			InputStream ios = FreemarkerUtils.class.getResourceAsStream("/freemarker.properties");
			if(ios!=null){
				Properties p = new Properties();
				p.load(ios);
				cfg.setSettings(p);
			}
			
		}
		
		Template t = new Template("name", new StringReader(templateString),cfg);
		StringWriter writer = new StringWriter();
		t.process(root, writer);
		return writer.toString();
	}

}

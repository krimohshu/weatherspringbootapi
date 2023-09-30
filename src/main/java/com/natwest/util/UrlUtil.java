package com.natwest.util;

import org.apache.http.client.utils.URIBuilder;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

public class UrlUtil {

    public static URL buildUrl(String protocol, String host, String path, Map<String, String> parameterMap) {
        try {
            URIBuilder builder = new URIBuilder();
            builder.setScheme(protocol);
            builder.setHost(host);
            builder.setPath(path);
            parameterMap.entrySet().stream()
                    .forEach(urlParamEntry -> builder.addParameter(urlParamEntry.getKey(), urlParamEntry.getValue()));

            return builder.build().toURL();

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}

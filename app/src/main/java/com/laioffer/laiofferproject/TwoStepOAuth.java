package com.laioffer.laiofferproject;
import org.scribe.builder.api.DefaultApi10a;
import org.scribe.model.Token;
/**
 * Created by Yisen on 4/6/16.
 */
public class TwoStepOAuth extends DefaultApi10a {

    /**
     * Generic service provider for two-step OAuth10a.
     */

    @Override
    public String getAccessTokenEndpoint() { return null; }

    @Override
    public String getAuthorizationUrl(Token unused) {
        return null;
    }
    @Override
    public String getRequestTokenEndpoint() {
        return null;
    }


}

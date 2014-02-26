package org.zero.utils;

import android.content.Context;

import com.codepath.oauth.OAuthBaseClient;

import org.scribe.builder.api.Api;
import org.scribe.builder.api.TumblrApi;
import org.zero.tumble.R;

/**
 * Created by mtopol on 2/25/14.
 */
public class TumbleClient extends OAuthBaseClient {
    public static final Class<? extends Api> REST_API_CLASS = TumblrApi.class;
    public static final String REST_URL = "http://api.tumblr.com";
    public static final String REST_CONSUMER_KEY = "0SeRvqhN6K1IxtZH9DVorMpEpQAQxE5QUZc5B72KTLLlcv4bzi";
    public static final String REST_CONSUMER_SECRET = "tahbMSn8oqQ6Mgv6UKYiFCCGVw4kyqVrDkYBlHAtBzV0S9t1E7";
    public static final String REST_CALLBACK_URL = "authtumble://tumblin.com";

    public TumbleClient(Context context) {
        super(context, REST_API_CLASS, REST_URL, REST_CONSUMER_KEY, REST_CONSUMER_SECRET, REST_CALLBACK_URL);
    }



}

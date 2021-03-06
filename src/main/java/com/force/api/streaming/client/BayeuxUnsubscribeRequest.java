package com.force.api.streaming.client;

/**
 * Bayeux protocol subscribe object, for requests on /meta/subscribe
 * 
 * @author gwester
 */
public class BayeuxUnsubscribeRequest extends StreamingApiRequest {
    // REQUIRED request fields
    private final String channel = "/meta/unsubscribe";
    private final String clientId;
    private final String subscription;

    // OPTIONAL request fields
    private String id;
    private String ext;

    /**
     * Required fields consturctor.
     * 
     * @param clientId
     * @param subscription
     */
    public BayeuxUnsubscribeRequest(String clientId, String subscription) {
        this(clientId, subscription, null, null);
    }

    /**
     * All fields constructor.
     * 
     * @param clientId
     * @param subscription
     * @param id
     * @param ext
     */
    public BayeuxUnsubscribeRequest(String clientId, String subscription, String id, String ext) {
        super();
        this.clientId = clientId;
        this.subscription = subscription;
        this.id = id;
        this.ext = ext;
    }

    public BayeuxUnsubscribeRequest(BayeuxSubscribeRequest sub) {
        this(sub.getClientId(), sub.getSubscription(), sub.getId(), sub.getExt());
    }

    @Override
    public String getChannel() {
        return channel;
    }

    public String getClientId() {
        return clientId;
    }

    public String getSubscription() {
        return subscription;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void setExt(String ext) {
        this.ext = ext;
    }
    
    String getExt() {
        return ext;
    }
    
    String getId() {
        return id;
    }

}

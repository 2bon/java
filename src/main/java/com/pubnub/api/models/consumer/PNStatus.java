package com.pubnub.api.models.consumer;

import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.enums.PNStatusCategory;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class PNStatus {

    private PNStatusCategory category;
    private PNErrorData errorData;
    private boolean error;

    // boolean automaticallyRetry;

    private int statusCode;
    private PNOperationType operation;

    //CHECKSTYLE.OFF
    private boolean TLSEnabled;
    //CHECKSTYLE.ON

    private String uuid;
    private String authKey;
    private String origin;
    private Object clientRequest;

    // send back channel, channel groups that were affected by this operation
    private List<String> affectedChannels;
    private List<String> affectedChannelGroups;

    /*
    public void retry(){
        // TODO
    }

    public void cancelAutomaticRetry() {
        // TODO
    }
    */

}
